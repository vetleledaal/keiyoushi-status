# Extension Validation Report

- Extension: tachiyomi-zh.zerobyw-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8743284448117690086
- Source name: zero搬运网
- Source language: zh
- Selected manga input: popular offset 0: 鬼人幻灯抄 (`.../details <redacted query values: kuid>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | 鬼人幻灯抄 (`.../details <redacted query values: kuid>`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | 只有我的疫苗可以拯救丧尸化的世界 (`.../details <redacted query values: kuid>`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 鬼人幻灯抄 (`.../details <redacted query values: kuid>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 鬼人幻灯抄  (`.../details <redacted query values: kuid>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | 1 (`.../index.php <redacted query values: zjid>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 56 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=鬼人幻灯抄, URL=`.../details <redacted query values: kuid>` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://tupa.zerobyw33.com/.../001.jpg` (image/jpeg, 484205 bytes, 1600x2275) |  |  |  |
| details identity | UNUSUAL | Details changed selected title 鬼人幻灯抄 to 鬼人幻灯抄  |  |  |  |
| details thumbnail URL | PASS | `http://tupa.zerobyw33.com/.../001.jpg` |  |  |  |
| details author | PASS | 里見有×中西モトオ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 作者: 里見有×中西モトオ, 冒险, 战斗, 一半中文一半生肉, 连载中, 收藏: 2, 人气: 50 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 他所经历的是长达一百七十年的漫长旅途—— |  |  |  |
| metadata trimming | LINT | Untrimmed fields: title |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | LINT | All 5 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=5 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `http://tupa.zerobyw33.com/.../001.jpg` (image/jpeg, 379720 bytes, 1400x1991) |  |  |  |
