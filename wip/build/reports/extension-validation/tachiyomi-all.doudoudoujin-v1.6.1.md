# Extension Validation Report

- Extension: tachiyomi-all.doudoudoujin-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4031568581018999460
- Source name: DouDouDoujin
- Source language: all
- Selected manga input: popular offset 0: Dangerous Potion (`.../dangerous-potion`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 28 | Dangerous Potion (`.../dangerous-potion`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Dangerous Potion (`.../dangerous-potion`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Dangerous Potion (`.../dangerous-potion`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Dangerous Potion (`.../dangerous-potion`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 28 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Dangerous Potion, URL=`.../dangerous-potion` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 29/29 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 29/29 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage-prod.doudoujin.ai/.../thumb_01KRATSZYV6GFFJYN7DC6DRMR1.jpg` (image/jpeg, 300859 bytes, 895x1247) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../dangerous-potion` |  |  |  |
| details thumbnail URL | PASS | `https://storage-prod.doudoujin.ai/.../thumb_01KRATSZYV6GFFJYN7DC6DRMR1.jpg` |  |  |  |
| details author | PASS | Misasagi Miruka |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Shojo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Some people are afraid of witches. They are not someone anyone can love, but who would have thought that magic would turn against them.<br><br>Kindle: https://amzn.asia/.../00I8NfWx<br><br>LINE Manga: https://manga.line.me/.../detail <redacted query values: id><br><br>ピッコマ: https://piccoma.com/.../210110<br><br>DMMブックス: https://book.dmm.com/.../k804annbn30383 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage-prod.doudoujin.ai/.../01KRATWGJWSWM6EMVZ1XGTA0CN.jpg` (image/jpeg, 286676 bytes, 895x1247) |  |  |  |
