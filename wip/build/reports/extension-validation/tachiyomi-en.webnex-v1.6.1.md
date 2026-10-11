# Extension Validation Report

- Extension: tachiyomi-en.webnex-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 319678837350572744
- Source name: Webnex
- Source language: en
- Selected manga input: popular offset 0: The Forgotten Field (`.../manhwa-forgotten-field-manhwa-91c15cfdb7b2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | The Forgotten Field (`.../manhwa-forgotten-field-manhwa-91c15cfdb7b2`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | The Ancient Sovereign of Eternity (`.../manhua-ancient-sovereign-of-eternity-manhua-2fdd7bc11d72`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | Babel II: The Returner (`.../manga-babel-ii-returner-manga-5b19740c71d6`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | Academy's Genius Swordsman (`.../manhwa-academy-s-genius-swordsman-manhwa-451944a53ae9`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Forgotten Field (`.../manhwa-forgotten-field-manhwa-91c15cfdb7b2`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Forgotten Field (`.../manhwa-forgotten-field-manhwa-91c15cfdb7b2`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 333 | Chapter 0 (`.../chapter-ezmanga-the-forgotten-field-chapter-0-da192bc0554e`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Forgotten Field, URL=`manhwa-forgotten-field-manhwa-91c15cfdb7b2` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://f005.backblazeb2.com/.../8e1611c950389e8ffd7174c2b9a2492547a1bca3adf8e79a15a8e3a68f960bfc.jpg` (image/jpeg, 226071 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `manhwa-forgotten-field-manhwa-91c15cfdb7b2` |  |  |  |
| details thumbnail URL | PASS | `https://f005.backblazeb2.com/.../8e1611c950389e8ffd7174c2b9a2492547a1bca3adf8e79a15a8e3a68f960bfc.jpg` |  |  |  |
| details author | PASS | Kim Suji |  |  |  |
| details artist | PASS | Spoon (스푼), Spoon |  |  |  |
| details genres | PASS | Manhwa, Drama, Fantasy, Historical, Josei, Psychological, Romance, Shoujo, Slice of Life, Tragedy, Villainess, Adaptation, Full Color, Long Strip, Web Comic, Dark romance, Enemies, Family |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | From the artist of <Who Made Me a Princess?> and the author of <Under the Oak Tree>!Every day, I pray…that this love will die.That I will love you only until today,and that by tomorrow, this love will be gone.Thalia Roem Ghirta is a tragic imperial princess, born from an affair and raised in a palace that never truly accepted her.Surrounded by indifferent parents, hostile half-siblings, and servants who looked down on her, Thalia grew up twisted by neglect. To protect herself, she learned to bare her thorns at anyone who came near.And yet, before one person, even she becomes utterly defenseless.Varkas Raedgo Siarkan, a noble lord of the East, is a vassal of the imperial family and heir to a grand ducal house. Raised under relentless expectations of perfection, his emotions were dulled by training that bordered on abuse.He lived only for the honor and duty of his family.To keep a promise made to the former empress, Varkas becomes engaged to Thalia’s half-sister, Ayla. Consumed by despair, Thalia begins to slowly fall apart.But her love, once fated only to die, soon meets an unexpected turning point…<br><br>Alternative titles:<br>• 잊혀진 들판<br>• The Forgotten Meadow |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 333 chapters |  |  |  |
| chapter dates | PASS | 333 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://webnex.cc/.../001.webp` (image/webp (encoding: lossy), 371766 bytes, 724x2172) |  |  |  |
