# Extension Validation Report

- Extension: tachiyomi-es.eternalmangas-v1.6.29
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: iken
- Source ID: 1533901034425595323
- Source name: EternalMangas
- Source language: es
- Selected manga input: popular offset 0: el curíoso rancho del señor A (`.../la-granja-del-seor-a`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | el curíoso rancho del señor A (`.../la-granja-del-seor-a`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | Mi sádico amo (`.../mi-sdico-amo`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 17 | A Coroa Viridescente (`.../a-coroa-viridescente`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 17 | El tigre está descendiendo (`.../el-tigre-est-descendiendo`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | el curíoso rancho del señor A (`.../la-granja-del-seor-a`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | el curíoso rancho del señor A (`.../la-granja-del-seor-a`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 28 | Chapter 1 (`.../01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 17 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=el curíoso rancho del señor A, URL=`la-granja-del-seor-a#1995` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=A Coroa Viridescente, URL=`a-coroa-viridescente#1914` at page 1 offset 0 and page 2 offset 7, title=Proyeccion, URL=`proyeccion#630` at page 1 offset 1 and page 2 offset 8, title=No, ¡Encante Solamente a la Princesa!, URL=`no-encante-solamente-a-la-princesa#278` at page 1 offset 4 and page 2 offset 10, title=Soy la tutora de los príncipes gemelos, URL=`soy-la-tutora-de-los-prncipes-gemelos#139` at page 1 offset 5 and page 2 offset 11, title=Amor de la ciencia espacial, URL=`amor-de-la-ciencia-espacial#86` at page 1 offset 9 and page 2 offset 4, title=El retorno de una leyenda, URL=`el-retorno-de-una-leyenda#371` at page 1 offset 10 and page 2 offset 3, title=Mis esposos pelean por mi amor, URL=`mis-esposos-pelean-por-mi-amor#342` at page 1 offset 11 and page 2 offset 14, title=A Filha do Arquimago, URL=`a-filha-do-arquimago#1916` at page 1 offset 12 and page 2 offset 15, title=El rey del tigre blanco, URL=`el-rey-del-tigre-blanco#1441` at page 1 offset 13 and page 2 offset 13, title=Mi cuerpo ha sido poseido por alguien mas, URL=`mi-cuerpo-ha-sido-poseido-por-alguien-mas#1352` at page 1 offset 14 and page 2 offset 5, title=Cómo abrazar a dios, URL=`cmo-abrazar-a-dios#742` at page 1 offset 15 and page 2 offset 12, title=El tigre está descendiendo, URL=`el-tigre-est-descendiendo#198` at page 1 offset 16 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 71/71 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 71/71 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.eternalmangas.org/.../62e3c219-9f19-4d75-8194-7e5b188927aa.webp` (image/webp (encoding: lossy), 28324 bytes, 178x283) |  |  |  |
| details identity | PASS | Details preserved selected URL `la-granja-del-seor-a#1995` |  |  |  |
| details thumbnail URL | PASS | `https://storage.eternalmangas.org/.../62e3c219-9f19-4d75-8194-7e5b188927aa.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | BL |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | El tío A le escribe a su sobrino para que lo ayude en su granja, pero lo que menos espera el pequeño A es toparse con una granja de ganado humano. Su tío está desaparecido y él deberá hacerse cargo de las extrañas tareas<br><br>Alternative Names: Mr.A |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 3 name |  |  |  |
| chapters | PASS | 28 chapters |  |  |  |
| chapter dates | PASS | 28 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://media.eternalmangas.com/.../8957bc1f-f56a-4741-bd9d-845a8abc35b8.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
