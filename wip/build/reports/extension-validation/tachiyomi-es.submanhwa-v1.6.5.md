# Extension Validation Report

- Extension: tachiyomi-es.submanhwa-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 3
- Failed: 1
- Retry disposition: REVIEW

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
| popular_next | `getPopularManga(2)` | success | 10 | Configurando a mi Equipo de Voleibol (`.../configurando-a-mi-equipo-de-voleybol`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 471 | Kanojo, Okarishimasu (`.../kanojo-okarishimasu`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Plan de Intercambio de Madres (`.../plan-de-intercambio-de-madres`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 101 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 471 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 491/491 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 491/491 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.submanhwa.com/.../cover_250x350.jpg` (image/jpeg, 425632 bytes, 1000x1400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../plan-de-intercambio-de-madres` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://media.submanhwa.com/.../cover_250x350.jpg <redacted query values: 1795124641>` (image/jpeg, 425632 bytes, 1000x1400) |  |  |  |
| details author | PASS | Yagyeong |  |  |  |
| details artist | PASS | Baengkki |  |  |  |
| details genres | PASS | 🔞MANHWA, Seinen, Drama, Harem, Relacion secreta, Romance, Comedia, Contrato, # Maduras, # Milfs, #Dominación, Mujer casada, Madrastra, Hermanastra, Madre E Hijo, Fetiches |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 👁️ 440,821 vistas \| 📚 101 capítulos \| ⭐ 5.0 · 100% la recomienda \| 📅 2025<br><br>Una historia de amor inesperada se desarrolla entre dos jóvenes, Eunnam y Hamji-dong, quienes atraviesan complicados sentimientos familiares. Eunnam, enamorado de la madre de su mejor amigo, se ve envuelto en una serie de situaciones que ponen en peligro su relación con su madrastra. A medida que la trama avanza, los jóvenes luchan con sus propios sentimientos mientras tratan de encontrar un camino hacia la resolución de sus conflictos familiares.<br><br>Nombres alternativos:<br>- Mom Swap<br>- MILF Exchange Plan<br>- 아줌마 교환계획<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 101 chapters |  |  |  |
| chapter dates | PASS | 101 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media1.submanhwa.net/.../fc14349feba1eaaaaa1bf7-1790481631619.jpg` (image/jpeg, 361108 bytes, 900x7207) |  |  |  |
