# Extension Validation Report

- Extension: tachiyomi-zh.bilimanga-v1.6.16
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 1
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7289707411592168382
- Source name: 嗶哩漫畫
- Source language: zh
- Selected manga input: popular offset 0: 學生會也有洞！ (`.../917.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 學生會也有洞！ (`.../917.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | 拜託請穿上，鷹峰同學 (`.../523.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | 彈珠女孩 (`.../559.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | 這樣的關係才好 (`.../1280.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.Exception: 請在 WebView 中搜尋一次並輸入驗證碼，或在擴充功能設定中開啟「自動輸入搜尋驗證碼」 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 學生會也有洞！ (`.../917.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 203 | 第1話 雄悻小鬼頭也是有洞的吧⋯ (`.../73015.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | java.lang.Exception: 請在 WebView 中搜尋一次並輸入驗證碼，或在擴充功能設定中開啟「自動輸入搜尋驗證碼」 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | SKIP | 請在 WebView 中搜尋一次並輸入驗證碼，或在擴充功能設定中開啟「自動輸入搜尋驗證碼」 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 200/200 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 200/200 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.bilimanga.net/.../917s.jpg <redacted query values: 1793090747>` (image/jpeg, 39220 bytes, 400x568) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../917.html` |  |  |  |
| details thumbnail URL | PASS | `https://www.bilimanga.net/.../917s.jpg <redacted query values: 1793090747>` |  |  |  |
| details author | PASS | 無知麻呂 |  |  |  |
| details artist | PASS | 無知麻呂 |  |  |  |
| details genres | PASS | 歡樂, 校園, 日常, 校園青春, 日本漫畫, 連載於2022年, 已動畫化 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 高一的文藝青年水之江梅的文學造詣相當精深，但是物理化學數學等等理科的成績卻完全毀滅性的差，因此面臨了留級的危機。在導師平塚的建議下，他加入學生會想要藉此挽救成績。想不到這間國高中一貫制的學校的學生會的成員，竟然不是囂張小屁孩，就是悶騷學姊跟不幸少女……在這些充滿個性的成員之中，阿梅也開始過起「色」彩繽紛的歡樂校園生活！<br><br>**别名:** 腦洞學生會 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 203 chapters |  |  |  |
| chapter dates | LINT | 202 of 203 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=202 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.motiezw.com/.../7297b09aeb99ba0d714a92e52a354bd8.avif` (image/avif (format: avif), 169223 bytes, 1126x1600) |  |  |  |
