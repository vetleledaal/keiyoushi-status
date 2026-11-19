# Extension Validation Report

- Extension: tachiyomi-en.readsakamotodaysmangaonline-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 24
- Lint: 4
- Warnings: 1
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangacatalog
- Source ID: 9061586347786095111
- Source name: Read Sakamoto Days Manga Online
- Source language: en
- Selected manga input: popular offset 0: Sakamoto Days (`https://ww2.readsakadays.com/.../sakamoto-days`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 7 | Sakamoto Days (`https://ww2.readsakadays.com/.../sakamoto-days`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Sakamoto Days (`https://ww2.readsakadays.com/.../sakamoto-days`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sakamoto Days (`https://ww2.readsakadays.com/.../sakamoto-days`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 284 | Sakamoto Days Chapter 0 (`https://ww2.readsakadays.com/.../sakamoto-days-chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 44 |  |  | <1s |

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
| popular listing | PASS | 7 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sakamoto Days, URL=`https://ww2.readsakadays.com/.../sakamoto-days` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 11/11 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://ww2.readsakadays.com/.../sakamoto-days`, popular entry 2: `https://ww2.readsakadays.com/.../sakamoto-days-digital-colored-comics`, popular entry 3: `https://ww2.readsakadays.com/.../sakamoto-days-assassins-method` |  |  |  |
| thumbnail URLs | LINT | 0/11 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `https://ww2.readsakadays.com/.../sakamoto-days` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../ucdwQJc.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Tarou Sakamoto was the ultimate assassin, feared by villains and admired by hitmen. But one day...he fell in love! Retirement, marriage, fatherhood and then... Sakamoto gained weight! The chubby guy who runs the neighborhood store is actually a former legendary hitman! Can he protect his family from danger? Get ready to experience a new kind of action comedy series! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 284 chapters |  |  |  |
| chapter dates | LINT | All 284 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=284 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 284 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 44 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.readsakadays.com/.../1.jpeg` (image/jpeg, 240515 bytes, 959x1400) |  |  |  |
