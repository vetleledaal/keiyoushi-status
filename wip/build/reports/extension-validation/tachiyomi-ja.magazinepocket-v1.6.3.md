# Extension Validation Report

- Extension: tachiyomi-ja.magazinepocket-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 583369548372015159
- Source name: Magazine Pocket
- Source language: ja
- Selected manga input: latest offset 0: 聖☆おにいさん (`.../01938`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | シャングリラ・フロンティア～クソゲーハンター、神ゲーに挑まんとす～ (`.../01191`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | 屋根の下のアルテミス (`.../02798`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 649 | 聖☆おにいさん (`.../01938`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 聖☆おにいさん (`.../01938`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 聖☆おにいさん (`.../01938`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 178 | 【その1】ブッダの休日 (`.../359509`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 4 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 649 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=聖☆おにいさん, URL=`01938` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 700/700 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 700/700 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mgpk-cdn.magazinepocket.com/.../title_grid_wide_20221006192834d26ad27a951bc4f56a7675bca06cd500.png` (image/png, 75305 bytes, 480x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `01938` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mgpk-cdn.magazinepocket.com/.../title_grid_square_20221006192834106016f960d861cfa63c074ff3f475e2.png` (image/png, 45998 bytes, 320x320) |  |  |  |
| details author | PASS | 中村光 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ギャグ・コメディー・日常, アニメ化, 実写化, 有名漫画賞 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 目覚めた人ブッダ、神の子イエス。世紀末を無事に越えた二人は、東京・立川でアパートをシェアし、下界でバカンスを過ごしていた。近所のおばあちゃんのように、細かいお金を気にするブッダ。衝動買いが多いイエス。そんな“最聖”コンビの立川デイズ。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 178 chapters |  |  |  |
| chapter dates | PASS | 178 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mgpk-cdn.magazinepocket.com/.../4e8324089a6495ccfa89a341a31ef08f2dfbb2ea76ebd5c47265e1833db12a83.jpg <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 399200 bytes, 1125x1600) |  |  |  |
