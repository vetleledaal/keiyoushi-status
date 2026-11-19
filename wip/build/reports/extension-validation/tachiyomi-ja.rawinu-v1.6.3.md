# Extension Validation Report

- Extension: tachiyomi-ja.rawinu-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source theme: fmreader
- Source ID: 7788489411010171607
- Source name: RawINU
- Source language: ja
- Selected manga input: popular offset 0: Pirate King (Manga) (`.../manga-one-piece-raw.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Pirate King (Manga) (`.../manga-one-piece-raw.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | OSHI NO KO - RAW (`.../manga-oshi-no-ko-raw.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | DANZAI SARERU KOUSHAKU REIJOU, UMAREKAWATTE LAST BOSS NO OUHI-SAMA NO KODOMO NI NARIMASU (`.../manga-danzai-sareru-koushaku-reijou-umarekawatte-last-boss-no-ouhi-sama-no-kodomo-ni-narimasu.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | OJISAN TO FIXATIVE (`.../manga-ojisan-to-fixative.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Pirate King (Manga) (`.../manga-one-piece-raw.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Pirate King (Manga) (`.../manga-one-piece-raw.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 198 | Chapter 999 (`.../unir-one-piece-raw-chapter-999.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Pirate King (Manga), URL=`.../manga-one-piece-raw.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.ihlv1.xyz/.../5f27876233111_5f27876542e6e.jpg <redacted query values: imgmax>` (image/jpeg, 399444 bytes, 764x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manga-one-piece-raw.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://s4.ihlv1.xyz/.../5f27876233111_5f27876542e6e.jpg` (image/jpeg, 399444 bytes, 764x1200) |  |  |  |
| details author | PASS | ODA Eiichiro |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Shounen, Weekly Shonen Jump |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Before the Pirate King was executed, he dared the many pirates of the world to seek out the fortune that he left behind in one piece. As a child, Monkey D. Luffy dreamed of becoming the King of the Pirates. But his life changed when he accidentally gained the power to stretch like rubber...at the cost of never being able to swim again! Now Luffy, with the help of a motley collection of nakama, is setting off in search of One Piece, said to be the greatest treasure in the world. Note: The best-selling series in manga history. Was a finalist for the Tezuka Osamu Cultural Prize from 2000 to 2002. The German translation of Vol 44 won the Sondermann audience award at the Frankfurt Book Fair Comics Centre in 2005. Won the 41st Japan Cartoonists Association Award Grand Prize alongside Neko Darake in 2012.<br><br>Alternative Name: One Piece, ワンピース |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 198 chapters |  |  |  |
| chapter dates | PASS | 198 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s2.ihlv1.xyz/.../1beea236b11299b6b2449fe9081a872930.jpg` (image/jpeg, 591231 bytes, 959x1400) |  |  |  |
