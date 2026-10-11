# Extension Validation Report

- Extension: tachiyomi-es.taurusfansub-v1.6.65
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 5157867187592331768
- Source name: Taurus Fansub
- Source language: es
- Selected manga input: latest offset 0: Reencarnación Del Ladrón que Dominará el Mundo (`.../reencarnacion-del-ladron-que-dominara-el-mundo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Después de dejar de actuar como un perro, me convertí en un Magnate Celestial Urbano (`.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Apotheosis – Elevation to the status of a god (`.../apotheosis-elevation-to-the-status-of-a-god`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Reencarnación Del Ladrón que Dominará el Mundo (`.../reencarnacion-del-ladron-que-dominara-el-mundo`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | El Mercenario Que Reencarno Entre Aristócratas (`.../el-mercenario-que-reencarno-entre-aristocratas`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Reencarnación Del Ladrón que Dominará el Mundo (`.../reencarnacion-del-ladron-que-dominara-el-mundo`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Reencarnación Del Ladrón que Dominará el Mundo (`.../reencarnacion-del-ladron-que-dominara-el-mundo`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 51 | Capitulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 185 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Reencarnación Del Ladrón que Dominará el Mundo, URL=`.../reencarnacion-del-ladron-que-dominara-el-mundo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://lectortaurus.com/.../IMG_20250826_150657.png` -> all 46 manga URLs (examples: `.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano`, `.../subiendo-de-nivel-10-000-anos-en-el-futuro`, `.../el-esposo-de-la-emperatriz-es-realmente-invencible`) |  |  |  |
| thumbnail | PASS | `https://lectortaurus.com/.../IMG_20250826_150657.png` (image/png, 7026 bytes, 90x100) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../reencarnacion-del-ladron-que-dominara-el-mundo` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://lectortaurus.com/.../1772078884583-scaled.jpg` (image/jpeg, 587802 bytes, 1930x2560) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Artes Marciales, Aventura, Cazador, Fantasía, Manhua, Puto-Amo, Reencarnación, Shounen, Sistema |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Un viajero solitario, siguiendo los pasos de las sombras: este es el himno de los ladrones. Con los recuerdos de un maestro ladrón de nivel 180, Nie Yan regresa a diez años del pasado. El destino le ha jugado una broma. Todo lo que una vez perdió, todo lo que le fue arrebatado, lo recuperará. Entonces, armado con equipo divino, aplastará todos los obstáculos, imparable y abrumador, aniquilando incluso a los dioses que se interpongan en su camino. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 51 chapters |  |  |  |
| chapter dates | PASS | 51 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 185 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lectortaurus.com/.../001_01.webp` (image/webp (encoding: lossy), 38848 bytes, 799x707) |  |  |  |
