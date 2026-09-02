# Extension Validation Report

- Extension: tachiyomi-it.lupiteam-v1.6.8
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 148102640598931038
- Source name: LupiTeam
- Source language: it
- Selected manga input: popular offset 0: Area no Kishi (`.../area-no-kishi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Area no Kishi (`.../area-no-kishi`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 6 | One Piece (`.../one-piece`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Area no Kishi (`.../area-no-kishi`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Area no Kishi (`.../area-no-kishi`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 95 | Capitoli precedenti (`.../it`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

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
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 6 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Area no Kishi, URL=`.../area-no-kishi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 13/13 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 13/13 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lupiteam.net/.../area-no-kishi.jpg <redacted query values: v>` (image/jpeg, 233200 bytes, 803x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../area-no-kishi` |  |  |  |
| details thumbnail URL | PASS | `https://lupiteam.net/.../area-no-kishi.jpg <redacted query values: v>` |  |  |  |
| details author | PASS | Tadashi Agi |  |  |  |
| details artist | PASS | Kaya Tsukiyama |  |  |  |
| details genres | PASS | Drammatico, Scolastico, Sport |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kakeru Aizawa è il fratello più giovane del capitano della squadra di calcio della scuola Kamakura e talento della nazionale giapponese under-15. Kakeru, scoraggiato dai continui paragoni col fratello, non riesce mai a dare il meglio di sé in campo, sbagliando anche le giocate più semplici e procurandosi il soprannome di "Mr. No Goal". Ma la sua vita cambierà in seguito al ritorno in città di un'amica d'infanzia e a un tragico incidente che lo segnerà per sempre. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 95 chapters |  |  |  |
| chapter dates | PASS | 95 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://lupiteam.net/.../old-chapters.jpg <redacted query values: v>` (image/jpeg, 159807 bytes, 900x900) |  |  |  |
