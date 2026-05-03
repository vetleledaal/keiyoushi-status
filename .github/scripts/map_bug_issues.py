#!/usr/bin/env -S uv run --script
# /// script
# requires-python = ">=3.11"
# dependencies = [
#   "pykakasi",
#   "pypinyin",
#   "rapidfuzz",
# ]
# ///

from __future__ import annotations

import json
import os
import re
import subprocess
from dataclasses import dataclass, field
from datetime import datetime, timezone
from pathlib import Path

from pykakasi import kakasi
from pypinyin import lazy_pinyin
from rapidfuzz import fuzz, process
from rapidfuzz import utils as fuzz_utils

EXT_REPO = Path(os.getenv("EXT_REPO", "extensions-source")) / "src"
STATUS_MD = Path(os.getenv("STATUS_MD", "STATUS.md"))
OUTPUT_FILE = Path(os.getenv("OUTPUT_FILE", "STATUS_ISSUE_MAP.md"))
REPO = os.getenv("SOURCE_REPO", "keiyoushi/extensions-source")
SCORE_CUTOFF = 90
SKIP_LABELS = frozenset({"Meta request"})

CJK_RE = re.compile(r"[\u4e00-\u9fff\u3400-\u4dbf\u3040-\u309f\u30a0-\u30ff]")
PKG_ID_RE = re.compile(r"\b\w{2}\.\w+")  # e.g. co.navercomic, id.shinigami
EXT_NAME_RE = re.compile(r"""extName\s*=\s*['"](.+?)['"]""")
EXT_CLASS_RE = re.compile(r"""extClass\s*=\s*['"]\s*\.?(\w+)['"]""")
KT_NAME_RE = re.compile(r"""override\s+val\s+name(?:\s*:\s*\w+)?\s*=\s*['"](.+?)['"]""")
KT_CLASS_DEF_RE = re.compile(
    r"""^class\s+(\w+)(?:\s*\([^)]*\))?\s*:\s*([A-Z]\w*)\s*\(\s*['"]([ \w][^'"]{1,48})['"]""",
    re.MULTILINE,
)
# Parent class names matching this pattern are filter/UI helpers, not source base classes.
# e.g. UriPartFilter, SlugGroupFilter, SlugSelectFilter, Filter
KT_FILTER_PARENT_RE = re.compile(r"(?i)filter|select|tristate|checkbox|chip")
URL_RE = re.compile(r"https?://[^\s\)\]>\"']+", re.IGNORECASE)

SOURCE_INFO_RE = re.compile(
    r"###\s*Source\s+(?:information|name)\s*\n(.*?)(?=\n###|\n##|\Z)",
    re.IGNORECASE | re.DOTALL,
)
VERSION_RE = re.compile(r"\s+v?\d[\d.]*\s*$", re.IGNORECASE)
KANA_RE = re.compile(r"[\u3040-\u309f\u30a0-\u30ff]")
STATUS_ROW_URL_RE = re.compile(r"\|\s*(\S+)\s*\|\s*(.+?)\s*\|\s*(https?://\S+?)\s*\|")
STATUS_ROW_RE = re.compile(r"\|\s*(\S+)\s*\|\s*(.+?)\s*\|\s*\|")
STRIP_PROTO_RE = re.compile(r"^https?://")
STRIP_WWW_RE = re.compile(r"^(www\.)?")
SLUG_NORM_RE = re.compile(r"[\s\-_]+")
EXT_NAME_PREFIX_RE = re.compile(r"^Extension\s+name:\s*", re.IGNORECASE)
SOURCE_SPLIT_RE = re.compile(r"[;(]")
VERSION_ONLY_RE = re.compile(r"v?\d[\d.]*", re.IGNORECASE)
IGNORE_LINE_RE = re.compile(r"^(the\s+plugin|version\b)", re.IGNORECASE)
TRAILING_VER_RE = re.compile(r"(?<=[a-zA-Z\u4e00-\u9fff])\d+\.\d[\d.]*$")
TRAILING_V_RE = re.compile(r"\s+v$", re.IGNORECASE)
TITLE_TAG_RE = re.compile(r"^\[.*?\]\s*")
TITLE_SPLIT_RE = re.compile(r"^(.+?)(?:\s*:\s|\s+-\s)")
TITLE_SLASH_RE = re.compile(r"\s*/\s*")

_kakasi = kakasi()


@dataclass(frozen=True, slots=True)
class StatusEntry:
    emoji: str
    name: str
    url: str


@dataclass(frozen=True, slots=True)
class Match:
    entry: StatusEntry
    score: float
    method: str  # "url" | "fuzzy" | "fuzzy+kt"


@dataclass
class IssueResult:
    number: int
    title: str
    source_name: str
    matches: list[Match] = field(default_factory=list)


def romanize(text: str) -> list[str]:
    has_kana = bool(KANA_RE.search(text))
    slugs: list[str] = []
    if not has_kana:
        s = "".join(lazy_pinyin(text)).lower()
        if s and s != text.lower():
            slugs.append(s)
    else:
        s = "".join(item["hepburn"] for item in _kakasi.convert(text)).lower()
        if s and s != text.lower() and s not in slugs:
            slugs.append(s)
    return slugs


def build_ext_db(src: Path) -> dict[str, set[str]]:
    db: dict[str, set[str]] = {}
    for gradle in src.rglob("build.gradle"):
        gradle_text = gradle.read_text(errors="ignore")
        m = EXT_NAME_RE.search(gradle_text)
        if not m:
            continue
        ext_name = m.group(1)
        mc = EXT_CLASS_RE.search(gradle_text)
        ext_class_name = mc.group(1) if mc else None
        kt_names: set[str] = set()
        for kt in gradle.parent.rglob("*.kt"):
            text = kt.read_text(errors="ignore")
            kt_names.update(km.group(1) for km in KT_NAME_RE.finditer(text))
            # Factory pattern: class VCP : VerComics("VCP", ...) — capture display names
            # from classes inheriting non-filter base classes.
            # Require name to start uppercase to exclude ISO language codes ("af", "fr", "id" ...)
            # which MangaDex and similar factory extensions pass as the first constructor arg.
            for km in KT_CLASS_DEF_RE.finditer(text):
                if not KT_FILTER_PARENT_RE.search(km.group(2)) and km.group(3)[0].isupper():
                    kt_names.add(km.group(3))
        db[ext_name.lower()] = kt_names
        # Also allow lookup by extClass name (e.g. "MangaGun" → {"NihonKuni"})
        if ext_class_name:
            class_key = ext_class_name.lower()
            if class_key != ext_name.lower():
                db.setdefault(class_key, set()).add(ext_name)
        # Also index by directory slug (e.g. "spectralscan" → {"Nexus Toons"})
        dir_key = gradle.parent.name.lower()
        if dir_key != ext_name.lower():
            db.setdefault(dir_key, set()).add(ext_name)
    return db


def parse_status_md(path: Path) -> tuple[list[StatusEntry], list[str], dict[str, StatusEntry]]:
    base: list[StatusEntry] = []
    for line in path.read_text(encoding="utf-8").splitlines():
        m = STATUS_ROW_URL_RE.match(line)
        if m:
            base.append(StatusEntry(m.group(1), m.group(2).strip(), m.group(3).strip()))
            continue
        m = STATUS_ROW_RE.match(line)
        if m and (name := m.group(2).strip()) and not name.startswith("-"):
            base.append(StatusEntry(m.group(1), name, ""))

    match_entries: list[StatusEntry] = list(base)
    match_names: list[str] = [e.name for e in base]
    for e in base:
        if CJK_RE.search(e.name):
            for slug in romanize(e.name):
                match_entries.append(e)
                match_names.append(slug)

    host_map: dict[str, StatusEntry] = {
        STRIP_WWW_RE.sub("", STRIP_PROTO_RE.sub("", e.url).split("/")[0].lower()): e for e in base if e.url
    }
    return match_entries, match_names, host_map


def extract_source_name(body: str) -> str:
    m = SOURCE_INFO_RE.search(body)
    if not m:
        return ""
    for raw_line in m.group(1).splitlines():
        line = raw_line.strip().strip("\"'")
        if not line:
            continue
        line = EXT_NAME_PREFIX_RE.sub("", line)
        line = VERSION_RE.sub("", line).strip()
        line = SOURCE_SPLIT_RE.split(line)[0].strip()
        if VERSION_ONLY_RE.fullmatch(line):
            continue
        if IGNORE_LINE_RE.match(line):
            continue
        line = TRAILING_VER_RE.sub("", line).strip()
        line = TRAILING_V_RE.sub("", line).strip()
        line = line.replace("_", " ")
        if line:
            return line
    return ""


def title_to_names(title: str) -> list[str]:
    title = TITLE_TAG_RE.sub("", title)
    m = TITLE_SPLIT_RE.match(title)
    part = m.group(1).strip() if m else title
    return [n.strip() for n in TITLE_SLASH_RE.split(part) if n.strip()]


def match_issue(
    source_name: str,
    title: str,
    body: str,
    *,
    match_entries: list[StatusEntry],
    match_names: list[str],
    host_map: dict[str, StatusEntry],
    ext_db: dict[str, set[str]],
) -> list[Match]:
    seen: dict[str, Match] = {}

    # 1. URL host → exact match
    for raw_url in URL_RE.findall(body):
        url = raw_url.rstrip(".,;")
        if "github.com" in url or "tachiyomi" in url:
            continue
        stripped = STRIP_PROTO_RE.sub("", url).split("?")[0].rstrip("/").lower()
        host = STRIP_WWW_RE.sub("", stripped.split("/")[0])
        if host in host_map and host_map[host].name not in seen:
            seen[host_map[host].name] = Match(host_map[host], 100.0, "url")

    # 2. Fuzzy: source_name + title parts + Kotlin name aliases
    # Kotlin alias lookup only fires when source_name is a package ID (e.g. co.navercomic)
    title_names = [n for n in title_to_names(title) if n.lower() != source_name.lower()]
    queries: list[tuple[str, str]] = [(source_name, "fuzzy"), *((n, "fuzzy") for n in title_names)]
    # Look up by exact name, extClass, or dir slug (slug strips spaces/hyphens for e.g. "Spectral Scan" → "spectralscan")
    slug = SLUG_NORM_RE.sub("", source_name.lower())
    kt_names = ext_db.get(source_name.lower(), set()) | ext_db.get(slug, set())
    # For pkg-style IDs (e.g. "Fr.softepsilonscan"), also look up the suffix after the dot
    if PKG_ID_RE.match(source_name):
        pkg_suffix = source_name.lower().split(".", 1)[-1]
        kt_names |= ext_db.get(pkg_suffix, set())
    queries.extend((kt_name, "fuzzy+kt") for kt_name in kt_names if kt_name.lower() != source_name.lower())

    for query, method in queries:
        for _matched_name, score, idx in process.extract(
            query,
            match_names,
            scorer=fuzz.token_set_ratio,
            processor=fuzz_utils.default_process,
            limit=3,
            score_cutoff=SCORE_CUTOFF,
        ):
            e = match_entries[idx]
            if e.name not in seen:
                seen[e.name] = Match(e, score, method)

    # URL matches first, then by score descending
    return sorted(seen.values(), key=lambda m: (m.method != "url", -m.score))


def render_table(results: list[IssueResult]) -> str:
    today = datetime.now(tz=timezone.utc).date().isoformat()
    matched = sum(1 for r in results if r.matches)
    table_header = ["| Issue | Source | Status | Extension | URL |", "|-------|--------|:------:|-----------|-----|"]

    def issue_rows(r: IssueResult) -> list[str]:
        issue_link = f"[#{r.number}](https://github.com/{REPO}/issues/{r.number})"
        title = r.title.replace("|", "\\|")
        source = (r.source_name or "-").replace("|", "\\|")
        rows = []
        for i, m in enumerate(r.matches):
            issue_cell = f"{issue_link} {title}" if i == 0 else f"↳ [#{r.number}]"
            src_cell = source if i == 0 else ""
            url_cell = f"[{m.entry.url}]({m.entry.url})" if m.entry.url else ""
            score_str = f"{m.score:.0f}" if m.score < 100 else "100"
            detail = f" `{m.method} {score_str}`" if m.method != "url" else " `url`"
            rows.append(
                f"| {issue_cell} | {src_cell} | {m.entry.emoji} | {m.entry.name.replace('|', chr(92) + '|')}{detail} | {url_cell} |",
            )
        return rows

    matched_results = [r for r in results if r.matches]
    unmatched_results = [r for r in results if not r.matches]

    lines = [
        "# Bug Issue → Extension Map\n",
        f"_Updated {today}. Matched {matched} of {len(results)} open bug issues._\n",
        f"## Matched ({len(matched_results)})\n",
        *table_header,
        *(row for r in matched_results for row in issue_rows(r)),
        f"\n## No match ({len(unmatched_results)})\n",
        *table_header,
        *(
            f"| [#{r.number}](https://github.com/{REPO}/issues/{r.number}) {r.title.replace('|', chr(92) + '|')} | {(r.source_name or '-').replace('|', chr(92) + '|')} | | | |"
            for r in unmatched_results
        ),
    ]
    return "\n".join(lines) + "\n"


def main() -> None:
    result = subprocess.run(
        [
            "gh",
            "issue",
            "list",
            "-R",
            REPO,
            "-l",
            "Bug",
            "-s",
            "open",
            "-L",
            "1000",
            "--json",
            "number,title,body,labels",
        ],
        capture_output=True,
        text=True,
        check=True,
    )
    issues = json.loads(result.stdout)
    match_entries, match_names, host_map = parse_status_md(STATUS_MD)
    ext_db = build_ext_db(EXT_REPO)

    results: list[IssueResult] = []
    for issue in issues:
        if any(lbl["name"] in SKIP_LABELS for lbl in issue.get("labels", [])):
            continue
        body = issue["body"] or ""
        source_name = extract_source_name(body) or issue["title"]
        results.append(
            IssueResult(
                number=issue["number"],
                title=issue["title"],
                source_name=source_name,
                matches=match_issue(
                    source_name,
                    issue["title"],
                    body,
                    match_entries=match_entries,
                    match_names=match_names,
                    host_map=host_map,
                    ext_db=ext_db,
                ),
            ),
        )

    results.sort(key=lambda r: -r.number)
    OUTPUT_FILE.write_text(render_table(results), encoding="utf-8")

    matched = sum(1 for r in results if r.matches)
    print(f"Total: {len(results)} | Matched: {matched} | No match: {len(results) - matched}")


if __name__ == "__main__":
    main()
