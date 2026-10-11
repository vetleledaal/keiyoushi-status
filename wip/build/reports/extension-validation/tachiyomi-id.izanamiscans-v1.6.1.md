# Extension Validation Report

- Extension: tachiyomi-id.izanamiscans-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 831567442922111170
- Source name: Izanami Scans
- Source language: id
- Selected manga input: popular offset 0: It All Starts With Trillions Of Nether Currency (`.../it-all-starts-with-trillions-of-nether-currency`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | It All Starts With Trillions Of Nether Currency (`.../it-all-starts-with-trillions-of-nether-currency`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | The Investor Who Sees The Future (`.../the-investor-who-sees-the-future`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | The Villain Wants To Live (`.../the-villain-wants-to-live`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Offering Kimchi Cup Noodles to the Gods’ Group Chat (`.../offering-kimchi-cup-noodles-to-the-gods-group-chat`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | It All Starts With Trillions Of Nether Currency (`.../it-all-starts-with-trillions-of-nether-currency`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | It All Starts With Trillions Of Nether Currency (`.../it-all-starts-with-trillions-of-nether-currency`) |  | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 274 | Chapter 01 (`.../it-all-starts-with-trillions-of-nether-currency-chapter-01`) |  | <1s |
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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=It All Starts With Trillions Of Nether Currency, URL=`.../it-all-starts-with-trillions-of-nether-currency` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../With-My-Netherworld-Trillions-Game-On-Official.jpg <redacted query values: resize>` (image/jpeg, 17302 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../it-all-starts-with-trillions-of-nether-currency` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../With-My-Netherworld-Trillions-Game-On-Official.jpg` (image/jpeg, 158581 bytes, 400x600) |  |  |  |
| details author | PASS | 季米 \[Add, \] |  |  |  |
| details artist | PASS | 青鸿文化 \[Add, \]飞卢小说网 \[Add, \] |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Historical, Horror, Martial arts, Mystery, Shounen, Supernatural, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Setelah menentang cengkeraman kematian, Yu Lin membangunkan “Sistem Tycoon Ilahi”, yang memberinya pembayaran tunai harian. Namun ada kendalanya: uang tersebut adalah Token Nether yang tidak dapat digunakan. Bertahun-tahun kemudian, dia terpilih sebagai salah satu dari sedikit orang yang beruntung yang melakukan uji beta Global Menace, sebuah game horor di mana hanya yang terbaik dan terkuat yang bisa bertahan. Sementara yang lain dengan panik menenangkan roh-roh jahat, Yu Lin merekrut pengikut hantu yang setia dengan pengeluaran Tycoon-nya. Sepertinya hanya punya uang saja yang kamu perlukan untuk menguasai dunia bawah!<br><br>Alternative Names: <br>- With My Netherworld Trillions<br>- Game On!<br>- Bắt Đầu Với Trăm Vạn Minh Tệ<br>- Global Horror: Start With Trillions of Coins<br>- It All Starts With Trillions of Nether Currency<br>- Kaiju Wan Yi Ming Bi<br>- Kāijú Wàn Yì Míng Bì<br>- Trillions of Coins at the Start<br>- Я попал в мир ужасов с системой богатства<br>- ゴーストマスターは億万長者<br>- 全球惊悚：开局万亿冥币<br>- 开局万亿冥币 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 274 chapters |  |  |  |
| chapter dates | PASS | 274 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../001.webp` (image/jpeg, 128030 bytes, 720x954) |  |  |  |
