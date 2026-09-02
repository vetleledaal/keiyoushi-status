# Extension Validation Report

- Extension: tachiyomi-en.egscomics-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 0
- Warnings: 1
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6631281276194159210
- Source name: El Goonish Shive
- Source language: en
- Selected manga input: popular offset 0: El Goonish Shive (`.../archive`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 3 | El Goonish Shive (`.../archive`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | El Goonish Shive (`.../archive`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 3605 | 2002-01-21 (`.../2002-01-21`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | <1s |

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
| popular listing | PASS | 3 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 3/3 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 3/3 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://static.tumblr.com/.../tumblr_static_1f2fhwjyya74gsgs888g8k880.png` -> all 3 manga URLs (examples: `.../archive`, `.../archive`, `.../archive`) |  |  |  |
| thumbnail | PASS | `https://static.tumblr.com/.../tumblr_static_1f2fhwjyya74gsgs888g8k880.png` (image/png, 709872 bytes, 1920x1097) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../archive` |  |  |  |
| details thumbnail URL | PASS | `https://static.tumblr.com/.../tumblr_static_1f2fhwjyya74gsgs888g8k880.png` |  |  |  |
| details author | PASS | Dan Shive |  |  |  |
| details artist | PASS | Dan Shive |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | El Goonish Shive is a comic about a group of teenagers who face both real life and bizarre, supernatural situations. <br><br>It is a comedy mixed with drama and is recommended for audiences thirteen and older. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3605 chapters |  |  |  |
| chapter dates | PASS | 3605 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.egscomics.com/.../20020121_cqrF.gif` (image/gif (format: 89a), 29846 bytes, 700x259) |  |  |  |
