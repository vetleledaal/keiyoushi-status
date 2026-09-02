# Extension Validation Report

- Extension: tachiyomi-en.schlockmercenary-v1.4.2
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
- Source ID: 4705692208637300585
- Source name: Schlock Mercenary
- Source language: en
- Selected manga input: popular offset 0: Book 1: The Tub of Happiness (`.../2000-06-12`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 23 | Book 1: The Tub of Happiness (`.../2000-06-12`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Book 1: The Tub of Happiness (`.../2000-06-12`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 17 | Meet The Mercenaries (`.../2000-06-12`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 54 |  |  | 1-10s |

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
| popular listing | PASS | 23 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 23/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.schlockmercenary.com/.../logo.b6dacbb8.jpg` -> 6 manga URLs (examples: `.../2017-09-18`, `.../2018-07-25`, `.../2019-06-16`) |  |  |  |
| thumbnail | PASS | `https://www.schlockmercenary.com/.../book1.jpg` (image/jpeg, 52677 bytes, 191x247) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2000-06-12` |  |  |  |
| details thumbnail URL | PASS | `https://www.schlockmercenary.com/.../book1.jpg` |  |  |  |
| details author | PASS | Howard Tayler |  |  |  |
| details artist | PASS | Howard Tayler |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | This is the first 507 days of Schlock Mercenary. Meet Schlock when he enlists, meet Breya when she buys the company he enlisted with, and meet Captain Tagon, who doesn't want to take orders from a woman. This 240-page collection of strips is in print, and you can buy it here. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.schlockmercenary.com/.../schlock20000612.jpg <redacted query values: v>` (image/jpeg, 88867 bytes, 780x235) |  |  |  |
