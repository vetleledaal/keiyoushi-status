# Extension Validation Report

- Extension: tachiyomi-en.paritehaber-v1.6.56
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3740623306758763677
- Source name: Paritehaber
- Source language: en
- Selected manga input: popular offset 0: DEAR. DOOR UNCENSORED version (`.../76`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | DEAR. DOOR UNCENSORED version (`.../76`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Unholy Night (`.../82`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Devoured: The Serpent and the Pomegranate (`.../4652`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Mydei X Phainon (Honkai: Star Rail) (`.../4658`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | DEAR. DOOR UNCENSORED version (`.../76`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | DEAR. DOOR UNCENSORED version (`.../76`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 164 | 001-Chapter 1 Episode 1 (`.../001-chapter-1-episode-1`) |  | <1s |
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
| thumbnail URLs | UNUSUAL | 100/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.paritehaber.com/.../DEAR.-DOOR-UNCENSORED-Smut-BL-Yaoi-Manhwa-e1653549494567-175x238.jpg` (image/jpeg, 11885 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `76` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.paritehaber.com/.../DEAR.-DOOR-UNCENSORED-Smut-BL-Yaoi-Manhwa-e1653549494567-193x278.jpg` (image/jpeg, 14786 bytes, 193x278) |  |  |  |
| details author | PASS | Pluto |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Drama, Fantasy, Manhwa, Mature, Smut, Supernatural, Uncensored, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | While in pursuit of criminals, a police officer has an unexpected encounter with a rather uncanny demon. Barely surviving the incident, Do Gyeong Joon is left staring after the retreating form of the mysterious creature in bafflement. However, not long after this the two meet again when the demon crashes into Do Gyeong Joon’s apartment, saying: “Hurry up! I need to get inside of you”…!? +++++ Kyungjoon had lost all hope for a fulfilling life after his fiancée passed away. His days were now filled with tending to his house plants and dealing with petty crimes as a police officer. But everything changed when he stumbled upon a supernatural cult that led him to encounter “Lord Cain,” a demon king on the brink of death due to a lack of mana. As it turns out, Kyungjoon’s body could serve as a “door” for Cain to enter Hell and regain his strength. However, the process of opening that door involves some NSFW activities… Will Kyungjoon take the risk for the sake of helping Cain, or will he choose to play it safe?<br><br>Alternative Names: Dear Door / Querida Puerta / 디어 도어 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 164 chapters |  |  |  |
| chapter dates | PASS | 164 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.paritehaber.com/.../DEAR.-DOOR-%5BUNCENSORED-VERSION-R19+%5D-00.jpg` (image/jpeg, 43438 bytes, 641x967) |  |  |  |
