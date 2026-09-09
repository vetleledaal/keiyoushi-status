# Extension Validation Report

- Extension: tachiyomi-zh.dm5-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 293789630396851172
- Source name: 动漫屋
- Source language: zh
- Selected manga input: latest offset 0: 世界计划四格漫画 (`.../manhua-shijiejihuasigemanhua`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 70 | 被追放的转生重骑士用游戏知识开无双 (`.../manhua-beizhuifangdezhuanshengchongqishiyongyouxizhishikaiwushuang`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 70 | 秘密的姊弟 (`.../manhua-mimidezidi`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 70 | 世界计划四格漫画 (`.../manhua-shijiejihuasigemanhua`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 70 | 请忘了我 (`.../manhua-qingwanglewo`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 22 | 世界计划四格漫画 (`.../manhua-shijiejihuasigemanhua`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 世界计划四格漫画 (`.../manhua-shijiejihuasigemanhua`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 148 | 寶礦力聯動特別篇 （2P） (`.../m1660381`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 2 |  |  | 1-10s |

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
| popular listing | PASS | 70 entries |  |  |  |
| latest listing | PASS | 70 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=世界计划四格漫画, URL=`.../manhua-shijiejihuasigemanhua` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 302/302 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 302/302 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mhfm3us.cdndm5.com/.../20250611175801_180x240_20.jpg` (image/jpeg, 21285 bytes, 180x240) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manhua-shijiejihuasigemanhua` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mhfm5us.cdndm5.com/.../20250611175801_450x600_78.jpg` (image/jpeg, 79957 bytes, 450x600) |  |  |  |
| details author | PASS | SEGA |  |  |  |
| details artist | PASS | SEGA |  |  |  |
| details genres | PASS | 百合 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 世界计划四格漫画合集来啦！！！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 148 chapters |  |  |  |
| chapter dates | LINT | All 148 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=148 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manhua1039zjcdn26.cdndm5.com/.../1_6768.jpg <redacted query values: cid, key, and type>` (image/jpeg, 809204 bytes, 1200x3951) |  |  |  |
