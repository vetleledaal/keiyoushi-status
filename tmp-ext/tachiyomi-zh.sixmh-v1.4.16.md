# Extension Validation Report

- Extension: tachiyomi-zh.sixmh-v1.4.16
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5183325399429659419
- Source name: 六漫画
- Source language: zh
- Selected manga input: popular offset 0: 魔都精兵的奴隶 (`.../263176`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | 魔都精兵的奴隶 (`.../263176`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | 可爱过敏原 (`.../302262`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | 若能相恋，唯你不可 (`.../618914`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | 姬川是超级喜欢前辈的抖M辣妹 (`.../305873`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 魔都精兵的奴隶 (`.../263176`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 魔都精兵的奴隶 (`.../263176`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 221 | 第02话 (`.../63234.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=魔都精兵的奴隶, URL=`.../263176` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://static-tw.baozimh.com/.../yirenzhixia-dongmantang.jpg <redacted query values: w, h, and q>` -> 2 manga URLs (examples: `.../260264`, `.../236126`), `https://static-tw.baozimh.com/.../quanzhifashi-yuewenmanhua.jpg <redacted query values: w, h, and q>` -> 3 manga URLs (examples: `.../219423`, `.../259104`, `.../260091`) |  |  |  |
| thumbnail | PASS | `https://static-tw.baozimh.com/.../modujingbingdenuli-zhucunyangping.jpg <redacted query values: w, h, and q>` (image/jpeg, 29408 bytes, 285x375) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../263176` |  |  |  |
| details thumbnail URL | PASS | `https://static-tw.baozimh.com/.../modujingbingdenuli-zhucunyangping.jpg <redacted query values: w, h, and q>` |  |  |  |
| details author | PASS | 竹村洋平 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 冒险, 奇幻 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 日本各地出现了异空间「魔都」──由于只有女性能从魔都的「桃」得到特异的能力，因此便由女兵组成了「魔防队」。某一天，过着抑郁生活的男高中生──和仓优希不小心闯进了突发性产生的魔都入口，在那里，遇到了「魔防队」第七组的美丽队长──羽前京香，而她竟向优希宣言：「我要你当我的奴隶。」 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 221 chapters |  |  |  |
| chapter dates | LINT | All 221 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=221 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://s2.bzcdn.net/.../1.jpg` could not be downloaded: java.io.EOFException: SSL peer shut down incorrectly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
