#!/usr/bin/env -S uv run --script
# /// script
# requires-python = ">=3.11"
# dependencies = [
#   "aiohttp[speedups]",
#   "anyio",
#   "beautifulsoup4[lxml]",
#   "publicsuffixlist",
#   "tabulate",
#   "ua-generator",
#   "yarl",
# ]
# ///

from __future__ import annotations

import asyncio
import logging
import random
from dataclasses import dataclass
from typing import Any, NamedTuple

import aiohttp
from anyio import Path
from common import (
    REPORT_SECTIONS,
    TIME_PRECISION_CUTOFF_SECONDS,
    TIMEOUT_SECONDS,
    Status,
    check_all_generic,
    check_url_generic,
    format_duration,
    generate_headers,
    render_report_generic,
)

REPO_INDEX_URL = "https://raw.githubusercontent.com/keiyoushi/extensions/repo/index.min.json"
TABLE_COLUMNS = ["Status", "Name", "URL", "Time", "Info"]
SITES_REPORT_SECTIONS = [s for s in REPORT_SECTIONS if s[1] != Status.NOT_FOUND]

logging.basicConfig(level=logging.INFO)
log = logging.getLogger(__name__)


class Source(NamedTuple):
    name: str
    url: str


@dataclass(frozen=True, slots=True)
class CheckResult:
    source: Source
    status: Status
    duration: float = -1.0
    info: str = ""
    subcategory: str = ""

    @property
    def sort_key(self) -> tuple[str, str]:
        return (self.source.name.lower(), self.source.url.lower())

    def as_row(self) -> tuple[str, str, str, str, str]:
        time_str = format_duration(self.duration, TIME_PRECISION_CUTOFF_SECONDS)
        return (self.status.value, self.source.name, self.source.url, time_str, self.info)


def extract_sources(repo: list[dict[str, Any]]) -> list[Source]:
    sources = {
        Source(source["name"], url)
        for extension in repo
        for source in extension["sources"]
        for url in source["baseUrl"].split("#, ")
    }
    return sorted(sources)


async def check_source(session: aiohttp.ClientSession, source: Source) -> CheckResult:
    def make_result(status: Status, duration: float, info: str, subcategory: str) -> CheckResult:
        return CheckResult(source, status, duration, info, subcategory)

    return await check_url_generic(session, source.url, make_result)


def log_result(result: CheckResult, source: Source) -> None:
    log.info("%s %s (%s) %s", result.status, source.name, source.url, result.info)


async def main() -> None:
    async with aiohttp.ClientSession() as session:
        log.info("Fetching repository index from %s", REPO_INDEX_URL)
        async with session.get(REPO_INDEX_URL) as resp:
            repository = await resp.json(content_type=None)

    sources = extract_sources(repository)
    log.info("Checking %d unique sources", len(sources))

    seed = ",".join(f"{s.name}:{s.url}" for s in sources)
    headers = generate_headers(seed)

    async with aiohttp.ClientSession(
        timeout=aiohttp.ClientTimeout(total=TIMEOUT_SECONDS),
        headers=headers,
    ) as session:
        sources_shuffled = sources.copy()
        random.shuffle(sources_shuffled)
        results = await check_all_generic(session, sources_shuffled, check_source, log_result)

    report = render_report_generic(
        "Site Status Report",
        len(results),
        headers["User-Agent"],
        results,
        SITES_REPORT_SECTIONS,
        TABLE_COLUMNS,
    )
    await Path("STATUS.md").write_text(report, encoding="utf-8")


if __name__ == "__main__":
    asyncio.run(main())
