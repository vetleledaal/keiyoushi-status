# Extension Validation Report

- Extension: tachiyomi-zh.mh160-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8202483679232242177
- Source name: 漫画160
- Source language: zh
- Selected manga input: popular offset 0: 风起苍岚 (`.../12094`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 风起苍岚 (`.../12094`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | 中华小当家 (`.../7033`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 风起苍岚 (`.../12094`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 782 | 第1话 苍岚之巅1 (`.../43350001.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://p.miyeye.cn/.../2013812143624464.jpg@!180x240` (image/jpeg, 16226 bytes, 180x240) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12094` |  |  |  |
| details thumbnail URL | PASS | `https://p.miyeye.cn/.../2013812143624464.jpg@!180x240` |  |  |  |
| details author | PASS | 未知 |  |  |  |
| details artist | PASS | 未知 |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 游戏高手风恋晚意外穿越到修真世界一路升级的故事。虽然是老套的网游穿越故事，但这次的主角却是一个萝莉身御姐心的妹子，给人的新鲜感十足。古风唯美，故事激动人心，尤其是女主不按套路出牌的性格为故事情节增添了... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 782 chapters |  |  |  |
| chapter dates | LINT | All 782 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=782 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../1772359991.html` at offsets 46, 47, `.../1606576619.html` at offsets 339, 340 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mhpic7fr.tgmhfc.uk/.../0001.jpg` (image/jpeg, 45228 bytes, 800x1109) |  |  |  |
