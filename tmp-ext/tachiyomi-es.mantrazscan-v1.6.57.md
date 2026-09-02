# Extension Validation Report

- Extension: tachiyomi-es.mantrazscan-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 3
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7172992930543738693
- Source name: Mantraz Scan
- Source language: es
- Selected manga input: popular offset 0: Restaurante Del Más Allá (`.../restaurante-del-mas-alla`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | Restaurante Del Más Allá (`.../restaurante-del-mas-alla`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Espada del viento (`.../espada-del-viento`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | Restaurante Del Más Allá (`.../restaurante-del-mas-alla`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Espada del viento (`.../espada-del-viento`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Restaurante Del Más Allá (`.../restaurante-del-mas-alla`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Restaurante Del Más Allá (`.../restaurante-del-mas-alla`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 120 | Capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 42 |  |  | 1-10s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Restaurante Del Más Allá, URL=`.../restaurante-del-mas-alla` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.mantrazscan.co/.../vJ743-420x620-14142.jpg` (image/jpeg, 84893 bytes, 420x620) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../restaurante-del-mas-alla` |  |  |  |
| details thumbnail URL | PASS | `https://img.mantrazscan.co/.../vJ743-420x620-14142.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comida, Drama, Fantansía, Slice of Life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | ¿Me dieron un edificio como herencia? De ser un don nadie que hacía todo tipo de trabajos ocasionales y llevaba una vida dura, ¡le dieron la oportunidad de convertirse en propietario en pleno Gangnam! Pero la condición para recibir la herencia es «administrar un restaurante durante 5 años». «Además, siento un escalofrío por culpa de los clientes extraños que vinieron hoy a la inauguración… ¿De verdad solo tengo que preparar comida?». «Entonces… todos los clientes que vinieron ayer…» «Eran fantasmas». ¡A partir de ahora, abriremos todas las noches de 11:00 a 13:00! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 120 chapters |  |  |  |
| chapter dates | LINT | All 120 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=120 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.mantrazscan.co/.../1.webp` (image/webp (encoding: lossy), 79670 bytes, 1024x1536) |  |  |  |
