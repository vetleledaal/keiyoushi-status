# Extension Validation Report

- Extension: tachiyomi-id.lianscans-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T13:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37+dirty
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 8863831356505058723
- Source name: LianScans
- Source language: id
- Selected manga input: popular offset 0: Tada de wa Dakaremasen (`.../tada-de-wa-dakaremasen`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Tada de wa Dakaremasen (`.../tada-de-wa-dakaremasen`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Anmari sono Kinisasenaide (`.../anmari-sono-kinisasenaide`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Honto wa Motto, Shitai dake (`.../honto-wa-motto-shitai-dake`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Hatsujou Kiken Chitai (Hololive) (`.../hatsujou-kiken-chitai-hololive`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tada de wa Dakaremasen (`.../tada-de-wa-dakaremasen`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tada de wa Dakaremasen (`.../tada-de-wa-dakaremasen`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 67 | Chapter 01 - Kali Pertama Nakano-san dan Aku (`.../tada-de-wa-dakaremasen-chapter-01-bahasa-indonesia`) |  | <1s |
| pages | `getPageList(chapter)` | success | 39 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tada de wa Dakaremasen, URL=`.../tada-de-wa-dakaremasen` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | `https://images2.imgbox.com/.../XIL9D7ke_o.jpg` (image/jpeg, 8091 bytes, 240x240); known placeholder: imgbox: Thumbnail Temporarily Unavailable | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../tada-de-wa-dakaremasen` |  |  |  |
| details thumbnail URL | PASS | `https://images2.imgbox.com/.../XIL9D7ke_o.jpg` |  |  |  |
| details author | PASS | Hinohara Fuki |  |  |  |
| details artist | PASS | Hinohara Fuki |  |  |  |
| details genres | PASS | Adult, Comedy, Harem, School life, Seinen, Smut, Yuri, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kirishima Miyako, mahasiswa di sebuah universitas khusus wanita dan calon guru, adalah seorang gadis miskin yang menjalani hidup serba hemat. Suatu hari, setelah ditraktir oleh teman gadisnya Nakano Yui, dia diajak untuk mengunjungi ke love hotel. Namun, dia menolaknya karena enggan untuk berhubungan seks dengan temannya. Sampai kemudian, Nakano menawarkannya 30.000 yen jika Miyako menerima ajakannya. Sejak saat itu, Miyako melakukan lebih banyak “transaksi” dengan teman-temannya yang lain dari universitasnya!? Kisah Yuri tentang persahabatan, uang dan seks pun dimulai.<br><br>Alternative Names: <br>- Aku Gak Nidurin Kamu Secara Cuma-cuma<br>- I Won't Sleep with You for Free<br>- タダでは抱かれません<br>- |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 67 chapters |  |  |  |
| chapter dates | LINT | All 67 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=67 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | `https://wsrv.nl <redacted query values: url>` (image/jpeg, 7178 bytes, 240x240); known placeholder: imgbox: Thumbnail Temporarily Unavailable | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
