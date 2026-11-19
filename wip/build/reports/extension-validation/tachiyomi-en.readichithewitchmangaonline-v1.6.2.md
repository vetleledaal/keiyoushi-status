# Extension Validation Report

- Extension: tachiyomi-en.readichithewitchmangaonline-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 23
- Lint: 4
- Warnings: 1
- Skipped: 9
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangacatalog
- Source ID: 3152007240050380198
- Source name: Read Ichi the Witch Manga Online
- Source language: en
- Selected manga input: popular offset 0: Ichi the Witch (`https://ww2.readichithewitch.com/.../ichi-the-witch`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1 | Ichi the Witch (`https://ww2.readichithewitch.com/.../ichi-the-witch`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ichi the Witch (`https://ww2.readichithewitch.com/.../ichi-the-witch`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ichi the Witch (`https://ww2.readichithewitch.com/.../ichi-the-witch`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 106 | Ichi the Witch Chapter 1 - 1st hunt: Ichi (`https://ww2.readichithewitch.com/.../ichi-the-witch-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 50 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ichi the Witch, URL=`https://ww2.readichithewitch.com/.../ichi-the-witch` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | LINT | 2/2 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://ww2.readichithewitch.com/.../ichi-the-witch`, search entry 1: `https://ww2.readichithewitch.com/.../ichi-the-witch` |  |  |  |
| thumbnail URLs | LINT | 0/2 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `https://ww2.readichithewitch.com/.../ichi-the-witch` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../j5Mqkxk.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Alternative name : Madan no Ichi In this world, witches must hunt down their magic! Deep in the forest, the terrifying king of magic and the strongest witch are locked in deadly combat. But suddenly, a young boy joins the fray. His name is Ichi and he is just a hunter. But he has the power to flip the magic world upside down in this magic hunting fantasy epic! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 106 chapters |  |  |  |
| chapter dates | LINT | All 106 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=106 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 106 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.readichithewitch.com/.../1.jpeg` (image/jpeg, 145317 bytes, 784x1145) |  |  |  |
