# Extension Validation Report

- Extension: tachiyomi-vi.luvevaland-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 23
- Lint: 0
- Warnings: 1
- Skipped: 11
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4980383988041274982
- Source name: LuvEvaLand
- Source language: vi
- Selected manga input: latest offset 0: THỎA HIỆP HÔN NHÂN 2 - KHÚC CA KHÓ QUÊN (`.../thoa-hiep-hon-nhan-2-khuc-ca-kho-quen.2368`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | THỎA HIỆP HÔN NHÂN 2 - KHÚC CA KHÓ QUÊN (`.../thoa-hiep-hon-nhan-2-khuc-ca-kho-quen.2368`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | MỐI TÌNH THUẦN KHIẾT HƯ HỎNG (`.../su-thuan-khiet-hu-hong.2559`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | THỎA HIỆP HÔN NHÂN 2 - KHÚC CA KHÓ QUÊN (`.../thoa-hiep-hon-nhan-2-khuc-ca-kho-quen.2368`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | java.lang.NullPointerException | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 53 | Chap 1 (`.../chap-1.127849`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 59 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | SKIP | HTTP error 403 |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=THỎA HIỆP HÔN NHÂN 2 - KHÚC CA KHÓ QUÊN, URL=`.../thoa-hiep-hon-nhan-2-khuc-ca-kho-quen.2368` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | HTTP error 403 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 25/25 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 25/25 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://picevaland.xyz/.../web-thhn2kckq.png` (image/png, 927188 bytes, 500x750) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 53 chapters |  |  |  |
| chapter dates | PASS | 53 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 59 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://luvevalands2.co/.../thoa-hiep-hon-nhan-2-khuc-ca-kho-quen.2368` to `https://luvevalands2.co/.../un-lock <redacted query values: link>` (1 redirects) |  |  |  |
| page load | PASS | `https://picevaland.xyz/.../000.jpg` (image/jpeg, 958803 bytes, 960x3655) |  |  |  |
