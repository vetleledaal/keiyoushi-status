# Extension Validation Report

- Extension: tachiyomi-es.templescanesp-v1.4.64
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 3451196845457607826
- Source name: Temple Scan
- Source language: es
- Selected manga input: popular offset 0: ¡Deja De Fumar! (`.../deja-de-fumar`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | ¡Deja De Fumar! (`.../deja-de-fumar`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Me Convertí En El Dios De Un Manhwa (`.../me-converti-en-el-dios-de-un-manhwa`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | De Tal Padre, Tal Hijo (`.../de-tal-padre-tal-hijo`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | Vendí las cartas de mi hermano (`.../vendi-las-cartas-de-mi-hermano`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | ¡Deja De Fumar! [Edición Especial] (`.../deja-de-fumar-edicion-especial`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | ¡Deja De Fumar! (`.../deja-de-fumar`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 113 |  (`.../n-a`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=¡Deja De Fumar!, URL=`.../deja-de-fumar` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 42/42 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://aedexnox.akan01.com/.../PT-Fumar.webp` (image/webp (container: extended), 165800 bytes, 720x1302) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../deja-de-fumar` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Un hombre, quien enfrenta dificultades debido a su apariencia juvenil, se ve superado por la situación cuando el humo del tabaco invade su hogar. Sin embargo, su vecina, una mujer con una personalidad única y enigmática, se convierte en un factor inesperado en su vida. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 113 chapters |  |  |  |
| chapter dates | PASS | 113 positive upload dates |  |  |  |
| chapter titles | LINT | One or more chapters have no title |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://catharsis.b-cdn.net/.../01.webp` (image/webp (encoding: lossy), 1489816 bytes, 760x10000) |  |  |  |
