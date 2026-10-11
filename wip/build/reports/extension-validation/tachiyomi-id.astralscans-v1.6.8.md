# Extension Validation Report

- Extension: tachiyomi-id.astralscans-v1.6.8
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 27
- Lint: 0
- Warnings: 0
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 829250309114015686
- Source name: Astral Scans
- Source language: id
- Selected manga input: latest offset 0: Finding My Angel (`.../finding-my-angel`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | While You Were Letting Your Guard Down (`.../while-you-were-letting-your-guard-down`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 7 | When Alpha Becomes Omega (`.../when-alpha-becomes-omega`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Finding My Angel (`.../finding-my-angel`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 7 | A Pushover From Potae Village (`.../a-pushover-from-potae-village`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Finding My Angel (`.../finding-my-angel`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Finding My Angel (`.../finding-my-angel`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Finding My Angel, URL=`.../finding-my-angel` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 75/75 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 75/75 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.wp.com/.../poster-angel.webp` (image/jpeg, 143692 bytes, 720x960) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../finding-my-angel` |  |  |  |
| details thumbnail URL | PASS | `https://i1.wp.com/.../poster-angel.webp` |  |  |  |
| details author | PASS | M9 |  |  |  |
| details artist | PASS | M9 |  |  |  |
| details genres | PASS | Comedy, School life, Shounen ai, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Gadis tetangga sebelah berwajah bak malaikat yang membuatnya jatuh cinta pada pandangan pertama hingga saling berjanji untuk menikah. Sepuluh tahun kemudian, ia malah kembali sebagai pria bertubuh raksasa…?! Eugene Kim, seorang pemuda berdarah Korea-Amerika yang tinggal di sebuah kota kecil di Amerika. Setelah sepuluh tahun, akhirnya ia reuni kembali dengan cinta pertamanya, Morgan Riley, yang pindah ke rumah sebelah. Namun, sosok yang muncul di hadapannya saat ini adalah Morgan versi pria pirang bertubuh kekar. Sadar dirinya telah salah mengira Morgan sebagai anak perempuan seumur hidupnya, Eugene pun berusaha menjaga jarak dan menghindar, tetapi segalanya tak berjalan semudah itu.<br><br>Alternative Names: <br>- 나의 천사를 찾아서<br>- Mencari Malaikatku |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
