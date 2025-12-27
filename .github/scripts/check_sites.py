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
from dataclasses import dataclass
from enum import StrEnum
from http import HTTPStatus
from operator import attrgetter
from typing import Any, NamedTuple

import aiohttp
import ua_generator
from anyio import Path
from bs4 import BeautifulSoup
from tabulate import tabulate  # type: ignore[import-untyped]

REPO_INDEX_URL = "https://raw.githubusercontent.com/keiyoushi/extensions/repo/index.min.json"
TIMEOUT_SECONDS = 65
MAX_CONCURRENT = 48

logging.basicConfig(level=logging.INFO)
log = logging.getLogger(__name__)


class Status(StrEnum):
    OK = "✅"
    ERROR = "❌"
    WARNING = "⚠️"
    CF_BLOCK = "🛑"
    CF_IUAM = "🚧"
    REDIRECT = "🔀"


class Source(NamedTuple):
    name: str
    url: str


@dataclass(frozen=True, slots=True)
class CheckResult:
    source: Source
    status: Status
    info: str = ""

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
    ("Warnings", Status.WARNING),
    ("Errors", Status.ERROR),
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

    log.info("Using User-Agent: %s", str(ua))
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
    try:
        async with session.get(source.url) as resp:
            if not str(resp.url).startswith(source.url):
                return CheckResult(source, Status.REDIRECT, f"Redirected: {resp.url}")

            if resp.status == HTTPStatus.OK:
                return CheckResult(source, Status.OK)

            html = await resp.text()
            soup = BeautifulSoup(html, "html.parser")
            title = soup.title.string.strip() if soup.title and soup.title.string else ""

            if title == "Just a moment...":
                status = Status.CF_IUAM
            elif title == "Attention Required! | Cloudflare":
                status = Status.CF_BLOCK
            else:
                status = Status.WARNING

            return CheckResult(source, status, f"HTTP {resp.status}: {title}")

    except Exception as e:
        return CheckResult(source, Status.ERROR, str(e) or type(e).__name__)


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


def render_report(user_agent: str, results: list[CheckResult]) -> str:
    buf = ""
    buf += "# Site Status Report\n\n"
    buf += f"Count: {len(results)}\\\n"
    buf += f"User-Agent: `{user_agent}`\n\n"

    for title, status in REPORT_SECTIONS:
        rows = [
            tuple(_escape_pipes(c) for c in r.as_row())
            for r in sorted((r for r in results if r.status == status), key=attrgetter("sort_key"))
        ]
        buf += f"## {title}\n\n"
        buf += f"Count: {len(rows)}\n\n"
        if rows:
            buf += tabulate(rows, ["Status", "Name", "URL", "Info"], tablefmt="github")
            buf += "\n\n"

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
