# Extension Validation Report

- Extension: tachiyomi-es.inmortalscan-v1.6.60
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 8879875375160764811
- Source name: Inmortal Scan
- Source language: es
- Selected manga input: popular offset 0: La admisión es una pérdida de tiempo (`.../2869`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | La admisión es una pérdida de tiempo (`.../2869`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Me convertí en un actor de primera sólo leyendo libros! (`.../2647`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | La espada del chamán (`.../2747`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | CORPORACIÓN NEGRA: JOSEON (`.../2559`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | La admisión es una pérdida de tiempo (`.../2869`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | La admisión es una pérdida de tiempo (`.../2869`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 57 | capitulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La admisión es una pérdida de tiempo, URL=`2869` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://scan-inmortal.com/.../La-admision-es-una-perdida-de-tiempo-175x238.webp` (image/webp (encoding: lossy), 17992 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `2869` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Fantasía |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Ban Yoo-won puede comprender cualquier idioma y absorber los conceptos que descubre. Su extraña habilidad cobra sentido cuando averigua que su familia desciende de los constructores de la Torre de Babel.<br><br>Nombres Alternativos: Admission Is a Waste of Time |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 57 chapters |  |  |  |
| chapter dates | PASS | 57 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://wp.scaninmortal.store/.../0-1.webp` (image/webp (container: extended), 39162 bytes, 512x512) |  |  |  |
