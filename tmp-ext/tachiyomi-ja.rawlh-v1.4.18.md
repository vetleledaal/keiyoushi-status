# Extension Validation Report

- Extension: tachiyomi-ja.rawlh-v1.4.18
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 0
- Warnings: 3
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: fmreader
- Source ID: 7595224096258102519
- Source name: WeLoveManga
- Source language: ja
- Selected manga input: latest offset 0: Chikubi × Buddy (`.../0YGPp`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Parallel Paradise - Raw (`.../0x4Hj`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | One Punch Man (manga) (`.../0ctK9`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Chikubi × Buddy (`.../0YGPp`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Roku Nensei To Shitai Koto (`.../0YQwP`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Chikubi × Buddy (`.../0YGPp`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 3 | 1 (`.../e2Cw0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 79/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.ihlv1.xyz/.../chikubi-buddy_6a8fcbc525e71.jpg <redacted query values: imgmax>` (image/jpeg, 252085 bytes, 320x457) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../0YGPp` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://s4.ihlv1.xyz/.../chikubi-buddy_6a8fcbc525e71.jpg` (image/jpeg, 252085 bytes, 320x457) |  |  |  |
| details author | PASS | Kage Makanaiji |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Noir is a rookie spy! The first words from their senior are "We're going to touch nipples!?" Complete the mission by locking nipples! The long-awaited serialization of the spy gag manga that won the X-Compe (X Compe Grand Prix)!<br><br>Alternative Name: チクビ×バディ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://weloma.net/.../manga-list.html <redacted query values: listType, page, sort, and sort_type>` to `https://weloma.net/.../qxjLQ` (1 redirects); popular_next: `https://weloma.net/.../manga-list.html <redacted query values: listType, page, sort, and sort_type>` to `https://weloma.net/.../qxjiZ` (1 redirects); latest: `https://weloma.net/.../manga-list.html <redacted query values: listType, page, sort, and sort_type>` to `https://weloma.net/.../qcFhA` (1 redirects); latest_next: `https://weloma.net/.../manga-list.html <redacted query values: listType, page, sort, and sort_type>` to `https://weloma.net/.../qcZPV` (1 redirects) |  |  |  |
| page load | PASS | `https://ihlv1.xyz/.../d4a5467f07ae6b1ea63299f78328808801.jpg` (image/jpeg, 236940 bytes, 800x1143) |  |  |  |
