# Extension Validation Report

- Extension: tachiyomi-all.foamgirl-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5874068195320206396
- Source name: FoamGirl
- Source language: all
- Selected manga input: popular offset 0: Misao Oguri 小栗操 – REbecca 写真集 「Misao 蒼春プールサイド」 (`.../1839927.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Misao Oguri 小栗操 – REbecca 写真集 「Misao 蒼春プールサイド」 (`.../1839927.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Cosplay 氢氧化钡 – 奥古斯特素材 (`.../1839907.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Misao Oguri 小栗操 – REbecca 写真集 「Misao 蒼春プールサイド」 (`.../1839927.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | GALLERY (`.../1839927.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 104 |  |  | 1-10s |

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
| thumbnail | PASS | `https://cdn.foamgirl.net/.../41080192008441.webp!320x440` (image/webp (encoding: lossy), 29420 bytes, 320x440) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1839927.html` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.foamgirl.net/.../41080192008441.webp!320x440` |  |  |  |
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
| page URLs | PASS | 104 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.foamgirl.net/.../41080192008442.webp` (image/webp (encoding: lossy), 181940 bytes, 1000x1514; server Content-Type: application/octet-stream) |  |  |  |
