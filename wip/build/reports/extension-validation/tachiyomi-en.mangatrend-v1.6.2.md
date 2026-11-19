# Extension Validation Report

- Extension: tachiyomi-en.mangatrend-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 2
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1983630122600815139
- Source name: Manga Trend
- Source language: en
- Selected manga input: popular offset 0: One Piece English (`.../one-piece-english`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | One Piece English (`.../one-piece-english`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 6 | Bleach Manga (`.../bleach-manga`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Kagurabachi (`.../kagurabachi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 6 | One Punch Man (`.../one-punch-man`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | One Piece English (`.../one-piece-english`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece English (`.../one-piece-english`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 27 | Chapter 1173 (`.../one-piece-chapter-1173-english-2`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece English, URL=`.../one-piece-english` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=One Punch Man, URL=`.../one-punch-man` at page 1 offset 16 and page 2 offset 0, title=Chainsmoker Cat manga, URL=`.../chainsmoker-cat-manga` at page 1 offset 17 and page 2 offset 1, title=The Baddest Villainess Is Back manhwa, URL=`.../the-baddest-villainess-is-back-manhwa` at page 1 offset 18 and page 2 offset 2, title=Kengan Omega, URL=`.../kengan-omega` at page 1 offset 19 and page 2 offset 3 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 53/53 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 53/53 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.wp.com/.../57.jpeg <redacted query values: resize>` (image/jpeg, 66732 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-piece-english` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i1.wp.com/.../57.jpeg` (image/jpeg, 650866 bytes, 1029x1600) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | One piece, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | As a child, Monkey D. Luffy was inspired to become a pirate by listening to the tales of the buccaneer “Red-Haired” Shanks. But Luffy’s life changed when he accidentally ate the Gum-Gum Devil Fruit and gained the power to stretch like rubber…at the cost of never being able to swim again! Years later, still vowing to become the king of the pirates, Luffy sets out on his adventure…one guy alone in a rowboat, in search of the legendary “One Piece,” said to be the greatest treasure in the world… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 27 chapters |  |  |  |
| chapter dates | PASS | 27 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
