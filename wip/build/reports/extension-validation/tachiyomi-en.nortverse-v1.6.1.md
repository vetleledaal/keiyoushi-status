# Extension Validation Report

- Extension: tachiyomi-en.nortverse-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 0
- Warnings: 0
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2836009758311292809
- Source name: Nortverse
- Source language: en
- Selected manga input: popular offset 0: Nortverse (`.../comic`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1 | Nortverse (`.../comic`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Nortverse (`.../comic`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Nortverse (`.../comic`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 497 | #1. Overconfidence (`.../overconfidence`) |  | 1-10s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nortverse, URL=`.../comic` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 2/2 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 2/2 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../cropped-Site-Icon.png <redacted query values: fit and ssl>` (image/png, 90912 bytes, 512x512) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../comic` |  |  |  |
| details thumbnail URL | PASS | `https://i0.wp.com/.../cropped-Site-Icon.png <redacted query values: fit and ssl>` |  |  |  |
| details author | PASS | nortuet |  |  |  |
| details artist | PASS | nortuet |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Tara and Beverly |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 497 chapters |  |  |  |
| chapter dates | PASS | 497 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i0.wp.com/.../for-posting.png <redacted query values: ssl>` (image/webp (encoding: lossless), 975320 bytes, 950x2170) |  |  |  |
