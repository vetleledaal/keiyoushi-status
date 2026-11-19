# Extension Validation Report

- Extension: tachiyomi-ko.cookmana-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 661147347145612262
- Source name: Cookmana
- Source language: ko
- Selected manga input: popular offset 0: 열혈강호 (`.../1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 102 | 열혈강호 (`.../1`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 102 | 불꽃 소방대(염염의 소방대) (`.../8598`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 102 | 아스미 짱은 레즈풍속에 흥미가 있습니다! (`.../24564`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 102 | 이 멋진 세계에 축복을! (`.../2537`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 열혈강호 (`.../1`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 열혈강호 (`.../1`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 318 | 1권 (`.../180`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 99 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 102 entries |  |  |  |
| latest listing | PASS | 102 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=열혈강호, URL=`.../1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 409/409 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 409/409 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://smallimage.11toon8.com/.../1.webp` (image/webp (encoding: lossy), 34526 bytes, 280x390) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1` |  |  |  |
| details thumbnail URL | PASS | `https://smallimage.11toon8.com/.../1.webp` |  |  |  |
| details author | PASS | 전극진 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 무협 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 무림의 실권을 놓고 정파(正派)와 사파(邪派)가 대립하고 있던 혼란의 시대. 사파 무림지존인 천마신군의 6번째 제자인 한비광은 뛰어난 경공술을 지닌 무술의 천재이지만, 천성적으로 싸움을 싫어하는 평화주의자이다. 어느 날, 우연히 남장을 한 여검객 담화린을 보고 사랑에 빠지게 되는데... 그녀는 정파최고의 고수 검황의 손녀. 이때부터 한비광의 좌충우돌 무림기행 시작되는데... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 318 chapters |  |  |  |
| chapter dates | PASS | 318 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 99 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.pl3040.com/.../1475220786629.jpg` (image/jpeg, 244393 bytes, 1067x1600) |  |  |  |
