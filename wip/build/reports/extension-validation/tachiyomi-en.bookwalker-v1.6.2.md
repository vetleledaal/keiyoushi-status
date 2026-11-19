# Extension Validation Report

- Extension: tachiyomi-en.bookwalker-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 25
- Lint: 0
- Warnings: 2
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2744810059574599668
- Source name: BookWalker
- Source language: en
- Selected manga input: popular offset 0: Kiss or Die Trying! (`.../kiss-or-die-trying`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 59 | Kiss or Die Trying! (`.../kiss-or-die-trying`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 60 | Travel Japan, Learn Japanese (`.../travel-japan-learn-japanese`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 60 | A Certain Scientific Railgun (`.../a-certain-scientific-railgun`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 60 | Replica（DMP） (`.../replicadmp`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kiss or Die Trying! (`.../kiss-or-die-trying`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kiss or Die Trying! (`.../kiss-or-die-trying`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 59 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kiss or Die Trying!, URL=`.../kiss-or-die-trying` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 240/240 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 203/240 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.sos-dan.net/.../ZAYMF3RKSEAAFJ884Q84M.webp` (image/webp (container: extended), 86664 bytes, 505x720) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kiss-or-die-trying` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://img.sos-dan.net/.../ZAYMF3RKSEAAFJ884Q84M.webp` (image/webp (container: extended), 169366 bytes, 842x1200) |  |  |  |
| details author | PASS | Den Mitao |  |  |  |
| details artist | PASS | Den Mitao |  |  |  |
| details genres | PASS | Boys Love, Romance, Comedy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kanemaru, a chronic serial dater, takes an interest in Liu, a transfer student at his college who works at his favorite Chinese eatery. But just as Kanemaru works up the courage to ask Liu out, they're suddenly attacked by a gang of kidnappers! Each and every time the stars align and things start to heat up between the two, a wild and unpredictable predicament just so happens to get in the way… But even with the entire universe seemingly against him, Kanemaru is determined to do whatever it takes to get his man and land a kiss on Liu's lips-even if it kills him! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
