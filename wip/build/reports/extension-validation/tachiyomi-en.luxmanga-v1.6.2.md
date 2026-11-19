# Extension Validation Report

- Extension: tachiyomi-en.luxmanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9066204719461145317
- Source name: LuxManga
- Source language: en
- Selected manga input: popular offset 0: Pregnant, and Gone in Five Months (`.../7586e84d-8597-4d47-983d-c7972110dd0d`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Pregnant, and Gone in Five Months (`.../7586e84d-8597-4d47-983d-c7972110dd0d`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The 100 Curses of the Illeston Mansion (`.../631d1d56-b391-4bf5-b5a6-89974c5a98e6`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Pregnant, and Gone in Five Months (`.../7586e84d-8597-4d47-983d-c7972110dd0d`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Pregnant, and Gone in Five Months (`.../7586e84d-8597-4d47-983d-c7972110dd0d`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 51 | Chapter 1 (`.../bedf4057-d8fe-4058-886e-b02708775e9c`) |  | <1s |
| pages | `getPageList(chapter)` | success | 82 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Pregnant, and Gone in Five Months, URL=`7586e84d-8597-4d47-983d-c7972110dd0d` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 45/45 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 45/45 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.luxmanga.net/.../b3f6b0fad2a0c8ed0be1d11eca4a88f3.webp` (image/webp (encoding: lossy), 336340 bytes, 1378x2000) |  |  |  |
| details identity | PASS | Details preserved selected URL `7586e84d-8597-4d47-983d-c7972110dd0d` |  |  |  |
| details thumbnail URL | PASS | `https://api.luxmanga.net/.../b3f6b0fad2a0c8ed0be1d11eca4a88f3.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Romance, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Since the day they wed, Sophia and her husband have been nothing more than strangers sharing a bed. Their only connection is a cold, mechanical fulfillment of their marital duties.<br>Thinking their child might finally bridge the distance between them, Sophia goes to share the news of her pregnancy. Instead, he greets her with a chilling response: "————————." In that moment, something inside Sophia snaps. Her life as a discarded wife is over. She has five months to prepare—and then, she’s disappearing for good.<br><br>**Also known as:**<br>- Ninshin Shita no de 5 Kagetsugo ni Iede Shimasu<br>- 妊娠したので5ヶ月後に家出します |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 51 chapters |  |  |  |
| chapter dates | PASS | 51 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 82 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://api.luxmanga.net/.../b29d32123ac22b03200f3c3eeb14405d17593e61124868708315acb23f40c2ec` (image/webp (encoding: lossy), 358268 bytes, 800x2000) |  |  |  |
