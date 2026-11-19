# Extension Validation Report

- Extension: tachiyomi-en.thunderscans-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 2848420679472350044
- Source name: Thunder Scans
- Source language: en
- Selected manga input: popular offset 0: I Got The Weakest Class, Dragon Tamer!? (`.../i-got-the-weakest-class-dragon-tamer`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | I Got The Weakest Class, Dragon Tamer!? (`.../i-got-the-weakest-class-dragon-tamer`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | The Reincarnation of the Forbidden Archmage (`.../the-reincarnation-of-the-forbidden-archmage`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | My Skill Bar Is Full of Monsters (`.../my-skill-bar-is-full-of-monsters`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Apocalypse Sword God (`.../apocalypse-sword-god`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Got The Weakest Class, Dragon Tamer!? (`.../i-got-the-weakest-class-dragon-tamer`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Got The Weakest Class, Dragon Tamer!? (`.../0086250808-i-got-the-weakest-class-dragon-tamer`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 306 | Chapter 1 (`.../1482765166-i-got-the-weakest-class-dragon-tamer-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Got The Weakest Class, Dragon Tamer!?, URL=`.../i-got-the-weakest-class-dragon-tamer` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://en-thunderscans.com/.../2024-06-14-06-20-02-1718389202359-206x300.jpg` (image/jpeg, 28275 bytes, 206x300) |  |  |  |
| details identity | UNUSUAL | Details changed selected URL `.../i-got-the-weakest-class-dragon-tamer` to `.../0086250808-i-got-the-weakest-class-dragon-tamer` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://en-thunderscans.com/.../2024-06-14-06-20-02-1718389202359.jpg` (image/jpeg, 1308189 bytes, 1280x1866) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Superpower, System, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Combining reality with a gaming world where ferocious beasts roam freely, filled with numerous mysteries and dungeons. In order to defend against the onslaught of these beasts, everyone undergoes class transfers and crazily levels up. On the day of his transfer, Lu Fan becomes a hidden class – Dragon Tamer. However, due to the immense strength of dragons, it is deemed impossible for anyone to tame them, earning Dragon Tamer the reputation of being the most useless class. Fortunately, he awakens the Super Treasure Map System. As Lu Fan, with his mighty dragon, sweeps through everything, the entire world trembles. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 306 chapters |  |  |  |
| chapter dates | PASS | 306 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://en-thunderscans.com/.../0-4.jpg` (image/jpeg, 708776 bytes, 1300x720) |  |  |  |
