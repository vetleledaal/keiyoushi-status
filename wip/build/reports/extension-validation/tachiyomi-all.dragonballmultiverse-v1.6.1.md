# Extension Validation Report

- Extension: tachiyomi-all.dragonballmultiverse-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5855032551259176250
- Source name: Dragon Ball Multiverse
- Source language: en
- Selected manga input: popular offset 0: DB Multiverse (`.../chapters.html <redacted query values: comic>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | DB Multiverse (`.../chapters.html <redacted query values: comic>`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | DB Multiverse (`.../chapters.html <redacted query values: comic>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 118 | Chapter 1: A really strange tournament! (`.../chapters.html <redacted query values: comic and chapter>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 25/25 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 25/25 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.dragonball-multiverse.com/.../page.jpg <redacted query values: >` (image/jpeg, 284609 bytes, 600x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../chapters.html <redacted query values: comic>` |  |  |  |
| details thumbnail URL | PASS | `https://www.dragonball-multiverse.com/.../page.jpg <redacted query values: >` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 20 timelines that diverged from DBZ meet in a multiverse tournament! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 118 chapters |  |  |  |
| chapter dates | LINT | All 118 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=118 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.dragonball-multiverse.com/.../image.php <redacted query values: idp, lg, ext, and pw>` (image/jpeg, 186017 bytes, 600x848; server Content-Type: image/jpg) |  |  |  |
