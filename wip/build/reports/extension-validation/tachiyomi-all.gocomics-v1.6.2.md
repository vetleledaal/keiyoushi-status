# Extension Validation Report

- Extension: tachiyomi-all.gocomics-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5960491017424675036
- Source name: GoComics
- Source language: en
- Selected manga input: popular offset 0: 1 and Done (`.../1-and-done`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 372 | 1 and Done (`.../1-and-done`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 209 | 1 and Done (`.../1-and-done`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 1 and Done (`.../1-and-done`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 1 and Done (`.../1-and-done`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | November 6, 2026 (`.../06`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 372 entries |  |  |  |
| latest listing | PASS | 209 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=1 and Done, URL=`.../1-and-done` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 582/582 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 582/582 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gocomicscmsassets.gocomics.com/.../Global_Feature_Badge_1_And_Done_600_8c72fff520.png` (image/png, 66466 bytes, 600x750) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1-and-done` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Eric Scott |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 1 and Done delivers quick-hit single-panel humor, serving up punchy jokes and witty observations about everyday life in just one shot. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.gocomics.com/.../a-to-z` to `https://www.gocomics.com/.../a-to-z <redacted query values: _rsc>` (1 redirects); popular: `https://www.gocomics.com/.../a-to-z` to `https://www.gocomics.com/.../a-to-z <redacted query values: _rsc>` (1 redirects); popular: `https://www.gocomics.com/.../a-to-z` to `https://www.gocomics.com/.../a-to-z <redacted query values: _rsc>` (1 redirects) |  |  |  |
| page load | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network>` (image/gif (format: 89a), 82417 bytes, 900x695) |  |  |  |
