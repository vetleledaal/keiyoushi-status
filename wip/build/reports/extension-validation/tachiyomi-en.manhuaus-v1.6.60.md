# Extension Validation Report

- Extension: tachiyomi-en.manhuaus-v1.6.60
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: madara
- Source ID: 4005973248538140146
- Source name: ManhuaUS
- Source language: en
- Selected manga input: popular offset 0: Logging 10,000 Years into the Future (`.../1356173`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Logging 10,000 Years into the Future (`.../1356173`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Magic Academy’s Genius Blinker (`.../1357147`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Chronicles of the Demon Faction (`.../1356302`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Academy’s Genius Swordmaster (`.../1356576`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Logging 10,000 Years into the Future (`.../1356173`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Logging 10,000 Years into the Future (`.../1356173`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 361 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Logging 10,000 Years into the Future, URL=`1356173` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhuaus.com/.../Logging-10000-Years-into-the-Future-175x238.webp` (image/webp (encoding: lossy), 12818 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1356173` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manhuaus.com/.../Logging-10000-Years-into-the-Future-193x278.webp` (image/webp (encoding: lossy), 15542 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Martial Arts, Shounen, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | High Martial Art: Logging In 10,000 Years into the Future, Awakening 10,000 Years into the Future, 高武：登陆未来一万年, Apex Future Martial Arts<br><br>At the beginning of the martial dao, abnormal beasts invaded the world. Humanity’s martials had to retreat in defeat time and time again. Lu Sheng transmigrates to that time, but in his dreams he enters a world 10 000 years later. The foundational body refining method from 10k years in the future is several thousand times more effective than the current one. Then there’s the breathing method, body refining pill formula, and sacred martial law from 10k years later… Despite developing martial arts for 10k years, humanity was annihilated! Their martial arts civilization reached the apex, and yet there was no one left to inherit it. Except Lu Sheng, he’s exactly that last spark of hope!<br><br>Alternative Names: High Martial Art: Logging In 10,000 Years into the Future, Awakening 10,000 Years into the Future, 高武：登陆未来一万年, Apex Future Martial Arts |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 361 chapters |  |  |  |
| chapter dates | PASS | 361 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.manhuaus.com/.../001.webp` (image/webp (container: extended), 664644 bytes, 800x12255) |  |  |  |
