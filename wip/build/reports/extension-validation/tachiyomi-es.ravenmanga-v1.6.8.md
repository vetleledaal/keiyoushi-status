# Extension Validation Report

- Extension: tachiyomi-es.ravenmanga-v1.6.8
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 698913079501532785
- Source name: RavenManga
- Source language: es
- Selected manga input: popular offset 0: Me voy a la academia con mi cuchillo de cocina (`.../me-voy-a-la-academia-con-mi-cuchillo-de-cocina`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 13 | Me voy a la academia con mi cuchillo de cocina (`.../me-voy-a-la-academia-con-mi-cuchillo-de-cocina`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Manual de rehabilitacion para damas caprichosas (`.../manual-de-rehabilitacion-para-damas-caprichosas`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Me voy a la academia con mi cuchillo de cocina (`.../me-voy-a-la-academia-con-mi-cuchillo-de-cocina`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Me voy a la academia con mi cuchillo de cocina (`.../me-voy-a-la-academia-con-mi-cuchillo-de-cocina`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 112 | Capítulo 0 (`.../00`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Me voy a la academia con mi cuchillo de cocina, URL=`.../me-voy-a-la-academia-con-mi-cuchillo-de-cocina` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 35/35 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 35/35 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.imgur.com/.../btoO8Uo.png` (image/png, 1973835 bytes, 1101x1428) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../me-voy-a-la-academia-con-mi-cuchillo-de-cocina` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../btoO8Uo.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Accion, Fantasia, Magia, Vida Escolar, Supervivencia |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Me hice cargo de la Academia con un solo sashimi cuchillo Resumen: «Si corto, será cortado». Yo, que una vez fui llamado el mejor espadachín de la nación, he caído en un juego de móvil en el que sólo he gastado un poco de dinero. Además, ¡he sido otorgado con la «Bendición del Dios de la Espada»...! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 112 chapters |  |  |  |
| chapter dates | PASS | 112 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://wsrv.nl <redacted query values: url>` (image/jpeg, 192839 bytes, 900x1400) |  |  |  |
