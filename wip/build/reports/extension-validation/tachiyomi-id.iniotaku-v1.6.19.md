# Extension Validation Report

- Extension: tachiyomi-id.iniotaku-v1.6.19
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 5311518849697361922
- Source name: IniOtaku
- Source language: id
- Selected manga input: popular offset 0: Predatory Marriage (`.../predatory-marriage_18.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Predatory Marriage (`.../predatory-marriage_18.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 17 | Class Saiyasune de Urareta Ore wa, Jitsu wa Saikyou Parameter (`.../class-saiyasune-de-urareta-ore-wa-jitsuu.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Predatory Marriage (`.../predatory-marriage_18.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Predatory Marriage (`.../predatory-marriage_18.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 13 | Chapter 01 (`.../chapter-01_7.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 31 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 17 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Predatory Marriage, URL=`.../predatory-marriage_18.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 24/24 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 24/24 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../7f972420d2e1fc2a654c1e47b5af012527077740_960_1458_272606.jpeg` (image/jpeg, 94345 bytes, 600x911) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../predatory-marriage_18.html` |  |  |  |
| details thumbnail URL | PASS | `https://blogger.googleusercontent.com/.../7f972420d2e1fc2a654c1e47b5af012527077740_960_1458_272606.jpeg` |  |  |  |
| details author | PASS | Saha |  |  |  |
| details artist | PASS | Hera |  |  |  |
| details genres | PASS | Manhwa, Demons, Drama, Fantasy, Historical, Josei, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★☆ 8<br>Korea · 2023<br><br>---<br><br>Putri Leah menulis catatan bunuh diri menjelang pernikahannya. Itu karena dia yakin dia akan mati setelah malam pernikahan; akhir yang menyedihkan dari seorang putri yang mengabdikan hidupnya untuk negara dan keluarga kerajaan.<br><br>Tetapi sebelum menyerahkan hidupnya, Leah merencanakan balas dendam terakhirnya kepada keluarga, yang pasti akan membuat mereka hancur bahkan setelah dia menjadi mayat yang dingin. Dia akan membuat mereka malu dengan menjadi pengantin non-perawan. “Mengapa kamu membuang pengalaman pertamamu? Bukankah kamu hanya ingin melarikan diri? "Aku ... aku ingin mati." Leah secara impulsif menceritakan kepada pria yang tidur dengannya selama satu malam. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 13 chapters |  |  |  |
| chapter dates | PASS | 13 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../001.png` (image/png, 3628402 bytes, 720x5120) |  |  |  |
