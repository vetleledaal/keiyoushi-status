# Extension Validation Report

- Extension: tachiyomi-en.suryascans-v1.6.58
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
- Source theme: keyoapp
- Source ID: 1061713767402958340
- Source name: Genz Toons
- Source language: en
- Selected manga input: popular offset 0: Logging Out Is Too Hard (`.../logging-out-is-too-hard`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 252 | Logging Out Is Too Hard (`.../logging-out-is-too-hard`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 219 | Face Genius: Top Star from Age 0 (`.../face-genius-top-star-from-age-0`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Logging Out Is Too Hard (`.../logging-out-is-too-hard`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Logging Out Is Too Hard (`.../logging-out-is-too-hard`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 20 | Chapter 1 (`.../6603eb15051-660416dcb50`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 252 entries |  |  |  |
| latest listing | PASS | 219 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Logging Out Is Too Hard, URL=`.../logging-out-is-too-hard` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 472/472 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 472/472 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wsrv.nl <redacted query values: url and w>` (image/jpeg, 73209 bytes, 480x640) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../logging-out-is-too-hard` |  |  |  |
| details thumbnail URL | PASS | `https://wsrv.nl <redacted query values: url and w>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | ToYou Dream |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | \[By the Studio that brought you and !\] Kim Woojin was trapped inside the virtual reality game "Evil Tale." In the depths of despair, having even his existence in the real world erased, he finally came across a logout window and pressed it… But instead of returning to reality, he found himself in Evil Tale 50 years in the future—a world on the brink of destruction! Amidst a monster invasion, Woojin inherited the spirit of the ancient divine beast Sarbandin and witnessed the sacrifice of Raul, a swordsman. He was then forcibly logged back into the game’s past. “If you truly wish to log out, prevent the destruction of this world!” Armed with the secret technique Dragon Ascension, a legacy from the future, the overpowered ability Mark of the Ravenous, and knowledge of the world’s doomed future, Woojin began to make waves. Surpassing the immortal records of Kerga, the number-one ranked player, Woojin soon drew the attention of the entire server. His sights were set on the 100th floor of the Labyrinth Tower, where any wish is said to be granted. The ultimate game walkthrough begins, led by the only player who has experienced the world’s destruction!<br><br>Alternative Titles:<br>- 로그아웃이 너무 어렵다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | PASS | 20 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../660416dcb50.avif` (image/avif (format: avif), 373193 bytes, 900x12620) |  |  |  |
