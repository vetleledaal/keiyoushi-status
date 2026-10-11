# Extension Validation Report

- Extension: tachiyomi-es.traduccionesmoonlight-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 26
- Lint: 3
- Warnings: 0
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: moonlighttl
- Source ID: 4349338377187141550
- Source name: Traducciones Moonlight
- Source language: es
- Selected manga input: popular offset 0: LOS CAMPOS OLVIDADOS (NOVELA) (`.../los-campos-olvidados-novela`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 11 | LOS CAMPOS OLVIDADOS (NOVELA) (`.../los-campos-olvidados-novela`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | APAREAMIENTO DE ELFOS (`.../apareamiento-de-elfos`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | LOS CAMPOS OLVIDADOS (NOVELA) (`.../los-campos-olvidados-novela`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | LOS CAMPOS OLVIDADOS (NOVELA) (`.../los-campos-olvidados-novela`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 301 | Capítulo 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 11 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=LOS CAMPOS OLVIDADOS (NOVELA), URL=`.../los-campos-olvidados-novela` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 24/24 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 24/24 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.traduccionesmoonlight.com/.../9ea4d639-31f7-4468-9f2c-c6ade94fb01c.png` (image/png, 5924097 bytes, 1664x2540) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../los-campos-olvidados-novela` |  |  |  |
| details thumbnail URL | PASS | `https://media.traduccionesmoonlight.com/.../9ea4d639-31f7-4468-9f2c-c6ade94fb01c.png` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Adulto, Drama, Fantasia, Romance |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | “Todos los días rezo.”<br><br>Que este amor morirá.<br><br>Que pueda amarte solo hasta hoy,<br><br>Y mañana, este amor ya no existirá.<br><br>Nacida de una relación ilícita, la desafortunada princesa imperial Talia Roem Gwirta crece deformada en un mundo que la rechaza.<br><br>Con padres indiferentes, hermanastros hostiles y sirvientes que la tratan con desprecio, sobrevive mostrando sus espinas a cualquiera que se atreva a acercarse.<br><br>Sin embargo, ante un solo hombre, incluso las defensas de Talia se derrumban.<br><br>Ese hombre es Varkas Laedgo Siorcan, el noble heredero del Este.<br><br>Como vasallo de la Casa Imperial y sucesor de una línea gran ducal, fue forzado a la perfección desde su nacimiento. Criado bajo una disciplina que rozaba el abuso, sus emociones se embotaron, convirtiéndolo en un hombre que existía únicamente para el honor y el deber familiar.<br><br>Para cumplir una promesa hecha a la difunta emperatriz, se compromete con Aila, la hermanastra mayor de Talia.<br><br>Destrozada por la desesperación, Talia se desmorona lentamente.<br><br>Pero entonces...<br><br>Su amor, destinado únicamente a la muerte, comienza a enfrentarse a un giro inesperado… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 301 chapters |  |  |  |
| chapter dates | PASS | 301 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
