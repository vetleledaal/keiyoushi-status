# Extension Validation Report

- Extension: tachiyomi-zh.toptoon-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 0
- Warnings: 2
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1680248666203661128
- Source name: TOPTOON頂通
- Source language: zh
- Selected manga input: popular offset 0: 飛機杯女神連線中 (`.../81163`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | 飛機杯女神連線中 (`.../81163`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 1105 | 慾海交鋒 (`.../81102`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 飛機杯女神連線中 (`.../81163`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 飛機杯女神連線中 (`.../81163`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 87 | 第1話 堪比真人的飛機杯 (`.../58613`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 1105 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=飛機杯女神連線中, URL=`.../81163` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 1207/1207 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1207/1207 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tw-contents-image.toptoon.net/.../1738_1777367862.1302.jpg` (image/jpeg, 37446 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../81163` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tw-contents-image.toptoon.net/.../1738_1777367861.9777.jpg` (image/jpeg, 72541 bytes, 750x400) |  |  |  |
| details author | PASS | 一日三尻&不倒翁&灰背隼 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | NTL, 現代奇幻, 雙重生活, 後宮, SM, 女大生, 飛機杯, 小說改編, 校園 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 這個偶然購入的飛機杯有夠神奇，它似乎可以跟我腦中所想的女人連動!既然如此，就先用校園女神來測試看看… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 87 chapters |  |  |  |
| chapter dates | PASS | 87 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://www.toptoon.net/.../58613` to `https://www.toptoon.net/.../81163` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
