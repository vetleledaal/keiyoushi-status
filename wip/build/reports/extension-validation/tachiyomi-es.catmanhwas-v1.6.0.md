# Extension Validation Report

- Extension: tachiyomi-es.catmanhwas-v1.6.0
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
- Source ID: 360108012210956342
- Source name: Catoons
- Source language: es
- Selected manga input: popular offset 0: Bestias que cruzan la línea (`.../bestias-que-cruzan-la-linea`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Bestias que cruzan la línea (`.../bestias-que-cruzan-la-linea`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Dome al perro del palacio (`.../dome-al-perro-del-palacio`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 3 | Bajo el Roble (`.../bajo-el-roble`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 4 | Pintor de mazmorras (`.../pintor-de-mazmorras`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Bestias que cruzan la línea (`.../bestias-que-cruzan-la-linea`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Bestias que cruzan la línea (`.../bestias-que-cruzan-la-linea`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 49 | Capítulo 1 (`.../15894`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 3 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bestias que cruzan la línea, URL=`bestias-que-cruzan-la-linea` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 56/56 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 56/56 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.newcat1.xyz/.../acd92d5f-a57f-48ea-960b-a6765240cbe2.webp` (image/webp (encoding: lossy), 76118 bytes, 1200x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `bestias-que-cruzan-la-linea` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.newcat1.xyz/.../acd92d5f-a57f-48ea-960b-a6765240cbe2.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | La aburrida vida cotidiana se convierte en una pesadilla; hombres peligrosos que despiertan tus instintos." Mujeres que llevan una vida ordinaria y moralmente correcta. Pero una noche, en un momento inesperado, hombres bestiales se cuelan en sus puntos débiles. Desde amigos de la infancia con los que han vivido veinte años hasta jefes con los que tienen una relación de poder muy inestable, e incluso desconocidos con secretos peligrosos: "Huye. Si te pillan, no te dejaré ir." Pero una vez que cruzas la línea, ya no hay vuelta atrás. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 49 chapters |  |  |  |
| chapter dates | PASS | 49 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.newcat1.xyz/.../1b04e899-f5c6-49d1-90ac-c31a96943ff6.webp` (image/webp (encoding: lossy), 12334 bytes, 1280x800) |  |  |  |
