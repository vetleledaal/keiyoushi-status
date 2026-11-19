# Extension Validation Report

- Extension: tachiyomi-en.elanschool-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 1
- Warnings: 0
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6159323532820101296
- Source name: Elan School
- Source language: en
- Selected manga input: popular offset 0: Elan School (`.../chapters <redacted query values: dps_paged>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1 | Elan School (`.../chapters <redacted query values: dps_paged>`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Elan School (`.../chapters <redacted query values: dps_paged>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Elan School (`.../chapters <redacted query values: dps_paged>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 103 | 1: Rude Awakening (`.../rude-awakening`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 8 |  |  | <1s |

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
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Elan School, URL=`.../chapters <redacted query values: dps_paged>` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 2/2 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 2/2 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://elan.school/.../The-Elan-School-Comic-1cNEW-1-768x1491.jpg` (image/jpeg, 49006 bytes, 768x1491) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../chapters <redacted query values: dps_paged>` |  |  |  |
| details thumbnail URL | PASS | `https://elan.school/.../The-Elan-School-Comic-1cNEW-1-768x1491.jpg` |  |  |  |
| details author | PASS | Joe Nobody |  |  |  |
| details artist | PASS | Joe Nobody |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A 16 year old boy named Joe gets indoctrinated into a sick cult that is run by imprisoned teenagers. Based on the true story of the Elan School. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 103 chapters |  |  |  |
| chapter dates | LINT | All 103 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=103 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://elan.school/.../The-Elan-School-Comic-1a2020-copy.jpg` (image/jpeg, 332662 bytes, 1215x2359) |  |  |  |
