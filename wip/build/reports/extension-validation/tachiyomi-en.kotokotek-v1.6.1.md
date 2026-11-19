# Extension Validation Report

- Extension: tachiyomi-en.kotokotek-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3080817756216633355
- Source name: Kotokotek
- Source language: en
- Selected manga input: popular offset 0: Safeword is Handcuffs (`.../swcensor`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Safeword is Handcuffs (`.../swcensor`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Safeword is Handcuffs (`.../swcensor`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Safeword is Handcuffs (`.../swcensor`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 15 | Episode 01 (`.../episode-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 33 |  |  | <1s |

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
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Safeword is Handcuffs, URL=`.../swcensor` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 7/7 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 7/7 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.wixstatic.com/.../cd69cd_9fc58e0c8bda4357abd8d3df2f14b6c7~mv2.jpg` (image/jpeg, 605613 bytes, 850x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../swcensor` |  |  |  |
| details thumbnail URL | PASS | `https://static.wixstatic.com/.../cd69cd_9fc58e0c8bda4357abd8d3df2f14b6c7~mv2.jpg` |  |  |  |
| details author | PASS | Kotokot |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | LINT | All 15 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=15 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static.wixstatic.com/.../cd69cd_7ca5549ca6ca4d018d20ef325e848c47~mv2.jpg` (image/jpeg, 944876 bytes, 850x1202) |  |  |  |
