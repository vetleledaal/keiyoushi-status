# Extension Validation Report

- Extension: tachiyomi-fr.histoiredhentai-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6899189456839494153
- Source name: HistoireDHentai
- Source language: fr
- Selected manga input: popular offset 0: Stepmother’s Friends (`.../6617`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Stepmother’s Friends (`.../6617`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | 3 Charos empêchent leur crush de coucher avec 3 Big Darons (`.../14327`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Stepmother’s Friends (`.../6617`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 147 | Chapitre 1 (`.../chapitre-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 34 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 24/24 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 24/24 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pub-9b104fb2e07640bcb74620f75f1596d2.r2.dev/.../steopmother-covere-350x476.jpg` (image/jpeg, 40112 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `6617` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://pub-9b104fb2e07640bcb74620f75f1596d2.r2.dev/.../steopmother-covere.jpg` (image/jpeg, 143084 bytes, 720x1008) |  |  |  |
| details author | PASS | Neck Pillow |  |  |  |
| details artist | PASS | red-A |  |  |  |
| details genres | PASS | Big Ass, Big Breasts, Drame, Harem, Romance, Webtoon |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Mon père a épousé sa jeune et sexy secrétaire et ça a été une torture pour moi. Elle n’a que 6 ans de plus que moi, et elle continue à se promener en culotte ! Et ne parlons même pas de ses amies ? webton big breasts ass milf Drame Harem Romance Seinen Adulte<br><br>Alternative Names: 새엄마의 친구들 \| 繼母的朋友們 \| My Stepmother's Friends |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 147 chapters |  |  |  |
| chapter dates | PASS | 147 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 34 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.hhentai.fr/.../01.png` (image/png, 593997 bytes, 1280x5000) |  |  |  |
