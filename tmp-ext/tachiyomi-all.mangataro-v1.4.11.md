# Extension Validation Report

- Extension: tachiyomi-all.mangataro-v1.4.11
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8358097306709528603
- Source name: MangaTaro
- Source language: en
- Selected manga input: popular offset 0: One Piece (`.../%7B%22id%22:%2247%22,%22slug%22:%22one-piece%22%7D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | One Piece (`.../%7B%22id%22:%2247%22,%22slug%22:%22one-piece%22%7D`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Magic Academy's Genius Blinker (`.../%7B%22id%22:%223562%22,%22slug%22:%22magic-academys-genius-blinker%22%7D`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | TRUMP (`.../%7B%22id%22:%22701143%22,%22slug%22:%22trump%22%7D`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 23 | My Contract Marriage and Life With the Adorable Twins End Today... Or So I Thought (`.../%7B%22id%22:%22689353%22,%22slug%22:%22my-contract-marriage-and-life-with-the-adorable-twins-end-today-or-so-i-thought%22%7D`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 24 | One Piece (`.../%7B%22id%22:%2247%22,%22slug%22:%22one-piece%22%7D`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | One Piece (`.../%7B%22id%22:%2247%22,%22slug%22:%22one-piece%22%7D`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 498 | Chapter 700: At His Own Pace (`.../ch700-5352`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`{"id":"47","slug":"one-piece"}` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 119/119 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 119/119 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangataro.org/.../one-piece.jpg` (image/jpeg, 116656 bytes, 386x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `{"id":"47","slug":"one-piece"}` |  |  |  |
| details thumbnail URL | PASS | `https://mangataro.org/.../one-piece.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Manga, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Gol D. Roger, a man referred to as the “King of the Pirates,” is set to be executed by the World Government. But just before his demise, he confirms the existence of a great treasure, One Piece, located somewhere within the vast ocean known as the Grand Line. Announcing that One Piece can be claimed by anyone worthy enough to reach it, the King of the Pirates is executed and the Great Age of Pirates begins. Twenty-two years later, a young man by the name of Monkey D. Luffy is ready to embark on his own adventure, searching for One Piece and striving to become the new King of the Pirates. Armed with just a straw hat, a small boat, and an elastic body, he sets out on a fantastic journey to gather his own crew and a worthy ship that will take them across the Grand Line to claim the greatest status on the high seas. \[Written by MAL Rewrite\]<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 498 chapters |  |  |  |
| chapter dates | PASS | 498 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangataro.yachts/.../001.webp` (image/webp (encoding: lossy), 29486 bytes, 479x440) |  |  |  |
