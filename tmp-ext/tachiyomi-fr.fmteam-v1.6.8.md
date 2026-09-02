# Extension Validation Report

- Extension: tachiyomi-fr.fmteam-v1.6.8
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7699632518084274667
- Source name: FMTEAM
- Source language: fr
- Selected manga input: popular offset 0: Batuque (`.../batuque`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 19 | Batuque (`.../batuque`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Blue Lock (`.../blue-lock`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Batuque (`.../batuque`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Batuque (`.../batuque`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 157 | Chapitre 1 : Souvenirs de la lune (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 50 |  |  | <1s |

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
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Batuque, URL=`.../batuque` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 30/30 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 30/30 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://fmteam.fr/.../A1oQhNxscwL.jpg` (image/jpeg, 1174394 bytes, 1794x2550) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../batuque` |  |  |  |
| details thumbnail URL | PASS | `https://fmteam.fr/.../A1oQhNxscwL.jpg` |  |  |  |
| details author | PASS | Sako Toshio |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | C'est l'histoire d'une collégienne et adepte du skateboard, Kazuri Sanjô surnommée "Icchi" qui ressent un sentiment de solitude et de servitude tout en grandissant dans une famille ordinaire. Elle peut ressembler à une simple fille énergétique mais à chaque fois qu'elle voit la pleine lune, elle est frappée par une vague d'émotion qu'elle ne peut comprendre. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 157 chapters |  |  |  |
| chapter dates | PASS | 157 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://fmteam.fr/.../001.jpg <redacted query values: v>` (image/jpeg, 143671 bytes, 704x1000) |  |  |  |
