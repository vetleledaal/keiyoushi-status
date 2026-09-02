# Extension Validation Report

- Extension: tachiyomi-tr.tonizutoon-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 0
- Warnings: 1
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5222101826721428426
- Source name: TonizuToon
- Source language: tr
- Selected manga input: latest offset 0: Kış Ormanı (`.../1714`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 11 | Kayıp Hareket (`.../227`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 11 | Kış Ormanı (`.../1714`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kış Ormanı (`.../1714`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kış Ormanı (`.../1714`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 40 | Bölüm 0 (`.../bolum-0`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kış Ormanı, URL=`1714` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 23/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tonizu.top/.../kisormanitall-350x476.jpg` (image/jpeg, 35672 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `1714` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tonizu.top/.../kisormanitall.jpg` (image/jpeg, 63585 bytes, 480x623) |  |  |  |
| details author | PASS | cosmos |  |  |  |
| details artist | PASS | Banji |  |  |  |
| details genres | PASS | Doğa Üstü, Drama, Josei, Romantizm, Yaşamdan Kesitler |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Bir simyacı Winter’ı yarattığından bu yana birkaç bin yıl geçti. Winter, hikayesini anlatmak karşılığında yazar Jane ile yaşamaya başlar. Etkileşimlerinden Winter insan olmanın anlamını öğrenmeye başlar ve Jane, farkında olmadan hayatını hayal edebileceğinden çok daha fazla şekilde değiştiren bir adam görmeye başlar.<br><br>Alternative Names: Winter Woods / 윈터우즈 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 40 chapters |  |  |  |
| chapter dates | PASS | 40 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
