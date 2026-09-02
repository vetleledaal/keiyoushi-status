# Extension Validation Report

- Extension: tachiyomi-zh.bilimanga-v1.6.14
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7289707411592168382
- Source name: 嗶哩漫畫
- Source language: zh
- Selected manga input: popular offset 0: 甜辣騷貨 (`.../1592.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 甜辣騷貨 (`.../1592.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | 七龍珠 (全彩文傳版) (`.../7.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | 我的女友是老師 (`.../581.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | 離開A級隊伍的我，和從前的弟子往迷宮深處邁進 (`.../822.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 6 | 甜辣騷貨 (`<redacted URL #1: selected resource; relative; no scheme>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 甜辣騷貨 (`.../1592.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 9 | 第1話 (`.../131054.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: 漫畫可能已下架或需要足夠的權限 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: 漫畫可能已下架或需要足夠的權限 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=甜辣騷貨, URL=<blank> |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Invalid manga: search entry 1: title=甜辣騷貨, URL=<blank>, search entry 2: title=ljx夏羽頭像, URL=<blank>, search entry 3: title=凌時雨灬頭像, URL=<blank>, search entry 4: title=归頭像, URL=<blank>, search entry 5: title=无语不子頭像, URL=<blank> | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | UNUSUAL | 204/206 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.bilimanga.net/.../1592s.jpg <redacted query values: 1787844606>` (image/jpeg, 60694 bytes, 400x568) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1592.html` |  |  |  |
| details thumbnail URL | PASS | `https://www.bilimanga.net/.../1592s.jpg <redacted query values: 1787844606>` |  |  |  |
| details author | PASS | 香山リム |  |  |  |
| details artist | PASS | 香山リム |  |  |  |
| details genres | PASS | 戀愛, 歡樂, 日常, 後宮, 愛情浪漫, 日本漫畫, 連載於2024年 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 乾妹妹、同事、名門大小姐、隔壁鄰居、<br><br><br>同級生女友、辣妹學妹、姐妹花、青梅竹馬、家教學生，<br><br><br>被各式各樣♡色女孩猛烈追求、盡情愛愛的過程最棒了！<br><br><br>甜蜜又火辣♡♡可愛女生的♡逗模樣讓人欲罷不能♡<br><br><br>***别名**：あまからびっち*  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | 漫畫可能已下架或需要足夠的權限 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
