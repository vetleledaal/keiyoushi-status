# Extension Validation Report

- Extension: tachiyomi-es.nexusscanlation-v1.6.6
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4086183896761281232
- Source name: NexusScanlation
- Source language: es
- Selected manga input: popular offset 0: Conquista hipnotica (`.../conquista-hipnotica`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Conquista hipnotica (`.../conquista-hipnotica`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Domando a mi Noona (`.../domando-a-mi-noona`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | La amistad chico-chica mas sin limites del mundo (`.../la-amistad-chico-chica-mas-sin-limites-del-mundo`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Conquista hipnotica (`.../conquista-hipnotica`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Conquista hipnotica (`.../conquista-hipnotica`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 119 | Capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Conquista hipnotica, URL=`conquista-hipnotica` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.nexusscanlation.com/.../portada.jpg` (image/jpeg, 48348 bytes, 460x606) |  |  |  |
| details identity | PASS | Details preserved selected URL `conquista-hipnotica` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.nexusscanlation.com/.../portada.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adulto, Comedia, Drama, Ecchi, Harem, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | El protagonista, Choi Kyung-won, lo pierde todo debido a una estafa de arrendamiento y va de un trabajo temporal a otro. Mientras trabaja como guardia de seguridad, encuentra un teléfono hipnótico con poderes misteriosos en un almacén. Con este dispositivo, comienza a someter a las mujeres que están en la cima de la cadena alimenticia, una por una. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 119 chapters |  |  |  |
| chapter dates | PASS | 119 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.nexusscanlation.com/.../001.jpg` (image/webp (container: extended), 482930 bytes, 700x7351; server Content-Type: image/jpeg) |  |  |  |
