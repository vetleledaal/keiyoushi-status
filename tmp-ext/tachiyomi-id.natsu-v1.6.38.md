# Extension Validation Report

- Extension: tachiyomi-id.natsu-v1.6.38
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 778073414277513172
- Source name: Natsu
- Source language: id
- Selected manga input: popular offset 0: Martial Peak (`.../%7B%22id%22:42055,%22slug%22:%22martial-peak%22%7D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Martial Peak (`.../%7B%22id%22:42055,%22slug%22:%22martial-peak%22%7D`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | One Punch-Man (`.../%7B%22id%22:29627,%22slug%22:%22one-punch-man%22%7D`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Lv. 99 Princess of Black Flame (`.../%7B%22id%22:401824,%22slug%22:%22lv-99-princess-of-black-flame%22%7D`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Tang Clan Legend (`.../%7B%22id%22:30129,%22slug%22:%22tang-clan-legend%22%7D`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Martial Peak (`.../%7B%22id%22:42055,%22slug%22:%22martial-peak%22%7D`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../%7B%22id%22:42055,%22slug%22:%22martial-peak%22%7D`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3865 | Chapter 1 (`.../chapter-1.59006`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`{"id":42055,"slug":"martial-peak"}` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Tang Clan Legend, URL=`{"id":30129,"slug":"tang-clan-legend"}` at page 1 offset 23 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://natsu.one/.../51a42f3f-9cbc-4e6c-a165-bdeadbb6027d.png` (image/png, 2208356 bytes, 1273x1800) |  |  |  |
| details identity | PASS | Details preserved selected URL `{"id":42055,"slug":"martial-peak"}` |  |  |  |
| details thumbnail URL | PASS | `https://natsu.one/.../51a42f3f-9cbc-4e6c-a165-bdeadbb6027d.png` |  |  |  |
| details author | PASS | Pikapi |  |  |  |
| details artist | PASS | Pikapi |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Harem, Martial Arts, Shounen, Supernatural, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Perjalanan ke puncak bela diri adalah yang sepi, soliter dan panjang. Dalam menghadapi kesulitan, Anda harus bertahan dan tetap pantang menyerah. Hanya dengan begitu Anda dapat menerobos dan dan melanjutkan perjalanan Anda untuk menjadi yang terkuat. Sky Tower menguji murid-muridnya dengan cara yang paling keras untuk mempersiapkan mereka untuk perjalanan ini. Suatu hari penyapu rendahan Yang Kai berhasil mendapatkan sebuah buku hitam, menempatkannya di jalan menuju puncak dunia persilatan<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 3865 chapters |  |  |  |
| chapter dates | PASS | 3865 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.natsu.id/.../1.webp` (image/webp (encoding: lossy), 131040 bytes, 800x1200) |  |  |  |
