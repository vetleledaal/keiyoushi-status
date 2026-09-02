# Extension Validation Report

- Extension: tachiyomi-it.gto-v1.6.8
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
- Source ID: 2773063800266255222
- Source name: GTO The Great Site
- Source language: it
- Selected manga input: popular offset 0: 100% Fragola East Side Story (`.../100-fragola-east-side-story`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 83 | 100% Fragola East Side Story (`.../100-fragola-east-side-story`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Il mio senpai è irritante (`.../il-mio-senpai-e-irritante`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 100% Fragola East Side Story (`.../100-fragola-east-side-story`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 100% Fragola East Side Story (`.../100-fragola-east-side-story`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Ch.1 - La donna dalle mutandine con le fragole (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | <1s |

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
| popular listing | PASS | 83 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=100% Fragola East Side Story, URL=`.../100-fragola-east-side-story` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 94/94 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 94/94 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://reader.gtothegreatsite.net/.../100-fragola-east-side-story.jpg <redacted query values: v>` (image/jpeg, 455701 bytes, 534x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../100-fragola-east-side-story` |  |  |  |
| details thumbnail URL | PASS | `https://reader.gtothegreatsite.net/.../100-fragola-east-side-story.jpg <redacted query values: v>` |  |  |  |
| details author | PASS | Mizuki Kawashita |  |  |  |
| details artist | PASS | Mizuki Kawashita |  |  |  |
| details genres | PASS | Commedia, Ecchi, Romantico, Scolastico |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Sequel di 100% Fragola, edito in Italia dalla casa editrice Planet manga. La serie segue Junpei Manaka, un ragazzo che un giorno sgattaiola sul tetto della scuola per godersi il tramonto. Ma quando apre la porta si trova di fronte una bella ragazza che fugge via, non prima però che Junpei resti colpito dalla vista delle mutandine con fragole stampate su che indossa… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://reader.gtothegreatsite.net/.../Credits.png <redacted query values: v>` (image/png, 1085983 bytes, 800x1200) |  |  |  |
