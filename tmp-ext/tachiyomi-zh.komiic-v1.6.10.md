# Extension Validation Report

- Extension: tachiyomi-zh.komiic-v1.6.10
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 792932060924485302
- Source name: Komiic
- Source language: zh
- Selected manga input: popular offset 0: 想要成為影之實力者 (`.../1263`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 想要成為影之實力者 (`.../1263`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | 想當冒險者的女兒到首都當了等級S的冒險者 (`.../1219`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | 和班級第二可愛的女孩子成為了朋友 (`.../1023`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 小緩緩 周刊圍棋四格漫畫 (`.../9759`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 想要成為影之實力者 (`.../1263`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 想要成為影之實力者 (`.../1263`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 107 | 第 01 卷 (`.../24515`) |  | <1s |
| pages | `getPageList(chapter)` | success | 164 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=想要成為影之實力者, URL=`.../1263` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://public.komiic.com/.../cover.jpg` (image/jpeg, 22772 bytes, 180x240) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1263` |  |  |  |
| details thumbnail URL | PASS | `https://public.komiic.com/.../cover.jpg` |  |  |  |
| details author | PASS | 阪野杏梨，逢澤大介 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 搞笑, 冒險, 魔法, 異世界 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 少年席德憧憬成為隱藏於幕後、暗中操控局勢的「影之強者」。轉生至異世界後，他為了擊潰自己幻想中的敵人「黑暗教團」，暗中展開行動。然而，這個教團竟然真實存在。與此同時，他收為部下的少女們誤以為他是真正的「影之強者」，在不知情的情況下，席德成為了名副其實的「影之強者」，並與部下們組成「暗影庭園」，致力於殲滅世上的黑暗。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 107 chapters |  |  |  |
| chapter dates | PASS | 107 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 164 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://komiic.com/.../938ba9b3-3310-4b12-920b-9907689c23b5` (image/jpeg, 257255 bytes, 980x1394) |  |  |  |
