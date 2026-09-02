# Extension Validation Report

- Extension: tachiyomi-en.orchisasia-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4403086215261921832
- Source name: Orchisasia
- Source language: en
- Selected manga input: popular offset 0: DEAR. DOOR UNCENSORED version (`.../76`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | DEAR. DOOR UNCENSORED version (`.../76`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Define The Relationship (`.../360`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | The Rogue Prince Is Secretly an Omega (`.../3317`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Show Me Some Love! (`.../2378`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | DEAR. DOOR UNCENSORED version (`.../76`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | DEAR. DOOR UNCENSORED version (`.../76`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 166 | 0001 Chapter 001 Episode 1 (`.../0001-chapter-001-episode-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=DEAR. DOOR UNCENSORED version, URL=`76` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.orchisasia.org/.../DEAR.-DOOR-UNCENSORED-Smut-BL-Yaoi-Manhwa-e1653549494567-175x238.jpg` (image/jpeg, 12602 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `76` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.orchisasia.org/.../DEAR.-DOOR-UNCENSORED-Smut-BL-Yaoi-Manhwa-e1653549494567-193x278.jpg` (image/jpeg, 15586 bytes, 193x278) |  |  |  |
| details author | PASS | Pluto |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Drama, Fantasy, Manhwa, Mature, Smut, Supernatural, Uncensored, Yaoi, Beautiful Art Yaoi BL, BIG DICK, Demon, Full Color BL, Hardcore, Horny Seme, HOT |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | While in pursuit of criminals, a police officer has an unexpected encounter with a rather uncanny demon. Barely surviving the incident, Do Gyeong Joon is left staring after the retreating form of the mysterious creature in bafflement. However, not long after this the two meet again when the demon crashes into Do Gyeong Joon’s apartment, saying: “Hurry up! I need to get inside of you”…!?<br><br>Alternative Names: Dear Door / Querida Puerta / 디어 도어 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 166 chapters |  |  |  |
| chapter dates | LINT | All 166 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=166 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.orchisasia.org/.../001.jpg` (image/jpeg, 73103 bytes, 641x967) |  |  |  |
