# Extension Validation Report

- Extension: tachiyomi-es.lectormangalat-v1.6.0
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
- Source ID: 7178038133263703638
- Source name: LectorManga.lat
- Source language: es
- Selected manga input: popular offset 0: Bestias que cruzan la línea (`.../185`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Bestias que cruzan la línea (`.../185`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | En Está Vida Seré La Matriarca (`.../1`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Besame si puedes (`.../2`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Renacido como un duque cruel que invoca demonios (`.../19976`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Bestias que cruzan la línea (`.../185`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Bestias que cruzan la línea (`.../185`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 48 | Capítulo 1 (`.../13974`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bestias que cruzan la línea, URL=`185` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.zerocomics.net/.../01KTDXT19NPQK08W8ZEYMXT5VK.webp` (image/webp (encoding: lossy), 54090 bytes, 600x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `185` |  |  |  |
| details thumbnail URL | PASS | `https://api.zerocomics.net/.../01KTDXT19NPQK08W8ZEYMXT5VK.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comics, +18, Drama, Smut, Josei, Adulto, Maduro, Ecchi, Harem |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | La vida de tres mujeres se ve sacudida cuando lo cotidiano se transforma en un enigma lleno de sensualidad y peligro. Una noche aparentemente normal, se presenta una serie de hombres intrigantes que desafían su realidad: un amigo olvidado que regresa del pasado, un jefe imponente que no reconoce límites, y un extraño que guarda un secreto capaz de cambiarlo todo. Con el aviso de que el peligro acecha, se ven obligadas a enfrentar sus propios deseos y miedos. Al cruzar la línea entre lo normal y lo extraordinario, sus vidas nunca volverán a ser las mismas. La aventura las llevará a redescubrirse en un mundo lleno de pasiones y conflictos.<br><br>Grupo: Cat scan |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 48 chapters |  |  |  |
| chapter dates | PASS | 48 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.ikigaicomics.lat/.../page_001.webp` (image/webp (encoding: lossy), 165668 bytes, 800x5000) |  |  |  |
