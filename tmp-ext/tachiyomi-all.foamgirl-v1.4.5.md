# Extension Validation Report

- Extension: tachiyomi-all.foamgirl-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5874068195320206396
- Source name: FoamGirl
- Source language: all
- Selected manga input: popular offset 0: Pimpa – The Black Alley Photobook Set.02 (`.../1839041.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Pimpa – The Black Alley Photobook Set.02 (`.../1839041.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Pureding 퓨딩 – Sexy Photobook Vol.14 (`.../1839021.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Pimpa – The Black Alley Photobook Set.02 (`.../1839041.html`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | GALLERY (`.../1839041.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 90 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 40/40 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 40/40 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.foamgirl.net/.../38860020400501.webp!320x440` (image/webp (encoding: lossy), 53676 bytes, 320x440) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1839041.html` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.foamgirl.net/.../38860020400501.webp!320x440` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 90 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.foamgirl.net/.../38860020400502.webp` (image/webp (encoding: lossy), 278986 bytes, 1000x1500; server Content-Type: application/octet-stream) |  |  |  |
