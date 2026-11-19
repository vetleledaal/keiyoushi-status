# Extension Validation Report

- Extension: tachiyomi-all.manta-v1.6.12
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 8753096034341798862
- Source name: Manta
- Source language: en
- Selected manga input: popular offset 0: Love Order [Full ver.] (`.../5300`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | Love Order [Full ver.] (`.../5300`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Love Order [Full ver.] (`.../5300`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Love Order [Full ver.] (`.../5300`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 13 | Episode 1 (`.../246111`) |  | <1s |
| pages | `getPageList(chapter)` | success | 74 |  |  | <1s |

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
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Love Order \[Full ver.\], URL=`5300` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.mantacdn.net/.../j7UQ46iuTxOtishP.jpg` (image/jpeg, 79815 bytes, 480x690) |  |  |  |
| details identity | PASS | Details preserved selected URL `5300` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Manta Comics |  |  |  |
| details artist | PASS | Kangneuk |  |  |  |
| details genres | PASS | BL, Modern, Eastern/Asian-inspired setting, Childhood friends, Cohabitation, Long-term relationship, Housemates/Roommates, Capable Top, Yearning Bottom, Adult/Mature, Bittersweet, Steamy, New, Exclusive, Event |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Woojin has spent thirteen years secretly loving his best friend, Itaе. When Itaе convinces him to move in, Woojin's carefully guarded feelings become impossible to hide. But after one unexpected turn of events, the line between friends gets a little blurry. So... what exactly are they now? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 13 chapters |  |  |  |
| chapter dates | PASS | 13 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 74 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://si.mantacdn.net/.../aEnAVu8t2GR9Wx8v.jpg <redacted query values: sign>` (image/jpeg, 34297 bytes, 720x1203) |  |  |  |
