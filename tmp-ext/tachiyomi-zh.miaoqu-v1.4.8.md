# Extension Validation Report

- Extension: tachiyomi-zh.miaoqu-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 2
- Warnings: 1
- Skipped: 1
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 116946528518438525
- Source name: 喵趣漫画
- Source language: zh
- Selected manga input: latest offset 0: 若能相恋，唯你不可 (`.../ruonengxianglianweinibuke`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 35 | 魔都精兵的奴隶 (`.../modoujingbingdenuli`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 35 | 斗罗大陆5重生唐三 (`.../douluodalu5zhongshengtangsan`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 35 | 若能相恋，唯你不可 (`.../ruonengxianglianweinibuke`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 35 | 身为魔族的我想向勇者小队的可... (`.../shenweimozudewoxiangxiangyongzhexiaoduidekeainuhaigaobai`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.Exception: 服务器错误，无法搜索 | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 若能相恋，唯你不可 (`.../ruonengxianglianweinibuke`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | 第1.1话 (`.../230722.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| thumbnail | PASS | `https://static-tw.baozimh.com/.../ruonengxianglianweinibuke-zheyuanneru.jpg <redacted query values: w, h, and q>` (image/jpeg, 24419 bytes, 285x375) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ruonengxianglianweinibuke` |  |  |  |
| details thumbnail URL | PASS | `https://static-tw.baozimh.com/.../ruonengxianglianweinibuke-zheyuanneru.jpg <redacted query values: w, h, and q>` |  |  |  |
| details author | PASS | 折原ねる |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 纯爱 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 更新于：2026-09-02<br><br>你知道恋人之间，都会做些什么吗？ 被同班同学评价为“不起眼”的悠。虽然对身为学校风云人物的青梅竹马·遥真所给予的温柔感到无比开心，但内心却也忍不住产生了一种抱歉和愧疚感……？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://s2.bzcdn.net/.../1.jpg` could not be downloaded: java.io.EOFException: SSL peer shut down incorrectly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
