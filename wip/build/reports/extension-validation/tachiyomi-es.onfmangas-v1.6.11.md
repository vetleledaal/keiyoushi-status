# Extension Validation Report

- Extension: tachiyomi-es.onfmangas-v1.6.11
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 24
- Lint: 0
- Warnings: 1
- Skipped: 11
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 438553037668091848
- Source name: ONF MANGAS
- Source language: es
- Selected manga input: popular offset 0: ¡Deja de fumar! (`.../deja-de-fumar`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 33 | ¡Deja de fumar! (`.../deja-de-fumar`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | El Maníaco Obsesivo Está Tratando De Confinarme (`.../el-maniaco-obsesivo-esta-tratando-de-confinarme`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | El regresor lo hace todo (`.../el-regresor-lo-hace-todo`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | ¡Deja De Fumar! (Sin Censura) (`.../deja-de-fumar-sin-censura`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ¡Deja de fumar! (`.../deja-de-fumar`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 33 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=¡Deja de fumar!, URL=`.../deja-de-fumar` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://d33y4i2dmzjqjh.cloudfront.net/.../c64185e8a4f94ce0495ba7e2fa5459eb.webp` (image/webp (encoding: lossy), 15292 bytes, 270x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../deja-de-fumar` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://d33y4i2dmzjqjh.cloudfront.net/.../f98ad6409c9bbec3f4292c146a0050e1.webp` (image/webp (encoding: lossy), 15292 bytes, 270x400) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedia, Drama, Romance, Recuentos de la vida, Harem, Tira larga, A todo color |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Aunque me tomen el pelo por ser bajito o revolcarme en el trabajo, ¡¡¡Mi casa es el paraíso!!! ...Yo pensaba que lo era, ¡¡Pero en la puerta de al lado fuman como locos!! Na Se-young, una mujer gángster de mirada dura, ¡Se enfrentó a ella después de no poder soportarlo! |  |  |  |
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
