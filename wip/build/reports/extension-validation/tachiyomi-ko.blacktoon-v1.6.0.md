# Extension Validation Report

- Extension: tachiyomi-ko.blacktoon-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 7080800841003944426
- Source name: 블랙툰
- Source language: ko
- Selected manga input: popular offset 0: 동아리 (`.../9098`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | 동아리 (`.../9098`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | 이력서 (`.../11634`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 혈우 (`.../19502`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 함부로 친절하지 말라 (`.../15148`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | 짝사랑 과몰입 동아리 (`.../20348`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 동아리 (`.../9098`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 221 | 동아리 1화 (`.../861852`) |  | <1s |
| pages | `getPageList(chapter)` | success | 34 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 4: title=동아리, URL=`9098` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 106/106 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 106/106 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ttjsde.speedwebgo.com/.../202102071143111334982.png` (image/png, 349971 bytes, 676x343) |  |  |  |
| details identity | PASS | Details preserved selected URL `9098` |  |  |  |
| details thumbnail URL | PASS | `https://ttjsde.speedwebgo.com/.../202102071143111334982.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | "너, 딱 내 타입이다!” 우여곡절 끝에 연극영화 동아리 P&M에 입부한 전재우 그런데 왠걸? 동아리의 미녀들이 전재우에게 적극적으로 들이댄다! 과연 재우는 그녀들의 육탄 공세에서 살아남아 자신만의 사랑을 쟁취할 수 있을까? |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 183 name |  |  |  |
| chapters | PASS | 221 chapters |  |  |  |
| chapter dates | PASS | 221 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 34 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ttjsde.speedwebgo.com/.../202102071145403054200.jpg` (image/jpeg, 424954 bytes, 600x3587) |  |  |  |
