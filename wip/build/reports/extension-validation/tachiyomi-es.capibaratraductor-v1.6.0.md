# Extension Validation Report

- Extension: tachiyomi-es.capibaratraductor-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3335229490349802396
- Source name: CapibaraTraductor
- Source language: es
- Selected manga input: popular offset 0: Blue Lock (`.../senshimanga`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Blue Lock (`.../senshimanga`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | Mi hermano se deslizó dentro de mí en el baño (`.../rakuen`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | Ano Saisekijou de Hanataba wo (`.../spiralscan`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | ¿Quién es la Presa? (`.../cazadorademangas`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Blue Lock (`.../elscansemanal`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Blue Lock (`.../senshimanga`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 369 | Capítulo 1 - Capítulo 1 (`.../senshimanga`) |  | <1s |
| pages | `getPageList(chapter)` | success | 78 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Blue Lock, URL=`blue-lock/senshimanga` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 146/146 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 146/146 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://r2.capibaratraductor.com/.../1785883886443_434176.webp` (image/webp (encoding: lossy), 157076 bytes, 832x1248) |  |  |  |
| details identity | PASS | Details preserved selected URL `blue-lock/senshimanga` |  |  |  |
| details thumbnail URL | PASS | `https://r2.capibaratraductor.com/.../1785883886443_434176.webp` |  |  |  |
| details author | PASS | Kaneshiro Muneyuki |  |  |  |
| details artist | PASS | SenshiManga |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yoichi Isagi perdió la oportunidad de ir a los campeonatos nacionales de secundaria porque pasó a su compañero de equipo que falló en lugar de dispararse a sí mismo. Isagi es uno de los 300 delanteros sub-18 elegidos por Jinpachi Ego, un hombre que fue contratado por la Asociación Japonesa de Fútbol después de la Copa Mundial de la FIFA 2018, para guiar a Japón a ganar la Copa del Mundo destruyendo el fútbol japonés. El plan de Ego es aislar a los 300 delanteros en una institución similar a una prisión llamada "Blue Lock", con el fin de crear el mayor "egoísta" / delantero del mundo, lo que ha faltado en el fútbol japonés. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 14 name, chapter 65 name, chapter 109 name, chapter 112 name, chapter 113 name, chapter 114 name |  |  |  |
| chapters | PASS | 369 chapters |  |  |  |
| chapter dates | PASS | 369 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 78 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://r2.capibaratraductor.com/.../1767580211216_36556.webp` (image/webp (encoding: lossy), 417256 bytes, 1244x1920) |  |  |  |
