# Extension Validation Report

- Extension: tachiyomi-zh.bilimanga-v1.6.14
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

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
| popular_next | `getPopularManga(2)` | success | 50 | 為美好的世界獻上祝福！ (`.../625.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | 鄰座的黑川同學 (`.../1704.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | 災禍陷阱師的勇者狩獵 (`.../1666.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 7 | 學生會也有洞！ (`<redacted URL #1: selected resource; relative; no scheme>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 學生會也有洞！ (`.../917.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 147 | 第1話 雄悻小鬼頭也是有洞的吧⋯ (`.../73015.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=學生會也有洞！, URL=<blank> |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Invalid manga: search entry 1: title=學生會也有洞！, URL=<blank>, search entry 2: title=飞花逐水流頭像, URL=<blank>, search entry 3: title=dango666頭像, URL=<blank>, search entry 4: title=yuripedia頭像, URL=<blank>, search entry 5: title=橙橙橙橙橙頭像, URL=<blank> | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | UNUSUAL | 205/207 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.bilimanga.net/.../917s.jpg <redacted query values: 1756798704>` (image/jpeg, 39220 bytes, 400x568) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../917.html` |  |  |  |
| details thumbnail URL | PASS | `https://www.bilimanga.net/.../917s.jpg <redacted query values: 1756798704>` |  |  |  |
| details author | PASS | 無知麻呂 |  |  |  |
| details artist | PASS | 無知麻呂 |  |  |  |
| details genres | PASS | 歡樂, 校園, 日常, 校園青春, 日本漫畫, 已動畫化 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 高一的文藝青年水之江梅的文學造詣相當精深，但是物理化學數學等等理科的成績卻完全毀滅性的差，因此面臨了留級的危機。在導師平塚的建議下，他加入學生會想要藉此挽救成績。想不到這間國高中一貫制的學校的學生會的成員，竟然不是囂張小屁孩，就是悶騷學姊跟不幸少女……在這些充滿個性的成員之中，阿梅也開始過起「色」彩繽紛的歡樂校園生活！<br><br><br>***别名**：腦洞學生會*  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 147 chapters |  |  |  |
| chapter dates | PASS | 147 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.bilimanga.net/.../%E5%AD%B8%E7%94%9F%E6%9C%83%E4%B9%9F%E6%9C%89%E6%B4%9E%EF%BC%81_1.html` to `https://www.bilimanga.net/.../917.html` (1 redirects) |  |  |  |
| page load | PASS | `https://i.motiezw.com/.../1586989.avif` (image/avif (format: avif), 169223 bytes, 1126x1600) |  |  |  |
