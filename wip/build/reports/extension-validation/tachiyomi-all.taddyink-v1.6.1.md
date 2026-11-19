# Extension Validation Report

- Extension: tachiyomi-all.taddyink-v1.6.1
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
- Source ID: 2332326521515456967
- Source name: Taddy INK (Webtoons)
- Source language: all
- Selected manga input: popular offset 0: Rainbow and the Gleamstone (`https://taddy.org/.../fd65354f-d249-403c-860b-9bd80dd33362`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Rainbow and the Gleamstone (`https://taddy.org/.../fd65354f-d249-403c-860b-9bd80dd33362`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | The price of peace (`https://taddy.org/.../5ce1457c-5dfb-4d17-9849-f603db0c9c1c`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Rainbow and the Gleamstone (`https://taddy.org/.../fd65354f-d249-403c-860b-9bd80dd33362`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Rainbow and the Gleamstone (`https://taddy.org/.../fd65354f-d249-403c-860b-9bd80dd33362`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Episode 1 (`https://taddy.org/.../fd65354f-d249-403c-860b-9bd80dd33362`) |  | <1s |
| pages | `getPageList(chapter)` | success | 37 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Rainbow and the Gleamstone, URL=`https://taddy.org/.../fd65354f-d249-403c-860b-9bd80dd33362` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 51/51 listing manga have titles and URLs; popular: all absolute; popular_next: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://taddy.org/.../fd65354f-d249-403c-860b-9bd80dd33362`, popular entry 2: `https://taddy.org/.../1e9a4b65-f0c3-49bc-a088-b52e9bfe5394`, popular entry 3: `https://taddy.org/.../a7f297d8-f99e-47f1-a1cb-1286532221ee` |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ax1.taddy.org/.../cover-sm.webp` (image/webp (encoding: lossy), 43126 bytes, 320x480; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `https://taddy.org/.../fd65354f-d249-403c-860b-9bd80dd33362` |  |  |  |
| details thumbnail URL | PASS | `https://ax1.taddy.org/.../cover-sm.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, LGBTQ+, Comedy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Started on Earth in a lab there was a experiment of making soldiers but instead they became aware of things and escaped but it doesn't end there. The story follows a transgender golden retriever named Rainbow who must save his village Gleamstone from the Nightmare King. So he goes on an adventure to save his Gleamstone and his island will he succeed? Find out!. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 3 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ay1.taddy.org/.../story.webp` (image/webp (encoding: lossy), 199934 bytes, 800x1280; server Content-Type: application/octet-stream) |  |  |  |
