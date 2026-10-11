# Extension Validation Report

- Extension: tachiyomi-ja.mangakuro-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4278045440527026000
- Source name: MangaKuro
- Source language: ja
- Selected manga input: popular offset 0: 入学傭兵 (`.../ru-xue-yong-bing`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | 入学傭兵 (`.../ru-xue-yong-bing`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | PICK ME UP~低レア英雄の成り上がり~ (`.../pick-me-up-direa-ying-xiongno-chengri-shanggari`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 追放されたゲーマーは最強武器で無双する (`.../zhui-fangsaretagemaha-zui-qiang-wu-qide-wu-shuangsuru`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 唯一無二のネクロマンサー (`.../wei-yi-wu-ernonekuromansa`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 入学傭兵 (`.../ru-xue-yong-bing`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 入学傭兵 (`.../ru-xue-yong-bing`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 280 | 第1話 (`.../di1hua`) |  | <1s |
| pages | `getPageList(chapter)` | success | 131 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=入学傭兵, URL=`.../ru-xue-yong-bing` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangakuro.net/.../ru-xue-yong-bing.jpg` (image/jpeg, 41634 bytes, 360x518) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ru-xue-yong-bing` |  |  |  |
| details thumbnail URL | PASS | `https://mangakuro.net/.../ru-xue-yong-bing.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 10年間の傭兵生活を終え少年は学校に入学する |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 280 chapters |  |  |  |
| chapter dates | PASS | 280 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 131 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://i2.wp.com/.../1.jpg` to `https://blogger.googleusercontent.com/.../1.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://i2.wp.com/.../1.jpg` (image/webp (container: extended), 288326 bytes, 690x1280) |  |  |  |
