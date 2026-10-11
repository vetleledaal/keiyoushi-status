# Extension Validation Report

- Extension: tachiyomi-en.batcave-v1.6.12
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 10
- Lint: 0
- Warnings: 0
- Skipped: 23
- Failed: 4
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7422099479605463706
- Source name: BatCave
- Source language: en
- Selected manga input: popular offset 0: Harley Quinn Fartacular: Silent Butt Deadly (2025-) (`.../33408-harley-quinn-fartacular-silent-butt-deadly-2025.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Harley Quinn Fartacular: Silent Butt Deadly (2025-) (`.../33408-harley-quinn-fartacular-silent-butt-deadly-2025.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | Ultimate Spider-Man (2024-) (`.../32394-ultimate-spider-man-2024.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | java.io.IOException: Open in WebView to bypass site protection | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | java.io.IOException: Open in WebView to bypass site protection | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | java.io.IOException: Open in WebView to bypass site protection | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | ERROR | java.io.IOException: Open in WebView to bypass site protection | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | ERROR | java.io.IOException: Open in WebView to bypass site protection | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | ERROR | java.io.IOException: Open in WebView to bypass site protection | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | Timed out waiting for 30000 ms |  |  |  |
| search listing | SKIP | Open in WebView to bypass site protection |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Timed out waiting for 30000 ms |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 20/20 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 20/20 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://batcave.biz/.../70bb7e98c546564f43c7441e943966.webp` (image/webp (encoding: lossy), 5314 bytes, 100x150) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | SKIP | No details metadata to check |  |  |  |
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
