# Extension Validation Report

- Extension: tachiyomi-zh.tencentcomics-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6353436350537369479
- Source name: 腾讯动漫
- Source language: zh-Hans
- Selected manga input: latest offset 0: 哪吒传·新版 (`.../657920`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | 一人之下 (`.../531490`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | 不当舔狗后，我成了亿万神豪 (`.../654128`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | 哪吒传·新版 (`.../657920`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | 重生另嫁小叔，夫妻联手虐渣 (`.../657856`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 哪吒传·新版 (`.../657920`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 61 | 第1话 (`.../150037`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 29 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhua.acimg.cn/.../420` (image/jpeg, 155591 bytes, 420x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../657920` |  |  |  |
| details thumbnail URL | PASS | `https://manhua.acimg.cn/.../420` |  |  |  |
| details author | PASS | 米猫动漫 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 灵珠子转世为陈塘关哪吒，入世之后屡遭构陷迫害，祸起闹海，引得四海龙王兴师问罪。哪吒万般无奈，选择剔骨还父、割肉还母，以血肉了结尘缘。幸得太乙真人施以妙法，借莲花为其重塑躯体得以重生。他冲破世俗桎梏，凭一己之力对抗既定天命，历经征战磨砺，最终肉身成圣。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 61 chapters |  |  |  |
| chapter dates | LINT | All 61 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=61 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../151102` at offsets 0, 20, `.../151091` at offsets 1, 21, `.../151089` at offsets 2, 22, `.../151086` at offsets 3, 23, `.../151085` at offsets 4, 24, `.../151083` at offsets 5, 25, `.../151080` at offsets 6, 26, `.../151077` at offsets 7, 27, `.../151076` at offsets 8, 28, `.../151075` at offsets 9, 29, `.../151074` at offsets 10, 30, `.../151073` at offsets 11, 31, `.../151072` at offsets 12, 32, `.../151112` at offsets 13, 33, `.../151071` at offsets 14, 34, `.../151070` at offsets 15, 35, `.../151069` at offsets 16, 36, `.../151079` at offsets 17, 37, `.../151068` at offsets 18, 38, `.../151067` at offsets 19, 39 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | search: `https://m.ac.qq.com/.../result <redacted query values: word and page>` to `https://ac.qq.com/.../searchList <redacted query values: word and page>` (1 redirects) |  |  |  |
| page load | PASS | `https://manhua.acimg.cn/.../0` (image/jpeg, 807752 bytes, 2362x1824) |  |  |  |
