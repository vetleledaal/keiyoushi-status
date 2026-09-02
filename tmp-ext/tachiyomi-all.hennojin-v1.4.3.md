# Extension Validation Report

- Extension: tachiyomi-all.hennojin-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 0
- Lint: 0
- Warnings: 0
- Skipped: 35
- Failed: 1
- Retry disposition: RETRY_WHEN
- Retry condition: HOST_RESOLVES: hennojin.com

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 2486465102799235219
- Source name: Hennojin
- Source language: en

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | error | 0 |  | java.net.UnknownHostException: hennojin.com: No address associated with hostname | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | skipped | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | skipped | 0 |  |  | <1s |
| chapters | `fetchChapterList(manga)` | skipped | 0 |  |  | <1s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | ERROR | java.net.UnknownHostException: hennojin.com: No address associated with hostname | RETRY_WHEN | DNS_LOOKUP_FAILURE | HOST_RESOLVES: hennojin.com |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | SKIP | No manga was returned by popular or latest |  |  |  |
| details operation | SKIP | No manga was returned by popular or latest |  |  |  |
| chapters operation | SKIP | No manga was returned by popular or latest |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | SKIP | hennojin.com: No address associated with hostname |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | No manga was returned by popular or latest |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | hennojin.com: No address associated with hostname |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | SKIP | No manga to check |  |  |  |
| thumbnail URLs | SKIP | No manga to check |  |  |  |
| duplicate thumbnail URLs | SKIP | No manga to check |  |  |  |
| thumbnail | SKIP | No manga to check |  |  |  |
| details identity | SKIP | No selected manga URL to compare |  |  |  |
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
| page load | SKIP | No pages to load |  |  |  |
