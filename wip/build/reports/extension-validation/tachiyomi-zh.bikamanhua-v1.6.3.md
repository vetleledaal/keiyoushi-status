# Extension Validation Report

- Extension: tachiyomi-zh.bikamanhua-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mccms
- Source ID: 8976260719331701966
- Source name: 哔咔漫画 (unoriginal)
- Source language: zh
- Selected manga input: popular offset 0: 魔都精兵的奴隶 (`.../modoujingbingdenuli`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 魔都精兵的奴隶 (`.../modoujingbingdenuli`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | 向导是不是重生的 (`.../xiangdaoshibushizhongshengde`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | 功夫大师 (`.../gongfudashi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 过敏 (`.../guomin`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 魔都精兵的奴隶 (`.../modoujingbingdenuli`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 225 | 第02话 (`.../263176-63234.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static-tw.baozimh.com/.../modujingbingdenuli-zhucunyangping.jpg <redacted query values: w, h, and q>` (image/jpeg, 29408 bytes, 285x375) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../modoujingbingdenuli` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://static-tw.baozimh.com/.../modujingbingdenuli-zhucunyangping.jpg <redacted query values: w, h, and q>` (image/jpeg, 29408 bytes, 285x375) |  |  |  |
| details author | PASS | 竹村洋平 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 冒险, 奇幻 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 日本各地出现了异空间「魔都」──由于只有女性能从魔都的「桃」得到特异的能力，因此便由女兵组成了「魔防队」。某一天，过着抑郁生活的男高中生──和仓优希不小心闯进了突发性产生的魔都入口，在那里，遇到了「魔防队」第七组的美丽队长──羽前京香，而她竟向优希宣言：「我要你当我的奴隶。」 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 225 chapters |  |  |  |
| chapter dates | PASS | 225 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s2.bzcdn.net/.../1.jpg` (image/jpeg, 249831 bytes, 822x1200) |  |  |  |
