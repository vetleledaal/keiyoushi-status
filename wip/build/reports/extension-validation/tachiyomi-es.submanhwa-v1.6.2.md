# Extension Validation Report

- Extension: tachiyomi-es.submanhwa-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1136717301008230074
- Source name: Submanhwa
- Source language: es
- Selected manga input: popular offset 0: Plan de Intercambio de Madres (`.../plan-de-intercambio-de-madres`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Plan de Intercambio de Madres (`.../plan-de-intercambio-de-madres`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | Cazador de Milfs en otro Mundo (`.../cazador-de-milfs-en-otro-mundo`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 469 | REENCARNADO EN UN COLISEO ~Utilizando la habilidad más débil para derrotar a las mujeres más fuertes y crear un harem de esclavas~ (`.../reencarnado-en-un-coliseo-utilizando-la-habilidad-mas-debil-para-derrotar-a-las-mujeres-mas-fuertes-y-crear-un-harem-de-`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Plan de Intercambio de Madres (`.../plan-de-intercambio-de-madres`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Plan de Intercambio de Madres (`.../plan-de-intercambio-de-madres`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 95 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | <1s |

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
| latest listing | PASS | 469 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Plan de Intercambio de Madres, URL=`.../plan-de-intercambio-de-madres` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 490/490 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 490/490 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://submanhwa.com/.../cover_250x350.jpg` (image/jpeg, 20156 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../plan-de-intercambio-de-madres` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://submanhwa.com/.../cover_250x350.jpg <redacted query values: 1791722788>` (image/jpeg, 20156 bytes, 250x350) |  |  |  |
| details author | PASS | Yagyeong |  |  |  |
| details artist | PASS | Baengkki |  |  |  |
| details genres | PASS | 🔞MANHWA, Seinen, Drama, Harem, Relacion secreta, Romance, Comedia, Contrato, Dominación, Mujer casada, Madrastra, Hermanastra, Madre E Hijo, MILFs, Fetiches, Maduras |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 👁️ 371,315 vistas \| 📚 95 capítulos \| 📅 2025<br><br>Una historia de amor inesperada se desarrolla entre dos jóvenes, Eunnam y Hamji-dong, quienes atraviesan complicados sentimientos familiares. Eunnam, enamorado de la madre de su mejor amigo, se ve envuelto en una serie de situaciones que ponen en peligro su relación con su madrastra. A medida que la trama avanza, los jóvenes luchan con sus propios sentimientos mientras tratan de encontrar un camino hacia la resolución de sus conflictos familiares.<br><br>Alternative names<br>- Mom Swap<br>- MILF Exchange Plan<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 95 chapters |  |  |  |
| chapter dates | PASS | 95 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage.submanhwa.net/.../fc14349feba1eaaaaa1bf7-1790481631619.jpg` (image/jpeg, 361108 bytes, 900x7207) |  |  |  |
