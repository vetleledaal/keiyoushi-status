# Extension Validation Report

- Extension: tachiyomi-en.theblank-v1.6.6
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 17
- Lint: 0
- Warnings: 0
- Skipped: 18
- Failed: 2
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: pam
- Source ID: 7514642512113015247
- Source name: The Blank
- Source language: en
- Selected manga input: latest offset 0: Four’s a Crowd (`.../fours-a-crowd`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Someone Stop Her! (`.../8pND4ybM8Y-someone-stop-her`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Love Quest (`.../love-quest`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Four’s a Crowd (`.../fours-a-crowd`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Tears on a Withered Flower (`.../tears-on-a-withered-flower`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Four’s a Crowd (`.../fours-a-crowd`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| chapters operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Four’s a Crowd, URL=`fours-a-crowd` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://theblank.net/.../AyXGJDVMJAaW.webp <redacted query values: v>` (image/webp (encoding: lossy), 45478 bytes, 400x593) |  |  |  |
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
