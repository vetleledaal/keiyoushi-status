# Extension Validation Report

- Extension: tachiyomi-en.arcrelight-v1.4.16
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source theme: mangadventure
- Source ID: 6809555026902049727
- Source name: Arc-Relight
- Source language: en
- Selected manga input: popular offset 0: Steins;Gate - Babel of the Grieved Maze (`.../babel`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 13 | Steins;Gate - Babel of the Grieved Maze (`.../babel`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 13 | Chaos;Child - Children's Collapse (`.../childrens-collapse`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Steins;Gate - Babel of the Grieved Maze (`.../babel`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Steins;Gate - Babel of the Grieved Maze (`.../babel`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 7 | Vol. 1, Ch. 0: Prologue (`.../12`) |  | <1s |
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
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | PASS | 13 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Steins;Gate - Babel of the Grieved Maze, URL=`babel` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 27/27 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 27/27 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://arc-relight.com/.../cover.jpeg` (image/jpeg, 323075 bytes, 844x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `babel` |  |  |  |
| details thumbnail URL | PASS | `https://arc-relight.com/.../cover.jpeg` |  |  |  |
| details author | PASS | MAGES., Nitroplus |  |  |  |
| details artist | PASS | Nariie Shinichirou |  |  |  |
| details genres | PASS | Drama, Mystery, Sci-Fi, Seinen, Steins;Gate, Tragedy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | An alternate take on the original Steins;Gate story, this time told from Makise Kurisu's point of view. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://arc-relight.com/.../72bb00014738e3b8ba94a80dc81354d2.jpg` (image/jpeg, 1884878 bytes, 2542x1000) |  |  |  |
