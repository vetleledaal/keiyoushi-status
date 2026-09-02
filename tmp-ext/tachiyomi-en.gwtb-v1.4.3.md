# Extension Validation Report

- Extension: tachiyomi-en.gwtb-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 26
- Lint: 2
- Warnings: 0
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4006397036545425884
- Source name: Gone with the Blastwave
- Source language: en
- Selected manga input: popular offset 0: Gone with the Blastwave (`.../index.php`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 1 | Gone with the Blastwave (`.../index.php`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Gone with the Blastwave (`.../index.php`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Gone with the Blastwave (`.../index.php`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 93 | #1. Why do we fight? (`.../index.php <redacted query values: nro>`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Gone with the Blastwave, URL=`.../index.php` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 2/2 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 2/2 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.blastwave-comic.com/.../yarr.jpg` (image/jpeg, 56246 bytes, 480x700) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../index.php` |  |  |  |
| details thumbnail URL | PASS | `https://www.blastwave-comic.com/.../yarr.jpg` |  |  |  |
| details author | PASS | Kimmo Lemetti |  |  |  |
| details artist | PASS | Kimmo Lemetti |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Because war can be boring too. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 93 chapters |  |  |  |
| chapter dates | LINT | All 93 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=93 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.blastwave-comic.com/.../20060501.jpg` (image/jpeg, 132589 bytes, 595x842) |  |  |  |
