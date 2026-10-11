# Extension Validation Report

- Extension: tachiyomi-all.mangataro-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8358097306709528603
- Source name: MangaTaro
- Source language: en
- Selected manga input: popular offset 0: One Piece (`.../%7B%22id%22:%2247%22,%22slug%22:%22one-piece%22%7D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | One Piece (`.../%7B%22id%22:%2247%22,%22slug%22:%22one-piece%22%7D`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | The Swordmaster's Son (`.../%7B%22id%22:%2267%22,%22slug%22:%22the-swordmasters-son%22%7D`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Neo Cat (`.../%7B%22id%22:%22704306%22,%22slug%22:%22neo-cat%22%7D`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 23 | Severe Section Manager (`.../%7B%22id%22:%22689440%22,%22slug%22:%22severe-section-manager%22%7D`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | One Piece (`.../%7B%22id%22:%2247%22,%22slug%22:%22one-piece%22%7D`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../%7B%22id%22:%2247%22,%22slug%22:%22one-piece%22%7D`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1201 | Chapter 001: Romance Dawn (`.../ch001-50`) |  | <1s |
| pages | `getPageList(chapter)` | success | 53 |  |  | <1s |

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
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://via.placeholder.com/.../300x400` -> 2 manga URLs (examples: `{"id":"702480","slug":"a-space-marine-got-a-status-window"}`, `{"id":"699503","slug":"super-god-card-maker"}`) |  |  |  |
| thumbnail | PASS | `https://mangataro.org/.../one-piece.jpg` (image/jpeg, 116656 bytes, 386x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `{"id":"47","slug":"one-piece"}` |  |  |  |
| details thumbnail URL | PASS | `https://mangataro.org/.../one-piece.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Manga, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Gol D. Roger, a man referred to as the “King of the Pirates,” is set to be executed by the World Government. But just before his demise, he confirms the existence of a great treasure, One Piece, located somewhere within the vast ocean known as the Grand Line. Announcing that One Piece can be claimed by anyone worthy enough to reach it, the King of the Pirates is executed and the Great Age of Pirates begins. Twenty-two years later, a young man by the name of Monkey D. Luffy is ready to embark on his own adventure, searching for One Piece and striving to become the new King of the Pirates. Armed with just a straw hat, a small boat, and an elastic body, he sets out on a fantastic journey to gather his own crew and a worthy ship that will take them across the Grand Line to claim the greatest status on the high seas. \[Written by MAL Rewrite\]<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1201 chapters |  |  |  |
| chapter dates | PASS | 1201 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangataro.yachts/.../001.webp` (image/webp (encoding: lossy), 175432 bytes, 1456x1072) |  |  |  |
