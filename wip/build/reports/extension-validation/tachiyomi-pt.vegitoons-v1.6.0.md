# Extension Validation Report

- Extension: tachiyomi-pt.vegitoons-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: greenshit
- Source ID: 7104462396017692362
- Source name: Vegitoons
- Source language: pt-BR
- Selected manga input: popular offset 0: Pico Marcial (`.../15472`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 26 | Pico Marcial (`.../15472`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 26 | O Novato de Nível Máximo (`.../194`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 26 | Um Pintor Que Desenha Dungeons (`.../15687`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 26 | Imperador Demoníaco (`.../1150`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Pico Marcial (`.../15472`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Pico Marcial (`.../15472`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3862 | Capítulo 1 (`.../415961`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| popular listing | PASS | 26 entries |  |  |  |
| latest listing | PASS | 26 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Pico Marcial, URL=`.../15472` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 105/105 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 105/105 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.vegitoons.black/.../capa` (image/webp (encoding: lossy), 57904 bytes, 720x1012) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../15472` |  |  |  |
| details thumbnail URL | PASS | `https://api.vegitoons.black/.../capa` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Livres, Ação, Aventura, Artes Marciais, Ecchi, Família, Hárem |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A jornada para o topo das artes marcial é solitária e longa. Enfrentando várias adversidades, você deve sobreviver e permanecer inflexível. Somente então conseguirá romper as barreiras e continuar sua jornada para se tornar o mais forte. Pavilhão celestial testa seus discípulos da maneira mais severa para prepará-los para essa jornada. Um dia, o humilde varredor do pavilhão Yang Kai conseguiu obter um livro negro, colocando-o no caminho rumo ao topo das artes marciais. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3862 chapters |  |  |  |
| chapter dates | PASS | 3862 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://api.vegitoons.black/.../capa` to `https://api.vegitoons.black/.../capa <redacted query values: tst>` (1 redirects) |  |  |  |
| page load | PASS | `https://api.vegitoons.black/.../0 <redacted query values: tst>` (image/webp (encoding: lossy), 144774 bytes, 735x1589; server Content-Type: image/jpeg) |  |  |  |
