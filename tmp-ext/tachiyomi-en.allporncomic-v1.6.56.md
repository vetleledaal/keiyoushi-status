# Extension Validation Report

- Extension: tachiyomi-en.allporncomic-v1.6.56
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
- Source ID: 8547397037512613554
- Source name: AllPornComic
- Source language: en
- Selected manga input: popular offset 0: Trick Or Treat [Pegasus Smith] (`.../14455`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Trick Or Treat [Pegasus Smith] (`.../14455`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Twenteen Titans (Teen Titans) [Fred Perry] (`.../20665`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | A Celebration Of Summer (Various) [Tracy Scops] (`.../44804`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | My Boner Academia (My Hero Academia) [Suavi-Cream] (`.../44774`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Trick Or Treat [Pegasus Smith] (`.../14455`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Trick Or Treat [Pegasus Smith] (`.../14455`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 16 | 0.1 . Tina Bonus Images - [Pegasus Smith] (`.../0-1-tina-bonus-images`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Trick Or Treat \[Pegasus Smith\], URL=`14455` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 99/99 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 99/99 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.allporncomic.com/.../000a-350x476.jpg` (image/jpeg, 29137 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `14455` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.allporncomic.com/.../000a-193x278.jpg` (image/jpeg, 13015 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Pegasus Smith |  |  |  |
| details genres | PASS | 3D, Anal, Big Breasts, Big Penis, Blackmail, Cheating, Cosplaying, Dark Skin, DILF, Double Penetration, Eyemask, Gangbang, Group, Handjob, Interracial, MILF, Nakadashi, Twintails, Virginity |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Tina and her son are out trick or treating when they get invited to a party that will change both of their lives forever. A 3D porn comic including blackmail, incest, and cheating by Pegasus Smith. Prequel to Timmy Strikes Back. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 16 chapters |  |  |  |
| chapter dates | LINT | 6 of 16 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.allporncomic.com/.../001.jpg` (image/jpeg, 432721 bytes, 1854x3000) |  |  |  |
