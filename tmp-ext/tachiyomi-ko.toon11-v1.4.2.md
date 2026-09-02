# Extension Validation Report

- Extension: tachiyomi-ko.toon11-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 1
- Warnings: 1
- Skipped: 6
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8796296375202334266
- Source name: 11toon
- Source language: ko
- Selected manga input: popular offset 0: 열혈강호 (`.../board.php <redacted query values: bo_table, stx, and is>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 101 | 열혈강호 (`.../board.php <redacted query values: bo_table, stx, and is>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 열혈강호 (`.../board.php <redacted query values: bo_table, stx, and is>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 열혈강호 (`.../board.php <redacted query values: bo_table, stx, and is>`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 313 | 열혈강호 1권 (`.../board.php <redacted query values: bo_table, wr_id, stx, and is>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 99 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 101 entries |  |  |  |
| latest listing | SKIP | HTTP error 500 |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=열혈강호, URL=`.../board.php <redacted query values: bo_table, stx, and is>` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | HTTP error 500 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://11toon8.com/.../1.webp` -> 2 manga URLs (examples: `.../board.php <redacted query values: bo_table, stx, and is>`, `.../board.php <redacted query values: bo_table, stx, and is>`) |  |  |  |
| thumbnail | PASS | `https://11toon8.com/.../1.webp` (image/webp (encoding: lossy), 34526 bytes, 280x390) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../board.php <redacted query values: bo_table, stx, and is>` |  |  |  |
| details thumbnail URL | PASS | `https://11toon8.com/.../1.webp` |  |  |  |
| details author | PASS | 전극진 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 무협 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 무림의 실권을 놓고 정파(正派)와 사파(邪派)가 대립하고 있던 혼란의 시대. 사파 무림지존인 천마신군의 6번째 제자인 한비광은 뛰어난 경공술을 지닌 무술의 천재이지만, 천성적으로 싸움을 싫어하는 평화주의자이다. 어느 날, 우연히 남장을 한 여검객 담화린을 보고 사랑에 빠지게 되는데... 그녀는 정파최고의 고수 검황의 손녀. 이때부터 한비광의 좌충우돌 무림기행 시작되는데... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 313 chapters |  |  |  |
| chapter dates | PASS | 313 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 99 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.pl3040.com/.../1475220786629.jpg` (image/jpeg, 244393 bytes, 1067x1600) |  |  |  |
