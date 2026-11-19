# Extension Validation Report

- Extension: tachiyomi-en.readbleachmangaonline-v1.6.2
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
- Source ID: 8536242988682411945
- Source name: Read Bleach Manga Online
- Source language: en
- Selected manga input: popular offset 0: Bleach (`https://ww7.readbleachmanga.com/.../bleach`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 7 | Bleach (`https://ww7.readbleachmanga.com/.../bleach`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 6 | Bleach (`https://ww7.readbleachmanga.com/.../bleach`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Bleach (`https://ww7.readbleachmanga.com/.../bleach`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 694 | Bleach Chapter 1 - Bleach Chapter 001 Online (`https://ww7.readbleachmanga.com/.../bleach-chapter-001`) |  | <1s |
| pages | `getPageList(chapter)` | success | 60 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bleach, URL=`https://ww7.readbleachmanga.com/.../bleach` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 13/13 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://ww7.readbleachmanga.com/.../bleach`, popular entry 2: `https://ww7.readbleachmanga.com/.../bleach-digital-colored-comics`, popular entry 3: `https://ww7.readbleachmanga.com/.../bleach-the-unforgivens` |  |  |  |
| thumbnail URLs | LINT | 0/13 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `https://ww7.readbleachmanga.com/.../bleach` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../Vf65wQL.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Ichigo Kurosaki has always been able to see ghosts, but this ability doesn’t change his life nearly as much as his close encounter with Rukia Kuchiki, a Soul Reaper and member of the mysterious Soul Society. While fighting a Hollow, an evil spirit that preys on humans who display psychic energy, Rukia attempts to lend Ichigo some of her powers so that he can save his family; but much to her surprise, Ichigo absorbs every last drop of her energy. Now a full-fledged Soul Reaper himself, Ichigo quickly learns that the world he inhabits is one full of dangerous spirits and, along with Rukia—who is slowly regaining her powers—it’s Ichigo’s job to protect the innocent from Hollows and help the spirits themselves find peace. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 694 chapters |  |  |  |
| chapter dates | LINT | All 694 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=694 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 694 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.readbleachmanga.com/.../1.jpg` (image/jpeg, 134605 bytes, 1066x1600) |  |  |  |
