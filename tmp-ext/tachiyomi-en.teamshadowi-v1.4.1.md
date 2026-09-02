# Extension Validation Report

- Extension: tachiyomi-en.teamshadowi-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1326600535134927871
- Source name: Team Shadowi
- Source language: en
- Selected manga input: popular offset 0: +99 Reinforced Wooden Stick (`.../99-reinforced-wooden-stick`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | +99 Reinforced Wooden Stick (`.../99-reinforced-wooden-stick`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 8 | The Student, The Witch, and The Academy (`.../the-student-the-witch-and-the-academy`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | +99 Reinforced Wooden Stick (`.../99-reinforced-wooden-stick`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | +99 Reinforced Wooden Stick (`.../99-reinforced-wooden-stick`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 223 | Chapter 1 (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 35 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=+99 Reinforced Wooden Stick, URL=`.../99-reinforced-wooden-stick` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 17/17 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 17/17 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.team-shadowi.com/.../cover_4.jpg` (image/jpeg, 98798 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../99-reinforced-wooden-stick` |  |  |  |
| details thumbnail URL | PASS | `https://images.team-shadowi.com/.../cover_4.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Drama, Fantasy, Male Protagonist, Overpowered Protagonist, Full Color, Webtoon, Absurdity, Dumb Protagonist, Virtual Game World, Virtual Reality, Comedic Violence, Web Comic, Comedic Facial Expressions, 21st Century, Comedic Undertone, Facial Expressions, Famous Male Lead, Annoying Male Lead, Romantic Subplot, Unusual First Meeting, Age Gap, Surrealism, Game Elements, Troll/s, Korea, Surreal Comedy, Tragic Past, University/Post-Secondary Student/s, Adults Behaving Badly, Petty Protagonist, Strangers Become Allies, Jjang, Scary Male Lead, Web Comic With OST, Slapstick Comedy, Sharp-Tongued Male Lead, Snarky Male Lead, Famous Female Lead, Dumb Character/s, Large Scale Battle/s, Rude Character/s, Annoying Character/s |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Welcome to “Chrono Life,” a virtual reality game where only the strongest survive. Ji-u logs in to “Chrono Life,” only to be ignored and ridiculed by the other players for his lack of experience, crappy items, and being an overall noob. But when he upgrades his wooden stick to the max reinforcement level of +99, Ji-u realizes he has the power to split continents and slay armies of thousands in just one swing. “It’s time to teach the rest of you a lesson, you f*ckers.” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 223 chapters |  |  |  |
| chapter dates | PASS | 223 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://images.team-shadowi.com/.../page_001.webp` (image/webp (encoding: lossy), 459910 bytes, 690x9675) |  |  |  |
