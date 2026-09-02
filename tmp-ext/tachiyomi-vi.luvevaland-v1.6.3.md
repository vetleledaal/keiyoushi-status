# Extension Validation Report

- Extension: tachiyomi-vi.luvevaland-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 21
- Lint: 0
- Warnings: 0
- Skipped: 13
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4980383988041274982
- Source name: LuvEvaLand
- Source language: vi
- Selected manga input: popular offset 0: QUÝ CÔ BÍ ẨN - SECRET LADY (`.../quy-co-bi-an.727`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | QUÝ CÔ BÍ ẨN - SECRET LADY (`.../quy-co-bi-an.727`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | QUÝ CÔ BÍ ẨN - SECRET LADY (`.../quy-co-bi-an.727`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | java.lang.NullPointerException | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 124 | Chap 1 (`.../chap-1.27533`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | SKIP | HTTP error 403 |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=QUÝ CÔ BÍ ẨN - SECRET LADY, URL=`.../quy-co-bi-an.727` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | HTTP error 403 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 16/16 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 16/16 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://picevaland.xyz/.../webqcba.png` (image/png, 769693 bytes, 500x750) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 124 chapters |  |  |  |
| chapter dates | PASS | 124 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://picevaland.xyz/.../0-1-copy.jpg` (image/jpeg, 2125759 bytes, 720x12000) |  |  |  |
