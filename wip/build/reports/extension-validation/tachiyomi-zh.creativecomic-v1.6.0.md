# Extension Validation Report

- Extension: tachiyomi-zh.creativecomic-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8346821279138091413
- Source name: CCC追漫台
- Source language: zh-Hant
- Selected manga input: latest offset 0: 閻鐵花 (`.../50`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | 16647 (`.../341`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | 煉乳咖啡滴答滴 (`.../220`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | 閻鐵花 (`.../50`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 為什麼不能把珍珠放進炒飯裡？ (`.../542`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 閻鐵花 (`.../50`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 閻鐵花 (`.../50`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 32 | 第 1 話 #01 閻鐵花 (`.../67`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 72 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=閻鐵花, URL=`50` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.creative-comic.tw/.../7ab81642-fd7e-4be5-aaa3-ec55cba793ab.jpg` (image/jpeg, 255797 bytes, 768x768) |  |  |  |
| details identity | PASS | Details preserved selected URL `50` |  |  |  |
| details thumbnail URL | PASS | `https://www.creative-comic.tw/.../7ab81642-fd7e-4be5-aaa3-ec55cba793ab.jpg` |  |  |  |
| details author | PASS | 常勝 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 冒險動作, 冒險動作, 戰鬥, 超級英雄, 超能力, 京劇, 科幻, 金漫獎, 閱讀新視野, 中小學生讀物選介, 國慶光雕漫畫 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 常勝超能力英雄漫畫全新篇章 《閻鐵花Ⅱ》正式啟動！<br><br>天塌了，撐天、跌倒了，撐地。<br>閻家人沒有什麼過不去的。<br><br>一場網路直播殺人事件，背後隱藏著橫亙三十年的陰謀。<br>畫著京劇臉譜的神祕女子，即將展開她的復仇之路——<br><br>　 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 32 chapters |  |  |  |
| chapter dates | PASS | 32 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | FAIL | 71 of 72 pages have invalid URLs: page 2: url=`10461` (relative URL), page 3: url=`10462` (relative URL), page 4: url=`10463` (relative URL), page 5: url=`10464` (relative URL), page 6: url=`10465` (relative URL), and 66 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage.googleapis.com/.../2` (image/jpeg, 41730 bytes, 1200x1640; server Content-Type: application/octet-stream) |  |  |  |
