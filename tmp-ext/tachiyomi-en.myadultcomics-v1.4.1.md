# Extension Validation Report

- Extension: tachiyomi-en.myadultcomics-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4116931674173505341
- Source name: MyAdultComics
- Source language: en
- Selected manga input: popular offset 0: Breaking the last fast (`.../read.php <redacted query values: i>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | Breaking the last fast (`.../read.php <redacted query values: i>`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 16 | Blind Date (`.../read.php <redacted query values: i>`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Breaking the last fast (`.../read.php <redacted query values: i>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Breaking the last fast (`.../read.php <redacted query values: i>`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Gallery (`.../read.php <redacted query values: i>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 25 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Breaking the last fast, URL=`.../read.php <redacted query values: i>` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 33/33 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 33/33 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://myadultcomics.com/.../1637.jpg` (image/jpeg, 51802 bytes, 197x280) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../read.php <redacted query values: i>` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | hijabolic, zephyros |  |  |  |
| details artist | PASS | hijabolic, zephyros |  |  |  |
| details genres | PASS | bbw, big ass, big breasts, bisexual, blowjob, breast feeding, collar, cum drinking, cum in mouth, cum swap, cunnilingus, deepthroat, facial hair, fingering, grandmother, grandson, group, handjob, hijab, huge breasts, incest, kissing, milf, mother, old lady, shaved head, son, squirting, stockings, unusual pupils, voluptuous |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://myadultcomics.com/.../1.jpg` (image/jpeg, 395109 bytes, 1357x1920) |  |  |  |
