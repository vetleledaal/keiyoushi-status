# Extension Validation Report

- Extension: tachiyomi-zh.miaoqu-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 2
- Warnings: 1
- Skipped: 1
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mccms
- Source ID: 116946528518438525
- Source name: 喵趣漫画
- Source language: zh
- Selected manga input: popular offset 0: 魔都精兵的奴隶 (`.../modoujingbingdenuli`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 35 | 魔都精兵的奴隶 (`.../modoujingbingdenuli`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 35 | 斗罗大陆5重生唐三 (`.../douluodalu5zhongshengtangsan`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 35 | 格雷基斯的魔界语译录 (`.../geleijisidemojieyuyilu`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 35 | 水属性的魔法师 (`.../shuishuxingdemofashi`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.Exception: 服务器错误，无法搜索 | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 魔都精兵的奴隶 (`.../modoujingbingdenuli`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 221 | 第02话 (`.../63234.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 52 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | java.lang.Exception: 服务器错误，无法搜索 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 35 entries |  |  |  |
| latest listing | PASS | 35 entries |  |  |  |
| search listing | SKIP | 服务器错误，无法搜索 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 140/140 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 140/140 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://static-tw.baozimh.com/.../yirenzhixia-dongmantang.jpg <redacted query values: w, h, and q>` -> 2 manga URLs (examples: `.../yirenzhixia_260264`, `.../yirenzhixia`), `https://static-tw.baozimh.com/.../quanzhifashi-yuewenmanhua.jpg <redacted query values: w, h, and q>` -> 3 manga URLs (examples: `.../quanzhifashi`, `.../quanzhifashi_259104`, `.../quanzhifashi_260091`) |  |  |  |
| thumbnail | PASS | `https://static-tw.baozimh.com/.../modujingbingdenuli-zhucunyangping.jpg <redacted query values: w, h, and q>` (image/jpeg, 29408 bytes, 285x375) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../modoujingbingdenuli` |  |  |  |
| details thumbnail URL | PASS | `https://static-tw.baozimh.com/.../modujingbingdenuli-zhucunyangping.jpg <redacted query values: w, h, and q>` |  |  |  |
| details author | PASS | 竹村洋平 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 冒险, 奇幻 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 更新于：2026-08-28<br><br>日本各地出现了异空间「魔都」──由于只有女性能从魔都的「桃」得到特异的能力，因此便由女兵组成了「魔防队」。某一天，过着抑郁生活的男高中生──和仓优希不小心闯进了突发性产生的魔都入口，在那里，遇到了「魔防队」第七组的美丽队长──羽前京香，而她竟向优希宣言：「我要你当我的奴隶。」 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 221 chapters |  |  |  |
| chapter dates | LINT | All 221 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=221 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s2.bzcdn.net/.../1.jpg` (image/jpeg, 249831 bytes, 822x1200) |  |  |  |
