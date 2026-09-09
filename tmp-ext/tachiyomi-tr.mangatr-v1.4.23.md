# Extension Validation Report

- Extension: tachiyomi-tr.mangatr-v1.4.23
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 19
- Lint: 5
- Warnings: 0
- Skipped: 10
- Failed: 3
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4990678311970770946
- Source name: Manga-TR
- Source language: tr
- Selected manga input: latest offset 0: Dragnarok (`.../manga-dragnarok.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 19 | Vagabond (`.../manga-vagabond.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Sousou no Frieren (`.../manga-sousou-no-frieren.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 14 | Dragnarok (`.../manga-dragnarok.html`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | Skip Beat (`.../manga-skip-beat.html`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Dragnarok (`.../manga-dragnarok.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | error | 0 |  | java.io.EOFException | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.io.EOFException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Invalid manga: popular entry 12: title=<blank>, URL=`.../manga-.html` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | PASS | 71/71 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image.mangatr.site/.../3ae7986abc8b61bb287a1c62fed3adbc.webp` (image/webp (encoding: lossy), 23238 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manga-dragnarok.html` |  |  |  |
| details thumbnail URL | PASS | `https://image.mangatr.site/.../3ae7986abc8b61bb287a1c62fed3adbc.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
