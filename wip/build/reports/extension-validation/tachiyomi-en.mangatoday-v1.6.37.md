# Extension Validation Report

- Extension: tachiyomi-en.mangatoday-v1.6.37
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 2
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangahub
- Source ID: 868511056418443637
- Source name: MangaToday
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Secret Class (`.../secret-class`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Bleach (`.../bleach_106`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Jitsu wa Watashi, Dekiaisaretemashita!? - Saitei Kareshi kara Saikyou Kareshi e (`.../jitsu-wa-watashi-dekiaisaretemashita-saitei-kareshi-kara-saikyou-kareshi-e`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | The White Mage Who Was Banished From the Hero's Party (`.../the-white-mage-who-was-banished-from-the-hero-s-party`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 30 | Secret Class (`.../secret-class`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../secret-class`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 329 | Chapter 1 (`.../chapter-1.0`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | keiyoushi.b.c: Chapter encryption unavailable | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | keiyoushi.b.c: Chapter encryption unavailable | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=The White Mage Who Was Banished From the Hero's Party, URL=`.../the-white-mage-who-was-banished-from-the-hero-s-party` at page 1 offset 27 and page 2 offset 0, title=The White Mage Who Was Banished From The Hero's Party Is Picked Up By An S Rank Adventurer~ This White Mage Is Too Out Of The Ordinary!, URL=`.../the-white-mage-who-was-banished-from-the-hero-s-party-is-picked-up-by-an-s-rank-adventurer-this-white-mage-is-too-out-of-the-ordinary` at page 1 offset 28 and page 2 offset 1, title=Scooped Up by an S-Rank Adventurer! - This White Mage Is One Heck of a Healer, URL=`.../scooped-up-by-an-s-rank-adventurer-this-white-mage-is-one-heck-of-a-healer` at page 1 offset 29 and page 2 offset 2 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 132/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumb.mghcdn.com/.../secret-class.jpg` (image/jpeg, 47833 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class` |  |  |  |
| details thumbnail URL | PASS | `https://thumb.mghcdn.com/.../secret-class.jpg` |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Mina-chan |  |  |  |
| details genres | PASS | Action, Psychological, Romance, Adventure, Drama, Mystery, Incest, Harem, Shota, Long Strip, Web Comic, Full Color, Pornographic |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dae Ho, who became an orphan at the age of 13, was adopted by his father's friend. However, Dae Ho in adulthood knew nothing about the relationship between men and women. Aunt and sisters decided to give pure Dae Ho a secret class...<br><br>Alternative Names:<br>- 비밀수업<br>- 秘密教學<br>- Lezioni Segrete<br>- Секретне навчання<br>- 秘密の授業<br>- Clases Secretas |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 329 chapters |  |  |  |
| chapter dates | PASS | 329 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Chapter encryption unavailable |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
