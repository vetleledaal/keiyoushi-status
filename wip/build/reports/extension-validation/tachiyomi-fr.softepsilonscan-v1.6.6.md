# Extension Validation Report

- Extension: tachiyomi-fr.softepsilonscan-v1.6.6
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 12
- Lint: 0
- Warnings: 0
- Skipped: 22
- Failed: 3
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: pam
- Source ID: 4969929389259348100
- Source name: Soft Epsilon Scan
- Source language: fr
- Selected manga input: latest offset 0: Neet Hero (`.../neet-hero`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Neet Hero (`.../neet-hero`) |  | 10s+ |
| latest_next | `getLatestUpdates(2)` | success | 30 | Player who returned 10 000 years later (`.../player-who-returned-10-000-years-later`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Neet Hero (`.../neet-hero`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| chapters operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | SKIP | Timed out waiting for 30000 ms |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Neet Hero, URL=`neet-hero` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Timed out waiting for 30000 ms |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://epsilonsoft.to/.../XTVVKrlwAhQp.webp <redacted query values: v>` (image/webp (encoding: lossy), 85726 bytes, 640x900) |  |  |  |
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
