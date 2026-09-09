# Extension Validation Report

- Extension: tachiyomi-en.battleinfivesecondsaftermeeting-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 21
- Lint: 1
- Warnings: 3
- Skipped: 11
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 2529980242070778875
- Source name: Battle In 5 Seconds After Meeting
- Source language: en
- Selected manga input: popular offset 0: Battle in 5 Seconds After Meeting (`.../1967`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1 | Battle in 5 Seconds After Meeting (`.../1967`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Battle in 5 Seconds After Meeting (`.../1967`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Battle in 5 Seconds After Meeting Manga (`.../1967`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 278 | Chapter 1 Game Start (`.../deatte_5_byou_de_battle-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | 1-10s |

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
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Battle in 5 Seconds After Meeting, URL=`1967` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 2/2 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 2/2 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.deatte5.com/.../48-175x238.jpg` (image/jpeg, 14392 bytes, 175x238) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Battle in 5 Seconds After Meeting to Battle in 5 Seconds After Meeting Manga |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.deatte5.com/.../48.jpg` (image/jpeg, 60644 bytes, 333x524) |  |  |  |
| details author | PASS | HARAWATA Saizou |  |  |  |
| details artist | PASS | Kashiwa Miyako |  |  |  |
| details genres | PASS | Akira Shiroyanagi, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | It was just a usual morning. Akira Shiroyanagi, a high schooler who loves games and Konpeito (Japanese sweets), has suddenly been dragged into a battlefield by a mysterious girl who calls herself Mion. The participants are told that they are “erased from the family register, involved in an experiment, and gained certain powers.“ Akira is determined to win the game with his newfound powers and destroy the organization. Armed with a power no one expects and his “brain“ skills, the new period of intelligence battle of begins!<br><br>Alternative Names: Deatte 5-byou de Battle |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 278 chapters |  |  |  |
| chapter dates | LINT | All 278 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=278 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://www.deatte5.com/.../deatte_5_byou_de_battle` to `https://www.deatte5.com` (1 redirects); popular: `https://www.deatte5.com/.../deatte_5_byou_de_battle` to `https://www.deatte5.com` (1 redirects); popular: `https://www.deatte5.com/.../deatte_5_byou_de_battle-chapter-1` to `https://www.deatte5.com` (2 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
