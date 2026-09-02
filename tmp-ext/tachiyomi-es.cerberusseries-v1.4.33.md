# Extension Validation Report

- Extension: tachiyomi-es.cerberusseries-v1.4.33
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

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1814471239661920836
- Source name: Cerberus Series
- Source language: es
- Selected manga input: latest offset 0: Mi esposa sigue esperando en los campos de trigo. (`.../mi-esposa-sigue-esperando-en-los-campos-de-trigo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | GACHA INFINITA (`.../gacha-infinita-nivel-9999`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Todo comienza con un grupo de personas primitivas (`.../todo-comienza-con-un-grupo-de-personas-primitivas`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Mi esposa sigue esperando en los campos de trigo. (`.../mi-esposa-sigue-esperando-en-los-campos-de-trigo`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | La mesa humana. (`.../la-mesa-humana`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mi esposa sigue esperando en los campos de trigo. (`.../mi-esposa-sigue-esperando-en-los-campos-de-trigo`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mi esposa sigue esperando en los campos de trigo. (`.../mi-esposa-sigue-esperando-en-los-campos-de-trigo`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 27 | Chapter 01 (`.../01-115`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 23 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mi esposa sigue esperando en los campos de trigo., URL=`.../mi-esposa-sigue-esperando-en-los-campos-de-trigo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.wp.com/.../esposa-en-campos-1.jpg <redacted query values: resize>` (image/jpeg, 47917 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mi-esposa-sigue-esperando-en-los-campos-de-trigo` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i1.wp.com/.../esposa-en-campos-1.jpg` (image/jpeg, 419203 bytes, 832x1248) |  |  |  |
| details author | PASS | papapa |  |  |  |
| details artist | PASS | Studio Wooridle |  |  |  |
| details genres | PASS | Comedy, Drama, Fantasy, Romance, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Fue un matrimonio político. Así que, la noche de bodas, él huyó. Abandonó incluso su propio nombre y vivió oculto durante diez años, hasta que la noticia de la muerte de su padre finalmente lo hizo regresar a casa. Allí, en el lugar donde creía que ella se había marchado hacía mucho tiempo, encontró a su esposa: la mujer a la que solo había visto una vez, el día de su boda. Y ella seguía allí. Esperándolo entre los campos de trigo, tan hermosa como siempre. 4.5 111 votes Article Rating<br><br>Nombres alternativos: 부인은 밀밭에서 기다렸다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 27 chapters |  |  |  |
| chapter dates | PASS | 27 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i1.wp.com/.../Juobr3.png` (image/webp (container: extended), 312042 bytes, 1055x1500) |  |  |  |
