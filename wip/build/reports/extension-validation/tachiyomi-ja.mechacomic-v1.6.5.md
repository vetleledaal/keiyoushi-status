# Extension Validation Report

- Extension: tachiyomi-ja.mechacomic-v1.6.5
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
- Source ID: 4109851891728963895
- Source name: Mecha Comic
- Source language: ja
- Selected manga input: popular offset 0: キングダム (`.../85773`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | キングダム (`.../85773`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | シンデレラ・プロデュース～完璧御曹司は契約妻を愛し尽くす～ (`.../282354`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | 発情女子寮ハーレム～そんなに出したら妊娠しちゃう!! (`.../87926`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 水曜日には恋をして (`.../129650`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 50 | キングダム (`.../85773`) |  | 1-10s |
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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=キングダム, URL=`85773` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 138/138 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 138/138 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://c.mechacomic.jp/.../08X10000000075277100_R20261118_xl.jpg` (image/jpeg, 84601 bytes, 256x319) |  |  |  |
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
