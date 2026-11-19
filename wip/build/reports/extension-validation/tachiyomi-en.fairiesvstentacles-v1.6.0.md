# Extension Validation Report

- Extension: tachiyomi-en.fairiesvstentacles-v1.6.0
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
- Source ID: 5546045359057470664
- Source name: Fairies vs Tentacles
- Source language: en
- Selected manga input: popular offset 0: Fairies vs Tentacles (`.../main`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 2 | Fairies vs Tentacles (`.../main`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Fairies vs Tentacles (`.../main`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Fairies vs Tentacles (`.../main`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 817 | Page 0 (`.../page-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

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
| popular listing | PASS | 2 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Fairies vs Tentacles, URL=`.../main` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 4/4 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 4/4 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://eldrikdgt.com/.../page-00.jpg` (image/jpeg, 351273 bytes, 750x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../main` |  |  |  |
| details thumbnail URL | PASS | `https://eldrikdgt.com/.../page-00.jpg` |  |  |  |
| details author | PASS | Eldrik |  |  |  |
| details artist | PASS | Eldrik |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A silly comic about sexy fairies and naughty tentacles by eldrik aethervial. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 817 chapters |  |  |  |
| chapter dates | LINT | All 817 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=817 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://eldrikdgt.com/.../page-00.jpg` (image/jpeg, 351273 bytes, 750x1000) |  |  |  |
