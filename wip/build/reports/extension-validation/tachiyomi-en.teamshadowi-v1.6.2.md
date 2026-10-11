# Extension Validation Report

- Extension: tachiyomi-en.teamshadowi-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 1326600535134927871
- Source name: Team Shadowi
- Source language: en
- Selected manga input: popular offset 0: The Extra's Academy Survival Guide (`.../the-extras-academy-survival-guide`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | The Extra's Academy Survival Guide (`.../the-extras-academy-survival-guide`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 8 | The Student, The Witch, and The Academy (`.../the-student-the-witch-and-the-academy`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Extra's Academy Survival Guide (`.../the-extras-academy-survival-guide`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Extra's Academy Survival Guide (`.../the-extras-academy-survival-guide`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 129 | Chapter 0: Prologue (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | <1s |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 8 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Extra's Academy Survival Guide, URL=`.../the-extras-academy-survival-guide` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 17/17 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 17/17 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.team-shadowi.com/.../cover_9.jpg` (image/jpeg, 266155 bytes, 1099x1431) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-extras-academy-survival-guide` |  |  |  |
| details thumbnail URL | PASS | `https://images.team-shadowi.com/.../cover_9.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Romance, Isekai, Academy, Full Color, Disowned Child, Based on a Web Novel, Webtoon, Blonde-Haired Male Lead, Blonde-Haired Protagonist, Hunting, Male Protagonist, Smart Protagonist, Survival, Unpopular Protagonist, Careful Protagonist, Transmigrated as the Villain/ess, Transmigrated into a Game, Magic, Strong Character/s, Nature, Avoidance, Careful Male Lead, European Ambience, Female Lead Falls in Love First, Beautiful Love Interest/s, Badass Male Lead, Influential Character/s, Betrayal, Obsessive Love, Weak to Strong, Poor Male Lead, Hard-Working Male Lead, Younger Sister, Scheming Male Lead, Transported to a Game World, Transported to Another World, Forest, Quirky Character/s, Fallen Nobility, Sword and Sorcery/Magic, Bad Reputation, Beautiful Artwork, Scenario Deviation, Famous Character/s, Muscular Male Lead, Camping, Scheming Character/s, Strategic Male Lead, Blue-Eyed Male Lead, Magic Item/s, Reliable Male Lead |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ed Rothstaylor is a third-rate villain in a game, disowned by his family and kicked out of the dormitory for his misdeeds. One day, our main character wakes up as this very Ed, and realizes he must earn a scholarship so he can graduate and be set for life.<br><br>Now living in the woods, he resolves to keep away from the protagonists, but four of the female leads just won't leave him alone. Not only that, his presence starts to change the timeline and events of the game!<br><br>Can Ed help the story progress while staying out of the limelight? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 129 chapters |  |  |  |
| chapter dates | PASS | 129 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.team-shadowi.com/.../page_001.webp` (image/webp (encoding: lossy), 557520 bytes, 690x9500) |  |  |  |
