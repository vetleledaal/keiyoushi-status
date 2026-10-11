# Extension Validation Report

- Extension: tachiyomi-es.lectorasteria-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 3
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: moonlighttl
- Source ID: 698506559036250327
- Source name: Lector Asteria
- Source language: es
- Selected manga input: popular offset 0: Me convertí en el miembro más joven de un grupo de idols (`.../me-converti-en-el-miembro-mas-joven-de-un-grupo-de-idols`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 9 | Me convertí en el miembro más joven de un grupo de idols (`.../me-converti-en-el-miembro-mas-joven-de-un-grupo-de-idols`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | La temperatura Corporal del diablo (`.../la-temperatura-corporal-del-diablo`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Me convertí en el miembro más joven de un grupo de idols (`.../me-converti-en-el-miembro-mas-joven-de-un-grupo-de-idols`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Me convertí en el miembro más joven de un grupo de idols (`.../me-converti-en-el-miembro-mas-joven-de-un-grupo-de-idols`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 59 | Capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Me convertí en el miembro más joven de un grupo de idols, URL=`.../me-converti-en-el-miembro-mas-joven-de-un-grupo-de-idols` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 22/22 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 22/22 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.lectorasteria.com/.../0a55e5b6-e615-4b4c-bfd5-e30b839d5bdc.webp` (image/webp (encoding: lossless), 200310 bytes, 342x514) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../me-converti-en-el-miembro-mas-joven-de-un-grupo-de-idols` |  |  |  |
| details thumbnail URL | PASS | `https://media.lectorasteria.com/.../0a55e5b6-e615-4b4c-bfd5-e30b839d5bdc.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Supervivencia, Regresión, Fantasia, Drama |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | "25 años... ya no es una edad para debutar en la industria musical."<br><br>Una persona que fue eliminada del programa de audiciones *Proyecto Stardust* lucha por no abandonar su gran sueño. Aceptando la realidad, trabaja en varios empleos a tiempo parcial… hasta que, de repente, se da cuenta de que ha retrocedido ocho años en el pasado.<br><br>¡Y no solo eso, sino que ha vuelto justo antes de comenzar *Proyecto Stardust*! Ahora, con más experiencia pero un cuerpo más joven, ¿podrá superar la audición y convertirse en un miembro oficial del grupo? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 59 chapters |  |  |  |
| chapter dates | PASS | 59 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://wsrv.nl <redacted query values: url and n>` (image/webp (encoding: lossy), 434112 bytes, 800x9535) |  |  |  |
