# Extension Validation Report

- Extension: tachiyomi-all.playmatehunter-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 27
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: masonry
- Source ID: 1082062847119890629
- Source name: Playmate Hunter
- Source language: all
- Selected manga input: popular offset 0: Arizona Dream (`.../shantal-monique-arizona-dream-nude`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Arizona Dream (`.../shantal-monique-arizona-dream-nude`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Roxy Shaw in After Class from Playboy (`.../roxy-shaw-in-after-class`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Arizona Dream (`.../shantal-monique-arizona-dream-nude`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../shantal-monique-arizona-dream-nude`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Invalid manga: popular entry 2: title=<blank>, URL=`.../amanda-streich-nude`, popular entry 7: title=<blank>, URL=`.../jaclyn-swedberg-nude`, popular entry 10: title=<blank>, URL=`.../jessica-taylor-nude`, popular entry 12: title=<blank>, URL=`.../katie-anderson-nude`, popular entry 15: title=<blank>, URL=`.../wendy-kaye-nude` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | PASS | 38/38 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.pmatehunter.com/.../8710_masonry_1200.jpg` (image/jpeg, 297406 bytes, 1200x1679) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shantal-monique-arizona-dream-nude` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Shantal Monique |  |  |  |
| details artist | PASS | Shantal Monique |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Shantal Monique |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://pmatehunter.com/.../1` to `https://pmatehunter.com/.../newest` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.pmatehunter.com/.../shantal-monique-arizona-dream-01.jpg` (image/jpeg, 185040 bytes, 1200x800) |  |  |  |
