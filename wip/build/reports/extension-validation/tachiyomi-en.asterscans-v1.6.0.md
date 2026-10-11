# Extension Validation Report

- Extension: tachiyomi-en.asterscans-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: mangathemesia
- Source ID: 1931493862544259486
- Source name: Aster Scans
- Source language: en
- Selected manga input: popular offset 0: My husband hid the child (`.../my-husband-hid-the-child`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | My husband hid the child (`.../my-husband-hid-the-child`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 16 | Obsession (`.../obsession`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | My husband hid the child (`.../my-husband-hid-the-child`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My husband hid the child (`.../my-husband-hid-the-child`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 11 | Chapter 1 (`.../my-husband-hid-the-child-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | <1s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My husband hid the child, URL=`.../my-husband-hid-the-child` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 33/33 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 33/33 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../ChatGPT_Image_Sep_4_2026_05_18_03_PM-228x300.jpg` (image/jpeg, 23917 bytes, 228x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-husband-hid-the-child` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../ChatGPT_Image_Sep_4_2026_05_18_03_PM.jpg` (image/jpeg, 824671 bytes, 1094x1438) |  |  |  |
| details author | PASS | Crotch |  |  |  |
| details artist | PASS | Ryusol |  |  |  |
| details genres | PASS | Childcare, Comedy, Office romance, Parenting, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The woman wearing a pink dress vanished, leaving behind an intense, unforgettable night. For a full year, he longed for her, agonizing over the pure innocence she took away with her. Much like that sudden night she first appeared, Yuyoung re-entered Baek-ju’s life—this time as his new secretary, wearing an innocent face as if she were meeting him for the very first time. However, something is suspicious about the photograph Yuyoung always keeps close to her heart. “Wait… doesn’t this kid look exactly like me?” It seems he has finally uncovered the secret of the woman who disappeared.<br><br>Alternative Names: <br>- The husband hid the child<br>- 남편이 아이를 숨겼다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://asterscans.com/.../01.jpg` (image/jpeg, 1262240 bytes, 800x15223) |  |  |  |
