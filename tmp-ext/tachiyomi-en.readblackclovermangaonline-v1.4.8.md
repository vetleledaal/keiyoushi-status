# Extension Validation Report

- Extension: tachiyomi-en.readblackclovermangaonline-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 7
- Lint: 2
- Warnings: 0
- Skipped: 26
- Failed: 2
- Retry disposition: RETRY_WHEN
- Retry condition: HOST_RESOLVES: ww10.readblackclover.com

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangacatalog
- Source ID: 6485938153129890061
- Source name: Read Black Clover Manga Online
- Source language: en
- Selected manga input: popular offset 0: Black Clover (`https://ww10.readblackclover.com/.../black-clover`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 4 | Black Clover (`https://ww10.readblackclover.com/.../black-clover`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Black Clover (`https://ww10.readblackclover.com/.../black-clover`) |  | <1s |
| details | `fetchMangaDetails(manga)` | error | 0 |  | java.net.UnknownHostException: ww10.readblackclover.com | <1s |
| chapters | `fetchChapterList(manga)` | error | 0 |  | java.net.UnknownHostException: ww10.readblackclover.com: No address associated with hostname | <1s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.net.UnknownHostException: ww10.readblackclover.com | RETRY_WHEN | DNS_LOOKUP_FAILURE | HOST_RESOLVES: ww10.readblackclover.com |
| chapters operation | ERROR | java.net.UnknownHostException: ww10.readblackclover.com: No address associated with hostname | RETRY_WHEN | DNS_LOOKUP_FAILURE | HOST_RESOLVES: ww10.readblackclover.com |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 4 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Black Clover, URL=`https://ww10.readblackclover.com/.../black-clover` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 5/5 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://ww10.readblackclover.com/.../black-clover`, popular entry 2: `https://ww10.readblackclover.com/.../black-clover-colored`, popular entry 3: `https://ww10.readblackclover.com/.../hungry-joker` |  |  |  |
| thumbnail URLs | LINT | 0/5 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | SKIP | No details metadata to check |  |  |  |
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
