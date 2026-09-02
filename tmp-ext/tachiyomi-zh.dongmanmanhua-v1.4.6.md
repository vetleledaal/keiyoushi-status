# Extension Validation Report

- Extension: tachiyomi-zh.dongmanmanhua-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
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
- Source ID: 4222375517460530289
- Source name: Dongman Manhua
- Source language: zh-Hans
- Selected manga input: popular offset 0: 如出一辙的女儿 (`.../list <redacted query values: title_no>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 1306 | 如出一辙的女儿 (`.../list <redacted query values: title_no>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 40 | 剑尊归来 (`.../list <redacted query values: title_no>`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 如出一辙的女儿 (`.../episodeList <redacted query values: titleNo>`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 如出一辙的女儿 (`.../list <redacted query values: title_no>`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 11 | 第1话 (`.../viewer <redacted query values: title_no and episode_no>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 176 |  |  | 1-10s |

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
| popular listing | PASS | 1306 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=如出一辙的女儿, URL=`.../episodeList <redacted query values: titleNo>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 1347/1347 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1347/1347 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.dongmanmanhua.cn/.../2355a6e0-73f6-4385-aea9-daa181ea6031.jpg <redacted query values: x-oss-process>` (image/jpeg, 13144 bytes, 126x126) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../list <redacted query values: title_no>` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.dongmanmanhua.cn/.../2355a6e0-73f6-4385-aea9-daa181ea6031.jpg <redacted query values: x-oss-process>` (image/jpeg, 48078 bytes, 306x306) |  |  |  |
| details author | PASS | YIDAHM |  |  |  |
| details artist | PASS | YIDAHM |  |  |  |
| details genres | PASS | 悬疑 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 弟弟意外身亡！ 控制狂母亲却诡异地笑了？ 成绩优秀，品行端正的模范生吉晓茗，一直以来都按照妈妈的要求，过着完美女儿的生活。但是自从弟弟的尸体从江中浮起的那一天起，晓茗的脑海中便有了令人毛骨悚然的想法。想要做一个完美妈妈和想要摆脱妈妈掌控的女儿，她们之间的残酷关系将会如何发展 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 176 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.dongmanmanhua.cn/.../1642470818446195411.jpg <redacted query values: x-oss-process>` (image/jpeg, 33511 bytes, 690x824) |  |  |  |
