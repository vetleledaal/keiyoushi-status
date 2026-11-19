# Extension Validation Report

- Extension: tachiyomi-en.extrafabulouscomics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 1
- Warnings: 0
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 633679469952676219
- Source name: Extra Fabulous Comics
- Source language: en
- Selected manga input: popular offset 0: Extra Fabulous Comics (`.../archive`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1 | Extra Fabulous Comics (`.../archive`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Extra Fabulous Comics (`.../archive`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Extra Fabulous Comics (`.../archive`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1204 | 1 (`.../____1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Extra Fabulous Comics, URL=`.../archive` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 2/2 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 2/2 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.wixstatic.com/.../904535_d7187dcb8545431db8f80865f59ef376~mv2.png` (image/png, 125781 bytes, 421x421) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../archive` |  |  |  |
| details thumbnail URL | PASS | `https://static.wixstatic.com/.../904535_d7187dcb8545431db8f80865f59ef376~mv2.png` |  |  |  |
| details author | PASS | Zach M. Stafford |  |  |  |
| details artist | PASS | Zach M. Stafford |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | comics from hell and beyond, beyond hell, the field beyond hell where they grow corn and shit. Shit comics from the cornfield beyond hell |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1204 chapters |  |  |  |
| chapter dates | PASS | 1204 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static.wixstatic.com/.../904535_21a33add809344569a778f42715f08fc~mv2.gif` (image/gif (format: 89a), 211057 bytes, 487x750) |  |  |  |
