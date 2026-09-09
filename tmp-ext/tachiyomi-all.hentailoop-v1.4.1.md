# Extension Validation Report

- Extension: tachiyomi-all.hentailoop-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3077154580363219152
- Source name: HentaiLoop
- Source language: all
- Selected manga input: latest offset 0: Houtou Kizoku Wa Moto Outaishihi To No Haramasekon De Isogashii – The Rake And The Once Crowned Princess (`.../houtou-kizoku-wa-moto-outaishihi-to-no-haramasekon-de-isogashii-the-rake-and-the-once-crowned-princess`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | I Was Cucked By My Girlfriend’s Dog! (`.../i-was-cucked-by-my-girlfriends-dog-2`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | A Moth To Flame (`.../a-moth-to-flame`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Houtou Kizoku Wa Moto Outaishihi To No Haramasekon De Isogashii – The Rake And The Once Crowned Princess (`.../houtou-kizoku-wa-moto-outaishihi-to-no-haramasekon-de-isogashii-the-rake-and-the-once-crowned-princess`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | Ichigo Chichi E｜once In A Lifetime Chest Encounter (`.../ichigo-chichi-e%EF%BD%9Conce-in-a-lifetime-chest-encounter`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Houtou Kizoku Wa Moto Outaishihi To No Haramasekon De Isogashii – The Rake And The Once Crowned Princess (`.../houtou-kizoku-wa-moto-outaishihi-to-no-haramasekon-de-isogashii-the-rake-and-the-once-crowned-princess`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../houtou-kizoku-wa-moto-outaishihi-to-no-haramasekon-de-isogashii-the-rake-and-the-once-crowned-princess`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 148 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 40/40 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 40/40 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i5.hentailoop.com/.../houtou-kizoku-wa-moto-outaishihi-to-no-haramasekon-de-isogashii-the-rake-and-the-once-crowned-princess-page-1-400x600.jpg` (image/jpeg, 74402 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `houtou-kizoku-wa-moto-outaishihi-to-no-haramasekon-de-isogashii-the-rake-and-the-once-crowned-princess` |  |  |  |
| details thumbnail URL | PASS | `https://i5.hentailoop.com/.../houtou-kizoku-wa-moto-outaishihi-to-no-haramasekon-de-isogashii-the-rake-and-the-once-crowned-princess-page-1-400x600.jpg` |  |  |  |
| details author | PASS | Jagi Iwa |  |  |  |
| details artist | PASS | Jagi Iwa |  |  |  |
| details genres | PASS | Doujinshi, English |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Pages: 148<br>Views: 0<br>Updated: 46 minutes ago<br>Dislikes: 0<br>Likes: 0<br>Artists: Jagi Iwa<br>Genres: Doujinshi<br>Languages: English<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 148 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i5.hentailoop.com/.../houtou-kizoku-wa-moto-outaishihi-to-no-haramasekon-de-isogashii-the-rake-and-the-once-crowned-princess-page-1.jpg` (image/jpeg, 1599239 bytes, 1280x960) |  |  |  |
