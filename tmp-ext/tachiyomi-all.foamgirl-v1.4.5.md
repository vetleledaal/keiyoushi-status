# Extension Validation Report

- Extension: tachiyomi-all.foamgirl-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 30
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
- Selected manga input: popular offset 0: Hayun 하윤 – Bimilstory Vol.30 「Hong Kong Mood」 (`.../1839124.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Hayun 하윤 – Bimilstory Vol.30 「Hong Kong Mood」 (`.../1839124.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Miu Shirahama 白濱美兎 – 漫画アクションデジタル写真集 「君と僕の夏合宿」 (`.../1839104.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Hayun 하윤 – Bimilstory Vol.30 「Hong Kong Mood」 (`.../1839124.html`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | GALLERY (`.../1839124.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 120 |  |  | 1-10s |

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
| thumbnail | PASS | `https://cdn.foamgirl.net/.../39141081905532.webp!320x440` (image/webp (encoding: lossy), 37246 bytes, 320x440) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1839124.html` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.foamgirl.net/.../39141081905532.webp!320x440` |  |  |  |
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
| page URLs | PASS | 120 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.foamgirl.net/.../39141081905532.webp` (image/webp (encoding: lossy), 100868 bytes, 1125x1500; server Content-Type: application/octet-stream) |  |  |  |
