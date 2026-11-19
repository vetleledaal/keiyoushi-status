# Extension Validation Report

- Extension: tachiyomi-es.lectorjpg-v1.6.51
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 4439526602175493484
- Source name: LectorJPG
- Source language: es
- Selected manga input: popular offset 0: Mételo en la canasta (SIN CENSURA) (`.../metelo-en-la-cesta`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Mételo en la canasta (SIN CENSURA) (`.../metelo-en-la-cesta`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Dúo de baile (`.../duo-de-baile`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Amor Peligroso Entre Hermanos - FxS (`.../amor-peligroso-entre-hermanos`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mételo en la canasta (SIN CENSURA) (`.../metelo-en-la-cesta`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mételo en la canasta (SIN CENSURA) (`.../metelo-en-la-cesta`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Capitulo 1 (`.../64845`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mételo en la canasta (SIN CENSURA), URL=`metelo-en-la-cesta` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 31/31 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.lectorjpg.com/.../2b1319e6-f75f-4804-b889-c8015bc6f52d.webp` (image/webp (container: extended), 98312 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `metelo-en-la-cesta` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://media.lectorjpg.com/.../28afd39e-f907-480c-8696-5013a1100301.webp` (image/webp (container: extended), 115248 bytes, 1280x720) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | El momento en que me convertí en la manager del equipo de baloncesto de mi equipo favorito, un equipo que se enfrentaba al riesgo de desaparecer. Para salvar al equipo, tuve que hacer frente a las preferencias secretas de los jugadores… «¿Alguna vez has hecho un trío?» |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.lectorjpg.com/.../d22c97df-ccc4-4e32-9c6a-9ea05765e3d3.webp` (image/webp (encoding: lossy), 716366 bytes, 800x16000) |  |  |  |
