# Extension Validation Report

- Extension: tachiyomi-en.akazascans-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 8513894820944573933
- Source name: Akaza Scans
- Source language: en
- Selected manga input: popular offset 0: Shadow Slave (`.../shadow-slave`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Shadow Slave (`.../shadow-slave`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | I’ll Retire After Saving the World (`.../ill-retire-after-saving-the-world`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Shadow Slave (`.../shadow-slave`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Shadow Slave (`.../shadow-slave`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 13 | Chapter 0 - Prologue (`.../shadow-slave-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shadow Slave, URL=`.../shadow-slave` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://akazascans.org/.../Gemini_Generated_Image_bz9ud1bz9ud1bz9u-199x300.png` (image/png, 111481 bytes, 199x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shadow-slave` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://akazascans.org/.../Gemini_Generated_Image_bz9ud1bz9ud1bz9u.png` (image/png, 6317539 bytes, 1664x2512) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Magic, System, Transmigration, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “I will survive. No matter what happens, no matter what I have to do, I will survive. …Even if it is just to screw over people like you.” Sunny, a boy born and raised in the slums, suddenly gets infected by the Nightmare Spell one day and becomes trapped inside a ‘Nightmare’. After surviving and returning from the Nightmare against all odds, Sunny becomes an Awakened and gains incredible abilities, but he also gets an equally massive side effect to go with it…<br><br>Alternative Names: <br>- 섀도우 슬레이브 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 13 chapters |  |  |  |
| chapter dates | PASS | 13 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://akazascans.org/.../d340ba54eb4cd534de702783ca328e29.webp` (image/webp (encoding: lossy), 1105316 bytes, 800x7120) |  |  |  |
