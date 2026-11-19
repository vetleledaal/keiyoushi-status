# Extension Validation Report

- Extension: tachiyomi-all.yespornpics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 26
- Lint: 1
- Warnings: 0
- Skipped: 8
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7565626369772015997
- Source name: YesPornPics
- Source language: all
- Selected manga input: popular offset 0: Spizoo Blanche Summer Freeone Stockings Torrentfunk (`.../spizoo-blanche-summer-freeone-stockings-torrentfunk`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 180 | Spizoo Blanche Summer Freeone Stockings Torrentfunk (`.../spizoo-blanche-summer-freeone-stockings-torrentfunk`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 180 | Chicasuicidadvd Chicasuicidadvd Model Drippt Teen Fuck Ver Videos (`.../chicasuicidadvd-chicasuicidadvd-model-drippt-teen-fuck-ver-videos`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Spizoo Blanche Summer Freeone Stockings Torrentfunk (`.../spizoo-blanche-summer-freeone-stockings-torrentfunk`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../spizoo-blanche-summer-freeone-stockings-torrentfunk`) |  | <1s |
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
| popular listing | PASS | 180 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 360/360 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 360/360 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://x.uuu.cam/.../hd-blanche-summer-20.jpg` (image/jpeg, 26541 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../spizoo-blanche-summer-freeone-stockings-torrentfunk` |  |  |  |
| details thumbnail URL | PASS | `https://x.uuu.cam/.../hd-blanche-summer-20.jpg` |  |  |  |
| details author | PASS | Blanche Summer |  |  |  |
| details artist | PASS | Spizoo |  |  |  |
| details genres | PASS | Blowjob, Close Up, Clothed, Cowgirl, Cumshot, Lingerie, Pornstar, Pretty, Pussy, Stockings |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 0 photos |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
