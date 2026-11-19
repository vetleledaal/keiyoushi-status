# Extension Validation Report

- Extension: tachiyomi-en.buttsmithy-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 26
- Lint: 2
- Warnings: 2
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5116114496934092518
- Source name: Buttsmithy
- Source language: en
- Selected manga input: popular offset 0: Alfie (`https://buttsmithy.com`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Alfie (`https://buttsmithy.com`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Alfie (`https://buttsmithy.com`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Alfie (`https://buttsmithy.com`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 26 | Chapter 1 (`https://buttsmithy.com/.../p1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 28 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Alfie, URL=`https://buttsmithy.com` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | UNUSUAL | 31/31 listing manga have titles and URLs; popular: 1/30 absolute, 29/30 relative; search: all absolute; Absolute URL examples: popular entry 1: `https://buttsmithy.com`, search entry 1: `https://buttsmithy.com` |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network>` (image/png, 2384 bytes, 1000x106) |  |  |  |
| details identity | PASS | Details preserved selected URL `https://buttsmithy.com` |  |  |  |
| details thumbnail URL | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network>` |  |  |  |
| details author | PASS | InCase |  |  |  |
| details artist | PASS | InCase |  |  |  |
| details genres | PASS | fantasy, NSFW |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 26 chapters |  |  |  |
| chapter dates | LINT | All 26 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=26 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 26 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://buttsmithy.com/.../1.jpg` (image/jpeg, 321710 bytes, 1200x984) |  |  |  |
