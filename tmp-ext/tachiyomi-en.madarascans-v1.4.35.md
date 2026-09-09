# Extension Validation Report

- Extension: tachiyomi-en.madarascans-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 9025563662441338944
- Source name: Madara Scans
- Source language: en
- Selected manga input: popular offset 0: I Became a Swordsmanship Instructor at the Academy (`.../the-academys-new-swordmaster`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | I Became a Swordsmanship Instructor at the Academy (`.../the-academys-new-swordmaster`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | The Reset Life of a Game Addict (`.../the-reset-life-of-a-game-addict`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | I Became a Wizard in a Medieval Fantasy World (`.../i-became-a-wizard-in-a-medieval-fantasy-world`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Surviving in an RPG Maker Horror Game (`.../surviving-in-an-rpg-maker-horror-game`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | I Became a Swordsmanship Instructor at the Academy (`.../the-academys-new-swordmaster`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | I Became a Swordsmanship Instructor at the Academy (`.../the-academys-new-swordmaster`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 50 | Chapter 1 (`.../the-academys-new-swordmaster-chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | <1s |

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
| thumbnail | PASS | `https://i0.wp.com/.../2025-12-05-12-00-10-1764892810332.jpg` (image/jpeg, 446861 bytes, 1728x2464) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-academys-new-swordmaster` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../2025-12-05-12-00-10-1764892810332-718x1024.jpg` (image/jpeg, 158168 bytes, 718x1024) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Fantasy, School life, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The protagonist is reincarnated in the body of "Kageyama Ayumu," a background character from a popular novel. Ayumu decides to leave saving the world to the original protagonists and enjoy a wealthy, carefree life without interfering with the novel's plot. However, he discovers discrimination against non-Hunter school graduates at the school where he works. To avoid being looked down upon by his fellow teachers, and to lead a comfortable life, Ayumu begins his reincarnation journey, determined to become strong enough to protect himself... even if it means slightly altering the original story. |  |  |  |
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
| page load | PASS | `https://madarascans.org/.../01.webp` (image/webp (encoding: lossy), 1110400 bytes, 800x14000) |  |  |  |
