# Extension Validation Report

- Extension: tachiyomi-all.historyofhyrule-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 1
- Warnings: 2
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1995287596306677267
- Source name: History of Hyrule
- Source language: all
- Selected manga input: popular offset 0: The Hyrule Fantasy (`.../manga_loz_en`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 222 | The Hyrule Fantasy (`.../manga_loz_en`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | The Hyrule Fantasy (`.../manga_loz_en`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Legend of Zelda: The Hyrule Fantasy (The Original Legend of Zelda Game) (`.../manga_loz_en`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Japanese Language Version (`.../manga_loz`) |  | <1s |
| pages | `getPageList(chapter)` | success | 99 |  |  | <1s |

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
| popular listing | PASS | 222 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Hyrule Fantasy, URL=`.../manga_loz_en` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 226/226 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 226/226 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://historyofhyrule.com/.../thumb.jpg` (image/jpeg, 19682 bytes, 101x150) |  |  |  |
| details identity | UNUSUAL | Details changed selected title The Hyrule Fantasy to The Legend of Zelda: The Hyrule Fantasy (The Original Legend of Zelda Game) |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://historyofhyrule.com/.../cover.jpg` (image/jpeg, 241623 bytes, 450x670) |  |  |  |
| details author | PASS | Ran Maru |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | English Language Version · **Publisher & ISBN Info:** One Pack Comics (No ISBN) · **First Published Date:** 1986 Japan Only · **Approx Length:** 192 pages · **Posted on this Site:** Relaunch Date. · **Translation Posted on:** First part: 2012/12/08. We need the rest done! Help? · **English Covers Made by:** Beno (Amazing!) · **Part 1's Translation by:** Brigette · **Localization by:** Ingie · **Scanned and Edited by:** Melora |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | LINT | All 2 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 99 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://historyofhyrule.com/.../cover.jpg` (image/jpeg, 206443 bytes, 433x683) |  |  |  |
