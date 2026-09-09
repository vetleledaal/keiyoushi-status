# Extension Validation Report

- Extension: tachiyomi-it.hentaiarchive-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6052929656772429531
- Source name: HentaiArchive
- Source language: it
- Selected manga input: popular offset 0: L’allevamento delle scrofe (`.../lallevamento-delle-scrofe`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 9 | L’allevamento delle scrofe (`.../lallevamento-delle-scrofe`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 9 | Non dirlo a mio marito 2 (`.../non-dirlo-a-mio-marito-2`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | L’allevamento delle scrofe (`.../lallevamento-delle-scrofe`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | L’allevamento delle scrofe (`.../lallevamento-delle-scrofe`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../lallevamento-delle-scrofe`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 22 |  |  | 1-10s |

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
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=L’allevamento delle scrofe, URL=`.../lallevamento-delle-scrofe` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 19/19 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 19/19 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.hentai-archive.com/.../Lallevamento_delle_scrofe_1-722x1024.webp` (image/webp (encoding: lossy), 116046 bytes, 722x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lallevamento-delle-scrofe` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ahegao  recenti,  culi grossi,  formose,  ita harem,  recenti,  milf,  tette grosse,  x ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | LINT | Untrimmed fields: genre |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://picsarchive1.b-cdn.net/.../Lallevamento_delle_scrofe_1.webp` (image/webp (encoding: lossy), 269288 bytes, 1280x1816) |  |  |  |
