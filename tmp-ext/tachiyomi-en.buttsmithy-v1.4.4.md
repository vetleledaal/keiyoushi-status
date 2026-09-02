# Extension Validation Report

- Extension: tachiyomi-en.buttsmithy-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 24
- Lint: 0
- Warnings: 3
- Skipped: 9
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5116114496934092518
- Source name: Buttsmithy
- Source language: en
- Selected manga input: popular offset 0: Alfie - chapter 18 (`https://buttsmithy.com/.../chapter-18`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 55 | Alfie - chapter 18 (`https://buttsmithy.com/.../chapter-18`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.UnsupportedOperationException | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Alfie - chapter 18 (`https://buttsmithy.com/.../chapter-18`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 109 | p 1286 (`https://buttsmithy.com/.../p-1286`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | <1s |

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
| popular listing | PASS | 55 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | search operation did not complete successfully |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | UNUSUAL | 55/55 popular manga have titles and URLs; 29 relative, 26 absolute (examples: entry 1: `https://buttsmithy.com/.../chapter-18`, entry 2: `https://buttsmithy.com/.../chapter-19`, entry 3: `https://buttsmithy.com/.../misc`) |  |  |  |
| thumbnail URLs | PASS | 55/55 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network>` -> 26 manga URLs (examples: `https://buttsmithy.com/.../chapter-18`, `https://buttsmithy.com/.../chapter-19`, `https://buttsmithy.com/.../misc`) |  |  |  |
| thumbnail | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network>` (image/png, 2384 bytes, 1000x106) |  |  |  |
| details identity | PASS | Details preserved selected URL `https://buttsmithy.com/.../chapter-18` |  |  |  |
| details thumbnail URL | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network>` |  |  |  |
| details author | PASS | InCase |  |  |  |
| details artist | PASS | InCase |  |  |  |
| details genres | PASS | fantasy, NSFW |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 109 chapters |  |  |  |
| chapter dates | PASS | 109 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 109 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://buttsmithy.com/.../106.jpg` (image/jpeg, 725218 bytes, 1196x1800) |  |  |  |
