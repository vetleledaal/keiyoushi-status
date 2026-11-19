# Extension Validation Report

- Extension: tachiyomi-id.cgbum-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1830727736083703316
- Source name: CGBUM
- Source language: id
- Selected manga input: popular offset 0: Cry, or Better Yet, Beg (`.../cry-or-better-yet-begcgbum`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Cry, or Better Yet, Beg (`.../cry-or-better-yet-begcgbum`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | A Hero Saves With Her Body (`.../a-hero-saves-with-her-bodycgbum`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 24 Hours Resurrection of the Villainess (`.../24-hours-resurrection-of-the-villainesscgbum`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Bad Apple (`.../bad-applecgbum`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Cry, or Better Yet, Beg (`.../cry-or-better-yet-begcgbum`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Cry, or Better Yet, Beg (`.../cry-or-better-yet-begcgbum`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 92 | Ch. 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cry, or Better Yet, Beg, URL=`.../cry-or-better-yet-begcgbum` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://img.cgbum.com/.../cover-w1-dbdc09c897f39167fb1b67e4.webp` did not contain a decodable image (3277056 bytes) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../cry-or-better-yet-begcgbum` |  |  |  |
| details thumbnail URL | PASS | `https://img.cgbum.com/.../cover-w1-dbdc09c897f39167fb1b67e4.webp` |  |  |  |
| details author | PASS | Solche |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Crime, Fantasy, Full Color, Josei(W), Mature, Psychological, Romance, Shoujo(G), Tragedy, drama, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | \[Cry, or Better Yet, Beg\] Dibesarkan sebagai anak yatim sejak usia muda, Layla Llewellyn mengaggap dirinya adalah gadis yang paling mujur di dunia ketika diadopsi oleh pamannya, Bill Remmer- seorang tukang kebun yang menetap di tanah perkebunan megah Arvis di kekaisaran Berg. Arvis, menurut Layla, tampak seperti sebuah surga; dia terpesona oleh keindahan luasnya hutan, dan selalu membawa buku catatannya untuk mendokumentasikan setiap makhluk liar yang dia jumpai dalam penjelajahannya. Kecintaannya terhadap burung, membuatnya sering memandangi mereka dengan kekaguman ketika menonton mereka berkembang dari anak berbulu menjadi burung yang anggun. Duke Herhardt, Duke muda Arvis yang menawan, juga memiliki minat yang sama terhadap burung dan juga Layla. Namun, perbedaannya terletak pada alasannya: dia tertarik pada burung karena kesenangannya memburu mereka, dan dia tertarik pada Layla dengan alasan membuatnya menangis. Ketika burung indah dipenjarakan dalam sangkar emas, Layla, sang burung, dihadapkan pada dua pilihan: apakah dia akan memilih kehidupan mewah atau kebebasan? ~ CGBUM<br><br>Judul alternatif: 울어봐, 빌어도좋고 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 92 chapters |  |  |  |
| chapter dates | LINT | All 92 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=92 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://cgbum.com/.../1` at pages 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://cgbum.com/.../1` did not contain a decodable image (118394 bytes) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
