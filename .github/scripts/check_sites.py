#!/usr/bin/env -S uv run --script
# /// script
# requires-python = ">=3.11"
# dependencies = [
#   "aiohttp[speedups]",
#   "anyio",
#   "beautifulsoup4",
#   "ua-generator",
#   "tabulate",
# ]
# ///

from __future__ import annotations

import asyncio
import logging
import random
import re
from dataclasses import dataclass
from enum import StrEnum
from http import HTTPStatus
from itertools import groupby
from operator import attrgetter
from typing import Any, NamedTuple

import aiohttp
import ua_generator
from anyio import Path
from bs4 import BeautifulSoup
from tabulate import tabulate  # type: ignore[import-untyped]

REPO_INDEX_URL = "https://raw.githubusercontent.com/keiyoushi/extensions/repo/index.min.json"
TIMEOUT_SECONDS = 65
MAX_CONCURRENT = 62
TABLE_COLUMNS = ["Status", "Name", "URL", "Info"]
PATTERN_WWSUB = re.compile(r"^ww\d+\.")
MIN_NODES_WARN = 20

logging.basicConfig(level=logging.INFO)
log = logging.getLogger(__name__)


class Status(StrEnum):
    UNKNOWN = "❔"
    OK = "✅"
    ERROR = "❌"
    WARNING = "⚠️"
    CF_BLOCK = "🛑"
    CF_IUAM = "🚧"
    REDIRECT = "🔀"
    PARKED = "🅿️"


class Source(NamedTuple):
    name: str
    url: str


@dataclass(frozen=True, slots=True)
class CheckResult:
    source: Source
    status: Status
    info: str = ""
    subcategory: str = ""

    @property
    def sort_key(self) -> tuple[str, str]:
        return (self.source.name.lower(), self.source.url.lower())

    def as_row(self) -> tuple[str, str, str, str]:
        return (self.status.value, self.source.name, self.source.url, self.info)


REPORT_SECTIONS: list[tuple[str, Status]] = [
    ("OK", Status.OK),
    ("Redirects", Status.REDIRECT),
    ("Cloudflare IUAM", Status.CF_IUAM),
    ("Cloudflare Blocked", Status.CF_BLOCK),
    ("Parked Domains", Status.PARKED),
    ("Warnings", Status.WARNING),
    ("Errors", Status.ERROR),
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


def extract_sources(repo: list[dict[str, Any]]) -> list[Source]:
    sources = {
        Source(source["name"], url)
        for extension in repo
        for source in extension["sources"]
        for url in source["baseUrl"].split("#, ")
    }
    return sorted(sources)


def generate_headers(sources: list[Source]) -> dict[str, str]:
    seed = ",".join(f"{source.name}:{source.url}" for source in sources)

    rng_state = random.getstate()
    random.seed(seed)
    ua = ua_generator.generate(device="desktop", browser=["chrome", "edge"])
    random.setstate(rng_state)

    log.info("Using User-Agent: %s", ua)
    headers = {
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
    return headers


async def check_source(session: aiohttp.ClientSession, source: Source) -> CheckResult:
    infos: list[str] = []
    parked_signals: list[str] = []

    def result(status: Status, subcategory: str = "") -> CheckResult:
        parts = infos.copy()
        if parked_signals:
            parts.append(f"Method: {', '.join(parked_signals)}")
        return CheckResult(source, status, ". ".join(parts), subcategory)

    try:
        async with session.get(source.url) as resp:
            html = await resp.text()
            soup = BeautifulSoup(html, "html.parser")

            node_count = len(soup.select("*"))
            if node_count < MIN_NODES_WARN:
                infos.append(f"Low node count ({node_count})")

            redirected = not str(resp.url).startswith(source.url)
            if redirected:
                infos.append(f"Redirected: {resp.url}")
                if resp.url.scheme == "http" and PATTERN_WWSUB.match(str(resp.url.host)):
                    parked_signals.append("scheme")
                if any(str(resp.url).startswith(domain) for domain in PARKED_DOMAINS):
                    parked_signals.append("domain")
                if any(resp.url.query.get(query) is not None for query in PARKED_QUERIES):
                    parked_signals.append("query")

            title = soup.title.string.strip() if soup.title and soup.title.string else ""

            # Cloudflare
            if not redirected:
                if title == "Just a moment...":
                    return CheckResult(source, Status.CF_IUAM)
                if title == "Attention Required! | Cloudflare":
                    return CheckResult(source, Status.CF_BLOCK)

            # Parked domains
            if title in PARKED_TITLES:
                parked_signals.append("title")
            if any(body in html for body in PARKED_BODIES):
                parked_signals.append("body")

            if parked_signals:
                return result(Status.PARKED)
            if redirected:
                return result(Status.REDIRECT)
            if resp.status == HTTPStatus.OK:
                return result(Status.OK, subcategory="With Warnings" if infos else "")

            infos.append(f"HTTP {resp.status}: {title}")
            return result(Status.WARNING)

    except Exception as e:
        if msg := str(e):
            infos.append(msg)
        return result(Status.ERROR, subcategory=type(e).__name__)


async def check_all(session: aiohttp.ClientSession, sources: list[Source]) -> list[CheckResult]:
    semaphore = asyncio.Semaphore(MAX_CONCURRENT)

    async def f(src: Source) -> CheckResult:
        async with semaphore:
            result = await check_source(session, src)
            log.info("%s %s (%s) %s", result.status, src.name, src.url, result.info)
            return result

    return await asyncio.gather(*[f(s) for s in sources])


def _escape_pipes(text: str) -> str:
    return text.replace("|", r"\|")


def _make_table(results: list[CheckResult]) -> str:
    rows = [tuple(_escape_pipes(c) for c in r.as_row()) for r in results]
    return tabulate(rows, TABLE_COLUMNS, tablefmt="github")


def render_report(user_agent: str, results: list[CheckResult]) -> str:
    buf = ""
    buf += "# Site Status Report\n\n"
    buf += f"Count: {len(results)}\\\n"
    buf += f"User-Agent: `{user_agent}`\n\n"

    for title, status in REPORT_SECTIONS:
        rows = sorted((r for r in results if r.status == status), key=attrgetter("sort_key"))
        buf += f"## {title}\n\n"
        buf += f"Count: {len(rows)}\n\n"

        if not rows:
            continue

        rows_main = [r for r in rows if not r.subcategory]
        if rows_main:
            buf += _make_table(rows_main) + "\n\n"

        rows_with_subcategory = [r for r in rows if r.subcategory]
        if not rows_with_subcategory:
            continue

        rows_with_subcategory.sort(key=lambda r: (r.subcategory, r.sort_key))
        for subcategory, group in groupby(rows_with_subcategory, key=attrgetter("subcategory")):
            rows_group = list(group)
            buf += f"### {subcategory}\n\n"
            buf += f"Count: {len(rows_group)}\n\n"
            buf += _make_table(rows_group) + "\n\n"

    return buf.rstrip() + "\n"


async def main() -> None:
    async with aiohttp.ClientSession() as session:
        log.info("Fetching repository index from %s", REPO_INDEX_URL)
        async with session.get(REPO_INDEX_URL) as resp:
            repository = await resp.json(content_type=None)

    sources = extract_sources(repository)
    log.info("Checking %d unique sources", len(sources))

    headers = generate_headers(sources)

    async with aiohttp.ClientSession(
        timeout=aiohttp.ClientTimeout(total=TIMEOUT_SECONDS),
        headers=headers,
    ) as session:
        sources_shuffled = sources.copy()
        random.shuffle(sources_shuffled)
        results = await check_all(session, sources_shuffled)

    report = render_report(headers["User-Agent"], results)
    await Path("STATUS.md").write_text(report, encoding="utf-8")


if __name__ == "__main__":
    asyncio.run(main())
