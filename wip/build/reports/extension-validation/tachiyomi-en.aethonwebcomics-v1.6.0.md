# Extension Validation Report

- Extension: tachiyomi-en.aethonwebcomics-v1.6.0
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
- Source ID: 5210693156893032326
- Source name: Aethon Webcomics
- Source language: en
- Selected manga input: popular offset 0: Shadow Slave (`.../shadow-slave`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 3 | Shadow Slave (`.../shadow-slave`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 3 | Shadow Slave (`.../shadow-slave`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Shadow Slave (`.../shadow-slave`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Shadow Slave (`.../shadow-slave`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 13 | S1:E1: Episode 1 (`.../episode-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 44 |  |  | <1s |

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
| popular listing | PASS | 3 entries |  |  |  |
| latest listing | PASS | 3 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shadow Slave, URL=`shadow-slave` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 7/7 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 7/7 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://b4600180.assetcdn.net/.../SS-Site-Title-Card-2.jpg <redacted query values: lossy, strip, and webp>` (image/jpeg, 905937 bytes, 3000x3750) |  |  |  |
| details identity | PASS | Details preserved selected URL `shadow-slave` |  |  |  |
| details thumbnail URL | PASS | `https://b4600180.assetcdn.net/.../SS-Site-Title-Card-2.jpg <redacted query values: lossy, strip, and webp>` |  |  |  |
| details author | PASS | Guiltythree |  |  |  |
| details artist | PASS | Laurel Pursuit |  |  |  |
| details genres | PASS | Action Fantasy, Dark Fantasy, LitRPG, Manhwa, Progression Fantasy, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Weekly on Wednesday<br><br>Escape the Nightmare. Survive the Dream Realm.<br><br>Growing up in poverty, Sunny never expected anything good from life. However, even he did not anticipate being chosen by the Nightmare Spell and becoming one of the Awakened — an elite group of people gifted with supernatural powers.<br><br>Transported into a ruined magical world, he finds himself facing off against terrible monsters and other Awakened in a deadly battle of survival.<br><br>What's worse, the shadow powers he received happen to possess a small and potentially fatal side effect.<br><br>But that won’t stop him. Born a slave. Destined for the grave. He chooses to survive.<br><br>No matter the cost…<br><br>Weekly episodes of Shadow Slave will drop every Wednesday at 9PM EST, 1 week ahead of WebNovel's release of episodes. Make an account and stay tuned! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 13 chapters |  |  |  |
| chapter dates | PASS | 13 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 44 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://b4600180.assetcdn.net/.../4bf788a0ffaeb18236e9548cbff0f0cb4c35f59256d6c6eee19bfee12c4c9684.jpg <redacted query values: lossy, strip, and webp>` (image/webp (encoding: lossy), 630230 bytes, 1600x11857) |  |  |  |
