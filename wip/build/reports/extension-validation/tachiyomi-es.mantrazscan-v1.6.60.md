# Extension Validation Report

- Extension: tachiyomi-es.mantrazscan-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7172992930543738693
- Source name: Mantraz Scan
- Source language: es
- Selected manga input: popular offset 0: An Innocent Sin (`.../an-innocent-sin`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | An Innocent Sin (`.../an-innocent-sin`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Art Books (`.../art-books`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | An Innocent Sin (`.../an-innocent-sin`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | An Innocent Sin (`.../an-innocent-sin`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 131 | Capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 34 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=An Innocent Sin, URL=`.../an-innocent-sin` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 31/31 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.mantrazscanss.lat/.../34de226c7bb97ea7e1444dc5f8772f-48526.jpg <redacted query values: w and f>` (image/webp (encoding: lossy), 10616 bytes, 200x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../an-innocent-sin` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://img.mantrazscanss.lat/.../34de226c7bb97ea7e1444dc5f8772f-48526.jpg <redacted query values: w and f>` (image/webp (encoding: lossy), 10616 bytes, 200x300) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Ecchi, Psychological, Romance |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Pensando que está sola en el último tren a casa, Nayeon siente la necesidad de divertirse fantaseando con sus deseos. Sin embargo, un reflejo de las ventanas del tren muestra que un hombre misterioso está en el mismo tren. Él se acerca a ella y le ofrece su tarjeta de presentación. Ante la idea de ver a este apuesto extraño una vez más, ella toma su oferta y llega a un lugar llamado Peach Puff. ¿Qué es este lugar? ¿Qué están haciendo estas personas? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 131 chapters |  |  |  |
| chapter dates | LINT | 6 of 131 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 34 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.mantrazscanss.lat/.../1.webp` (image/webp (encoding: lossy), 112028 bytes, 900x552) |  |  |  |
