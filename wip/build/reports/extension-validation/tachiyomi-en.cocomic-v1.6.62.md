# Extension Validation Report

- Extension: tachiyomi-en.cocomic-v1.6.62
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 24
- Lint: 0
- Warnings: 1
- Skipped: 9
- Failed: 3
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3544369893051520689
- Source name: Cocomic
- Source language: en
- Selected manga input: popular offset 0: The Cheat Batter Takes All (`.../59528`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | The Cheat Batter Takes All (`.../59528`) |  | 10s+ |
| popular_next | `getPopularManga(2)` | success | 25 | Swallow You Whole (`.../66662`) |  | 10s+ |
| latest | `getLatestUpdates(1)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Cheat Batter Takes All (`.../59528`) |  | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 105 | Chapter 1 (`.../chapter-1`) |  | 10s+ |
| pages | `getPageList(chapter)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | SKIP | Timed out waiting for 30000 ms |  |  |  |
| search listing | SKIP | Timed out waiting for 30000 ms |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Timed out waiting for 30000 ms |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cocomic.co/.../4ea8ed275eb81812160b5833c9d76098b4a0ce05_720_960_196488-350x476.jpeg` (image/jpeg, 30278 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `59528` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cocomic.co/.../4ea8ed275eb81812160b5833c9d76098b4a0ce05_720_960_196488.jpeg` (image/jpeg, 59716 bytes, 600x800) |  |  |  |
| details author | PASS | Epiphany |  |  |  |
| details artist | PASS | Red paper (301ho) |  |  |  |
| details genres | PASS | Adult, Cheating/Infidelity, Comedy, Drama, Fetish, Full Color, Harem, Mature, Romance, Seinen(M), Smut, Sports, Super power, Supernatural, Webtoon, MANHWA |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | MENG-HO is a college baseball player who lost his parents in an accident and is recovering from an injury. However, his life changes when he meets a ghost who used to be one of the most skilled MLB players of all time. Now, he is a god-like player ready to conquer all the girls and even the pro league!<br><br>Alternative Names: 치트 타자가 다 따먹음 / 炸裂吧!巨棒 / El bateador tramposo lo gana todo / Un Bateador Tramposo / The Cheat Hitter |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 105 chapters |  |  |  |
| chapter dates | PASS | 105 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Timed out waiting for 30000 ms |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
