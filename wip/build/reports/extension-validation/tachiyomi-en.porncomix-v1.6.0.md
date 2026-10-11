# Extension Validation Report

- Extension: tachiyomi-en.porncomix-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 28
- Lint: 1
- Warnings: 2
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6627320413337959683
- Source name: PornComix
- Source language: en
- Selected manga input: popular offset 0: Tracy Scops – I wanna take you for a ride (`.../tracy-scops-i-wanna-take-you-for-a-ride`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Tracy Scops – I wanna take you for a ride (`.../tracy-scops-i-wanna-take-you-for-a-ride`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Tracy Scops – I wanna take you for a ride (`.../tracy-scops-i-wanna-take-you-for-a-ride`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tracy Scops – I wanna take you for a ride (`.../tracy-scops-i-wanna-take-you-for-a-ride`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tracy Scops – I wanna take you for a ride (`.../tracy-scops-i-wanna-take-you-for-a-ride`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | CHAPTER (`.../tracy-scops-i-wanna-take-you-for-a-ride`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tracy Scops – I wanna take you for a ride, URL=`.../tracy-scops-i-wanna-take-you-for-a-ride` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bestporncomix.com/.../I-wanna-take-you-for-a-ride-1-1-415x600.webp` (image/webp (container: extended), 28174 bytes, 230x325) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tracy-scops-i-wanna-take-you-for-a-ride` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://bestporncomix.com/.../I-wanna-take-you-for-a-ride-1-230x325.webp` was not downloaded |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Porn Comics |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Porn Comics |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://bestporncomix.com/.../multporn-net` to `https://bestporncomix.com/.../2` (1 redirects); popular: `https://bestporncomix.com/.../2` to `https://bestporncomix.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://bestporncomix.com/.../I-wanna-take-you-for-a-ride-1.webp` (image/webp (container: extended), 419324 bytes, 1280x1978) |  |  |  |
