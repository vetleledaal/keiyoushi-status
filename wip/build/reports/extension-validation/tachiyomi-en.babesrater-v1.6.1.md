# Extension Validation Report

- Extension: tachiyomi-en.babesrater-v1.6.1
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
- Source ID: 3304965214527977054
- Source name: Babes Rater
- Source language: en
- Selected manga input: popular offset 0: Vasia X (`.../vasia-x`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | Vasia X (`.../vasia-x`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Vasia X (`.../vasia-x`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Vasia X (`.../vasia-x`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Nude pictures, page 1 (`.../vasia-x <redacted query values: page>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 25 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Vasia X, URL=`.../vasia-x` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img6.hotnessrater.com/.../vasia-x-nude.jpg <redacted query values: w and h>` (image/jpeg, 53083 bytes, 486x750) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../vasia-x` |  |  |  |
| details thumbnail URL | PASS | `https://img6.hotnessrater.com/.../vasia-x-nude.jpg <redacted query values: w and h>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | ★★★★★ 9.87 (7615)<br>97 Nude Pictures of Vasia X |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | LINT | All 5 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=5 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img6.hotnessrater.com/.../vasia-x-nude.jpg` (image/jpeg, 314697 bytes, 664x1024) |  |  |  |
