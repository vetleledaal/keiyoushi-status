# Extension Validation Report

- Extension: tachiyomi-en.infinitescan-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8292631754651560785
- Source name: Infinite-Scan
- Source language: en
- Selected manga input: popular offset 0: Omniscient Readers Viewpoint (`.../omniscient-readers-viewpoint`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 4 | Omniscient Readers Viewpoint (`.../omniscient-readers-viewpoint`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Omniscient Readers Viewpoint (`.../omniscient-readers-viewpoint`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Omniscient Readers Viewpoint (`.../omniscient-readers-viewpoint`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 303 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | <1s |

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
| popular listing | PASS | 4 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Omniscient Readers Viewpoint, URL=`.../omniscient-readers-viewpoint` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 5/5 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 5/5 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.infinite-scan.com/.../omniscient-readers-viewpoint.webp` (image/webp (encoding: lossy), 25264 bytes, 330x467) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../omniscient-readers-viewpoint` |  |  |  |
| details thumbnail URL | PASS | `https://www.infinite-scan.com/.../omniscient-readers-viewpoint.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 303 chapters |  |  |  |
| chapter dates | LINT | All 303 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=303 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://pub-7c6c993d07f040f5b5c04f51b163a386.r2.dev/.../01.webp` (image/webp (encoding: lossy), 367236 bytes, 800x12530) |  |  |  |
