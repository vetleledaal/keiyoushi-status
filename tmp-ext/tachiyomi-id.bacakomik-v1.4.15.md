# Extension Validation Report

- Extension: tachiyomi-id.bacakomik-v1.4.15
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4383360263234319058
- Source name: BacaKomik
- Source language: id
- Selected manga input: popular offset 0: Solo Leveling (`.../solo-leveling`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Solo Leveling (`.../solo-leveling`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Murim Login (`.../698399-murim-login`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | The Invincible Escort (`.../the-invincible-escort`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Return of The Greatest Lancer (`.../191268-return-of-the-greatest-lancer`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 4 | Solo Leveling (`.../solo-leveling`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Solo Leveling (`.../solo-leveling`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 182 | Chapter 1 (`.../solo-leveling-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Solo Leveling, URL=`.../solo-leveling` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 124/124 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 124/124 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../Komik-Solo-Leveling.jpg <redacted query values: resize>` (image/jpeg, 9572 bytes, 146x208) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../solo-leveling` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../Komik-Solo-Leveling.jpg <redacted query values: resize>` (image/jpeg, 17624 bytes, 214x315) |  |  |  |
| details author | PASS | Chugong h-goon KI Soryeong |  |  |  |
| details artist | PASS | \]DUBU (Redice Studio) DISCIPLES (Redice Studio) \[Add Redice Studio |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Fantasy, Shounen, Supernatural |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 10 tahun yang lalu, setelah "Gerbang" yang menghubungkan dunia nyata dengan dunia monster terbuka, beberapa orang biasa, setiap hari menerima kekuatan untuk berburu monster di dalam Gerbang. Mereka dikenal sebagai "Pemburu". Namun, tidak semua Pemburu kuat. Nama saya Sung Jin-Woo, seorang Pemburu peringkat-E. Saya seseorang yang harus mempertaruhkan nyawanya di ruang bawah tanah paling rendah, "Terlemah di Dunia". Tidak memiliki keterampilan apa pun untuk ditampilkan, saya hampir tidak mendapatkan uang yang dibutuhkan dengan bertarung di ruang bawah tanah berlevel rendah… setidaknya sampai saya menemukan ruang bawah tanah tersembunyi dengan kesulitan tersulit dalam ruang bawah tanah peringkat-D! Pada akhirnya, saat aku menerima kematian, tiba-tiba aku menerima kekuatan aneh, log pencarian yang hanya bisa kulihat, rahasia untuk naik level yang hanya aku yang tahu! Jika saya berlatih sesuai dengan pencarian saya dan monster yang diburu, level saya akan naik. Berubah dari Hunter terlemah menjadi Hunter S-rank terkuat! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 182 chapters |  |  |  |
| chapter dates | PASS | 182 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://imageainewgeneration.lol/.../eG6WiHd9Woz1fyC001.jpg` (image/jpeg, 795047 bytes, 1124x768) |  |  |  |
