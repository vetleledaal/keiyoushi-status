# Extension Validation Report

- Extension: tachiyomi-es.bloomscans-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 2598725055968738551
- Source name: Bloom Scans
- Source language: es
- Selected manga input: popular offset 0: Matrimonio por venganza (`.../matrimonio-por-venganza`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Matrimonio por venganza (`.../matrimonio-por-venganza`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | La muñeca de los recuerdos (Novela) (`.../la-muneca-de-los-recuerdos`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Matrimonio por venganza (`.../matrimonio-por-venganza`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 10 | La muñeca de los recuerdos (Novela) (`.../la-muneca-de-los-recuerdos`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Matrimonio por venganza (`.../matrimonio-por-venganza`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Matrimonio por venganza (`.../matrimonio-por-venganza`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | Chapter 01 (`.../matrimonio-por-venganza-capitulo-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Matrimonio por venganza, URL=`.../matrimonio-por-venganza` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://bloomscans.com/.../noimg165px.png` -> 2 manga URLs (examples: `.../su-majestad-es-mi-jefe-ideal`, `.../jardin-de-mayo`) |  |  |  |
| thumbnail | PASS | `https://bloomscans.com/.../cover_bloom_matrimonio_por_venganza.webp` (image/webp (encoding: lossy), 167832 bytes, 1024x1536) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../matrimonio-por-venganza` |  |  |  |
| details thumbnail URL | PASS | `https://bloomscans.com/.../cover_bloom_matrimonio_por_venganza.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | +15, Drama, Fantasía, Histórico, Reencarnación, Romance, Transmigración |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Olivia, emperatriz del Imperio del Ródano, muere víctima de las intrigas de su esposo, el emperador, y despierta en el cuerpo de una mujer anónima en los barrios marginales. Su siguiente destino es la residencia de su ex prometido, el duque Lucas, de quien se había separado: el «verdadero» heredero al trono, despojado de su posición tras un golpe de Estado. Mientras oculta su verdadera identidad, Olivia le propone a Lucas una alianza matrimonial para que ambos puedan consumar su venganza. ¿Lograrán los dos llevar a cabo su plan de revancha? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://bloomscans.com/.../dfa8ed2a848b5a1ffcf78f4d.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
