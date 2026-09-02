# Extension Validation Report

- Extension: tachiyomi-all.sandraandwoo-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 0
- Warnings: 0
- Skipped: 8
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 8566345145646340492
- Source name: Sandra and Woo
- Source language: en
- Selected manga input: popular offset 0: Sandra and Woo (`.../archive`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 1 | Sandra and Woo (`.../archive`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Sandra and Woo (`.../archive`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1372 | Welcome to Sandra and Woo (`.../welcome-to-sandra-and-woo`) |  | <1s |
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
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 1/1 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1/1 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.sandraandwoo.com/.../zheng-qu-01-color-corrected.jpg` (image/jpeg, 963779 bytes, 1200x1750) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../archive` |  |  |  |
| details thumbnail URL | PASS | `https://www.sandraandwoo.com/.../zheng-qu-01-color-corrected.jpg` |  |  |  |
| details author | PASS | Oliver Knörzer |  |  |  |
| details artist | PASS | Powree |  |  |  |
| details genres | PASS | Comedy |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | Sandra and Woo is a comedy comic strip featuring the 13-year-old girl Sandra North and her mischievous pet raccoon Woo. While most strips are just supposed to be funny or tell an exciting story, some also deal with more serious topics. We also want to show what growing up means for Sandra and her best friends in middle school, Cloud and Larisa. Another regular feature of the comic are Woo’s trips to the forest to meet his furry friends Shadow (a fox) and Sid (a squirrel) and his love interest Lily. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1372 chapters |  |  |  |
| chapter dates | PASS | 1372 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.sandraandwoo.com/.../2000-01-01-Welcome-to-Sandra-and-Woo.png` (image/png, 573428 bytes, 980x3621) |  |  |  |
