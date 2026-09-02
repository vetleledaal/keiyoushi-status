# Extension Validation Report

- Extension: tachiyomi-id.komikucom-v1.6.35
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
- Source ID: 8489420317813224728
- Source name: Komiku.com
- Source language: id
- Selected manga input: popular offset 0: Solo Leveling (`.../060624-solo-leveling`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Solo Leveling (`.../060624-solo-leveling`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | I Have 90 Billion Licking Gold (`.../i-have-90-billion-licking-gold`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Trauma Center: Surgeon Baek Kang-Hyeok (`.../trauma-center-surgeon-baek-kang-hyeok`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | World-Saving Is A Skill (`.../world-saving-is-a-skill`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Solo Leveling (`.../060624-solo-leveling`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Solo Leveling (`.../060624-solo-leveling`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 185 | Chapter 0 (`.../233898`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Solo Leveling, URL=`.../060624-solo-leveling` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://content.komiku.me/.../solo-leveling.jpeg` (image/jpeg, 30001 bytes, 214x315) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../060624-solo-leveling` |  |  |  |
| details thumbnail URL | PASS | `https://content.komiku.me/.../solo-leveling.jpeg` |  |  |  |
| details author | PASS | Chugong ì¶ê³µ, Chugong ì¶ê³µ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Manhwa Solo Leveling yang dibuat oleh komikus bernama Chugong 추공 ini bercerita tentang 10 tahun yang lalu, setelah "Gerbang" yang menghubungkan dunia nyata dengan dunia monster terbuka, beberapa orang biasa, setiap hari menerima kekuatan untuk berburu monster di dalam Gerbang. Mereka dikenal sebagai "Pemburu". Namun, tidak semua Pemburu kuat. Nama saya Sung Jin-Woo, seorang Pemburu peringkat-E. Saya seseorang yang harus mempertaruhkan nyawanya di ruang bawah tanah paling rendah, "Terlemah di Dunia". Tidak memiliki keterampilan apa pun untuk ditampilkan, saya hampir tidak mendapatkan uang yang dibutuhkan dengan bertarung di ruang bawah tanah berlevel rendah… setidaknya sampai saya menemukan ruang bawah tanah tersembunyi dengan kesulitan tersulit dalam ruang bawah tanah peringkat-D! Pada akhirnya, saat aku menerima kematian, tiba-tiba aku menerima kekuatan aneh, log pencarian yang hanya bisa kulihat, rahasia untuk naik level yang hanya aku yang tahu! Jika saya berlatih sesuai dengan pencarian saya dan monster yang diburu, level saya akan naik. Berubah dari Hunter terlemah menjadi Hunter S-rank terkuat! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 185 chapters |  |  |  |
| chapter dates | PASS | 185 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdnkomiku.xyz/.../a11dfd1e099f342d5fe597c54d1641f3.jpg` (image/jpeg, 611535 bytes, 800x9790) |  |  |  |
