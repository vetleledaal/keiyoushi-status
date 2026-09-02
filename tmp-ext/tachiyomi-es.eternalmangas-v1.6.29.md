# Extension Validation Report

- Extension: tachiyomi-es.eternalmangas-v1.6.29
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 24
- Lint: 0
- Warnings: 1
- Skipped: 9
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1533901034425595323
- Source name: EternalMangas
- Source language: es
- Selected manga input: latest offset 0: Réquiem por la Reina (`.../rquiem-por-la-reina`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | el curíoso rancho del señor A (`.../la-granja-del-seor-a`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | Mi sádico amo (`.../mi-sdico-amo`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 17 | Réquiem por la Reina (`.../rquiem-por-la-reina`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 17 | Mis esposos pelean por mi amor (`.../mis-esposos-pelean-por-mi-amor`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Réquiem por la Reina (`.../rquiem-por-la-reina`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Réquiem por la Reina (`.../rquiem-por-la-reina`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 17 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Réquiem por la Reina, URL=`rquiem-por-la-reina#66` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Réquiem por la Reina, URL=`rquiem-por-la-reina#66` at page 1 offset 0 and page 2 offset 4, title=Creé un harén para evitar al protagonista masculino, URL=`cre-un-harn-para-evitar-al-protagonista-masculino-#1414` at page 1 offset 1 and page 2 offset 15, title=A Coroa Viridescente, URL=`a-coroa-viridescente#1914` at page 1 offset 2 and page 2 offset 5, title=A Princesa Monstro, URL=`a-princesa-monstro#1937` at page 1 offset 3 and page 2 offset 1, title=A Filha do Arquimago, URL=`a-filha-do-arquimago#1916` at page 1 offset 4 and page 2 offset 8, title=Elimina a la dama villana, URL=`elimina-a-la-dama-villana#2086` at page 1 offset 5 and page 2 offset 14, title=Cómo abrazar a dios, URL=`cmo-abrazar-a-dios#742` at page 1 offset 7 and page 2 offset 9, title=El tigre está descendiendo, URL=`el-tigre-est-descendiendo#198` at page 1 offset 8 and page 2 offset 12, title=El retorno de una leyenda, URL=`el-retorno-de-una-leyenda#371` at page 1 offset 9 and page 2 offset 10, title=Cómo sobrevivir como un jugador, URL=`cmo-sobrevivir-como-un-jugador#191` at page 1 offset 10 and page 2 offset 7, title=El rey del tigre blanco, URL=`el-rey-del-tigre-blanco#1441` at page 1 offset 11 and page 2 offset 2, title=Mis esposos pelean por mi amor, URL=`mis-esposos-pelean-por-mi-amor#342` at page 1 offset 12 and page 2 offset 0, title=Amor de la ciencia espacial, URL=`amor-de-la-ciencia-espacial#86` at page 1 offset 13 and page 2 offset 13, title=No, ¡Encante Solamente a la Princesa!, URL=`no-encante-solamente-a-la-princesa#278` at page 1 offset 14 and page 2 offset 11, title=D:AZE, URL=`daze#591` at page 1 offset 15 and page 2 offset 3 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 71/71 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 71/71 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://media.eternalmangas.com/.../bbeaf0b8-fdcc-4c4f-a35f-846a4b4b401d.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `rquiem-por-la-reina#66` |  |  |  |
| details thumbnail URL | PASS | `https://media.eternalmangas.com/.../bbeaf0b8-fdcc-4c4f-a35f-846a4b4b401d.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Por las noches, la princesa Milaia sueña con una reina desconocida. Como si fuera su destino, de pronto se encuentra poseyendo el cuerpo de la reina Gloria de hace cien años, lo cuál le permite descubrir su diario. \"Te confío el reino. Te suplico que lo cuides.\" Una oscuridad desconcertante se cierne sobre ella, ¡causando confusión! \"¿Quién eres tú?\" El duque Ferdinand, de alguna manera, reconoce su identidad. ¡Pero la crisis se convierte en una oportunidad! \"Colabora conmigo. A cambio, cerraré los ojos ante tu identidad.\" \"De acuerdo. Pero tengo una condición.\" \"¿Cuál es?\" \"No quiero que simplemente ignores mi identidad. Quiero ser tratada como una reina perfecta en todos los aspectos.\" Milaia, que ha decidido vivir en el nombre de la reina, y el duque Ferdinand, quien conoce su secreto. Por el bienestar del reino y por Gloria, la reina que solo deseaba la paz del reino, ambos interpretan un réquiem por la reina. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
