# Extension Validation Report

- Extension: tachiyomi-ar.murim-v1.6.21
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 26
- Lint: 2
- Warnings: 0
- Skipped: 8
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 4966914277555229831
- Source name: Murim
- Source language: ar
- Selected manga input: popular offset 0: الموريم (`.../blog-post.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | الموريم (`.../blog-post.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Legend of Star General (`.../legend-of-star-general.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | الموريم (`.../blog-post.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | الموريم (`.../blog-post.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | الفصل 1  (`.../1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=الموريم, URL=`.../blog-post.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 43/43 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 43/43 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../AVvXsEgQhyy-kv4KHTurLiRaAuoiYI_U1fqRq1eg6NA8_XK-csj679rf-ItHUbDwOghl5k4S4Iw5iBguHEzgRQrrqH1TPwpMRW36n_EzyGI2EWIBbmccUtVmuqqg5utdtjOEOMsEcnXWhMjqnW7AGGgUGpeqRpBPapMi3thivuRWPjXl4bbO7YsCXVXgGLNe8ts=w600` (image/png, 273850 bytes, 600x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../blog-post.html` |  |  |  |
| details thumbnail URL | PASS | `https://blogger.googleusercontent.com/.../AVvXsEgQhyy-kv4KHTurLiRaAuoiYI_U1fqRq1eg6NA8_XK-csj679rf-ItHUbDwOghl5k4S4Iw5iBguHEzgRQrrqH1TPwpMRW36n_EzyGI2EWIBbmccUtVmuqqg5utdtjOEOMsEcnXWhMjqnW7AGGgUGpeqRpBPapMi3thivuRWPjXl4bbO7YsCXVXgGLNe8ts=w600` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | شونين |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | تجارب لتحسين الموقع |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 2 name |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
