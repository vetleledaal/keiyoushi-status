# Extension Validation Report

- Extension: tachiyomi-es.kazokuden-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 475788948976592183
- Source name: Kazoku Den
- Source language: es
- Selected manga input: popular offset 0: Un harem en un apocalipsis zombie (`.../374`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | Un harem en un apocalipsis zombie (`.../374`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Aprovechando que no tengo clientes (`.../504`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | La Princesa de Sangre y el Caballero (`.../576`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | NTR Kaeshi (`.../620`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Un harem en un apocalipsis zombie (`.../374`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Un harem en un apocalipsis zombie (`.../374`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 68 | Capítulo 1.1 (`.../capitulo-1-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Un harem en un apocalipsis zombie, URL=`374` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.kazokuden.com/.../portada_manga-95-350x476.jpg` (image/jpeg, 49119 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `374` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.kazokuden.com/.../portada_manga-95.jpg` (image/jpeg, 396513 bytes, 600x900) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | accion, ecchi, harem |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | El mundo está al borde de la destrucción debido a la amenaza de los zombis. Actualmente estoy viviendo la vida más erótica de la historia. Un chico friki de instituto al que le encanta el shogi y los videojuegos descubre por primera vez que tiene un «cierto poder» tras entrar en el mundo zombi. ¿¡Salvar el mundo con sexo!? ¡¡Una divertida comedia de muertos vivientes!!<br><br>Nombres Alternativos: Zombie Sekai de Harem wo Tsukurou! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 68 chapters |  |  |  |
| chapter dates | LINT | All 68 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=68 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.kazokuden.com/.../0.webp` (image/webp (encoding: lossy), 599824 bytes, 3041x1011) |  |  |  |
