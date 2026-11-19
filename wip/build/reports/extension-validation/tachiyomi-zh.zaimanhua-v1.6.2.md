# Extension Validation Report

- Extension: tachiyomi-zh.zaimanhua-v1.6.2
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
- Source ID: 524579092615598717
- Source name: 再漫画
- Source language: zh
- Selected manga input: popular offset 0: 女友是触手怪 (`.../81759`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | 女友是触手怪 (`.../81759`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | 魅魔与美女蛇 (`.../77034`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | 和组织宿敌的婚后生活超甜 (`.../77616`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | 北地之龙 (`.../64645`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 女友是触手怪 (`.../81759`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 女友是触手怪 (`.../81759`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 30 | 第1话 (`.../163663`) |  | <1s |
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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=女友是触手怪, URL=`81759` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.zaimanhua.com/.../3544391764754180.jpg` (image/jpeg, 2459317 bytes, 1200x1873) |  |  |  |
| details identity | PASS | Details preserved selected URL `81759` |  |  |  |
| details thumbnail URL | PASS | `https://images.zaimanhua.com/.../3544391764754180.jpg` |  |  |  |
| details author | PASS | 惊面兔 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 爱情, 魔法, 搞笑 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 某一天，我发现我的女友居然变成了触手怪！惊面兔新作，发生在怪奇市的无厘头都市怪谈恋爱故事！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 30 chapters |  |  |  |
| chapter dates | PASS | 30 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.zaimanhua.com/.../chapterpic%2F42965%2F159073%2F%E5%A5%B3%E5%8F%8B%E6%98%AF%E8%A7%A6%E6%89%8B%E6%80%AA001_002.jpg <redacted query values: sign and t>` (image/jpeg, 1302917 bytes, 1200x1873) |  |  |  |
