# Extension Validation Report

- Extension: tachiyomi-th.hentaithainet-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4193399775119194496
- Source name: HentaiThai.net
- Source language: th
- Selected manga input: popular offset 0: เรนโบว์ ซัมเมอร์ สควอช! - [Pimichan] Rainbow Summer Squash! (`.../t52623`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | เรนโบว์ ซัมเมอร์ สควอช! - [Pimichan] Rainbow Summer Squash! - 5 (`.../t52623`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | เรนโบว์ ซัมเมอร์ สควอช! - [Pimichan] Rainbow Summer Squash! - 5 (`.../t52623`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | แมตช์สยิวล้างอาถรรพ์ 2 - [Hiraga Daidai] Deep Matching - 2 (`.../t52603`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.UnsupportedOperationException: Search is not available | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | เรนโบว์ ซัมเมอร์ สควอช! - [Pimichan] Rainbow Summer Squash! (`.../t52623`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oneshot (`.../t52623`) |  | <1s |
| pages | `getPageList(chapter)` | success | 33 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | SKIP | Search is not available |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | SKIP | Search is not available |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 64/64 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 64/64 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s2.hentaithai.net/.../5.webp` (image/webp (encoding: lossless), 13236 bytes, 1280x1820) |  |  |  |
| details identity | PASS | Details preserved selected URL `t52623` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://s2.hentaithai.net/.../1.webp` was not downloaded |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s2.hentaithai.net/.../1.webp` (image/webp (encoding: lossless), 13236 bytes, 1280x1820) |  |  |  |
