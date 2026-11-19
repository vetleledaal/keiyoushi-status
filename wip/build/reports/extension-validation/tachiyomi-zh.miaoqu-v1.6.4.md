# Extension Validation Report

- Extension: tachiyomi-zh.miaoqu-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 26
- Lint: 3
- Warnings: 1
- Skipped: 5
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mccms
- Source ID: 116946528518438525
- Source name: 喵趣漫画
- Source language: zh
- Selected manga input: popular offset 0: 魔都精兵的奴隶 (`.../modoujingbingdenuli`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 35 | 魔都精兵的奴隶 (`.../modoujingbingdenuli`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 35 | 终结的炽天使 (`.../zhongjiedechitianshi_257560`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 35 | 功夫大师 (`.../gongfudashi`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 35 | 秘密情事 (`.../mimiqingshi`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.Exception: 服务器错误，无法搜索 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 魔都精兵的奴隶 (`.../modoujingbingdenuli`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 225 | 第02话 (`.../63234.html`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: string doesn't match var DATA='\[...\]' | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | java.lang.Exception: 服务器错误，无法搜索 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: string doesn't match var DATA='\[...\]' | REVIEW | INSUFFICIENT_EVIDENCE |  |
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
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 更新于：2026-10-31<br><br>日本各地出现了异空间「魔都」──由于只有女性能从魔都的「桃」得到特异的能力，因此便由女兵组成了「魔防队」。某一天，过着抑郁生活的男高中生──和仓优希不小心闯进了突发性产生的魔都入口，在那里，遇到了「魔防队」第七组的美丽队长──羽前京香，而她竟向优希宣言：「我要你当我的奴隶。」 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 225 chapters |  |  |  |
| chapter dates | LINT | All 225 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=225 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | string doesn't match var DATA='\[...\]' |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
