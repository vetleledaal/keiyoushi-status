# Extension Validation Report

- Extension: tachiyomi-fr.bigsolo-v1.6.7
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4410528266393104437
- Source name: BigSolo
- Source language: fr
- Selected manga input: popular offset 0: K-9: Public Security Bureau, Division 9 – Special Abilities Countermeasure (`.../k-9-public-security-bureau-division-9`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 5 | K-9: Public Security Bureau, Division 9 – Special Abilities Countermeasure (`.../k-9-public-security-bureau-division-9`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 115 | On... On se connait juste depuis longtemps !! (`.../on-on-se-connait-juste-depuis-longtemps`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | K-9: Public Security Bureau, Division 9 – Special Abilities Countermeasure (`.../k-9-public-security-bureau-division-9`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | K-9: Public Security Bureau, Division 9 – Special Abilities Countermeasure (`.../k-9-public-security-bureau-division-9`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 21 | Vol. 1 Ch. 1 – Pour toi, mon amour (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 67 |  |  | <1s |

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
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 115 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=K-9: Public Security Bureau, Division 9 – Special Abilities Countermeasure, URL=`.../k-9-public-security-bureau-division-9` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdnic.bigsolo.org/.../846f2754dbe9.jpeg` (image/jpeg, 6308915 bytes, 2717x4063) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../k-9-public-security-bureau-division-9` |  |  |  |
| details thumbnail URL | PASS | `https://cdnic.bigsolo.org/.../846f2754dbe9.jpeg` |  |  |  |
| details author | PASS | Okuyama Tetsuya |  |  |  |
| details artist | PASS | Okuyama Tetsuya |  |  |  |
| details genres | PASS | Action, Surnaturel, Police |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | L'histoire se déroule dans un monde où les criminels gagnent des pouvoirs lorsqu'ils commettent des crimes. Ren Hizuki, une policière dure à cuire de la première division d'enquête du département de police métropolitaine de Tokyo, et qui a un passé traumatisant, se fait transférer dans une nouvelle division spécialisé dans la lutte contre ces nouveaux criminels, où elle va faire la rencontre de son partenaire excentrique, Yushiro Oboro. Alors qu'ils enquêtent sur un incident, Ren va découvrir le secret de son partenaire et également celui de la division K-9. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 21 chapters |  |  |  |
| chapter dates | PASS | 21 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 67 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdnic.bigsolo.org/.../a18e219462de.png` (image/png, 2035904 bytes, 960x1378) |  |  |  |
