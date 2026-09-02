# Extension Validation Report

- Extension: tachiyomi-en.mangatrend-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1983630122600815139
- Source name: Manga Trend
- Source language: en
- Selected manga input: popular offset 0: One Piece English (`.../one-piece-english`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | One Piece English (`.../one-piece-english`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 6 | The Exiled Heavy Knight Knows How to Game the System Manga (`.../the-exiled-heavy-knight-knows-how-to-game-the-system-manga`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Blue Lock English (`.../blue-lock-english`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 6 | One Punch Man (`.../one-punch-man`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | One Piece English (`.../one-piece-english`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | One Piece English (`.../one-piece-english`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 19 | Chapter 1179 (`.../read-one-piece-1179-english`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 53/53 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 53/53 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.wp.com/.../57.jpeg <redacted query values: resize>` (image/jpeg, 66732 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-piece-english` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i1.wp.com/.../57.jpeg` (image/jpeg, 650884 bytes, 1029x1600) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | One piece, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | As a child, Monkey D. Luffy was inspired to become a pirate by listening to the tales of the buccaneer “Red-Haired” Shanks. But Luffy’s life changed when he accidentally ate the Gum-Gum Devil Fruit and gained the power to stretch like rubber…at the cost of never being able to swim again! Years later, still vowing to become the king of the pirates, Luffy sets out on his adventure…one guy alone in a rowboat, in search of the legendary “One Piece,” said to be the greatest treasure in the world… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 19 chapters |  |  |  |
| chapter dates | LINT | All 19 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=19 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i0.wp.com/.../one-piece-chapter-1179-tcb-scans-are-out-v0-ivu19f2hntsg1.png` (image/webp (encoding: lossless), 248762 bytes, 640x934) |  |  |  |
