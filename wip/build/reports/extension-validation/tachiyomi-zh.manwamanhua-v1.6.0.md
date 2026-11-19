# Extension Validation Report

- Extension: tachiyomi-zh.manwamanhua-v1.6.0
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
- Source ID: 287323144843032723
- Source name: 漫蛙漫画
- Source language: zh
- Selected manga input: popular offset 0: 错撩 (`.../699`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | 错撩 (`.../699`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 36 | Greedy (`.../138856`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 36 | 被纯爱骑士团长意外买下后，竟成了他的真命天女！ (`.../160372`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | 超级神基因 (`.../10784`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | 错撩 (`.../699`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 错撩 (`.../699`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 158 | 序章 我要当你小舅妈 (`.../40819`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 50 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=错撩, URL=`699` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 164/164 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 164/164 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://52.128.238.250/.../442d8cbb2dd842deb608b723ccea3512.jpg` (image/jpeg, 25899 bytes, 320x424) |  |  |  |
| details identity | PASS | Details preserved selected URL `699` |  |  |  |
| details thumbnail URL | PASS | `https://52.128.238.250/.../442d8cbb2dd842deb608b723ccea3512.jpg` |  |  |  |
| details author | PASS | 绿绿绿酱, 翘摇（原著） |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 国漫, 年上, 甜文, 纯爱, 总裁, 恋爱, bg |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 财经美女记者郑书意竟遭遇渣男劈腿？怎么可能就此放任渣男和白莲小三双宿双飞！在看到小三舅舅的连号劳斯莱斯那一刻，郑书意心生一计，走上了啼笑皆非的泡总裁之路，臭渣男不是想少奋斗二十年吗？那我就成为你和小三的小舅妈！…… |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 26 name, chapter 72 name |  |  |  |
| chapters | PASS | 158 chapters |  |  |  |
| chapter dates | PASS | 158 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://tu.mhttu.cc/.../0.jpg` (image/webp (encoding: lossy), 12644 bytes, 800x625; server Content-Type: image/jpeg) |  |  |  |
