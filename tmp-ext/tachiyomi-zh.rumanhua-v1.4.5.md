# Extension Validation Report

- Extension: tachiyomi-zh.rumanhua-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 392262758488714109
- Source name: 如漫画
- Source language: zh
- Selected manga input: popular offset 0: 雪之牢笼 (`.../IIVWygq`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 99 | 雪之牢笼 (`.../IIVWygq`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 51 | 邪灵附体 (`.../OMsJGMe`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 雪之牢笼 (`.../IIVWygq`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 雪之牢笼 (`.../IIVWygq`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 68 | 人物介绍 (`.../RzMzvCF`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=雪之牢笼, URL=`.../IIVWygq` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 149/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://p6.ecombdimg.com/.../e90d69febaa44dd8bf4718e572ba64d1~tplv-scl3phc04j-image.jpeg` (image/jpeg, 49351 bytes, 420x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../IIVWygq` |  |  |  |
| details thumbnail URL | PASS | `https://p6.ecombdimg.com/.../e90d69febaa44dd8bf4718e572ba64d1~tplv-scl3phc04j-image.jpeg` |  |  |  |
| details author | PASS | 九川动漫 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 强强, 高甜 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 更新时间：09月26日<br><br>OMEGA狼族少年泽恩和父亲一起被陷害杀死了近卫队长，被逐出狼群，沦为通缉犯。为了寻找父亲和真相，泽恩被迫开始了无尽的逃亡。然而无论是忽然出现的命运伴侣，还是早就陪伴在自己身边的“弟弟”，都逐渐对泽恩产生了强烈的占有欲，想让泽恩沦为自己的禁脔…… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 68 chapters |  |  |  |
| chapter dates | LINT | All 68 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=68 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://p9-zhuxiaobang-sign.shimolife.com/.../oEIPTneBNEEAdABfOEHLZCIIIwGAYqECVAeZQD~tplv-hra1ikqiyn-29.jpeg <redacted query values: lk3s, x-expires, and x-signature>` (image/jpeg, 309945 bytes, 1200x1714) |  |  |  |
