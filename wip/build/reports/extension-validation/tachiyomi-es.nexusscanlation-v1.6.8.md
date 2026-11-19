# Extension Validation Report

- Extension: tachiyomi-es.nexusscanlation-v1.6.8
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Selected manga input: latest offset 0: El Heroe es la Secretaria (`.../el-heroe-es-la-secretaria`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Conquista hipnotica (`.../conquista-hipnotica`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | La amistad chico-chica mas sin limites del mundo (`.../la-amistad-chico-chica-mas-sin-limites-del-mundo`) |  | 10s+ |
| latest | `getLatestUpdates(1)` | success | 20 | El Heroe es la Secretaria (`.../el-heroe-es-la-secretaria`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | El Heroe es la Secretaria (`.../el-heroe-es-la-secretaria`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | El Heroe es la Secretaria (`.../el-heroe-es-la-secretaria`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 21 | Capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 33 |  |  | 10s+ |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El Heroe es la Secretaria, URL=`el-heroe-es-la-secretaria` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.nexusscanlation.com/.../portada.jpg` (image/jpeg, 62876 bytes, 438x650) |  |  |  |
| details identity | PASS | Details preserved selected URL `el-heroe-es-la-secretaria` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.nexusscanlation.com/.../portada.jpg` |  |  |  |
| details author | PASS | 목손 |  |  |  |
| details artist | PASS | goofy |  |  |  |
| details genres | PASS | Adulto, Comedia, Demonios, Drama, Ecchi, Fantasía, Harem, Romance, Seinen, Villana |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | El héroe que salvó a Corea de la invasión demoníaca hoy en día se desvive tratando de conseguir empleo aunque sea en una pequeña empresa. Un día acude a una entrevista en una compañía misteriosa... ¡donde resulta que el Rey Demonio al que derrotó en el pasado reina como el presidente! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 21 chapters |  |  |  |
| chapter dates | PASS | 21 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.nexusscanlation.com/.../001.jpg` (image/png, 4219016 bytes, 720x7216; server Content-Type: image/jpeg) |  |  |  |
