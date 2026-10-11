# Extension Validation Report

- Extension: tachiyomi-en.bookwalker-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 25
- Lint: 0
- Warnings: 2
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2744810059574599668
- Source name: BookWalker
- Source language: en
- Selected manga input: popular offset 0: With the All-Powerful Ability to Turn Experience Into New Skills, I Became the Strongest Explorer! 〜Climbing the Ladder with a Dungeon-Delving High School Girl〜 (`.../with-the-all-powerful-ability-to-turn-experience-into-new-skills-i-became-the-strongest-explorer-climbing-the-ladder-with-a-dungeon-delving-high-school-girl`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 58 | With the All-Powerful Ability to Turn Experience Into New Skills, I Became the Strongest Explorer! 〜Climbing the Ladder with a Dungeon-Delving High School Girl〜 (`.../with-the-all-powerful-ability-to-turn-experience-into-new-skills-i-became-the-strongest-explorer-climbing-the-ladder-with-a-dungeon-delving-high-school-girl`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 35 | Sour Face, Frills, And Lace (`.../sour-face-frills-and-lace`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 60 | A Certain Scientific Railgun (`.../a-certain-scientific-railgun`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 60 | Replica（DMP） (`.../replicadmp`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | With the All-Powerful Ability to Turn Experience Into New Skills, I Became the Strongest Explorer! 〜Climbing the Ladder with a Dungeon-Delving High School Girl〜 (`.../with-the-all-powerful-ability-to-turn-experience-into-new-skills-i-became-the-strongest-explorer-climbing-the-ladder-with-a-dungeon-delving-high-school-girl`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | With the All-Powerful Ability to Turn Experience Into New Skills, I Became the Strongest Explorer! 〜Climbing the Ladder with a Dungeon-Delving High School Girl〜 (`.../with-the-all-powerful-ability-to-turn-experience-into-new-skills-i-became-the-strongest-explorer-climbing-the-ladder-with-a-dungeon-delving-high-school-girl`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 58 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=With the All-Powerful Ability to Turn Experience Into New Skills, I Became the Strongest Explorer! 〜Climbing the Ladder with a Dungeon-Delving High School Girl〜, URL=`.../with-the-all-powerful-ability-to-turn-experience-into-new-skills-i-became-the-strongest-explorer-climbing-the-ladder-with-a-dungeon-delving-high-school-girl` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 214/214 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 203/214 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.sos-dan.net/.../VJRVMVYNE486TKR938VR1.webp` (image/webp (container: extended), 77580 bytes, 506x720) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../with-the-all-powerful-ability-to-turn-experience-into-new-skills-i-became-the-strongest-explorer-climbing-the-ladder-with-a-dungeon-delving-high-school-girl` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://img.sos-dan.net/.../VJRVMVYNE486TKR938VR1.webp` (image/webp (container: extended), 161856 bytes, 844x1200) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Isekai, Fantasy, Action, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "My dungeon-exploring partner is a beautiful high school girl!?"<br><br>"My dungeon-exploring partner is a beautiful high school girl!?"<br>Masato, the eldest son of the Jingu family, decides to become a explorer to support his younger brothers following the death of their parents. He begins making a living by selling the magic stones dropped by monsters in the "Tokyo Dungeon," but he soon realizes there are monsters he cannot defeat alone. <br>Just as he starts looking for a partner to help him conquer the dungeon, he teams up with Rika Tachibana-a girl introduced to him by his younger brother, Rekka. The two face various challenges, but as they support each other and overcome these obstacles, their bond deepens...!? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
