# Extension Validation Report

- Extension: tachiyomi-fr.hentaizone-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 10
- Lint: 0
- Warnings: 1
- Skipped: 21
- Failed: 5
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 4897336575284771091
- Source name: HentaiZone
- Source language: fr
- Selected manga input: popular offset 0: Stepmother’s Friends (`.../415`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Stepmother’s Friends (`.../415`) |  | 10s+ |
| popular_next | `getPopularManga(2)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| latest | `getLatestUpdates(1)` | success | 25 | [Ero Daisuki] Priest Warrior (Goblin Slayer) (`.../37347996`) |  | 10s+ |
| latest_next | `getLatestUpdates(2)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 10s+ |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| search operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| details operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | SKIP | Timed out waiting for 30000 ms |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Timed out waiting for 30000 ms |  |  |  |
| latest pagination | SKIP | Timed out waiting for 30000 ms |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaizone.xyz/.../Read-Stepmother-Friends-manhwa-toptoon-free-175x238.jpg` (image/jpeg, 12436 bytes, 175x238) |  |  |  |
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
| redirects | UNUSUAL | popular: `https://hentaizone.xyz <redacted query values: p>` to `https://hentaizone.xyz/.../stepmothers-friends` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
