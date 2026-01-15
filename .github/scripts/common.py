from __future__ import annotations

import asyncio
import logging
import random
import re
import time
from collections.abc import Awaitable, Callable
from enum import StrEnum
from http import HTTPStatus
from itertools import groupby
from operator import attrgetter
from typing import Any, Protocol, TypeVar

import aiohttp
import ua_generator
from bs4 import BeautifulSoup
from publicsuffixlist import PublicSuffixList  # type: ignore[import-untyped]
from tabulate import tabulate  # type: ignore[import-untyped]
from yarl import URL

log = logging.getLogger(__name__)
psl = PublicSuffixList()

TIMEOUT_SECONDS = 5 * 60
MAX_CONCURRENT = 80
PATTERN_WWSUB = re.compile(r"^ww\d+\.")
MIN_NODES_WARN = 20
TIME_PRECISION_CUTOFF_SECONDS = 10


class Status(StrEnum):
    OK = "✅"
    ERROR = "❌"
    WARNING = "⚠️"
    CF_BLOCK = "🛑"
    CF_IUAM = "🚧"
    REDIRECT = "🔀"
    PARKED = "🅿️"
    NOT_FOUND = "🔍"


REPORT_SECTIONS: list[tuple[str, Status]] = [
    ("OK", Status.OK),
    ("Redirects", Status.REDIRECT),
    ("Cloudflare IUAM", Status.CF_IUAM),
    ("Cloudflare Blocked", Status.CF_BLOCK),
    ("Parked Domains", Status.PARKED),
    ("Warnings", Status.WARNING),
    ("Errors", Status.ERROR),
    ("Not Found", Status.NOT_FOUND),
]

PARKED_DOMAINS = [
    "https://expireddomains.com/",
    "https://teksishe.net/",
]

PARKED_QUERIES = [
    "subid1",
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
        async with session.get(url) as resp:
            html = await resp.text()
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
    buf = f"# {title}\n\n"
    buf += f"Count: {count}\\\n"
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
