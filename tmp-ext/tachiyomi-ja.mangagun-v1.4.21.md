# Extension Validation Report

- Extension: tachiyomi-ja.mangagun-v1.4.21
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3811800324362294701
- Source name: NihonKuni
- Source language: ja
- Selected manga input: popular offset 0: Pirate King (Manga) (`.../manga-one-piece-raw.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Pirate King (Manga) (`.../manga-one-piece-raw.html`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | SPY X FAMILY - RAW (`.../manga-spy-x-family-raw.html`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | MIHABURI NO UTA ~KAGE TO IU NA NO SHINIGAMI~ RAW (`.../manga-mihaburi-no-uta-kage-to-iu-na-no-shinigami-raw.html`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | TSUIHOU SOURYO NO KENJA TIME (`.../manga-tsuihou-souryo-no-kenja-time.html`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Pirate King (Manga) (`.../manga-one-piece-raw.html`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Pirate King (Manga) (`.../manga-one-piece-raw.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 193 | Chapter 999 (`.../read-one-piece-raw-chapter-999.html`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Pirate King (Manga), URL=`.../manga-one-piece-raw.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.ihlv1.xyz/.../5f27876233111_5f27876542e6e.jpg <redacted query values: imgmax>` (image/jpeg, 399444 bytes, 764x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manga-one-piece-raw.html` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | ODA Eiichiro |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Shounen, Weekly Shonen Jump |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | One Piece, ワンピース The story of Pirate King (Manga) (ワンピース) continues to unfold. Stay tuned to NihonKuni for the latest Action, Adventure, Comedy, Drama, Fantasy, Shounen chapters and HD scans. This work is also recognized by other names like One Piece, ワンピース. Before the Pirate King was executed, he dared the many pirates of the world to seek out the fortune that he left behind in one piece. As a child, Monkey D. Luffy dreamed of becoming the King of the Pirates. But his life changed when he accidentally gained the power to stretch like rubber...at the cost of never being able to swim again! Now Luffy, with the help of a motley collection of nakama, is setting off in search of One Piece, said to be the greatest treasure in the world. Note: The best-selling series in manga history. Was a finalist for the Tezuka Osamu Cultural Prize from 2000 to 2002. The German translation of Vol 44 won the Sondermann audience award at the Frankfurt Book Fair Comics Centre in 2005. Won the 41st Japan Cartoonists Association Award Grand Prize alongside Neko Darake in 2012. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 193 chapters |  |  |  |
| chapter dates | PASS | 193 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s2.ihlv1.xyz/.../1beea236b11299b6b2449fe9081a872930.jpg` (image/jpeg, 591231 bytes, 959x1400) |  |  |  |
