# Extension Validation Report

- Extension: tachiyomi-en.xyzcomics-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 3
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 923206914242009120
- Source name: XYZ Comics
- Source language: en
- Selected manga input: popular offset 0: Tridevi by Silk Route Ira Raman (`.../tridevi-by-silk-route-ira-raman`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Tridevi by Silk Route Ira Raman (`.../tridevi-by-silk-route-ira-raman`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Bet Your Crack – Slutty Family by Tharnoren (`.../bet-your-crack-slutty-family-by-tharnoren`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tridevi by Silk Route Ira Raman (`.../tridevi-by-silk-route-ira-raman`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tridevi by Silk Route Ira Raman (`.../tridevi-by-silk-route-ira-raman`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../tridevi-by-silk-route-ira-raman`) |  | <1s |
| pages | `getPageList(chapter)` | success | 46 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tridevi by Silk Route Ira Raman, URL=`.../tridevi-by-silk-route-ira-raman` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://xyzcomics.com/.../037-354-392x600-q72.webp` (image/webp (encoding: lossy), 326634 bytes, 1499x1949) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tridevi-by-silk-route-ira-raman` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://xyzcomics.com/.../001-436.webp` was not downloaded |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://xyzcomics.com/.../001-436.webp` (image/webp (encoding: lossy), 326634 bytes, 1499x1949) |  |  |  |
