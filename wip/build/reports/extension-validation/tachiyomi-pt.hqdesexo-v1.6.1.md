# Extension Validation Report

- Extension: tachiyomi-pt.hqdesexo-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 856181348034023716
- Source name: HQ de Sexo
- Source language: pt-BR
- Selected manga input: popular offset 0: A Madrasta com fogo no rabo (`.../a-madrasta-com-fogo-no-rabo.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | A Madrasta com fogo no rabo (`.../a-madrasta-com-fogo-no-rabo.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 27 | Obsessive (`.../obsessive.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 27 | Pegando no flagra (`.../pegando-no-flagra-mae-joana.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 18 | A Madrasta com fogo no rabo (`.../a-madrasta-com-fogo-no-rabo.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Madrasta com fogo no rabo (`.../a-madrasta-com-fogo-no-rabo.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo Único (`.../a-madrasta-com-fogo-no-rabo.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 27 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Madrasta com fogo no rabo, URL=`.../a-madrasta-com-fogo-no-rabo.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.hqdesexo.com/.../a-madrasta-com-fogo-no-rabo_139033cd93d07492d7c37aac6ec7e53a.jpg` (image/jpeg, 23998 bytes, 237x289) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-madrasta-com-fogo-no-rabo.html` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Histórias em Quadrinhos, madrasta, mãe, família, gostosa, sexy |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Ashley é uma mãe de família comum, cuida da casa e ainda trabalha fora. Tem sua rotina normal, e ainda tem o enteado para cuidar. Certo dia, o rapaz chega em casa e flagra a madrasta dançando uma música peculiar, quando ele percebe que tal música excita a gostosa e o cara de 18 anos parte pra cima com força. E a mulher com uma roupa sexy não consegue evitar que o rapaz a foda bastante. Eis o segredo, uma canção específica que mexe bastante com a safada. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static.hqdesexo.com/.../a-madrasta-com-fogo-no-rabo_bbad5fe59307a2acce1e5247f33a2233.jpg` (image/jpeg, 347104 bytes, 926x1300) |  |  |  |
