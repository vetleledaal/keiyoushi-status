# Extension Validation Report

- Extension: tachiyomi-it.phoenixscans-v1.6.9
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
- Source ID: 6272882172599295519
- Source name: Phoenix Scans
- Source language: it
- Selected manga input: popular offset 0: 2.5 Dimensional Seduction (`.../25-dimensional-seduction`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 67 | 2.5 Dimensional Seduction (`.../25-dimensional-seduction`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | 2.5 Dimensional Seduction (`.../25-dimensional-seduction`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 2.5 Dimensional Seduction (`.../25-dimensional-seduction`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 2.5 Dimensional Seduction (`.../25-dimensional-seduction`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 32 | Vol.1 Ch.1 - La nuova arrivata (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 56 |  |  | <1s |

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
| popular listing | PASS | 67 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=2.5 Dimensional Seduction, URL=`.../25-dimensional-seduction` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 78/78 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 78/78 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.phoenixscans.com/.../001.jpg <redacted query values: v>` (image/jpeg, 330549 bytes, 844x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../25-dimensional-seduction` |  |  |  |
| details thumbnail URL | PASS | `https://www.phoenixscans.com/.../001.jpg <redacted query values: v>` |  |  |  |
| details author | PASS | Yu Hashimoto |  |  |  |
| details artist | PASS | Yu Hashimoto |  |  |  |
| details genres | PASS | Commedia, Ecchi, Harem, Mature, Romantico, Vita Scolastica |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "Non ho interesse nelle ragazze reali!" È ciò che sostiene Okumura, il presidente del club del manga della scuola. È un tipico otaku, ossessionato da un personaggio (immaginario) sexy in 2D chiamato Liliel. Inizia il nuovo anno scolastico e una ragazza 3D (reale) di nome Lilysa con la passione del cosplay si unisce al club, assottigliando sempre più i confini tra 2D e 3D in questa elettrizzante commedia romantica! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 32 chapters |  |  |  |
| chapter dates | PASS | 32 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.phoenixscans.com/.../2.5_Dimensional_Seduction_v01_c01_p00%5BPhoenixScans_NAFS%5D.jpg <redacted query values: v>` (image/jpeg, 1347202 bytes, 1600x1500) |  |  |  |
