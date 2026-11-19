# Extension Validation Report

- Extension: tachiyomi-pt.mangotoons-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 8989984812354857153
- Source name: Mango Toons
- Source language: pt-BR
- Selected manga input: popular offset 0: Pico Marcial (`.../12151`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Pico Marcial (`.../12151`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | O Antigo Soberano da Eternidade (`.../10797`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | A Tank Rank C Não Morre! (`.../11468`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | A Ascensão do Imperador da Espada de Namgung (`.../14110`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Pico Marcial (`.../12151`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Pico Marcial (`.../12151`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3862 | Capitulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Pico Marcial, URL=`.../12151` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=A Ascensão do Imperador da Espada de Namgung, URL=`.../14110` at page 1 offset 23 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangotoons.com/.../12151.webp` (image/png, 255825 bytes, 600x900; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12151` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.mangotoons.com/.../12151.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Fantasia, Aventura, Vilão |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A jornada para o topo das artes marcial é solitária e longa. Enfrentando várias adversidades, você deve sobreviver e permanecer inflexível. Somente então conseguirá romper as barreiras e continuar sua jornada para se tornar o mais forte. Pavilhão celestial testa seus discípulos da maneira mais severa para prepará-los para essa jornada. Um dia, o humilde varredor do pavilhão Yang Kai conseguiu obter um livro negro, colocando-o no caminho rumo ao topo das artes marciais. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3862 chapters |  |  |  |
| chapter dates | LINT | 3860 of 3862 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3860 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.mangotoons.com/.../0 <redacted query values: tst>` (image/webp (encoding: lossy), 53322 bytes, 735x550) |  |  |  |
