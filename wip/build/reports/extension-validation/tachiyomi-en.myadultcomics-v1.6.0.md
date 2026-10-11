# Extension Validation Report

- Extension: tachiyomi-en.myadultcomics-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4116931674173505341
- Source name: MyAdultComics
- Source language: en
- Selected manga input: popular offset 0: Breaking the last fast (`.../read.php <redacted query values: i>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | Breaking the last fast (`.../read.php <redacted query values: i>`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | Blind Date (`.../read.php <redacted query values: i>`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Breaking the last fast (`.../read.php <redacted query values: i>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Breaking the last fast (`.../read.php <redacted query values: i>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../read.php <redacted query values: i>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 25 |  |  | <1s |

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
| details thumbnail URL | PASS | `https://myadultcomics.com/.../1637.jpg` |  |  |  |
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
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://myadultcomics.com/.../1.jpg` (image/jpeg, 395109 bytes, 1357x1920) |  |  |  |
