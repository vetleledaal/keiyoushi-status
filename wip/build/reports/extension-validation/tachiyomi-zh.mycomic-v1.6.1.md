# Extension Validation Report

- Extension: tachiyomi-zh.mycomic-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9119537447562549661
- Source name: MyComic
- Source language: zh
- Selected manga input: popular offset 0: 美麗新世界！ (`.../54348`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 美麗新世界！ (`.../54348`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | 要來向表姐撒嬌嗎？ (`.../53168`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | 獵人遊戲W (`.../55355`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 狼同學的秘密 (`.../51102`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 美麗新世界！ (`.../54348`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 美麗新世界！ (`.../54348`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 262 | 第100话 (`.../792989`) |  | <1s |
| pages | `getPageList(chapter)` | success | 37 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=美麗新世界！, URL=`.../54348` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
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
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://biccam.com/.../1-2bd5fe.jpg` (image/jpeg, 148307 bytes, 720x4200) |  |  |  |
