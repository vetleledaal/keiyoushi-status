# Extension Validation Report

- Extension: tachiyomi-es.tmohentaiunoriginal-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6465093267346907024
- Source name: TMOHentai (unoriginal)
- Source language: es
- Selected manga input: popular offset 0: Ano Hito O Oikakete - Persiguiéndolo ~ (Anarchy Girl!!!) ~ (`.../ano-hito-o-oikakete-persiguiendolo-anarchy-girl`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Ano Hito O Oikakete - Persiguiéndolo ~ (Anarchy Girl!!!) ~ (`.../ano-hito-o-oikakete-persiguiendolo-anarchy-girl`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Boku no harem 6 (`.../boku-no-academy-6`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Ano Hito O Oikakete - Persiguiéndolo ~ (Anarchy Girl!!!) ~ (`.../ano-hito-o-oikakete-persiguiendolo-anarchy-girl`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Boku no harem 6 (`.../boku-no-academy-6`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ano Hito O Oikakete - Persiguiéndolo ~ (Anarchy Girl!!!) ~ (`.../ano-hito-o-oikakete-persiguiendolo-anarchy-girl`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ano Hito O Oikakete - Persiguiéndolo ~ (Anarchy Girl!!!) ~ (`.../ano-hito-o-oikakete-persiguiendolo-anarchy-girl`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo único (`.../20304`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ano Hito O Oikakete - Persiguiéndolo ~ (Anarchy Girl!!!) ~, URL=`.../ano-hito-o-oikakete-persiguiendolo-anarchy-girl` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.tmohentai.app/.../1.webp` (image/webp (encoding: lossy), 656320 bytes, 2008x2880) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ano-hito-o-oikakete-persiguiendolo-anarchy-girl` |  |  |  |
| details thumbnail URL | PASS | `https://storage.tmohentai.app/.../1.webp` |  |  |  |
| details author | PASS | Dam |  |  |  |
| details artist | PASS | Dam |  |  |  |
| details genres | PASS | Rape, Double Penetration, Big Breast, defloration, big penis |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | No hay descripción disponible para esta obra. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage.tmohentai.app/.../1.webp` (image/webp (encoding: lossy), 656320 bytes, 2008x2880) |  |  |  |
