# Extension Validation Report

- Extension: tachiyomi-zh.roumanwu-v1.6.25
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3647420805839021718
- Source name: 肉漫屋
- Source language: zh
- Selected manga input: popular offset 0: 愛愛桌遊社 (`.../cmv9qcfrh0002s6hdfg7ly694`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | 愛愛桌遊社 (`.../cmv9qcfrh0002s6hdfg7ly694`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | 一發致富 (`.../cmu4b8s530003s6igzr2zla2y`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | 愛愛桌遊社 (`.../cmv9qcfrh0002s6hdfg7ly694`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 愛愛桌遊社 (`.../cmv9qcfrh0002s6hdfg7ly694`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 愛愛桌遊社 (`.../cmv9qcfrh0002s6hdfg7ly694`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 12 | 第1話-立志靠桌遊脫單 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 260 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=愛愛桌遊社, URL=`.../cmv9qcfrh0002s6hdfg7ly694` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://towm85.xyz/.../czM6Ly9yb3VtYW4vaW1hZ2VzL2NtdjlxY2ZyaDAwMDJzNmhkZmc3bHk2OTQvY292ZXIuanBn.jpg` (image/webp (encoding: lossy), 42868 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cmv9qcfrh0002s6hdfg7ly694` |  |  |  |
| details thumbnail URL | PASS | `https://towm85.xyz/.../czM6Ly9yb3VtYW4vaW1hZ2VzL2NtdjlxY2ZyaDAwMDJzNmhkZmc3bHk2OTQvY292ZXIuanBn.jpg` |  |  |  |
| details author | PASS | ZIGIZ&色魔神功 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 韓國 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 我原本加入桌遊社只是想脫單，沒想到卻偶然入手一款超擬真的桌遊，只要遊戲任務失敗，就要面臨各種臉紅心跳的色色懲罰。重點是，如果我們不完成這場遊戲，就出不了社辦…! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | LINT | 11 of 12 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=11 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 260 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://v1.towm85.xyz/.../czM6Ly9yb3VtYW4vaW1hZ2VzL2NtdjlxY2ZyaDAwMDJzNmhkZmc3bHk2OTQvZnJlZXgvNTg2MjYvNTI5NTM4Mi5qcGc.jpg` (image/jpeg, 41379 bytes, 720x800) |  |  |  |
