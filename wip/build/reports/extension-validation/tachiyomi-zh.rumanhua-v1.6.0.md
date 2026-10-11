# Extension Validation Report

- Extension: tachiyomi-zh.rumanhua-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mmlook
- Source ID: 392262758488714109
- Source name: 如漫画
- Source language: zh
- Selected manga input: popular offset 0: 我的天劫女友 (`.../Xuzczul`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 99 | 我的天劫女友 (`.../Xuzczul`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 51 | 萤火虫之婚 (`.../GGZOJZS`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 我的天劫女友 (`.../Xuzczul`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 我的天劫女友 (`.../Xuzczul`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 826 | 1、天劫 (`.../DhvvDhf`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 99 entries |  |  |  |
| latest listing | PASS | 51 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=我的天劫女友, URL=`.../Xuzczul` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 149/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://p6.ecombdimg.com/.../328ecbbb5cb24aaf9a88e98b89e9cc9a~tplv-scl3phc04j-image.jpeg` (image/jpeg, 52293 bytes, 420x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Xuzczul` |  |  |  |
| details thumbnail URL | PASS | `https://p6.ecombdimg.com/.../328ecbbb5cb24aaf9a88e98b89e9cc9a~tplv-scl3phc04j-image.jpeg` |  |  |  |
| details author | PASS | 刀瑞斯 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 恋爱, 冒险, 玄幻 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 更新时间：06月17日<br><br>现代修仙界，尔虞我诈，弱肉强食，人人自危。保安马英雄救下修仙少女之后，误打误撞的开始了修行之路........读者13号群：456529881~ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 826 chapters |  |  |  |
| chapter dates | LINT | All 826 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=826 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://p9-zhuxiaobang-sign.shimolife.com/.../ocwqYLBlEiBeI1BQpAiBAPHAA9ROvUGCz7pCQr~tplv-hra1ikqiyn-29.jpeg <redacted query values: lk3s, x-expires, and x-signature>` (image/jpeg, 135059 bytes, 800x1132) |  |  |  |
