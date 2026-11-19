# Extension Validation Report

- Extension: tachiyomi-zh.creativecomic-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8346821279138091413
- Source name: CCC追漫台
- Source language: zh-Hant
- Selected manga input: popular offset 0: 16647 (`.../341`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | 16647 (`.../341`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | 煉乳咖啡滴答滴 (`.../220`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | 成為奪心魔之必要 (`.../303`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 燃燒的西太平洋 (`.../340`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 16647 (`.../341`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 16647 (`.../341`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 42 | 16647 上線預告 (`.../3850`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=16647, URL=`341` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.creative-comic.tw/.../253d0535-222f-4fad-ab02-acb11f855725.jpg` (image/jpeg, 673918 bytes, 768x768) |  |  |  |
| details identity | PASS | Details preserved selected URL `341` |  |  |  |
| details thumbnail URL | PASS | `https://www.creative-comic.tw/.../253d0535-222f-4fad-ab02-acb11f855725.jpg` |  |  |  |
| details author | PASS | 小河少年Kawa |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 愛情, BL, 網遊 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 遊戲裡是接近封頂的強者，現實中的鹿思棋是個生無可戀的高中生，整天思考活著與死亡的意義。<br>遊戲裡操作著柔弱的女角，現實中的石鷚自認是隻聰明的野獸，在螢幕後方尋找下一個有趣的獵物……<br><br>《空想online》這次的更新中，在中等副本「德維爾迷宮」加入高等級道具，吸引不少玩家組隊。<br>就這樣，想挑戰副本的647，與正在尋找獵物的Sixteen_16，在副本入口相遇了—— |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 42 chapters |  |  |  |
| chapter dates | PASS | 42 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage.googleapis.com/.../2` (image/jpeg, 278906 bytes, 1200x1642; server Content-Type: application/octet-stream) |  |  |  |
