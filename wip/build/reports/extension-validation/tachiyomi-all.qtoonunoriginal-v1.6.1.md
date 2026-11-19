# Extension Validation Report

- Extension: tachiyomi-all.qtoonunoriginal-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 7737368858056367259
- Source name: Qtoon (unoriginal)
- Source language: en
- Selected manga input: popular offset 0: Jinx (`.../jinx-yaoi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | Jinx (`.../jinx-yaoi`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 42 | Shutline (`.../shutline-1`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 39 | Confessions Of A Male Celeb (`.../confessions-of-a-male-celeb`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 39 | Beastmen And Tentacles (`.../beastmen-and-tentacles`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Love Jinx (`.../love-jinx`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jinx (`.../jinx-yaoi`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 151 | Episode 1 — Chapter 1 (`.../569901`) |  | <1s |
| pages | `getPageList(chapter)` | success | 97 |  |  | 1-10s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 39 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 3: title=Jinx, URL=`.../jinx-yaoi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 172/172 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 172/172 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.zonatmo.org/.../0d16eb275aa1b0c664ff731cebdc1bb4.jpg` (image/jpeg, 14196 bytes, 200x267) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../jinx-yaoi` |  |  |  |
| details thumbnail URL | PASS | `https://storage.zonatmo.org/.../0d16eb275aa1b0c664ff731cebdc1bb4.jpg` |  |  |  |
| details author | PASS | mingwa |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Josei, Romance, Drama, Slice of Life, Mature, Smut, Fantasy, Comedy, School Life, Yuri, Shoujo, All Genres, Shounen Ai, Webtoons, Yaoi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Physical therapist Kim Dan has been down on his luck for as long as he can remember. Between an ailing grandmother, menacing loansharks, and an old boss making it almost impossible for him to find work, Dan is truly running out of options. Naturally, it feels like a dream come true when he’s finally hired to treat top-paid MMA fighter Joo Jaekyung, especially when the man then calls him out for a treatment the night before a match with an oh-so-tantalizing offer of five thousand dollars. He claims to have a “jinx” in need of a particular type of “treatment,” but it’s one that Dan isn’t quite prepared to offer… You see, Jaekyung may be a beast in the ring, but he’s even rougher in the bedroom, and Dan’s not sure he can survive Jaekyung at his most primal. Nevertheless, the promise of much-needed cash has Dan agreeing to this ill-fated deal… Could a night together be the thing to help Jaekyung break this jinx once and for all?<br><br>**Alternative Names:**<br>- 징크스 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 151 chapters |  |  |  |
| chapter dates | PASS | 151 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 97 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage.zonatmo.org/.../98c384f2773bd155d54f128a76ba16ab.jpg` (image/webp (encoding: lossy), 47422 bytes, 720x1159; server Content-Type: image/jpeg) |  |  |  |
