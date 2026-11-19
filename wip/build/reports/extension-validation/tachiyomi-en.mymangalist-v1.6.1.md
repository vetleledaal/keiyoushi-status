# Extension Validation Report

- Extension: tachiyomi-en.mymangalist-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 623462228636558691
- Source name: MyMangaList
- Source language: en
- Selected manga input: popular offset 0: Wind Sword (`.../t-wind-sword`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Wind Sword (`.../t-wind-sword`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Second Life Ranker (`.../t-second-life-ranker`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Seventh (`.../t-seventh`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Zettai Shinanai Stella-Hime (`.../t-zettai-shinanai-stella-hime`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Wind Sword (`.../t-wind-sword`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Wind Sword (`.../t-wind-sword`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 165 | Chapter 1 (`.../s-wind-sword--chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Wind Sword, URL=`.../t-wind-sword` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www5.mymangalist.org/.../260x360` (image/jpeg, 22729 bytes, 260x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../t-wind-sword` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www5.mymangalist.org/.../420x600` (image/jpeg, 48258 bytes, 420x600) |  |  |  |
| details author | PASS | Kim Chul Hyun |  |  |  |
| details artist | PASS | Kim Chul Hyun |  |  |  |
| details genres | PASS | Action, Adventure |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 2018 · Manhwa<br><br>The world is riddled with beasts and demons, however little do people know that a magical barrier is currently sealing away high-level demons. There are those who wish to break the barrier and bring about the end of the world, and those who wish to protect it and its inhabitants. A great battle with heroes, villains, demons and magic is about to begin and will determine the fate of the world. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 165 chapters |  |  |  |
| chapter dates | PASS | 165 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.mymangalist.org/.../wind_sword_1_1.jpg` (image/jpeg, 97153 bytes, 800x1132) |  |  |  |
