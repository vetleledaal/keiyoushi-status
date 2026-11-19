# Extension Validation Report

- Extension: tachiyomi-es.mhscans-v1.6.71
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 25
- Lint: 0
- Warnings: 1
- Skipped: 10
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9008444898589746680
- Source name: MHScans
- Source language: es
- Selected manga input: popular offset 0: Inicio de Sesión en el Murim (`.../mhscans-inicio-de-sesion-en-el-murim`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Inicio de Sesión en el Murim (`.../mhscans-inicio-de-sesion-en-el-murim`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Convertido en Instructor de Esgrima de la Academia (`.../mhscans-convertido-en-instructor-de-esgrima-de-la-academia`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | El Comerciante del Tiempo (`.../mhscans-el-comerciante-del-tiempo`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Abandonado por Dios (`.../mhscans-abandonado-por-dios`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Inicio de Sesión en el Murim (`.../mhscans-inicio-de-sesion-en-el-murim`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Inicio de Sesión en el Murim (`.../mhscans-inicio-de-sesion-en-el-murim`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Inicio de Sesión en el Murim, URL=`mhscans-inicio-de-sesion-en-el-murim` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mhscans.com/.../cover-1793995441869.webp` (image/webp (encoding: lossy), 64272 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `mhscans-inicio-de-sesion-en-el-murim` |  |  |  |
| details thumbnail URL | PASS | `https://mhscans.com/.../cover-1793995441869.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Artes Marciales, Ciencia ficción, Comedia, Meian, Murim, Recomendado |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | El protagonista que vive en un mundo de mazmorras y cazadores recoge una máquina de realidad virtual y se conecta accidentalmente a un juego el cual se desarrolla en una era de artes marciales, ¿Qué pasará con nuestro protagonista en este nuevo mundo del que no sabe nada?, ¿Podrá nuestro protagonista volver a su mundo?, ¿Es ese mundo realmente un juego? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://mhscans.com/.../library <redacted query values: sort and page>` to `https://mhscans.com/.../library <redacted query values: sort>` (1 redirects); popular: `https://mhscans.com/.../library <redacted query values: sort and page>` to `https://mhscans.com/.../library <redacted query values: sort>` (1 redirects); popular: `https://mhscans.com/.../library <redacted query values: q, sort, and page>` to `https://mhscans.com/.../library <redacted query values: q and sort>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
