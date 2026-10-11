# Extension Validation Report

- Extension: tachiyomi-en.kingcomix-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8953466777316975228
- Source name: KingComiX
- Source language: en
- Selected manga input: popular offset 0: Happy Halloween!! – Dandery (`.../happy-halloween-dandery`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Happy Halloween!! – Dandery (`.../happy-halloween-dandery`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Link X Zelda in “Luvy-Duvy PRINCESS DOM” – Fred Perry (`.../link-x-zelda-in-luvy-duvy-princess-dom-fred-perry`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Happy Halloween!! – Dandery (`.../happy-halloween-dandery`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Happy Halloween!! – Dandery (`.../happy-halloween-dandery`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../happy-halloween-dandery`) |  | <1s |
| pages | `getPageList(chapter)` | success | 4 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Happy Halloween!! – Dandery, URL=`.../happy-halloween-dandery` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kingcomix.com/.../Happy-Halloween-Dandery-01-263x365.webp` (image/webp (encoding: lossy), 19922 bytes, 263x365) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../happy-halloween-dandery` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://kingcomix.com/.../Happy-Halloween-Dandery-01.webp` (image/webp (encoding: lossy), 123946 bytes, 1280x1810) |  |  |  |
| details author | PASS | EDDY |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Porn Comics, Big Ass, Full Color, Teen |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://kingcomix.com <redacted query values: s>` to `https://kingcomix.com` (1 redirects) |  |  |  |
| page load | PASS | `https://kingcomix.com/.../Happy-Halloween-Dandery-01.webp` (image/webp (encoding: lossy), 123946 bytes, 1280x1810) |  |  |  |
