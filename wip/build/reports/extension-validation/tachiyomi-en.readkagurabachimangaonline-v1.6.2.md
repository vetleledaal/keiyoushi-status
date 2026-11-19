# Extension Validation Report

- Extension: tachiyomi-en.readkagurabachimangaonline-v1.6.2
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
- Source ID: 5627354626280682563
- Source name: Read Kagurabachi Manga Online
- Source language: en
- Selected manga input: popular offset 0: Kagurabachi (`https://ww2.readkagurabachimanga.com/.../kagurabachi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Kagurabachi (`https://ww2.readkagurabachimanga.com/.../kagurabachi`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kagurabachi (`https://ww2.readkagurabachimanga.com/.../kagurabachi`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kagurabachi (`https://ww2.readkagurabachimanga.com/.../kagurabachi`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 143 | Kagurabachi Chapter 1 - Mission (`https://ww2.readkagurabachimanga.com/.../kagurabachi-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 58 |  |  | <1s |

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
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kagurabachi, URL=`https://ww2.readkagurabachimanga.com/.../kagurabachi` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 7/7 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://ww2.readkagurabachimanga.com/.../kagurabachi`, popular entry 2: `https://ww2.readkagurabachimanga.com/.../enten`, popular entry 3: `https://ww2.readkagurabachimanga.com/.../chain` |  |  |  |
| thumbnail URLs | LINT | 0/7 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `https://ww2.readkagurabachimanga.com/.../kagurabachi` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../N5ZF28b.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Young Chihiro spends his days training under his famous swordsmith father. One day he hopes to become a great sword-maker himself. The goofy father and the serious son—they thought these days would last forever. But suddenly, tragedy strikes. A dark day soaked in blood. Chihiro and his blade now live only for revenge. Epic sword battle action! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 143 chapters |  |  |  |
| chapter dates | LINT | All 143 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=143 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 143 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 58 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.readkagurabachimanga.com/.../1.jpeg` (image/jpeg, 529633 bytes, 1200x1800) |  |  |  |
