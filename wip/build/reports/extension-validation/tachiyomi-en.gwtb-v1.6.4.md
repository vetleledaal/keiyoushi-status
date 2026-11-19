# Extension Validation Report

- Extension: tachiyomi-en.gwtb-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 14
- Lint: 1
- Warnings: 0
- Skipped: 20
- Failed: 2
- Retry disposition: RETRY_WHEN
- Retry condition: HOST_RESOLVES: www.blastwave-comic.com

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4006397036545425884
- Source name: Gone with the Blastwave
- Source language: en
- Selected manga input: popular offset 0: Gone with the Blastwave (`.../index.php`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1 | Gone with the Blastwave (`.../index.php`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.UnsupportedOperationException | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Gone with the Blastwave (`.../index.php`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | java.net.UnknownHostException: www.blastwave-comic.com: Name or service not known | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | SKIP | java.lang.UnsupportedOperationException |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.net.UnknownHostException: www.blastwave-comic.com: Name or service not known | RETRY_WHEN | DNS_LOOKUP_FAILURE | HOST_RESOLVES: www.blastwave-comic.com |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | search operation did not complete successfully |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 1/1 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1/1 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://www.blastwave-comic.com/.../yarr.jpg` could not be downloaded: java.net.UnknownHostException: www.blastwave-comic.com | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../index.php` |  |  |  |
| details thumbnail URL | PASS | `https://www.blastwave-comic.com/.../yarr.jpg` |  |  |  |
| details author | PASS | Kimmo Lemetti |  |  |  |
| details artist | PASS | Kimmo Lemetti |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Because war can be boring too. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
