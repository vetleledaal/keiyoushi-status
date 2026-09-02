# Extension Validation Report

- Extension: tachiyomi-zh.dumanwu-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7167507050606280098
- Source name: 读漫屋
- Source language: zh
- Selected manga input: latest offset 0: 邪灵附体 (`.../OMsJGMS`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 99 | 宦妃天下（太监王爷强娶我） (`.../trbGsTl`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 51 | 邪灵附体 (`.../OMsJGMS`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 邪灵附体 (`.../OMsJGMS`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 邪灵附体 (`.../OMsJGMS`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 348 | 第1话 甘城千歌 (`.../vrGbKGl`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 62 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=邪灵附体, URL=`OMsJGMS` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://p6.ecombdimg.com/.../fdbc10a221e04d67b41f5ed245bc53a6~tplv-scl3phc04j-image.jpeg` (image/jpeg, 48011 bytes, 360x480) |  |  |  |
| details identity | PASS | Details preserved selected URL `OMsJGMS` |  |  |  |
| details thumbnail URL | PASS | `https://p6.ecombdimg.com/.../fdbc10a221e04d67b41f5ed245bc53a6~tplv-scl3phc04j-image.jpeg` |  |  |  |
| details author | PASS | 山田惠庸 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 冒险 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 更新时间：09月02日<br><br>开始增加的女性杀人事件——被称为美杜莎症候群的是…！？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 348 chapters |  |  |  |
| chapter dates | LINT | All 348 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=348 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://p3-zhuxiaobang-sign.shimolife.com/.../o4R3lABBzBu5y9uiiAA9YBEGHAYPfRFQMUI9Co~tplv-hra1ikqiyn-29.jpeg <redacted query values: lk3s, x-expires, and x-signature>` (image/jpeg, 344961 bytes, 721x1278) |  |  |  |
