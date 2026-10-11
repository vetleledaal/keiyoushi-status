# Extension Validation Report

- Extension: tachiyomi-all.taddyink-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
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
- Source ID: 2332326521515456967
- Source name: Taddy INK (Webtoons)
- Source language: all
- Selected manga input: popular offset 0: I Shipped Them Hard (`https://taddy.org/.../085172b9-5350-4c05-b41b-a0b90d2182aa`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | I Shipped Them Hard (`https://taddy.org/.../085172b9-5350-4c05-b41b-a0b90d2182aa`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Adam the Martian. The architect of Mars (`https://taddy.org/.../ce7da016-e86b-4b31-802f-f993f09a0483`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Shipped Them Hard (`https://taddy.org/.../085172b9-5350-4c05-b41b-a0b90d2182aa`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Shipped Them Hard (`https://taddy.org/.../085172b9-5350-4c05-b41b-a0b90d2182aa`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Ep 1 - Does this apply to you too? (`https://taddy.org/.../085172b9-5350-4c05-b41b-a0b90d2182aa`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Shipped Them Hard, URL=`https://taddy.org/.../085172b9-5350-4c05-b41b-a0b90d2182aa` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 51/51 listing manga have titles and URLs; popular: all absolute; popular_next: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://taddy.org/.../085172b9-5350-4c05-b41b-a0b90d2182aa`, popular entry 2: `https://taddy.org/.../77cff698-b983-43a1-8d1c-3e0b0296001e`, popular entry 3: `https://taddy.org/.../496052d0-346a-41e9-a085-62ab550adb3f` |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ax1.taddy.org/.../cover-sm.webp` (image/webp (encoding: lossy), 29498 bytes, 320x480; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `https://taddy.org/.../085172b9-5350-4c05-b41b-a0b90d2182aa` |  |  |  |
| details thumbnail URL | PASS | `https://ax1.taddy.org/.../cover-sm.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Slice Of Life, Comedy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | You came across two people. You kept stumbling upon their wholesome moments and it became your daily dose of happiness, not in a weird way, of course. -update once a month- |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 1 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ay1.taddy.org/.../story.webp` (image/webp (encoding: lossy), 67980 bytes, 800x1280; server Content-Type: application/octet-stream) |  |  |  |
