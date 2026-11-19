# Extension Validation Report

- Extension: tachiyomi-ja.mangatimesquare-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 5972758064357912813
- Source name: Manga Time Square
- Source language: ja
- Selected manga input: popular offset 0: 夜の缶詰 (`.../12207421984289785793`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 23 | 夜の缶詰 (`.../12207421984289785793`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 23 | ローカル女子の遠吠え (`.../12207421983530024760`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 夜の缶詰 (`.../12207421984289785793`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 夜の缶詰 (`.../12207421984289785793`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | 第1話 (`.../12207421984289830557`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 23 entries |  |  |  |
| latest listing | PASS | 23 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=夜の缶詰, URL=`12207421984289785793` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.mangatime-square.com/.../12207421984289785793-76749b8fbd67571458b448a83aee463c <redacted query values: 1792726590>` (image/jpeg, 491752 bytes, 700x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421984289785793` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.mangatime-square.com/.../12207421984289785793-76749b8fbd67571458b448a83aee463c <redacted query values: 1792726590>` |  |  |  |
| details author | PASS | メノタ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | おいしい食事や文化に憧れ地球にやってきた宇宙人のユビノ。しかし彼女が夢見た地上人とその文明はすでに滅んでいた。現在地球で暮らす地底人の少女・ルノに出会い、『夜』の缶詰を食べる事で、ユビノは地球の思い出を映像化させる。こうして2人で滅んだ地上人の軌跡を探す生活が始まった。【毎月第3金曜日更新！】 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.mangatime-square.com/.../12207421984289899008-1514355086849ca88fbd599a7810b155` (image/jpeg, 620524 bytes, 1350x1938) |  |  |  |
