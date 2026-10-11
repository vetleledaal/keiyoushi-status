# Extension Validation Report

- Extension: tachiyomi-es.platinumlilyscan-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5939158356306781713
- Source name: Platinum Lily Scan
- Source language: es
- Selected manga input: popular offset 0: Kimi ga Shinu made Koi wo shitai (`.../kimi-ga-shinu-made`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 76 | Kimi ga Shinu made Koi wo shitai (`.../kimi-ga-shinu-made`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 76 | Oshi no Bishoujo ni Kokuhaku sareru Hanashi (`.../oshi-no-bishoujo`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Kimi ga Shinu made Koi wo shitai (`.../kimi-ga-shinu-made`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kimi ga Shinu made Koi wo shitai (`.../kimi-ga-shinu-made`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 46 | Capítulo 1 - Encantada de conocerte (`.../kimi-ga-shinu-made`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | <1s |

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
| popular listing | PASS | 76 entries |  |  |  |
| latest listing | PASS | 76 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kimi ga Shinu made Koi wo shitai, URL=`kimi-ga-shinu-made` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 154/154 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 154/154 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://platinumlilyscan.com/.../kimi-ga-shinu-made.jpg` (image/jpeg, 117587 bytes, 512x725) |  |  |  |
| details identity | PASS | Details preserved selected URL `kimi-ga-shinu-made` |  |  |  |
| details thumbnail URL | PASS | `https://platinumlilyscan.com/.../kimi-ga-shinu-made.jpg` |  |  |  |
| details author | PASS | Aono Nachi |  |  |  |
| details artist | PASS | Aono Nachi |  |  |  |
| details genres | PASS | Yuri, Romance, Drama, Fantasía, Tragedia, Acción, Sobrenatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Hay una escuela que entrena a sus estudiantes para que sean armas de guerra, asesinos especializados en magia. En esta "escuela", Shiina ha tenido dificultades para lidiar con la muerte de su compañera de cuarto. Ella ignora por completo los rumores, incluido el de una estudiante supuestamente imparable con el nombre de "Mimi", que se cree que es incluso más fuerte que los profesores y no forma parte de ningún curso. Mientras toma un descanso, se encuentra con una niña demasiado alegre cubierta de sangre, y conversan un rato antes de que la enfermera de la escuela se lleve a la niña. Shiina pensó que no se volverían a ver, pero al día siguiente, la niña se traslada a su clase y se presenta alegremente como Mimi. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 46 chapters |  |  |  |
| chapter dates | PASS | 46 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://platinumlilyscan.com/.../002.webp` (image/webp (encoding: lossy), 222732 bytes, 1114x1600) |  |  |  |
