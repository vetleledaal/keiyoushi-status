# Extension Validation Report

- Extension: tachiyomi-es.shadowmanga-v1.6.5
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5649269152264667286
- Source name: Shadow Manga
- Source language: es
- Selected manga input: popular offset 0: Daiakutou Shonen (`.../8421`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 234 | Daiakutou Shonen (`.../8421`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Daiakutou Shonen (`.../8421`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Mangas AnOshi (`.../103522`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Daiakutou Shonen (`.../8421`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Daiakutou Shonen (`.../8421`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 16 | Cap. 1 (`.../204949`) |  | <1s |
| pages | `getPageList(chapter)` | success | 67 |  |  | 1-10s |

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
| popular listing | PASS | 234 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Daiakutou Shonen, URL=`8421` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Daiakutou Shonen, URL=`8421` at page 1 offset 0 and page 2 offset 7 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 260/260 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 260/260 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.shademanga.com/.../portada.webp <redacted query values: v>` (image/webp (container: extended), 60610 bytes, 600x853) |  |  |  |
| details identity | PASS | Details preserved selected URL `8421` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.shademanga.com/.../portada.webp <redacted query values: v>` |  |  |  |
| details author | PASS | Koume Fujichika |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Ciencia Ficción, Superpoderes, Drama, Crimen, Psicológica, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Todo en el mundo es absurdo. Los héroes que luchan bajo el disfraz de la justicia, los villanos de poca monta que solo pueden cometer delitos menores, los compañeros de clase que solo saben agruparse... y su propio yo, débil y miserable. Por eso, el chico anhela cambiarlo todo, no solo a sí mismo, sino también al mundo… pues se convertirá en el solitario, el distante, el supremo “¡Más Grande de Todos los Villanos!”! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 16 chapters |  |  |  |
| chapter dates | PASS | 16 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 67 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.shademanga.com/.../001.webp <redacted query values: v>` (image/webp (encoding: lossy), 61334 bytes, 1280x1820) |  |  |  |
