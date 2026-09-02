# Extension Validation Report

- Extension: tachiyomi-en.thepropertyofhate-v1.6.6
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 22
- Lint: 3
- Warnings: 0
- Skipped: 10
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7307224992915342074
- Source name: The Property of Hate
- Source language: en
- Selected manga input: popular offset 0: The Property of Hate (`https://jolleycomics.com`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1 | The Property of Hate (`https://jolleycomics.com`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.UnsupportedOperationException | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Property of Hate (`https://jolleycomics.com`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 35 | #1 - The Hook (`.../The_Hook`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | SKIP | java.lang.UnsupportedOperationException |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | search operation did not complete successfully |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | LINT | 1/1 popular manga have titles and URLs; all absolute (examples: entry 1: `https://jolleycomics.com`) |  |  |  |
| thumbnail URLs | PASS | 1/1 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | `https://jolleycomics.com/.../tpoh.png` (image/png, 3548 bytes, 200x200); image is solid or nearly solid (pixel colors vary by at most 0 on the 0-255 RGB scale; fails at 8 or less) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `https://jolleycomics.com` |  |  |  |
| details thumbnail URL | PASS | `https://jolleycomics.com/.../tpoh.png` |  |  |  |
| details author | PASS | Sarah Jolley |  |  |  |
| details artist | PASS | Sarah Jolley |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 35 chapters |  |  |  |
| chapter dates | LINT | All 35 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=35 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://jolleycomics.com/.../tpoh_547dfae6a2683.jpg` (image/jpeg, 474353 bytes, 800x1132) |  |  |  |
