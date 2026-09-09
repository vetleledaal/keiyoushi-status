# Extension Validation Report

- Extension: tachiyomi-en.mangatx-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3274683761704614629
- Source name: MangaTX
- Source language: en
- Selected manga input: latest offset 0: From Goblin to Goblin God (`.../from-goblin-to-goblin-god`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Martial Peak (`.../martial-peak`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | From Goblin to Goblin God (`.../from-goblin-to-goblin-god`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 30 | From Goblin to Goblin God (`.../from-goblin-to-goblin-god`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | From Goblin to Goblin God (`.../from-goblin-to-goblin-god`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 113 | # Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=From Goblin to Goblin God, URL=`.../from-goblin-to-goblin-god` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 90/90 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 90/90 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://azmin.manga18.us/.../cover_250x350.jpg` (image/jpeg, 18492 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../from-goblin-to-goblin-god` |  |  |  |
| details thumbnail URL | PASS | `https://azmin.manga18.us/.../cover_250x350.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | From Goblin to Goblin God Manhua Lin Tian reincarnated as a goblin, the lowest rank of magical creatures, and initially, he had to lie low. Later, he fully unleashed the true nature of a goblin. Blessed with many offspring, the more children he has, the stronger he becomes thanks to the blessings from the gods!<br><br>Alternative Names: Other Name: From Goblin to Goblin God |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 113 chapters |  |  |  |
| chapter dates | PASS | 113 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://azmin.manga18.us/.../01.webp` (image/webp (container: extended), 289860 bytes, 700x4671) |  |  |  |
