# Extension Validation Report

- Extension: tachiyomi-id.mangakuri-v1.6.37
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: loneseal
- Source ID: 8634079728231059906
- Source name: Mangakuri
- Source language: id
- Selected manga input: popular offset 0: You Can Blame It All on Me♡  [Hanniez] (`.../you-can-blame-it-all-on-me-hanniez`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | You Can Blame It All on Me♡  [Hanniez] (`.../you-can-blame-it-all-on-me-hanniez`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Colossal (`.../colossal`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 35 | The Rogue Prince is Secretly an Omega [ Handaa ] (`.../the-rogue-prince-is-secretly-an-omega-handaa`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | You Can Blame It All on Me♡  [Hanniez] (`.../you-can-blame-it-all-on-me-hanniez`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | You Can Blame It All on Me♡  [Hanniez] (`.../you-can-blame-it-all-on-me-hanniez`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | Chapter 0.50 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: Settings can only be passed to CEF before createClient is called the first time. Current state is TERMINATED | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: Settings can only be passed to CEF before createClient is called the first time. Current state is TERMINATED | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 35 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=You Can Blame It All on Me♡  \[Hanniez\], URL=`.../you-can-blame-it-all-on-me-hanniez` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 76/76 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 76/76 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.mangakuri.online/.../you-can-blame-it-all-on-me-hanniez-1773167138031-a19eb913-be44-4db5-9002-8d340e78fde0.png` (image/png, 1671398 bytes, 900x1280) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../you-can-blame-it-all-on-me-hanniez` |  |  |  |
| details thumbnail URL | PASS | `https://api.mangakuri.online/.../you-can-blame-it-all-on-me-hanniez-1773167138031-a19eb913-be44-4db5-9002-8d340e78fde0.png` |  |  |  |
| details author | PASS | Baek Yeon-Ho |  |  |  |
| details artist | PASS | Baek Yeon-Ho |  |  |  |
| details genres | PASS | Adult, Smut, Yaoi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Ketika Sung-yoon, seorang otaku sejati yang hanya menikmati bermain 'simulasi kencan', jatuh cinta pada seorang gadis cantik yang mirip dengan karakter favoritnya, 'Dalsa', ia akhirnya mabuk dan menginap di motel bersamanya...<br><br>Kenapa... punggungku sakit seperti ditusuk?<br><br>“Memang, kau menggunakan lubangmu. Aku juga laki-laki yang punya nyali...^^”<br><br>'Dalsa' ini sebenarnya laki-laki...? Si penyamar ini sebenarnya cowok paling populer di jurusan kita, Woo Soo-hee...?!<br><br>Kisah cinta yang manis dan menggemaskan antara Usu-hee, seorang penipu yang menyamar sebagai perempuan untuk memenangkan hati Sung-yoon, dan Sung-yoon, seorang otaku kutu buku yang mudah tergila-gila pada wajah cantik. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: title |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Settings can only be passed to CEF before createClient is called the first time. Current state is TERMINATED |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
