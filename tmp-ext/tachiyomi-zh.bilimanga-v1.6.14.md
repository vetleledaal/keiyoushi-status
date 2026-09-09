# Extension Validation Report

- Extension: tachiyomi-zh.bilimanga-v1.6.14
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
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
- Selected manga input: popular offset 0: 碧藍之海 (`.../159.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 碧藍之海 (`.../159.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | citrus + (`.../1622.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | 宗像教授異考錄 (`.../1634.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | 我老婆是學生會長！ (`.../1599.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 11 | 碧藍之海 (`<redacted URL #1: selected resource; relative; no scheme>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 碧藍之海 (`.../159.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 132 | 第1話 Deep Blue (`.../13203.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 51 |  |  | 10s+ |

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
| search listing | LINT | Matched selected manga by title at result offset 0: title=碧藍之海, URL=<blank> |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Invalid manga: search entry 1: title=碧藍之海, URL=<blank>, search entry 2: title=-步寻冥2032-頭像, URL=<blank>, search entry 3: title=satanist頭像, URL=<blank>, search entry 4: title=icerain頭像, URL=<blank>, search entry 5: title=钢板撞鼻梁頭像, URL=<blank> | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | UNUSUAL | 208/211 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.bilimanga.net/.../159s.jpg <redacted query values: 1786195051>` (image/jpeg, 48007 bytes, 400x568) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../159.html` |  |  |  |
| details thumbnail URL | PASS | `https://www.bilimanga.net/.../159s.jpg <redacted query values: 1786195051>` |  |  |  |
| details author | PASS | 井上堅二 |  |  |  |
| details artist | PASS | 吉岡公威 |  |  |  |
| details genres | PASS | 校園, 日常, 戀愛, 歡樂, 校園青春, 日本漫畫, 連載於2014年, 已動畫化 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 以上大學為契機，北原伊織開始在沿海城鎮居住。<br><br><br>他在那裡遇見的是美貌出眾的女孩、以及喜愛喝酒與水肺潛水的強壯男人。<br><br><br>最棒的校園生活在等待著他嗎!?<br><br><br>無止境爆笑生動青春喜劇、就此開幕！<br><br><br>笨蛋測驗召喚獸作者井上堅二初次執筆的原創漫!!<br><br><br>大學生活！可愛女孩！而且還穿泳裝！這不就肯定會有色色的發展嗎!? （其實沒有）<br><br><br>***别名**：GRANDBLUE*  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 132 chapters |  |  |  |
| chapter dates | PASS | 132 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.bilimanga.net/.../%E7%A2%A7%E8%97%8D%E4%B9%8B%E6%B5%B7_1.html` to `https://www.bilimanga.net/.../159.html` (1 redirects) |  |  |  |
| page load | PASS | `https://i.motiezw.com/.../276907.avif` (image/avif (format: avif), 224574 bytes, 1126x1600) |  |  |  |
