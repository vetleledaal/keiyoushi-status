# Extension Validation Report

- Extension: tachiyomi-zh.mycomic-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 26
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 4
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9119537447562549661
- Source name: MyComic
- Source language: zh
- Selected manga input: popular offset 0: 美麗新世界！ (`.../54348`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | 美麗新世界！ (`.../54348`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | 獵人遊戲W (`.../55355`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 美麗新世界！ (`.../54348`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 262 | 第100话 (`.../792989`) |  | <1s |
| pages | `fetchPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | HTTP error 403 |  |  |  |
| latest pagination | SKIP | HTTP error 403 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://biccam.com/.../54348-ecdd37.jpg` (image/jpeg, 15563 bytes, 180x240) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../54348` |  |  |  |
| details thumbnail URL | PASS | `https://biccam.com/.../54348-ecdd37.jpg` |  |  |  |
| details author | PASS | 尹坤志 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 職場, 生活, 青年, 韓國 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 走後門進全國最大企業上班的豪承，因為同事的輕視和冷落，長期籠罩在屈辱的陰影之下。因為一道突如其來的人事命令，而跑去找組長理論… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 262 chapters |  |  |  |
| chapter dates | PASS | 262 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 403 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
