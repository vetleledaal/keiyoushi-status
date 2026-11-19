# Extension Validation Report

- Extension: tachiyomi-th.rankermanga-v1.6.6
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 3
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zmanga
- Source ID: 8308198409738470637
- Source name: Ranker-Manga
- Source language: th
- Selected manga input: popular offset 0: Overgeared (Remake) (`.../overgeared-remake`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Overgeared (Remake) (`.../overgeared-remake`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | Tsuiraku JK to Haijin Kyoushi (`.../tsuiraku-jk-to-haijin-kyoushi`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | Mitsuishi-san wa Doko ka Okashii (`.../mitsuishi-san-wa-doko-ka-okashii`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Overgeared (Remake) (`.../overgeared-remake`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Overgeared (Remake) (`.../overgeared-remake`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 318 | ตอนที่ 25 (`.../overgeared-remake-25`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Overgeared (Remake), URL=`.../overgeared-remake` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 79/79 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 50/79 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.ranker-manga.com/.../c5bc8f02cf6fab52c4018a48d7c6ab5b-1.jpg` (image/jpeg, 712537 bytes, 720x972) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../overgeared-remake` |  |  |  |
| details thumbnail URL | PASS | `https://www.ranker-manga.com/.../c5bc8f02cf6fab52c4018a48d7c6ab5b-1.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Manhwa, Martial Arts |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 318 chapters |  |  |  |
| chapter dates | PASS | 318 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.ranker-manga.com/.../47J2MITBU9-1601353826.jpg` (image/jpeg, 152649 bytes, 1000x1350) |  |  |  |
