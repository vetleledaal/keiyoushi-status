# Extension Validation Report

- Extension: tachiyomi-en.madarascans-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9025563662441338944
- Source name: Madara Scans
- Source language: en
- Selected manga input: latest offset 0: My Disciples Are All Big Villains (`.../my-disciples-are-all-big-villains`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | I Became a Swordsmanship Instructor at the Academy (`.../the-academys-new-swordmaster`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | I, the Weakest Level 1 Adventurer, used “Wall Hacks” to Level Up (`.../i-the-weakest-level-1-adventurer-used-wall-hacks-to-level-up`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | My Disciples Are All Big Villains (`.../my-disciples-are-all-big-villains`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Da Capo for the Musical Genius (`.../da-capo-for-the-musical-genius`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | My Disciples Are All Big Villains (`.../my-disciples-are-all-big-villains`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | My Disciples Are All Big Villains (`.../my-disciples-are-all-big-villains`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 551 | Chapter 0 (`.../my-disciples-are-all-big-villains-chapter-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 4 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Disciples Are All Big Villains, URL=`.../my-disciples-are-all-big-villains` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../2025-11-30-12-46-47-1764506807748.jpg` (image/jpeg, 247732 bytes, 765x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-disciples-are-all-big-villains` |  |  |  |
| details thumbnail URL | PASS | `https://i0.wp.com/.../2025-11-30-12-46-47-1764506807748.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Martial arts, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lu Zhou wakes up to become the world’s most powerful and oldest villainous Patriarch, and finds that he has nine notorious disciples who are full of evil. His eldest disciple is the leader of the Nether Sect with thousands of minions, and his second disciple—Sword Devil—always slaughters others at the slightest disagreement… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 551 chapters |  |  |  |
| chapter dates | PASS | 551 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://madarascans.org/.../209098012963a2db0fb9d4a3.66001758.jpg` (image/webp (encoding: lossy), 457904 bytes, 800x4625; server Content-Type: image/jpeg) |  |  |  |
