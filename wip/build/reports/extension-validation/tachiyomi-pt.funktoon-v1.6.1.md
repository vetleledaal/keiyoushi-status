# Extension Validation Report

- Extension: tachiyomi-pt.funktoon-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 104093783822687912
- Source name: Funktoon
- Source language: pt-BR
- Selected manga input: popular offset 0: Sangue & Sal (`.../sangueesal`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Sangue & Sal (`.../sangueesal`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Manotiras (`.../manotiras`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sangue & Sal (`.../sangueesal`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sangue & Sal (`.../sangueesal`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 14 | Ep. 1 · Não foi um dos nossos, certo? (`.../17939`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sangue & Sal, URL=`.../sangueesal` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dhhgzt25lyi38.cloudfront.net/.../cover.jpg <redacted query values: time>` (image/jpeg, 108696 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sangueesal` |  |  |  |
| details thumbnail URL | PASS | `https://dhhgzt25lyi38.cloudfront.net/.../cover.jpg <redacted query values: time>` |  |  |  |
| details author | PASS | Mary Cagnin |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Crime e mistério, Revanche Originária, LGBTQI+ |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Entre saques, tempestades e confusões que quase sempre terminam em desastre, um capitão pirata começa a se envolver com alguém tão fascinante quanto… perigoso. Uma história de piratas sobre escolhas ruins, consequências piores, e sentimentos que talvez devessem ter ficado no fundo do mar. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | PASS | 14 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
