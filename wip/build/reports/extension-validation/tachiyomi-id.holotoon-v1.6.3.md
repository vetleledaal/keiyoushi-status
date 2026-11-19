# Extension Validation Report

- Extension: tachiyomi-id.holotoon-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 13
- Lint: 0
- Warnings: 2
- Skipped: 18
- Failed: 4
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3970113862660733375
- Source name: Holotoon
- Source language: id
- Selected manga input: popular offset 0: Martial Peak (`.../martial-peak-a134ffa2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 3 | Martial Peak (`.../martial-peak-a134ffa2`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 3 | Omniscient Reader (`.../omniscient-reader-2c60beff`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 3 | Nano Machine (`.../nano-machine-ea5a5ca8`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 3 | Return of the Blossoming Blade (`.../return-of-the-blossoming-blade-6c6e0ff3`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Reincarnation of the Suicidal Battle God (`.../reincarnation-of-the-suicidal-battle-god-426a6809`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 3 entries |  |  |  |
| latest listing | PASS | 3 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 3 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Eleceed, URL=`.../eleceed-d554d0f1` at page 1 offset 2 and page 2 offset 1 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 15/15 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 15/15 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://holodek.run/.../placeholder.webp` -> all 8 manga URLs (examples: `.../martial-peak-a134ffa2`, `.../wind-breaker-33fbae18`, `.../eleceed-d554d0f1`) |  |  |  |
| thumbnail | FAIL | `https://holodek.run/.../placeholder.webp` (image/webp (encoding: lossy), 1052 bytes, 600x900); image is solid or nearly solid (pixel colors vary by at most 6 on the 0-255 RGB scale; fails at 8 or less) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
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
