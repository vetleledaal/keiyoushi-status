# Extension Validation Report

- Extension: tachiyomi-tr.diamondfansub-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4357416108470845594
- Source name: DiamondFansub
- Source language: tr
- Selected manga input: popular offset 0: Patron Kurt ve Küçük Patates (`.../390`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Patron Kurt ve Küçük Patates (`.../390`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Po’nun Küçük Dünyası (`.../506`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Dük ve Sevgili Oğluyla Bir Aile Olmak (`.../16689`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Kuyrukluyıldızı Durdur! (`.../16535`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Patron Kurt ve Küçük Patates (`.../390`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Patron Kurt ve Küçük Patates (`.../390`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 178 | Bölüm 0 - Bonus (`.../bolum-0`) |  | <1s |
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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Patron Kurt ve Küçük Patates, URL=`390` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://diamondfansub.com/.../kurtkpk-175x238.png` (image/png, 55465 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `390` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://diamondfansub.com/.../kurtkpk.png` (image/png, 1267354 bytes, 1080x1564) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Ma Wei |  |  |  |
| details genres | PASS | Komedi, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Alternative Names: Dog and Wolf / King of Wolves / Papa Wolf and the Puppy / The Wolf That Picked up Something / 捡了东西的狼 / Pies i Wilk / The Wolf That Picked Something Up |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 178 chapters |  |  |  |
| chapter dates | PASS | 178 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://diamondfansub.com/.../3.jpg` (image/jpeg, 125299 bytes, 690x466) |  |  |  |
