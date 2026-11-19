# Extension Validation Report

- Extension: tachiyomi-en.lovesjanescans-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3971812949560196318
- Source name: Lovesjane Scans
- Source language: en
- Selected manga input: popular offset 0: Miyeon (`.../28`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 5 | Miyeon (`.../28`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 5 | Lohandra Scandal (`.../152`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Miyeon (`.../28`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Miyeon (`.../28`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 22 | Chapter 36 (`.../chapter-36`) |  | <1s |
| pages | `getPageList(chapter)` | success | 4 |  |  | <1s |

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
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 5 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Miyeon, URL=`28` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 11/11 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 11/11 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://lovesjane.site/.../miyeons2-175x238.png` (image/png, 67638 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `28` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://lovesjane.site/.../miyeons2-193x278.png` (image/png, 83966 bytes, 193x278) |  |  |  |
| details author | PASS | Seonye |  |  |  |
| details artist | PASS | Seonye |  |  |  |
| details genres | PASS | drama, manhwa, romance, actress, amnesia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Picture this: It’s your final year of high school, and you can’t wait to get out there and live your best life. You blush at the popular kid, and eye the new transfer student with bruises on his face. You’re looking forward to the future… Until you wake up in the future, with no memory of the last six years. Suddenly finding herself as a 25-year-old aspiring actress, Seo Miyeon begins to unravel the painful threads of her forgotten past.<br><br>Alternative Names: 19/25 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 22 chapters |  |  |  |
| chapter dates | PASS | 22 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `http://lovesjane.site/.../IMG_2008.jpg` (image/jpeg, 4149666 bytes, 1080x43648) |  |  |  |
