# Extension Validation Report

- Extension: tachiyomi-es.barmanga-v1.6.66
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 404674447362480247
- Source name: BarManga
- Source language: es
- Selected manga input: popular offset 0: Cállate, malvado dragón, ya no quiero criar hijos contigo. (`.../243`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Cállate, malvado dragón, ya no quiero criar hijos contigo. (`.../243`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | My Exclusive Dreamland Game (`.../730`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | El Villano Rubio De La Novela De La Protagonista Femenina Quiere Ser Feliz. (`.../2910`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | El Dominio de las Artes Marciales (`.../7514`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Cállate, malvado dragón, ya no quiero criar hijos contigo. (`.../243`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Cállate, malvado dragón, ya no quiero criar hijos contigo. (`.../243`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 126 | Capítulo 01 (`.../capitulo-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cállate, malvado dragón, ya no quiero criar hijos contigo., URL=`243` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://archiviumbar.com/.../Gemini_Generated_Image_puunjdpuunjdpuun-copia.png` (image/png, 1575264 bytes, 922x1152) |  |  |  |
| details identity | PASS | Details preserved selected URL `243` |  |  |  |
| details thumbnail URL | PASS | `https://archiviumbar.com/.../Gemini_Generated_Image_puunjdpuunjdpuun-copia.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Aventura, drama, Esposa, Fantasía, Manhua, MC, Romance, Seinen, Drunken Dream, Recomendados |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | fDespués de ser derrotado y capturado, el valiente cazador de dragones Leon se convirtió en prisionero de la Reina Dragón Plateada. Con la resolución de morir, lanzó una técnica prohibida para maldecir a la Reina, pero inesperadamente provocó que la Reina perdiera el control, impactándola profundamente. Pensó que al menos de esa manera la Reina viviría el resto de su vida con vergüenza, cumpliendo así con su misión como cazador de dragones. Sin embargo, dos años después, cuando Leon abrió los ojos, a su lado había una pequeña dragona con cola… (El manga se actualiza todos los jueves o viernes).<br><br>Nombres Alternativos: Shut Up, Evil Dragon, I Don't Want to Raise a Child With You Anymore, ¡Cállate, Dragón Malvado! Ya no quiero criar a un niño contigo |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 126 chapters |  |  |  |
| chapter dates | PASS | 126 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | FAIL | 1 of 46 pages have invalid URLs: page 46: imageUrl=`data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iODAwIiBoZWlnaHQ9IjEyMDAiPjwvc3ZnPg==` (data scheme) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://archiviumbar.com/.../001.jpg` (image/jpeg, 336117 bytes, 1200x1974) |  |  |  |
