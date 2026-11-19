# Extension Validation Report

- Extension: tachiyomi-id.natsu-v1.6.42
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: natsuid
- Source ID: 778073414277513172
- Source name: Natsu
- Source language: id
- Selected manga input: popular offset 0: Martial Peak (`.../%7B%22id%22:42055,%22slug%22:%22martial-peak%22%7D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Martial Peak (`.../%7B%22id%22:42055,%22slug%22:%22martial-peak%22%7D`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | The Little Brother Is the Academy’s Hotshot (`.../%7B%22id%22:41270,%22slug%22:%22the-little-brother-is-the-academys-hotshot%22%7D`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | The Obsessive Maniac Is Trying to Confine Me (`.../%7B%22id%22:376226,%22slug%22:%22the-obsessive-maniac-is-trying-to-confine-me%22%7D`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Back-to-School Boss (`.../%7B%22id%22:444034,%22slug%22:%22back-to-school-boss%22%7D`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Martial Peak (`.../%7B%22id%22:42055,%22slug%22:%22martial-peak%22%7D`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../%7B%22id%22:42055,%22slug%22:%22martial-peak%22%7D`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3867 | Chapter 1 (`.../chapter-1.59006`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| latest pagination | PASS |  |  |  |  |
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
| details description | PASS | Perjalanan ke puncak bela diri adalah yang sepi, soliter dan panjang. Dalam menghadapi kesulitan, Anda harus bertahan dan tetap pantang menyerah. Hanya dengan begitu Anda dapat menerobos dan dan melanjutkan perjalanan Anda untuk menjadi yang terkuat. Sky Tower menguji murid-muridnya dengan cara yang paling keras untuk mempersiapkan mereka untuk perjalanan ini. Suatu hari penyapu rendahan Yang Kai berhasil mendapatkan sebuah buku hitam, menempatkannya di jalan menuju puncak dunia persilatan<br><br>Alternative Names:<br>- The Pinnacle of Martial Arts<br>- Võ Luyện Đỉnh Phong<br>- Wu Lian Dian Feng<br>- Wu Lian Dianfeng<br>- Wǔ Liàn Diān Fēng<br>- Wǔ Liàn Diānfēng<br>- Вершина боевых искусств<br>- Пик боевых искусств<br>- ذروة الفنون القتالية<br>- مارشال بيك<br>- 武炼巅峰<br>- 武煉巔峰<br>- 武錬天下<br>- 무련전봉 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3867 chapters |  |  |  |
| chapter dates | PASS | 3867 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.natsu.id/.../1.webp` (image/webp (encoding: lossy), 131040 bytes, 800x1200) |  |  |  |
