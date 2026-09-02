# Extension Validation Report

- Extension: tachiyomi-en.asmotoon-v1.6.24
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5258838449396844455
- Source name: Asmodeus Scans
- Source language: en
- Selected manga input: popular offset 0: Reincarnated as the Mastermind of the Story: Overcoming Everything with My Ever-Evolving Demon Sword and Game Knowledge (`.../reincarnated-as-the-mastermind-of-the-story-overcoming-everything-with-my-ever-evolving-demon-sword-and-game-knowledge`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Reincarnated as the Mastermind of the Story: Overcoming Everything with My Ever-Evolving Demon Sword and Game Knowledge (`.../reincarnated-as-the-mastermind-of-the-story-overcoming-everything-with-my-ever-evolving-demon-sword-and-game-knowledge`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 212 | Today's Urabe-san with... (`.../todays-urabe-san-with`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Reincarnated as the Mastermind of the Story: Overcoming Everything with My Ever-Evolving Demon Sword and Game Knowledge (`.../reincarnated-as-the-mastermind-of-the-story-overcoming-everything-with-my-ever-evolving-demon-sword-and-game-knowledge`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Reincarnated as the Mastermind of the Story: Overcoming Everything with My Ever-Evolving Demon Sword and Game Knowledge (`.../reincarnated-as-the-mastermind-of-the-story-overcoming-everything-with-my-ever-evolving-demon-sword-and-game-knowledge`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 48 | Chapter 0 (`.../62ae3fd1d95-62ae412b2bd`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 212 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Reincarnated as the Mastermind of the Story: Overcoming Everything with My Ever-Evolving Demon Sword and Game Knowledge, URL=`.../reincarnated-as-the-mastermind-of-the-story-overcoming-everything-with-my-ever-evolving-demon-sword-and-game-knowledge` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 225/225 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 225/225 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wsrv.nl <redacted query values: url and w>` (image/png, 374964 bytes, 480x533) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../reincarnated-as-the-mastermind-of-the-story-overcoming-everything-with-my-ever-evolving-demon-sword-and-game-knowledge` |  |  |  |
| details thumbnail URL | PASS | `https://wsrv.nl <redacted query values: url and w>` |  |  |  |
| details author | PASS | Yuuki Ryou |  |  |  |
| details artist | PASS | Segawa Hajime |  |  |  |
| details genres | PASS | Manga, Romance, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | There was a globally popular game called The Legend of the Seven Heroes. Ren cleared the sequel of that game at the fastest record in the world, and thus he obtained a bonus special data. However, no matter where he looked inside the game, he could not find the data. The moment where Ren was about to give up the search, he decided to start playing the second round of the game. Suddenly, a notification message “Do you want to start a special story?" appeared on the screen. When Ren chose “Yes” without hesitation, he lost consciousness, and when he woke up, he was a baby. —Could it be that he was reincarnated as one of the heroes in The Legend of the Seven Heroes? Ren, who thought such a thing was impossible, could not believe his ears when he heard his name from his mother's mouth. It was the name of a classmate who betrays the heroes in the middle of the story. Of course, he wishes to live in peace. But he meets a saint whose life he's supposed to take, and doesn't. Furthermore, he ends up saving a character (the boss of a great noble family) who was supposed to die. All of these things creates a development that he doesn't know about coming to play…<br><br>Alternative Titles:<br>- Monogatari no Kuromaku ni Tensei shite<br>- Reincarnated as the Mastermind Behind the Story |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 48 chapters |  |  |  |
| chapter dates | LINT | 1 of 48 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../um5uo89WLzb` (image/jpeg, 279414 bytes, 1920x1080; server Content-Type: text/plain) |  |  |  |
