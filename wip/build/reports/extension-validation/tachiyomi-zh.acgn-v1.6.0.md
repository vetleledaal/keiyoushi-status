# Extension Validation Report

- Extension: tachiyomi-zh.acgn-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4112040754654708363
- Source name: ACGN
- Source language: zh
- Selected manga input: popular offset 0: 我們收集了幸福的戀愛 (`.../womengshoujilexingfudelianai`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | 我們收集了幸福的戀愛 (`.../womengshoujilexingfudelianai`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 我們收集了幸福的戀愛 (`.../womengshoujilexingfudelianai`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 我們收集了幸福的戀愛 (`.../womengshoujilexingfudelianai`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 137 | 第01話 (`.../387480`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=我們收集了幸福的戀愛, URL=`womengshoujilexingfudelianai` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 38/38 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 38/38 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://comic.acgn.cc/.../womengshoujilexingfudelianai.jpg` (image/jpeg, 35493 bytes, 270x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `womengshoujilexingfudelianai` |  |  |  |
| details thumbnail URL | PASS | `https://comic.acgn.cc/.../womengshoujilexingfudelianai.jpg` |  |  |  |
| details author | PASS | 立葵 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少女漫畫, 愛情 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 137 chapters |  |  |  |
| chapter dates | LINT | 136 of 137 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=136 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.acgn.cc/.../1.jpg` (image/jpeg, 170739 bytes, 846x1200) |  |  |  |
