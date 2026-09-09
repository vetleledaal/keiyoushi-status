# Extension Validation Report

- Extension: tachiyomi-tr.tonizutoon-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 28
- Lint: 0
- Warnings: 1
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 5222101826721428426
- Source name: TonizuToon
- Source language: tr
- Selected manga input: popular offset 0: Kayıp Hareket (`.../227`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 11 | Kayıp Hareket (`.../227`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 11 | Kış Ormanı (`.../1714`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kayıp Hareket (`.../227`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kayıp Hareket (`.../227`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 55 | Bölüm 1 (`.../bolum-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 0 |  |  | 1-10s |

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
| popular listing | PASS | 11 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kayıp Hareket, URL=`227` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 23/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tonizu.top/.../kayiptall-350x476.webp` (image/webp (encoding: lossy), 22406 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `227` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tonizu.top/.../kayiptall.webp` (image/webp (encoding: lossy), 43132 bytes, 536x785) |  |  |  |
| details author | PASS | DoDo |  |  |  |
| details artist | PASS | Soi |  |  |  |
| details genres | PASS | Drama, Final, Josei, Romantizm, Smut, Yetişkin |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Han Soo-ah bir kızın ihtiyaç duyabileceği her şeye sahip olarak büyüdü. Ya da babasının emrinde bir araçtan fazlası olmadığını fark edene kadar öyle olduğunu düşünüyordu. Kendisi için yapabileceği en iyi şey, omuzlarına yüklenen beklentileri karşılamaktı. Kendini böyle bir hayata teslim etmiştir, ta ki bir müzik mağazasında karşılaştığı kader her şeyi sonsuza dek değiştirene kadar. Piyanonun başındaki adam, Soo-ah’ın kaybettiğini bile bilmediği şeyi geri getirebilecek midir…?<br><br>Alternative Names: Lost Motion / 로스트모션 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 55 chapters |  |  |  |
| chapter dates | PASS | 55 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
