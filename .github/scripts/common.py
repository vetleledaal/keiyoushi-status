from __future__ import annotations

import asyncio
import logging
import random
import re
import socket
import ssl
import time
from collections.abc import Awaitable, Callable
from dataclasses import dataclass
from datetime import datetime, timezone
from enum import StrEnum
from functools import partial
from http import HTTPStatus
from itertools import groupby
from operator import attrgetter
from typing import Any, Protocol, TypeVar

import aiohttp
import dns.asyncbackend
import dns.asyncquery
import dns.asyncresolver
import dns.exception
import dns.message
import dns.nameserver
import dns.rdatatype
import httpx
import ua_generator
from aia import AIASession
from aiohttp.abc import AbstractResolver, ResolveResult
from bs4 import BeautifulSoup
from publicsuffixlist import PublicSuffixList  # type: ignore[import-untyped]
from tabulate import tabulate  # type: ignore[import-untyped]
from yarl import URL

log = logging.getLogger(__name__)
logging.getLogger("httpx").setLevel(logging.WARNING)  # silence per-request DoH logs
psl = PublicSuffixList()

TIMEOUT_SECONDS = 5 * 60
MAX_CONCURRENT = 80
PATTERN_WWSUB = re.compile(r"^ww\d+\.")
MIN_NODES_WARN = 20
TIME_PRECISION_CUTOFF_SECONDS = 10

DNS_NAMESERVERS = [
    "https://adfree.usableprivacy.net/",
    "https://cloudflare-dns.com/dns-query",
    "https://dns.aa.net.uk/dns-query",
    "https://dns.adguard-dns.com/dns-query",  # filter
    "https://dns.brahma.world/dns-query",
    "https://dns.digitale-gesellschaft.ch/dns-query",
    "https://dns.dnshome.de/dns-query",
    "https://dns.dnsoverhttps.com/dnfs-query",
    "https://dns.flatuslifir.is/dns-query",
    "https://dns.google/dns-query",
    "https://dns.hostux.net/dns-query",
    "https://dns.nextdns.io/dns-query",
    "https://dns.njal.la/dns-query",
    "https://dns.quad9.net/dns-query",
    "https://dns.switch.ch/dns-query",
    "https://dnsforge.de/dns-query",
    "https://doh-de.blahdns.com/dns-query",
    "https://doh.42l.fr/dns-query",
    "https://doh.applied-privacy.net/query",
    "https://doh.cleanbrowsing.org/doh/security-filter/",
    "https://doh.dns.sb/dns-query",
    "https://doh.ffmuc.net/dns-query",
    "https://doh.li/dns-query",
    "https://doh.libredns.gr/dns-query",
    "https://doh.mullvad.net/dns-query",
    "https://doh.opendns.com/dns-query",
    "https://doh.tiarap.org/dns-query",
    "https://doh.xfinity.com/dns-query",
    "https://ibuki.cgnat.net/dns-query",
    "https://ordns.he.net/dns-query",
    "https://private.canadianshield.cira.ca/dns-query",
    "https://public.dns.iij.jp/dns-query",
    "https://wikimedia-dns.org/dns-query",
]

DNS_NAMESERVERS_ZH = [
    "https://dns.alidns.com/dns-query",  # zh
    "https://doh.onedns.net/dns-query",  # zh
    "https://doh.pub/dns-query",  # zh
]

DNS_RDTYPES_BY_FAMILY = {
    socket.AF_INET: (dns.rdatatype.A,),
    socket.AF_INET6: (dns.rdatatype.AAAA,),
}

DNS_MAX_ATTEMPTS = 3
DNS_WEIGHT_INITIAL = 1.0
DNS_WEIGHT_MIN = 0.1
DNS_WEIGHT_MAX = 3.0
DNS_WEIGHT_REWARD = 0.1
DNS_WEIGHT_PENALTY = 0.3


@dataclass
class _NameserverScore:
    weight: float = DNS_WEIGHT_INITIAL

    def reward(self) -> None:
        self.weight = min(DNS_WEIGHT_MAX, self.weight + DNS_WEIGHT_REWARD)

    def penalize(self) -> None:
        # floor keeps a struggling nameserver eligible so it can recover
        self.weight = max(DNS_WEIGHT_MIN, self.weight - DNS_WEIGHT_PENALTY)


def _weighted_sample_without_replacement(
    pool: list[tuple[str, float]],
    k: int,
    rng: random.Random,
) -> list[str]:
    pool = pool.copy()
    picked: list[str] = []
    for _ in range(min(k, len(pool))):
        total = sum(weight for _, weight in pool)
        target = rng.uniform(0, total)
        cumulative = 0.0
        for i, (nameserver, weight) in enumerate(pool):
            cumulative += weight
            if cumulative >= target:
                picked.append(nameserver)
                pool.pop(i)
                break
    return picked


class _PersistentDoHNameserver(dns.nameserver.DoHNameserver):
    """DoHNameserver that reuses one httpx.AsyncClient instead of opening a new TLS connection per query."""

    def __init__(self, url: str, client: httpx.AsyncClient) -> None:
        super().__init__(url)
        self._client = client

    async def async_query(
        self,
        request: dns.message.QueryMessage,
        timeout: float,  # noqa: ASYNC109 - signature must match Nameserver.async_query
        source: str | None,
        source_port: int,
        max_size: bool,  # noqa: ARG002 - unused, required by Nameserver.async_query signature
        backend: dns.asyncbackend.Backend,  # noqa: ARG002 - unused, required by Nameserver.async_query signature
        one_rr_per_rrset: bool = False,
        ignore_trailing: bool = False,
    ) -> dns.message.Message:
        return await dns.asyncquery.https(
            request,
            self.url,
            timeout=timeout,
            source=source,
            source_port=source_port,
            one_rr_per_rrset=one_rr_per_rrset,
            ignore_trailing=ignore_trailing,
            verify=self.verify,
            post=(not self.want_get),
            http_version=self.http_version,
            client=self._client,
        )


class DNSPythonResolver(AbstractResolver):
    def __init__(self, nameservers: list[str], fallback_nameservers: list[str]) -> None:
        # own Random instance: avoids interleaving with generate_headers' global random.seed/setstate
        self._rng = random.Random()
        self._scores = {ns: _NameserverScore() for ns in nameservers}
        self._fallback_scores = {ns: _NameserverScore() for ns in fallback_nameservers}
        self._clients: dict[str, httpx.AsyncClient] = {}
        self._resolvers: dict[str, dns.asyncresolver.Resolver] = {}
        for ns in [*nameservers, *fallback_nameservers]:
            client = httpx.AsyncClient(http2=True)
            self._clients[ns] = client
            resolver = dns.asyncresolver.Resolver(configure=False)
            resolver.nameservers = [_PersistentDoHNameserver(ns, client)]
            self._resolvers[ns] = resolver

    def _pick_nameservers(self, scores: dict[str, _NameserverScore], k: int) -> list[str]:
        pool = [(ns, score.weight) for ns, score in scores.items()]
        return _weighted_sample_without_replacement(pool, k, self._rng)

    async def resolve(
        self,
        host: str,
        port: int = 0,
        family: socket.AddressFamily = socket.AF_INET,
    ) -> list[ResolveResult]:
        results: list[ResolveResult] = []
        for rdtype in DNS_RDTYPES_BY_FAMILY.get(family, (dns.rdatatype.A, dns.rdatatype.AAAA)):
            # fall back to ZH nameservers if the primary attempts are exhausted
            nameservers = self._pick_nameservers(self._scores, DNS_MAX_ATTEMPTS) + self._pick_nameservers(
                self._fallback_scores,
                len(self._fallback_scores),
            )
            for nameserver in nameservers:
                scores = self._scores if nameserver in self._scores else self._fallback_scores
                try:
                    answer = await self._resolvers[nameserver].resolve(host, rdtype)
                except dns.exception.DNSException as e:
                    log.debug("DNS %s %s failed via %s: %s", dns.rdatatype.to_text(rdtype), host, nameserver, e)
                    scores[nameserver].penalize()
                    continue
                scores[nameserver].reward()
                log.info(
                    "DNS %s %s -> %s via %s",
                    dns.rdatatype.to_text(rdtype),
                    host,
                    [rdata.address for rdata in answer],
                    nameserver,
                )
                results.extend(
                    ResolveResult(
                        hostname=host,
                        host=rdata.address,
                        port=port,
                        family=socket.AF_INET6 if rdtype == dns.rdatatype.AAAA else socket.AF_INET,
                        proto=0,
                        flags=socket.AI_NUMERICHOST | socket.AI_NUMERICSERV,
                    )
                    for rdata in answer
                )
                break
        if not results:
            raise OSError(None, f"DNS lookup failed for {host}")
        return results

    async def close(self) -> None:
        for client in self._clients.values():
            await client.aclose()


def create_connector() -> aiohttp.TCPConnector:
    resolver = DNSPythonResolver(DNS_NAMESERVERS, DNS_NAMESERVERS_ZH)
    return aiohttp.TCPConnector(resolver=resolver)


class Status(StrEnum):
    OK = "✅"
    ERROR = "❌"
    WARNING = "⚠️"
    CF_BLOCK = "🛑"
    CF_IUAM = "🚧"
    REDIRECT = "🔀"
    PARKED = "🅿️"
    NOT_FOUND = "🔍"
    PLACEHOLDER = "🪧"


REPORT_SECTIONS: list[tuple[str, Status]] = [
    ("OK", Status.OK),
    ("Redirects", Status.REDIRECT),
    ("Cloudflare IUAM", Status.CF_IUAM),
    ("Cloudflare Blocked", Status.CF_BLOCK),
    ("Placeholder", Status.PLACEHOLDER),
    ("Parked Domains", Status.PARKED),
    ("Warnings", Status.WARNING),
    ("Errors", Status.ERROR),
    ("Not Found", Status.NOT_FOUND),
]

PARKED_DOMAINS = [
    "https://bulsis.net/",
    "https://expireddomains.com/",
    "https://teksishe.net/",
]

PARKED_QUERIES = [
    "subid1",
]

PLACEHOLDER_TITLES = [
    "Apache2 Debian Default Page: It works",
    "Apache2 Ubuntu Default Page: It works",
    "Sorry, the website has been stopped",
    "Welcome to nginx!",
]

PLACEHOLDER_BODIES = [
    "site has been stopped by the administrator",
    "website has been stopped",
]

PARKED_TITLES = [
    "Loading...",
    "Redirecting...",
]

PARKED_BODIES = [
    '''"/lander"''',
    '''"domainPrice"''',
    '''"domainRegistrant"''',
    """?tr_uuid=""",
    """'/saleform'""",
    """<h1>This domain is for sale</h1>""",
    """<html data-adblockkey=""",
    """<img src="https://l.cdn-fileserver.com/bping.php?""",
    """<p><a href="/_pp">Privacy Policy</a></p>""",
    """<script src="\\/\\/sedoparking.com/frmpark/""",
    """<script>window.park = "ey""",
    """1and1.com""",
    """parklogic.com""",
    """sedo.com/services/parking.php""",
    """sedoparking.com""",
    """window.location.href="/lander""",
]


def check_placeholder_content(title: str, html: str) -> list[str]:
    signals: list[str] = []
    if title in PLACEHOLDER_TITLES:
        signals.append("title")
    if any(body in html.lower() for body in PLACEHOLDER_BODIES):
        signals.append("body")
    return signals


class CheckResultProtocol(Protocol):
    @property
    def status(self) -> Status: ...

    @property
    def subcategory(self) -> str: ...

    @property
    def sort_key(self) -> tuple[Any, ...]: ...

    def as_row(self) -> tuple[str, ...]: ...


R = TypeVar("R", bound=CheckResultProtocol)
T = TypeVar("T")


def generate_headers(seed: str) -> dict[str, str]:
    rng_state = random.getstate()
    random.seed(seed)
    ua = ua_generator.generate(device="desktop", browser=["chrome", "edge"])
    random.setstate(rng_state)

    log.info("Using User-Agent: %s", ua)
    headers: dict[str, str | None] = {
        "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8",
        "Accept-Encoding": "gzip, deflate, br, zstd",
        "Accept-Language": "en-US,en;q=0.6",
        "Priority": "u=0, i",
        "Referer": "https://search.brave.com/",
        "Sec-Ch-Ua": None,
        "Sec-Ch-Ua-Mobile": None,
        "Sec-Ch-Ua-Platform": None,
        "Sec-Fetch-Dest": "document",
        "Sec-Fetch-Mode": "navigate",
        "Sec-Fetch-Site": "cross-site",
        "Sec-Fetch-User": "?1",
        "Sec-Gpc": "1",
        "Upgrade-Insecure-Requests": "1",
        "User-Agent": None,
    }
    headers_ua = {k.title(): v for k, v in ua.headers.get().items()}
    headers.update(headers_ua)
    return {k: v for k, v in headers.items() if v is not None}


def check_parked_redirect(redirected_url: URL) -> list[str]:
    signals: list[str] = []
    if redirected_url.scheme == "http" and PATTERN_WWSUB.match(str(redirected_url.host)):
        signals.append("scheme")
    if any(str(redirected_url).startswith(domain) for domain in PARKED_DOMAINS):
        signals.append("domain")
    if any(redirected_url.query.get(query) is not None for query in PARKED_QUERIES):
        signals.append("query")
    return signals


def check_parked_content(title: str, html: str) -> list[str]:
    signals: list[str] = []
    if title in PARKED_TITLES:
        signals.append("title")
    if any(body in html for body in PARKED_BODIES):
        signals.append("body")
    return signals


def is_same_authority(url_a: str, url_b: str) -> bool:
    host_a = psl.privatesuffix(URL(url_a).host or "")
    host_b = psl.privatesuffix(URL(url_b).host or "")
    return bool(host_a and host_a == host_b)


def format_duration(duration: float, cutoff: float = TIME_PRECISION_CUTOFF_SECONDS) -> str:
    if duration < 0:
        return ""
    if duration < cutoff:
        return f"{duration:.3f}s"
    s = int(duration)
    m, s = divmod(s, 60)
    return f"{m}m{s}s" if m else f"{s}s"


_aia_session = AIASession()


async def _build_aia_ssl_context(url: str) -> ssl.SSLContext:
    # ssl_context_from_url is blocking (sync sockets), so run it off the event loop
    return await asyncio.get_event_loop().run_in_executor(
        None,
        partial(_aia_session.ssl_context_from_url, url),
    )


async def check_url_generic(
    session: aiohttp.ClientSession,
    url: str,
    make_result: Callable[[Status, float, str, str], R],
) -> R:
    infos: list[str] = []
    parked_signals: list[str] = []
    start = time.perf_counter()

    def result(status: Status, subcategory: str = "") -> R:
        duration = time.perf_counter() - start
        parts = infos.copy()
        if parked_signals:
            parts.append(f"Method: {', '.join(parked_signals)}")
        return make_result(status, duration, ". ".join(parts), subcategory)

    try:
        try:
            async with session.get(url) as resp:
                html = await resp.text(errors="replace")
        except aiohttp.ClientConnectorCertificateError:
            # some servers omit intermediate certs; complete the chain like a browser would
            ssl_context = await _build_aia_ssl_context(url)
            async with session.get(url, ssl=ssl_context) as resp:
                html = await resp.text(errors="replace")

        soup = BeautifulSoup(html, "lxml")

        node_count = len(soup.select("*"))
        if node_count < MIN_NODES_WARN:
            infos.append(f"Few nodes ({node_count})")

        redirected = not str(resp.url).startswith(url)
        if redirected:
            infos.append(f"Redirected: {resp.url}")
            parked_signals.extend(check_parked_redirect(resp.url))

        title = soup.title.string.strip() if soup.title and soup.title.string else ""

        if not redirected:
            if title == "Just a moment...":
                infos = []
                return result(Status.CF_IUAM)
            if title == "Attention Required! | Cloudflare":
                infos = []
                return result(Status.CF_BLOCK)

        if check_placeholder_content(title, html):
            return result(Status.PLACEHOLDER)

        parked_signals.extend(check_parked_content(title, html))

        if parked_signals:
            return result(Status.PARKED)
        if redirected:
            subcategory = "Same Authority" if is_same_authority(url, str(resp.url)) else ""
            return result(Status.REDIRECT, subcategory)
        if resp.status == HTTPStatus.OK:
            return result(Status.OK, subcategory="With Notes" if infos else "")

        infos.append(f"HTTP {resp.status}: {title}")
        return result(Status.WARNING)

    except Exception as e:
        if msg := str(e):
            infos.append(msg)
        return result(Status.ERROR, subcategory=type(e).__name__)


async def check_all_generic(
    session: aiohttp.ClientSession,
    items: list[T],
    check_fn: Callable[[aiohttp.ClientSession, T], Awaitable[R]],
    log_fn: Callable[[R, T], None],
) -> list[R]:
    semaphore = asyncio.Semaphore(MAX_CONCURRENT)

    async def f(item: T) -> R:
        async with semaphore:
            res = await check_fn(session, item)
            log_fn(res, item)
            return res

    return await asyncio.gather(*[f(item) for item in items])


def _escape_pipes(text: str) -> str:
    return text.replace("|", r"\|")


def make_table(results: list[R], columns: list[str]) -> str:
    rows = [tuple(_escape_pipes(str(c)) for c in r.as_row()) for r in results]
    return tabulate(rows, columns, tablefmt="github")


def render_report_generic(
    title: str,
    count: int,
    user_agent: str,
    results: list[R],
    sections: list[tuple[str, Status]],
    columns: list[str],
) -> str:
    timestamp = datetime.now(tz=timezone.utc).isoformat(timespec="seconds")
    buf = f"# {title}\n\n"
    buf += f"Count: {count}\\\n"
    buf += f"Timestamp: `{timestamp}`\\\n"
    buf += f"User-Agent: `{user_agent}`\n\n"

    for section_title, status in sections:
        rows = sorted((r for r in results if r.status == status), key=attrgetter("sort_key"))
        buf += f"## {section_title}\n\n"
        buf += f"Count: {len(rows)}\n\n"

        if not rows:
            continue

        rows_main = [r for r in rows if not r.subcategory]
        if rows_main:
            buf += make_table(rows_main, columns) + "\n\n"

        rows_with_subcategory = [r for r in rows if r.subcategory]
        if not rows_with_subcategory:
            continue

        rows_with_subcategory.sort(key=lambda r: (r.subcategory, r.sort_key))
        for subcategory, group in groupby(rows_with_subcategory, key=attrgetter("subcategory")):
            rows_group = list(group)
            buf += f"### {subcategory}\n\n"
            buf += f"Count: {len(rows_group)}\n\n"
            buf += make_table(rows_group, columns) + "\n\n"

    return buf.rstrip() + "\n"
