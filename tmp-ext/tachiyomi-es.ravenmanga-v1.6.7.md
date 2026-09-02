# Extension Validation Report

- Extension: tachiyomi-es.ravenmanga-v1.6.7
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 698913079501532785
- Source name: RavenManga
- Source language: es
- Selected manga input: popular offset 0: PLAYER (`.../player`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | PLAYER (`.../player`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Han pasado 30 años desde el prólogo (`.../han-pasado-30-anos-desde-el-prologo`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | PLAYER (`.../player`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | PLAYER (`.../player`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 273 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 108 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=PLAYER, URL=`.../player` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.imgur.com/.../pTyZYRa.gif` (image/gif (format: 89a), 3988723 bytes, 180x282) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../player` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../pTyZYRa.gif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Accion, Aventura, Comedia, Fantasia, Magia, Artes Marciales, Mecha, Reencarnación, Supernatural, Superpoderes, Supervivencia |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Al publicar un «Mejor comentario», ¡de alguna manera me convertí en el personaje principal de un webtoon! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 273 chapters |  |  |  |
| chapter dates | PASS | 273 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../12` at offsets 260, 261 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 108 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://wsrv.nl <redacted query values: url>` (image/jpeg, 151853 bytes, 800x3355) |  |  |  |
