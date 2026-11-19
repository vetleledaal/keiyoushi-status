# Extension Validation Report

- Extension: tachiyomi-en.complexbowler-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6359307016277841551
- Source name: Complex Bowler
- Source language: en
- Selected manga input: popular offset 0: Captain Tsubasa (`.../captaintsubasa`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 2 | Captain Tsubasa (`.../captaintsubasa`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Captain Tsubasa (`.../captaintsubasa`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Captain Tsubasa (`.../captaintsubasa`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 107 | Ch. 1 (`.../rsf1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

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
| popular listing | PASS | 2 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Captain Tsubasa, URL=`.../captaintsubasa` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 3/3 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 3/3 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.imgchest.com/.../436ac23d3abb.jpg` (image/jpeg, 318003 bytes, 857x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../captaintsubasa` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.imgchest.com/.../436ac23d3abb.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | This is the ninth and concluding manga arc of the Captain Tsubasa narrative. It continues directly from Rising Sun, detailing Olympic Japan's journey through the remainder of the Madrid Olympics.<br><br>As series creator Yoichi Takahashi announced his retirement, the arc will be released in a rough draft/storyboard format (pencil sketches without inking or toning) on the \[Captain Tsubasa WORLD\](https://captain-tsubasa.world/.../en) website, under the title Captain Tsubasa Rising Sun FINALS.<br><br>We are currently working on the **fast translation** for this release. If you'd like to proofread the chapters, please get in touch.<br><br>**Alternative Names:**<br>- Captain Tsubasa Rising Sun Finals |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 107 chapters |  |  |  |
| chapter dates | LINT | All 107 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=107 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.imgchest.com/.../a3e4070c5970.png` (image/png, 34702 bytes, 839x1199) |  |  |  |
