# Extension Validation Report

- Extension: tachiyomi-ja.comicride-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 6786869574657969795
- Source name: Comic Ride
- Source language: ja
- Selected manga input: popular offset 0: 脱法テイマーの成り上がり冒険譚 ～Sランク美少女冒険者が俺の獣魔になっテイマす～ (`.../06e012f7538e1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 脱法テイマーの成り上がり冒険譚 ～Sランク美少女冒険者が俺の獣魔になっテイマす～ (`.../06e012f7538e1`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 組長娘と世話係 (`.../473397a7d442d`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 冴えないおっさん、実は最強 (`.../4071ee13a360b`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 脱法テイマーの成り上がり冒険譚 ～Sランク美少女冒険者が俺の獣魔になっテイマす～ (`.../06e012f7538e1`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 脱法テイマーの成り上がり冒険譚 ～Sランク美少女冒険者が俺の獣魔になっテイマす～ (`.../06e012f7538e1`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 95 | 第1話 (`.../4ee8d210f0ea2`) |  | <1s |
| pages | `getPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=脱法テイマーの成り上がり冒険譚 ～Sランク美少女冒険者が俺の獣魔になっテイマす～, URL=`06e012f7538e1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../2023102417455379974C858927DE5FACFC76903A0E762E031-lg.webp` (image/webp (encoding: lossy), 39574 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `06e012f7538e1` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../2023102417455379974C858927DE5FACFC76903A0E762E031.png` (image/png, 1213928 bytes, 1280x672) |  |  |  |
| details author | PASS | 真鍋譲治, すかいふぁーむ, 大熊猫介 |  |  |  |
| details artist | PASS | 真鍋譲治, すかいふぁーむ, 大熊猫介 |  |  |  |
| details genres | PASS | お色気, コミックライドアドバンス, バトル・アクション |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | テイマーのリントは劣等職と蔑まれながらも、魔物の相棒と日銭を稼いで暮らしていた。なんとか一旗あげようと訪れた王都で、謎のＳランク美少女冒険者から声をかけられる。<br>「あのさ、私のことテイムしない？」<br>突拍子もない提案に面食らうリント。しかしここから彼の成り上がりが始まる……。強い女の子たちをテイムして最強パーティを作る、法律スレスレの冒険譚開幕!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 95 chapters |  |  |  |
| chapter dates | PASS | 95 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.comicride.jp/.../master-1760105432834-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 8, 15, 1, 7, 13, 2, 4, 9, 6, 10, 3, 11, 0, 12, 14\]` (image/jpeg, 622953 bytes, 1350x1920) |  |  |  |
