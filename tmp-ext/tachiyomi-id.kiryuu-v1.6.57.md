# Extension Validation Report

- Extension: tachiyomi-id.kiryuu-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3639673976007021338
- Source name: Kiryuu
- Source language: id
- Selected manga input: popular offset 0: Martial Peak (`.../%7B%22id%22:233,%22slug%22:%22martial-peak%22%7D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Martial Peak (`.../%7B%22id%22:233,%22slug%22:%22martial-peak%22%7D`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Player Who Returned 10,000 Years Later (`.../%7B%22id%22:383309,%22slug%22:%22player-who-returned-10000-years-later%22%7D`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Forget That Night, Your Majesty (`.../%7B%22id%22:795369,%22slug%22:%22forget-that-night-your-majesty%22%7D`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | World-Saving is a Skill (`.../%7B%22id%22:701938,%22slug%22:%22world-saving-is-a-skill%22%7D`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Martial Peak (`.../%7B%22id%22:233,%22slug%22:%22martial-peak%22%7D`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../%7B%22id%22:233,%22slug%22:%22martial-peak%22%7D`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3870 | Chapter 1 (`.../chapter-1.147609`) |  | 1-10s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`{"id":233,"slug":"martial-peak"}` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://v7.kiryuu.to/.../Martial-Peak.jpg` (image/jpeg, 90617 bytes, 420x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `{"id":233,"slug":"martial-peak"}` |  |  |  |
| details thumbnail URL | PASS | `https://v7.kiryuu.to/.../Martial-Peak.jpg` |  |  |  |
| details author | PASS | Momo (III) |  |  |  |
| details artist | PASS | Pikapi |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Harem, Historical, Martial Arts, Romance, Sci-fi, Shounen, Supernatural, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Perjalanan ke puncak bela diri adalah yang sepi, soliter dan panjang. Dalam menghadapi kesulitan, Anda harus bertahan dan tetap pantang menyerah. Hanya dengan begitu Anda dapat menerobos dan dan melanjutkan perjalanan Anda untuk menjadi yang terkuat. Sky Tower menguji murid-muridnya dengan cara yang paling keras untuk mempersiapkan mereka untuk perjalanan ini. Suatu hari penyapu rendahan Yang Kai berhasil mendapatkan sebuah buku hitam, menempatkannya di jalan menuju puncak dunia persilatan<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 3870 chapters |  |  |  |
| chapter dates | PASS | 3870 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://yuucdn.com/.../1-647a126102777.jpg` (image/jpeg, 215249 bytes, 800x1200) |  |  |  |
