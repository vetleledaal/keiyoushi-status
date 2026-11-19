# Extension Validation Report

- Extension: tachiyomi-de.mangatube-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 2
- Warnings: 2
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6851437974515624757
- Source name: Manga Tube
- Source language: de
- Selected manga input: latest offset 0: All-Master Necromancer (`.../all_master_necromancer`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | error | 0 |  | java.io.IOException: Challenge validation failed: 405 | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | All-Master Necromancer (`.../all_master_necromancer`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | All-Master Necromancer (`.../all_master_necromancer`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | All-Master Necromancer (`.../all_master_necromancer`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | All-Master Necromancer (`.../all_master_necromancer`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 86 | Vol. 1 Ch. 1 (`.../19037`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | ERROR | java.io.IOException: Challenge validation failed: 405 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | SKIP | Challenge validation failed: 405 |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=All-Master Necromancer, URL=`.../all_master_necromancer` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Challenge validation failed: 405 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=All-Master Necromancer, URL=`.../all_master_necromancer` at page 1 offset 0 and page 2 offset 0, title=Volcanic Age, URL=`.../volcanic_age` at page 1 offset 1 and page 2 offset 6, title=Superhuman Era, URL=`.../superhuman_era` at page 1 offset 4 and page 2 offset 7, title=Tales of Demons and Gods, URL=`.../tales_of_demons_and_gods` at page 1 offset 5 and page 2 offset 4, title=Revenge of the Baskerville Bloodhound, URL=`.../revenge_of_the_baskerville_bloodhound` at page 1 offset 6 and page 2 offset 5, title=Flying Witch, URL=`.../flying_witch` at page 1 offset 7 and page 2 offset 9 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://a.mtcdn.org/.../mid_Aykn4bTeodGXMoSidKUs.jpg` (image/jpeg, 17877 bytes, 151x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../all_master_necromancer` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://a.mtcdn.org/.../max_Aykn4bTeodGXMoSidKUs.jpg` (image/jpeg, 29679 bytes, 200x315) |  |  |  |
| details author | PASS | Cheongsong |  |  |  |
| details artist | PASS | Ji Baekho |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Der mächtige Nekromant Cha Jinhyuk, der von seinen Mitstreitern der Ninestar-Gilde verraten und getötet wurde, greift auf eine gewagte Seelenübertragung zurück. Ein Jahrzehnt später erwacht er in einem neuen Körper, der seiner früheren Kräfte beraubt wurde. Mit der Unterstützung seiner neuen Kameraden, dem Spirit Master Balkan und der Oni Haryu, begibt er sich auf einen Rachefeldzug und erklimmt erneut den mysteriösen Turm. Nur dieses Mal besitzt er die übermächtige Fähigkeit eines „All-Masters“, die es ihm ermöglicht, alle Waffen innerhalb des Turms zu beherrschen!  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 86 chapters |  |  |  |
| chapter dates | PASS | 86 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://a.mtcdn.org/.../001_91mkKx.png` (image/png, 942553 bytes, 1000x600) |  |  |  |
