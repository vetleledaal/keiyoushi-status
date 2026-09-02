# Extension Validation Report

- Extension: tachiyomi-fr.perfscan-v1.4.31
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 0
- Lint: 0
- Warnings: 0
- Skipped: 34
- Failed: 2
- Retry disposition: RETRY_WHEN
- Retry condition: TLS_HANDSHAKE_SUCCEEDS: api.perf-scan.xyz

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4533007917829146766
- Source name: Perf Scan
- Source language: fr

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | error | 0 |  | javax.net.ssl.SSLHandshakeException: (unrecognized_name) Received fatal alert: unrecognized_name | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | error | 0 |  | javax.net.ssl.SSLHandshakeException: (unrecognized_name) Received fatal alert: unrecognized_name | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | skipped | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | skipped | 0 |  |  | <1s |
| chapters | `fetchChapterList(manga)` | skipped | 0 |  |  | <1s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | ERROR | javax.net.ssl.SSLHandshakeException: (unrecognized_name) Received fatal alert: unrecognized_name | RETRY_WHEN | TLS_FAILURE | TLS_HANDSHAKE_SUCCEEDS: api.perf-scan.xyz |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | ERROR | javax.net.ssl.SSLHandshakeException: (unrecognized_name) Received fatal alert: unrecognized_name | RETRY_WHEN | TLS_FAILURE | TLS_HANDSHAKE_SUCCEEDS: api.perf-scan.xyz |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | SKIP | No manga was returned by popular or latest |  |  |  |
| details operation | SKIP | No manga was returned by popular or latest |  |  |  |
| chapters operation | SKIP | No manga was returned by popular or latest |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | SKIP | (unrecognized_name) Received fatal alert: unrecognized_name |  |  |  |
| latest listing | SKIP | (unrecognized_name) Received fatal alert: unrecognized_name |  |  |  |
| search listing | SKIP | No manga was returned by popular or latest |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | (unrecognized_name) Received fatal alert: unrecognized_name |  |  |  |
| latest pagination | SKIP | (unrecognized_name) Received fatal alert: unrecognized_name |  |  |  |
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
