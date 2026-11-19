# Extension Validation Report

- Extension: tachiyomi-es.zonatmoto-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1900395790630760038
- Source name: Zonatmo.to (unoriginal)
- Source language: es
- Selected manga input: popular offset 0: Dandadan (`.../dandadan-2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Dandadan (`.../dandadan-2`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Super Human Era (`.../super-human-era`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Soy Mi Novia Doméstica (`.../soy-mi-novia-domestica`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Dandadan (`.../dandadan-2`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Dandadan (`.../dandadan-2`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 217 | #1.00 - Capítulo 1.00 (`.../capitulo-1-00`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 63 |  |  | <1s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Dandadan, URL=`dandadan-2` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 76/76 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 76/76 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://zonatmo.to/.../614cdc1808414.webp` -> 2 manga URLs (examples: `dandadan-2`, `dandadan`) |  |  |  |
| thumbnail | PASS | `https://zonatmo.to/.../614cdc1808414.webp` (image/webp (encoding: lossy), 70666 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `dandadan-2` |  |  |  |
| details thumbnail URL | PASS | `https://zonatmo.to/.../614cdc1808414.webp` |  |  |  |
| details author | PASS | tatsu, yukinobu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ciencia Ficción, Comedia, Demonios, Fantasia, Romance, Sobrenatural, Vida Escolar |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Takakura es un apasionado del ocultismo, aunque irónicamente no cree en fantasmas, mientras que Ayase, convencida de la existencia de espíritus, desestima el misticismo del ocultismo. Juntos, se embarcan en una aventura juvenil que los enfrentará a espectros y fenómenos sobrenaturales, en una historia repleta de misterio, emociones y lo inexplicable. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 217 chapters |  |  |  |
| chapter dates | PASS | 217 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 63 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.zonatmo.to/.../821bac16.webp` (image/webp (encoding: lossy), 177608 bytes, 1851x1280) |  |  |  |
