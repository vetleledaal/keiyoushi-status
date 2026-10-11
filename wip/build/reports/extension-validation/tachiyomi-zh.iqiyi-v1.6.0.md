# Extension Validation Report

- Extension: tachiyomi-zh.iqiyi-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2198877009406729694
- Source name: 爱奇艺叭嗒
- Source language: zh-Hans
- Selected manga input: popular offset 0: 我家大师兄脑子有坑 (`.../detail_205650070.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | 我家大师兄脑子有坑 (`.../detail_205650070.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 12 | 我家侯爷不宠我 (`.../detail_283300070.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 我家大师兄脑子有坑 (`.../detail_205650070.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 287 | 1 第一章 (`.../205650070_315730170.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 6: title=我家大师兄脑子有坑, URL=`.../detail_205650070.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 112/112 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 112/112 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://pic8.iqiyipic.com/.../cb_164140_c_601_m6.jpg` (image/jpeg, 20043 bytes, 195x260) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../detail_205650070.html` |  |  |  |
| details thumbnail URL | PASS | `http://pic8.iqiyipic.com/.../cb_164140_c_601_m6.jpg` |  |  |  |
| details author | PASS | 凌宇沫 |  |  |  |
| details artist | PASS | 凌宇沫 |  |  |  |
| details genres | PASS | 冒险, 热血, 搞笑 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 主角穿越到修真世界之后，发现自己不是主角设定！这不就坑爹了吗？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 287 chapters |  |  |  |
| chapter dates | PASS | 287 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `http://manhua.iqiyipic.com/.../cc_3422686_c_601_m3.webp` (image/webp (encoding: lossy), 34200 bytes, 440x1013) |  |  |  |
