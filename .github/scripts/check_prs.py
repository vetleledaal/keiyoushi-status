#!/usr/bin/env -S uv run --script
# /// script
# requires-python = ">=3.11"
# dependencies = [
#   "aiohttp[speedups]",
#   "anyio",
#   "beautifulsoup4[lxml]",
#   "publicsuffixlist",
#   "pygithub",
#   "tabulate",
#   "ua-generator",
#   "yarl",
# ]
# ///

from __future__ import annotations

import asyncio
import json
import logging
import random
import re
import subprocess  # noqa: S404
from dataclasses import dataclass
from typing import NamedTuple

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
from publicsuffixlist import PublicSuffixList  # type: ignore[import-untyped]

REPO = "keiyoushi/extensions-source"
LABEL = "Source Request"
TABLE_COLUMNS = ["Status", "PR", "URL", "Time", "Info"]

logging.basicConfig(level=logging.INFO)
log = logging.getLogger(__name__)
psl = PublicSuffixList()

URL_RE = re.compile(r"https?://[^\s\)>\]\"']+", re.IGNORECASE)
MD_LINK_RE = re.compile(r"\[([^\]]+)\]\((https?://[^\s\)]+)\)", re.IGNORECASE)
DOMAIN_RE = re.compile(r"\b([a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z]{2,}\b", re.IGNORECASE)
BLACKLIST_DOMAINS = {"github.blog", "github.com", "github.io", "tachiyomi.org"}
STRIKETHROUGH_RE = re.compile(r"~+[^~\n]+~+")
SOURCE_LINK_RES = [
    re.compile(r"###\s*Source\s+link\s*\n(.*?)(?=\n###|\n##|\Z)", re.IGNORECASE | re.DOTALL),
    re.compile(r"###\s*Source\s+new\s+URL\s*\n(.*?)(?=\n###|\n##|\Z)", re.IGNORECASE | re.DOTALL),
]


class PrUrl(NamedTuple):
    pr_number: int
    url: str


@dataclass(frozen=True, slots=True)
class CheckResult:
    pr: PrUrl
    status: Status
    duration: float = -1.0
    info: str = ""
    subcategory: str = ""

    @property
    def sort_key(self) -> tuple[int, str]:
        return (-self.pr.pr_number, self.pr.url)

    def as_row(self) -> tuple[str, ...]:
        time_str = format_duration(self.duration, TIME_PRECISION_CUTOFF_SECONDS)
        pr_link = f"[#{self.pr.pr_number}](https://github.com/{REPO}/issues/{self.pr.pr_number})"
        return (self.status.value, pr_link, self.pr.url, time_str, self.info)


def extract_source_link_section(body: str) -> str:
    sections = []
    for pattern in SOURCE_LINK_RES:
        match = pattern.search(body)
        if match:
            sections.append(match.group(1))
    return "\n".join(sections)


def is_blacklisted(url: str) -> bool:
    return any(domain in url.lower() for domain in BLACKLIST_DOMAINS)


def extract_urls_from_text(text: str, urls: set[str]) -> None:
    for match in URL_RE.finditer(text):
        url = match.group().rstrip(".,;:!?")
        if not is_blacklisted(url):
            urls.add(url)
    for match in DOMAIN_RE.finditer(text):
        domain = match.group().lower()
        if is_blacklisted(domain) or any(domain in u for u in urls):
            continue
        suffix = psl.publicsuffix(domain)
        if suffix and suffix != domain and psl.privatesuffix(domain):
            urls.add(f"https://{domain}")


def extract_urls_from_md_links(text: str, urls: set[str]) -> None:
    for match in MD_LINK_RE.finditer(text):
        url = match.group(2).rstrip(".,;:!?")
        if not is_blacklisted(url):
            urls.add(url)


def extract_urls(text: str) -> set[str]:
    text = STRIKETHROUGH_RE.sub("", text)
    urls: set[str] = set()
    extract_urls_from_md_links(text, urls)
    extract_urls_from_text(text, urls)
    return urls


def fetch_issues() -> list[dict]:
    cmd = ["gh", "issue", "list", "-R", REPO, "-l", LABEL, "-s", "open", "-L", "1000", "--json", "number,body"]
    return json.loads(subprocess.run(cmd, capture_output=True, text=True, check=True).stdout)  # noqa: S603


def extract_pr_urls(issues: list[dict]) -> list[PrUrl]:
    pr_urls: list[PrUrl] = []
    for issue in issues:
        number = issue["number"]
        body = issue["body"]
        section = extract_source_link_section(body)
        urls = extract_urls(section) or extract_urls(body)
        if urls:
            pr_urls.extend(PrUrl(number, url) for url in urls)
        else:
            pr_urls.append(PrUrl(number, ""))
    return sorted(pr_urls)


async def check_url(session: aiohttp.ClientSession, pr: PrUrl) -> CheckResult:
    if not pr.url:
        return CheckResult(pr, Status.NOT_FOUND)

    def make_result(status: Status, duration: float, info: str, subcategory: str) -> CheckResult:
        return CheckResult(pr, status, duration, info, subcategory)

    return await check_url_generic(session, pr.url, make_result)


def log_result(result: CheckResult, pr: PrUrl) -> None:
    log.info("%s #%d (%s) %s", result.status, pr.pr_number, pr.url, result.info)


async def main() -> None:
    issues = list(fetch_issues())
    pr_urls = extract_pr_urls(issues)
    log.info("Checking %d URLs from %d issues", len(pr_urls), len(issues))

    seed = ",".join(f"{p.pr_number}:{p.url}" for p in pr_urls)
    headers = generate_headers(seed)

    async with aiohttp.ClientSession(
        timeout=aiohttp.ClientTimeout(total=TIMEOUT_SECONDS),
        headers=headers,
    ) as session:
        pr_urls_shuffled = pr_urls.copy()
        random.shuffle(pr_urls_shuffled)
        results = await check_all_generic(session, pr_urls_shuffled, check_url, log_result)

    report = render_report_generic(
        "Source Request URLs",
        len(results),
        headers["User-Agent"],
        results,
        REPORT_SECTIONS,
        TABLE_COLUMNS,
    )
    await Path("STATUS_PR.md").write_text(report, encoding="utf-8")


if __name__ == "__main__":
    asyncio.run(main())
