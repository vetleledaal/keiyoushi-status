#!/usr/bin/env -S uv run --script
# /// script
# requires-python = ">=3.11"
# dependencies = [
#   "aiohttp",
#   "anyio",
#   "beautifulsoup4",
#   "fake-useragent",
#   "tabulate",
# ]
# ///

from __future__ import annotations

import asyncio
import logging
from dataclasses import dataclass
from datetime import datetime, timezone
from enum import StrEnum
from http import HTTPStatus
from typing import Any, NamedTuple

import aiohttp
from anyio import Path
from bs4 import BeautifulSoup
from fake_useragent import UserAgent
from tabulate import tabulate  # type: ignore[import-untyped]

REPO_INDEX_URL = "https://raw.githubusercontent.com/keiyoushi/extensions/repo/index.min.json"
TIMEOUT_SECONDS = 15
MAX_CONCURRENT = 40

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

    def as_row(self) -> tuple[str, str, str, str]:
        return (self.status.value, self.source.name, self.source.url, self.info)


REPORT_SECTIONS: list[tuple[str, Status]] = [
    ("OK", Status.OK),
    ("Cloudflare Blocked", Status.CF_BLOCK),
    ("Cloudflare IUAM", Status.CF_IUAM),
    ("Redirects", Status.REDIRECT),
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


def render_report(results: list[CheckResult]) -> str:
    buf = ""
    buf += "# Site Status Report\n\n"
    buf += f"Updated: {datetime.now(tz=timezone.utc).isoformat(timespec='seconds')}\\\n"
    buf += f"Count: {len(results)}\n\n"

    for title, status in REPORT_SECTIONS:
        rows = [tuple(_escape_pipes(c) for c in r.as_row()) for r in results if r.status == status]
        buf += f"## {title}\n\n"
        buf += f"Count: {len(rows)}\n\n"
        if rows:
            buf += tabulate(rows, ["Status", "Name", "URL", "Info"], tablefmt="github")
            buf += "\n\n"

    return buf.rstrip() + "\n"


async def main() -> None:
    ua = UserAgent(browsers=["Edge", "Chrome"], os="Windows", platforms="desktop")
    user_agent = ua.random
    log.info("Using User-Agent: %s", user_agent)

    async with aiohttp.ClientSession(
        timeout=aiohttp.ClientTimeout(total=TIMEOUT_SECONDS),
        headers={"User-Agent": user_agent},
    ) as session:
        log.info("Fetching repository index from %s", REPO_INDEX_URL)
        async with session.get(REPO_INDEX_URL) as resp:
            repository = await resp.json(content_type=None)

        sources = extract_sources(repository)
        log.info("Checking %d unique sources", len(sources))
        results = await check_all(session, sources)

    report = render_report(results)
    await Path("STATUS.md").write_text(report, encoding="utf-8")


if __name__ == "__main__":
    asyncio.run(main())
