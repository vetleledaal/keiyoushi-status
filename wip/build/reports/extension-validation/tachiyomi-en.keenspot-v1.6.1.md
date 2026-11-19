# Extension Validation Report

- Extension: tachiyomi-en.keenspot-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 25
- Lint: 3
- Warnings: 0
- Skipped: 8
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3133607736276627986
- Source name: Keenspot TwoKinds
- Source language: en
- Selected manga input: popular offset 0: TwoKinds (1 page per chapter) (`.../1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 2 | TwoKinds (1 page per chapter) (`.../1`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.Exception: Search functionality is not available. | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | TwoKinds (1 page per chapter) (`.../1`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1309 | Page 1 (`.../1-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | ERROR | java.lang.Exception: Search functionality is not available. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 2 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | Search functionality is not available. |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 2/2 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 2/2 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dummyimage.com/.../ffffff.jpg&text=TwoKinds (1 page per chapter)` (image/jpeg, 19327 bytes, 768x994; server Content-Type: image/jpg) |  |  |  |
| details identity | PASS | Details preserved selected URL `1` |  |  |  |
| details thumbnail URL | PASS | `https://dummyimage.com/.../ffffff.jpg&text=TwoKinds (1 page per chapter)` |  |  |  |
| details author | PASS | Tom Fischbach |  |  |  |
| details artist | PASS | Tom Fischbach |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 66 name, chapter 118 name, chapter 121 name, chapter 123 name, chapter 144 name, chapter 151 name |  |  |  |
| chapters | PASS | 1309 chapters |  |  |  |
| chapter dates | LINT | All 1309 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1309 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.twokinds.keenspot.com/.../20031022.jpg` (image/jpeg, 323828 bytes, 825x1100) |  |  |  |
