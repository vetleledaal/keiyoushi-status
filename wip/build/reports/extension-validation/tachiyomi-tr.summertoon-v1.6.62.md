# Extension Validation Report

- Extension: tachiyomi-tr.summertoon-v1.6.62
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 3
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1346985078461508977
- Source name: SummerToon
- Source language: tr
- Selected manga input: popular offset 0: A Child Who Looks Like Me (`.../a-child-who-looks-like-me`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | A Child Who Looks Like Me (`.../a-child-who-looks-like-me`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | The Promise Isn’t Mine (`.../the-promise-isnt-mine`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | The Forgotten Field (`.../the-forgotten-field`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Transgression (`.../transgression`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 18 | The Forgotten Field (`.../the-forgotten-field`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Child Who Looks Like Me (`.../a-child-who-looks-like-me`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 60 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 18 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 90/90 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 90/90 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://summertoons.org/.../A-Child-Who-Looks-Like-Me_cover-780x1024.jpg` (image/jpeg, 236074 bytes, 780x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-child-who-looks-like-me` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://summertoons.org/.../A-Child-Who-Looks-Like-Me_cover.jpg` (image/jpeg, 1762090 bytes, 1559x2048) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Çocuklu seri, Dram, Hüzün, Komedi, Modern, Romantizm, Sezon finali, A child who looks like me oku, A child who looks like me türkçe oku, A child who looks like me webtoon oku |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Evlilik teklifi edemeden hafıza kaybı yaşayan bir adam, Jung Jihun. O adam tarafından kalbi binler parçaya ayrıldığını düşünen bir kadın, Lee Jeong-Oh. Koskoca 7 yıl geçtikten sonra kader yollarını tekrar kesiştirdi. Jihun Jeong-Oh’u hatırlamadığı halde iç güdüleri ona yaklaşmasında ısrarcı. Habersiz olduğu şey ise Jeong-Oh’nun ikisini de anımsatan bir çocuğu olması. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 60 chapters |  |  |  |
| chapter dates | PASS | 60 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
