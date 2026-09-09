# Extension Validation Report

- Extension: tachiyomi-zh.toptoon-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 30
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1680248666203661128
- Source name: TOPTOON頂通
- Source language: zh
- Selected manga input: latest offset 0: 青春戀愛紀錄 (`.../80758`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 100 | 飛機杯女神連線中 (`.../81163`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 1084 | 青春戀愛紀錄 (`.../80758`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 青春戀愛紀錄 (`.../80758`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 青春戀愛紀錄 (`.../80758`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 152 | 第1話 希媛的側臉 (`.../36829`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| latest listing | PASS | 1084 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=青春戀愛紀錄, URL=`.../80758` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 1185/1185 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1185/1185 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tw-contents-image.toptoon.net/.../1300_1611043316.8320.jpg` (image/jpeg, 124906 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../80758` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tw-contents-image.toptoon.net/.../1300_1683709787.8643.jpg` (image/jpeg, 63526 bytes, 750x400) |  |  |  |
| details author | PASS | 抹巧餅乾  |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | , 暢銷作品 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 木訥的建宇和冷漠的希媛座位相連，建宇無心的一句話讓希媛宛如冰塊一般的心臟開始融化了，十幾歲高中生們青澀又甜蜜的初戀! |  |  |  |
| metadata trimming | LINT | Untrimmed fields: author |  |  |  |
| chapters | PASS | 152 chapters |  |  |  |
| chapter dates | PASS | 152 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://tw-contents-image.toptoon.net/.../1300_36829_1611036522.058.jpg <redacted query values: key and time>` (image/jpeg, 424473 bytes, 720x4200) |  |  |  |
