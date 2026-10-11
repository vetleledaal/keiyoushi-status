# Extension Validation Report

- Extension: tachiyomi-all.manta-v1.6.11
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 24
- Lint: 1
- Warnings: 1
- Skipped: 10
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 8753096034341798862
- Source name: Manta
- Source language: en
- Selected manga input: popular offset 0: Unit 30 (`.../3314`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 80 | Unit 30 (`.../3314`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Unit 30 (`.../4144`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Unit 30 (`.../3314`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Volume 1 🔒 (`.../125785`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| popular listing | PASS | 80 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Unit 30, URL=`3314` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://static.mantacdn.net/.../QBkKvN81qDeYJW8J.jpg` -> 2 manga URLs (examples: `4546`, `4547`) |  |  |  |
| thumbnail | PASS | `https://static.mantacdn.net/.../oLM9GvkwXEmjFaq5.jpg` (image/jpeg, 63139 bytes, 480x690) |  |  |  |
| details identity | PASS | Details preserved selected URL `3314` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | handgold, RoseN, RIDI Corporation |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Romance, Modern, Non-Asian setting, Novel, Amnesia/Memory loss, Dystopian, Power imbalance, Contract relationship, Cold ML, Capable ML, Capable FL, Troubled-past FL, Adult/Mature, Dark, Suspense, Completed, New, Exclusive |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Riella awakens in a sealed vessel with no memory of who she is. She is surrounded by six strangers, all equally amnesiac. Amidst the despair, Aslan, the Unit’s cold and rational leader, becomes her sole anchor. As they navigate through deception, a shocking secret about Riella’s identity awaits. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
