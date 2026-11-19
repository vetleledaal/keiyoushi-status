# Extension Validation Report

- Extension: tachiyomi-en.porncomix-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6627320413337959683
- Source name: PornComix
- Source language: en
- Selected manga input: popular offset 0: Pegasus Smith – Au Naturel 30 (`.../pegasus-smith-au-naturel-30`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Pegasus Smith – Au Naturel 30 (`.../pegasus-smith-au-naturel-30`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Tracy Scops – I wanna take you for a ride (`.../tracy-scops-i-wanna-take-you-for-a-ride`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 13 | Pegasus Smith – Au Naturel 30 (`.../pegasus-smith-au-naturel-30`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Pegasus Smith – Au Naturel 30 (`.../pegasus-smith-au-naturel-30`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | CHAPTER (`.../pegasus-smith-au-naturel-30`) |  | <1s |
| pages | `getPageList(chapter)` | success | 56 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Pegasus Smith – Au Naturel 30, URL=`.../pegasus-smith-au-naturel-30` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 53/53 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 53/53 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bestporncomix.com/.../001-415x600.webp` (image/webp (encoding: lossy), 18230 bytes, 230x325) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../pegasus-smith-au-naturel-30` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://bestporncomix.com/.../001-230x325.webp` was not downloaded |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 3D Comics |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 3D Comics |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://bestporncomix.com/.../001.webp` (image/webp (encoding: lossy), 222444 bytes, 1257x1920) |  |  |  |
