# Extension Validation Report

- Extension: tachiyomi-en.orionscans-v1.6.27
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7776050777496310004
- Source name: Orion Scans
- Source language: en
- Selected manga input: latest offset 0: Little Fenrir and the Huge Dungeon (`.../little-fenrir-and-the-huge-dungeon`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | A Livid Lady's Guide to Getting Even: How I Crushed My Homeland with My Mighty Grimoires (`.../a-livid-lady's-guide-to-getting-even:-how-i-crushed-my-homeland-with-my-mighty-grimoires`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | The Lowest Adventurer. When the Guild is Expelled, Efforts Are Rewarded and He Gets (Unconditional Victory) (`.../the-lowest-adventurer.-when-the-guild-is-expelled-efforts-are-rewarded-and-he-gets-(unconditional-victory)`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Little Fenrir and the Huge Dungeon (`.../little-fenrir-and-the-huge-dungeon`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | MMO! Playing the Game Freely Led to Superhuman Abilities (`.../mmo!-playing-the-game-freely-led-to-superhuman-abilities`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Little Fenrir and the Huge Dungeon (`.../little-fenrir-and-the-huge-dungeon`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Little Fenrir and the Huge Dungeon (`.../little-fenrir-and-the-huge-dungeon`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 42 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Little Fenrir and the Huge Dungeon, URL=`little-fenrir-and-the-huge-dungeon#221` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.orion-scans.com/.../91bd16a9-6b4c-4826-b976-27faa44437b8.jpg` (image/jpeg, 459713 bytes, 848x1216) |  |  |  |
| details identity | PASS | Details preserved selected URL `little-fenrir-and-the-huge-dungeon#221` |  |  |  |
| details thumbnail URL | PASS | `https://storage.orion-scans.com/.../91bd16a9-6b4c-4826-b976-27faa44437b8.jpg` |  |  |  |
| details author | PASS | Nemuri Gunji |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Adventure, comedy, Fantasy, Slice of Life, action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yasuhiro Nakano was a salaryman at a black company who once aspired to become a Tame Seeker. One day, he receives an egg left behind by his great-grandfather and, following his last will and testament, visits the World Tree dungeon. There, he is saved from a monster attack by an SS-rank Fenrir that hatches from the egg! With "Fukumaro," a creature who can somehow understand his language, as his partner, he decides to start his journey as a seeker once again. "Together with my companions, I will definitely reach the deepest part of the World Tree!" Bonding with monsters and meeting new allies, he heads toward unknown floors! An exciting dungeon-crawling fantasy about a former salaryman and his incredibly cute and reliable tamed monsters! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://storage.orion-scans.com/.../page-0001_0_1788331752436-97400.png` (image/png, 1341863 bytes, 1024x1044) |  |  |  |
