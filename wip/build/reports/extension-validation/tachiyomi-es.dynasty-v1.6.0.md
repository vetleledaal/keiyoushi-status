# Extension Validation Report

- Extension: tachiyomi-es.dynasty-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1788469981763672104
- Source name: Dynasty
- Source language: es
- Selected manga input: popular offset 0: El mercenario regresado tiene un plan (`.../378%7Cel-mercenario-regresado-tiene-un-plan`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | El mercenario regresado tiene un plan (`.../378%7Cel-mercenario-regresado-tiene-un-plan`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Bosque de Limoneros (`.../288%7Cbosque-de-limoneros`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 14 | Bajo el Roble (`.../264%7Cbajo-el-roble`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Soy el discípulo menor de la mente maestra del murim (`.../279%7Csoy-el-discipulo-menor-de-la-mente-maestra-del-murim`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | El mercenario regresado tiene un plan (`.../378%7Cel-mercenario-regresado-tiene-un-plan`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | El mercenario regresado tiene un plan (`.../378%7Cel-mercenario-regresado-tiene-un-plan`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 103 | Capítulo 1 (`.../140038`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

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
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El mercenario regresado tiene un plan, URL=`378\|el-mercenario-regresado-tiene-un-plan` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 69/69 listing manga have titles and URLs; 69 pipe-containing URLs skipped from classification |  |  |  |
| thumbnail URLs | PASS | 69/69 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.manhuako.net/.../cover-1787412940873.webp` (image/webp (encoding: lossy), 358136 bytes, 1042x1509) |  |  |  |
| details identity | PASS | Details preserved selected URL `378\|el-mercenario-regresado-tiene-un-plan` |  |  |  |
| details thumbnail URL | PASS | `https://img.manhuako.net/.../cover-1787412940873.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ghislain Perdium, el Rey Mercenario y uno de los siete mejores del continente, inició una gran guerra en un intento de vengar a su familia caída. Sus planes de venganza iban viento en popa hasta que fue asesinado por Idun, de quien nunca esperó que hiciera acto de presencia. Ghislain pensó que había muerto, pero despertó como una versión más joven de sí mismo de antes de la caída de su casa. Con esta segunda oportunidad, decidió arreglar todas las piezas erróneas del rompecabezas y evitar cometer los mismos errores que en su vida pasada. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 103 chapters |  |  |  |
| chapter dates | PASS | 103 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.manhuako.net/.../001.webp` (image/webp (encoding: lossy), 822444 bytes, 1398x903) |  |  |  |
