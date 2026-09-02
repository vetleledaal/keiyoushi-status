# Extension Validation Report

- Extension: tachiyomi-es.submanhwa-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1136717301008230074
- Source name: Submanhwa
- Source language: es
- Selected manga input: popular offset 0: Plan de Intercambio de Madres (`.../plan-de-intercambio-de-madres`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Plan de Intercambio de Madres (`.../plan-de-intercambio-de-madres`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 10 | El Único Hombre en la Unidad Militar (`.../el-nico-hombre-en-la-unidad-militar`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 370 | El tiempo de la bestia ciega (`.../el-tiempo-de-la-bestia-ciega`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Plan de Intercambio de Madres (`.../plan-de-intercambio-de-madres`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Plan de Intercambio de Madres (`.../plan-de-intercambio-de-madres`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 89 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 29 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 370 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Plan de Intercambio de Madres, URL=`.../plan-de-intercambio-de-madres` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 391/391 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 391/391 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://submanhwa.com/.../cover_250x350.jpg` (image/jpeg, 20156 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../plan-de-intercambio-de-madres` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://submanhwa.com/.../cover_250x350.jpg <redacted query values: 1788356742>` (image/jpeg, 20156 bytes, 250x350) |  |  |  |
| details author | PASS | Yagyeong |  |  |  |
| details artist | PASS | Baengkki |  |  |  |
| details genres | PASS | Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Una historia de amor inesperada se desarrolla entre dos jóvenes, Eunnam y Hamji-dong, quienes atraviesan complicados sentimientos familiares. Eunnam, enamorado de la madre de su mejor amigo, se ve envuelto en una serie de situaciones que ponen en peligro su relación con su madrastra. A medida que la trama avanza, los jóvenes luchan con sus propios sentimientos mientras tratan de encontrar un camino hacia la resolución de sus conflictos familiares. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 89 chapters |  |  |  |
| chapter dates | LINT | 81 of 89 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=81 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://w1.submanhwa.com/.../003097420203.png` at pages 1, 28 |  |  |  |
| page load | PASS | `https://w1.submanhwa.com/.../003097420203.png` (image/png, 80999 bytes, 1000x284) |  |  |  |
