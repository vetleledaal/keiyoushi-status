# Extension Validation Report

- Extension: tachiyomi-en.madarascans-v1.6.5
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
- Source theme: mangathemesia
- Source ID: 9025563662441338944
- Source name: Madara Scans
- Source language: en
- Selected manga input: popular offset 0: I Became a Swordsmanship Instructor at the Academy (`.../the-academys-new-swordmaster`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | I Became a Swordsmanship Instructor at the Academy (`.../the-academys-new-swordmaster`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | I, the Weakest Level 1 Adventurer, used “Wall Hacks” to Level Up (`.../i-the-weakest-level-1-adventurer-used-wall-hacks-to-level-up`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Urban Dragon Revealed (`.../urban-dragon-revealed`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | The Lord Who Levels Up by Devouring (`.../the-lord-who-levels-up-by-devouring`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Became a Swordsmanship Instructor at the Academy (`.../the-academys-new-swordmaster`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Became a Swordsmanship Instructor at the Academy (`.../the-academys-new-swordmaster`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 50 | Chapter 1 (`.../the-academys-new-swordmaster-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Became a Swordsmanship Instructor at the Academy, URL=`.../the-academys-new-swordmaster` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../2026-09-16-11-15-13-1789557313398.webp <redacted query values: resize>` (image/jpeg, 19288 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-academys-new-swordmaster` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i3.wp.com/.../2026-09-16-11-15-13-1789557313398.webp` (image/jpeg, 393143 bytes, 1049x1500) |  |  |  |
| details author | PASS | coldpig, leejin |  |  |  |
| details artist | PASS | Seong Eun Pyo |  |  |  |
| details genres | PASS | Action, Fantasy, School life, Shounen, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | The protagonist is reincarnated in the body of “Kageyama Ayumu,” a background character from a popular novel. Ayumu decides to leave saving the world to the original protagonists and enjoy a wealthy, carefree life without interfering with the novel’s plot. However, he discovers discrimination against non-Hunter school graduates at the school where he works. To avoid being looked down upon by his fellow teachers, and to lead a comfortable life, Ayumu begins his reincarnation journey, determined to become strong enough to protect himself… even if it means slightly altering the original story. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | PASS | 50 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://madarascans.net/.../01.webp` (image/webp (encoding: lossy), 1110400 bytes, 800x14000) |  |  |  |
