# Extension Validation Report

- Extension: tachiyomi-es.elvosque-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6840774852905014341
- Source name: El Vosque
- Source language: es
- Selected manga input: popular offset 0: El asesino de árboles (`.../vosque`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | El asesino de árboles (`.../vosque`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | El asesino de árboles (`.../vosque`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | El asesino de árboles (`.../vosque`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 382 | El asesino de Árboles (`.../el-asesino-de-%C3%81rboles`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El asesino de árboles, URL=`.../vosque` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 15/15 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 15/15 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://elvosque.es/.../portada_vosque.png` (image/png, 919043 bytes, 800x1202) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../vosque` |  |  |  |
| details thumbnail URL | PASS | `https://elvosque.es/.../portada_vosque.png` |  |  |  |
| details author | PASS | Morán |  |  |  |
| details artist | PASS | Laurielle |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | El Vosque es un reino pequeño lleno de humanos, hadas, elfos y demasiados árboles. Un reino protegido por una diosa que lleva años muerta. Un reino gobernado por varios reyes. Y acaban de asesinar a uno: el rey de los árboles ha caído.<br><br>¿Podrán un hada borracha y un alquimista pirómano descubrir qué hay detrás de este crimen? ¿Oculta algo la testigo del hacha? ¿Afectará a la fiesta de palacio?<br><br>¿Ese árbol se ha movido? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 382 chapters |  |  |  |
| chapter dates | PASS | 382 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://elvosque.es/.../20090410-c1.jpg` (image/jpeg, 149362 bytes, 800x1171) |  |  |  |
