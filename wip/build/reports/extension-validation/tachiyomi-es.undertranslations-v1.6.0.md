# Extension Validation Report

- Extension: tachiyomi-es.undertranslations-v1.6.0
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
- Source theme: mangathemesia
- Source ID: 6130972683394103021
- Source name: UnderTranslations
- Source language: es
- Selected manga input: popular offset 0: El Duque Villano Condenado por su Hija, la ‘Dama de Hielo’ (`.../el-duque-villano-condenado-por-su-hija-la-dama-de-hielo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | El Duque Villano Condenado por su Hija, la ‘Dama de Hielo’ (`.../el-duque-villano-condenado-por-su-hija-la-dama-de-hielo`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | El Más Fuerte De La Academia Sobrenatural Se Oculta En La Tranquilidad ~ (`.../el-mas-fuerte-de-la-academia-sobrenatural-se-oculta-en-la-tranquilidad`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | El Deseo Del Tercer Hijo De Una Familia De Caballeros (`.../el-deseo-del-tercer-hijo-de-una-familia-de-caballeros`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | El Conocimiento de mi Madrastra (`.../el-conocimiento-de-mi-madrastra`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | El Duque Villano Condenado por su Hija, la ‘Dama de Hielo’ (`.../el-duque-villano-condenado-por-su-hija-la-dama-de-hielo`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | El Duque Villano Condenado por su Hija, la ‘Dama de Hielo’ (`.../el-duque-villano-condenado-por-su-hija-la-dama-de-hielo`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | Capítulo 1 (`.../duque-villano-capitulo-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 39 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El Duque Villano Condenado por su Hija, la ‘Dama de Hielo’, URL=`.../el-duque-villano-condenado-por-su-hija-la-dama-de-hielo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://undertranslations.com/.../00-3.jpg` (image/jpeg, 613689 bytes, 1440x2048) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../el-duque-villano-condenado-por-su-hija-la-dama-de-hielo` |  |  |  |
| details thumbnail URL | PASS | `https://undertranslations.com/.../00-3.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Asagaya |  |  |  |
| details genres | PASS | Accion, Drama, Magia, Monstruos, Reencarnación |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | MarkStuart se dio cuenta de que había reencarnado como un jefe intermedio en un videojuego, en el juego, le esperaba el trágico destino de ser condenado por su propia hija, Folcina, quien es conocida por todos como la “Dama de Hielo”. Al reflexionar sobre su pasado y recordar lo frío que solía ser con ella, Mark decide ganar «puntos de afecto» para cambiar su trágico futuro. Gracias a su amable consideración y a su rol activo como Duque, su hija recupera el amor y la confianza en su padre… ¡¿Pero se le pasó la mano y el amor de ella se volvió gradualmente demasiado pesado y obsesivo?! ¡El Duque Villano se enfrentará a la ruina del mundo entero mientras sigue acumulando los puntos de afecto de su hija! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://undertranslations.com/.../0000000.webp` (image/webp (container: extended), 314580 bytes, 2500x1406) |  |  |  |
