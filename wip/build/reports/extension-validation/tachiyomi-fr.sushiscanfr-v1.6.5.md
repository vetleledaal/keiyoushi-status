# Extension Validation Report

- Extension: tachiyomi-fr.sushiscanfr-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 7
- Lint: 0
- Warnings: 0
- Skipped: 24
- Failed: 6
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3196884165456788667
- Source name: Sushiscan.fr
- Source language: fr
- Selected manga input: latest offset 0: The Ruined World Was Mistaken for a Game (`.../the-ruined-world-was-mistaken-for-a-game`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | The Ruined World Was Mistaken for a Game (`.../the-ruined-world-was-mistaken-for-a-game`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| details operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | SKIP | HTTP error 504 |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | SKIP | HTTP error 504 |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | HTTP error 504 |  |  |  |
| latest pagination | SKIP | HTTP error 504 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 30/30 latest manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 30/30 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://sushiscan.fr/.../cover-3-205x300.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
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
