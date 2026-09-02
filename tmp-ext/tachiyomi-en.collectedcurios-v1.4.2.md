# Extension Validation Report

- Extension: tachiyomi-en.collectedcurios-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1896428900030795228
- Source name: Collected Curios
- Source language: en
- Selected manga input: popular offset 0: Sequential Art (`.../sequentialart.php`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 3 | Sequential Art (`.../sequentialart.php`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | Sequential Art (`.../sequentialart.php`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Sequential Art (`.../sequentialart.php`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1288 | Chapter - 1 (`.../sequentialart.php <redacted query values: s>`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sequential Art, URL=`.../sequentialart.php` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 6/6 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 6/6 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.collectedcurios.com/.../CC_2011_Sequential_Art_Button.jpg` (image/jpeg, 50829 bytes, 575x79) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sequentialart.php` |  |  |  |
| details thumbnail URL | PASS | `https://www.collectedcurios.com/.../CC_2011_Sequential_Art_Button.jpg` |  |  |  |
| details author | PASS | Jolly Jack aka Phillip M Jackson |  |  |  |
| details artist | PASS | Jolly Jack aka Phillip M Jackson |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Sequential Art webcomic. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1288 chapters |  |  |  |
| chapter dates | LINT | All 1288 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1288 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.collectedcurios.com/.../SA_0001_small.jpg` (image/jpeg, 73096 bytes, 900x290) |  |  |  |
