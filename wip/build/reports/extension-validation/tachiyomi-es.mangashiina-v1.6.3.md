# Extension Validation Report

- Extension: tachiyomi-es.mangashiina-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 23
- Lint: 0
- Warnings: 0
- Skipped: 13
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 711368877221654433
- Source name: Manga Mukai
- Source language: es
- Selected manga input: latest offset 0: La señora y el mozo de cuadra (`.../59181`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 550 | La legendaria asesina acabó reencarnándose en la querida hija menor de la familia real (`.../29522`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 550 | La señora y el mozo de cuadra (`.../59181`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | La señora y el mozo de cuadra (`.../59181`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | La señora y el mozo de cuadra (`.../59181`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 550 entries |  |  |  |
| latest listing | PASS | 550 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La señora y el mozo de cuadra, URL=`59181` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 1101/1101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1101/1101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangamukai.com/.../MOZO11.webp` (image/webp (encoding: lossy), 352160 bytes, 800x1159) |  |  |  |
| details identity | PASS | Details preserved selected URL `59181` |  |  |  |
| details thumbnail URL | PASS | `https://mangamukai.com/.../MOZO11.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Vendida para saldar las deudas de su tío, Edith se ve arrastrada a la traicionera finca de Portrion como la cuarta esposa del vizconde en coma. Ahora a merced de la codiciosa primera esposa, Edith recibe un ultimátum despiadado: concebir un heredero en un mes, con cualquier hombre y por cualquier medio. Para sobrevivir y escapar de la letal finca, Edith hace un pacto con Walter, un enigmático mozo de cuadra tan atado como ella. Sin embargo, mientras ambos fingen un romance en busca de su libertad, terminan por cruzar la delgada línea entre la pasión fingida y los verdaderos sentimientos… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
