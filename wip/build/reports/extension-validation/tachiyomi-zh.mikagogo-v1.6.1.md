# Extension Validation Report

- Extension: tachiyomi-zh.mikagogo-v1.6.1
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
- Source ID: 32954900499175308
- Source name: 米卡插画
- Source language: zh
- Selected manga input: popular offset 0: 莱可老师的宵宫cos (`.../6761`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | 莱可老师的宵宫cos (`.../6761`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | 【VIP插画】原神 宵宮 八重神子 申鹤 AI生成 美图壁纸推荐 (`.../660`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | 【动漫插画】蔚蓝档案 才羽ミドリ 早濑优香 星穹铁道 卡芙卡 原神 甘雨 动漫游戏壁纸推荐 (`.../11443`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | 【动漫插画】原神 桑多涅 八重神子 蔚蓝档案 妃咲 飞鸟马时 动漫游戏壁纸推荐 (`.../11415`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 莱可老师的宵宫cos (`.../6761`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 莱可老师的宵宫cos (`.../6761`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../6761`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=莱可老师的宵宫cos, URL=`6761` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bu-img.townimg.com/.../20250104004624413.jpg` (image/jpeg, 259769 bytes, 1554x2332) |  |  |  |
| details identity | PASS | Details preserved selected URL `6761` |  |  |  |
| details thumbnail URL | PASS | `https://bu-img.townimg.com/.../20250104004624413.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | COSPLAY, COS, 原神, 女孩子, 少女 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 还有 5 张图片需要 开通VIP会员 才能浏览！<br><br>请先 \[登录\](https://mikagogo.com/.../login <redacted query values: r>) 或 \[注册\](https://mikagogo.com/.../login <redacted query values: r and wp_type>) 后查看！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://bu-img.townimg.com/.../20250104004624413.jpg` (image/jpeg, 259769 bytes, 1554x2332) |  |  |  |
