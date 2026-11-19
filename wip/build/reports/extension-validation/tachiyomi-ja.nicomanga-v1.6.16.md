# Extension Validation Report

- Extension: tachiyomi-ja.nicomanga-v1.6.16
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 13
- Lint: 0
- Warnings: 0
- Skipped: 20
- Failed: 4
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5680590515266301834
- Source name: Nicomanga
- Source language: ja
- Selected manga input: popular offset 0: SHANGRILA FRONTIER ~ SHITTY GAMES HUNTER CHALLENGES GODLY GAME ~ - RAW (`.../1424bfba.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | SHANGRILA FRONTIER ~ SHITTY GAMES HUNTER CHALLENGES GODLY GAME ~ - RAW (`.../1424bfba.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | OCHIKOBORE DATTA ANI GA JITSUHA SAIKYOU: SHIJOU SAIKYOU NO YUUSHA WA TENSEI-SHI, GAKUEN DE MUJIKAKU NI MUSOU SURU (`.../af35c56c.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | RINNE NO MAJUTSUSHI (`.../7cb4d199.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| search operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| details operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| chapters operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | SKIP | Timed out waiting for 30000 ms |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Timed out waiting for 30000 ms |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 90/90 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 90/90 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.ihlv1.xyz/.../5faa1046d57cb_5faa10473ef09.jpg <redacted query values: imgmax>` (image/jpeg, 209231 bytes, 320x454) |  |  |  |
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
