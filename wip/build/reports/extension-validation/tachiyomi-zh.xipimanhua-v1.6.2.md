# Extension Validation Report

- Extension: tachiyomi-zh.xipimanhua-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 10879178251255350
- Source name: 嬉皮漫畫
- Source language: zh
- Selected manga input: popular offset 0: 一人之下 (`.../bToyMzQ3NQ`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | 一人之下 (`.../bToyMzQ3NQ`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | 大象无形 (`.../bToyMzQ4NQ`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | 我獨自在高塔種田 (`.../bToyOTYzMw`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | 回档人生 (`.../bToyODUzMA`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | 一人之下 (`.../bToyMzQ3NQ`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 一人之下 (`.../bToyMzQ3NQ`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 822 | 1.姐姐1 (`.../bToyMzQ3NS1jOjU5NTk1-MjM0NzU6MS4wMA`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 10s+ |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=一人之下, URL=`bToyMzQ3NQ` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 75/75 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 75/75 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.s3imgs.top/.../yi-ren-zhi-xia-tencent-531490-17793-eWktcmVuLXpoaS14aWEtdGVuY2VudC01MzE0OTAtMTc3OTM.webp` (image/webp (encoding: lossy), 48594 bytes, 420x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `bToyMzQ3NQ` |  |  |  |
| details thumbnail URL | PASS | `https://cover.s3imgs.top/.../yi-ren-zhi-xia-tencent-531490-17793-eWktcmVuLXpoaS14aWEtdGVuY2VudC01MzE0OTAtMTc3OTM.webp` |  |  |  |
| details author | PASS | 米二, 米橙子 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 国漫, 战斗, 搞笑 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 【一人之下6定档1月2日！】大学生张楚岚清明回乡，遭遇神秘少女冯宝宝。素未谋面的冯宝宝却对张楚岚异常熟悉，并将其带去自己打工的快递公司。为了帮冯宝宝寻找她的身世，也为了查清自己与爷爷身上的秘密，张楚岚的生活被彻底颠覆，与冯宝宝一同踏上“异人”之旅。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 822 chapters |  |  |  |
| chapter dates | PASS | 822 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hip-tx-1.s3imgs.top/.../dHg6MjM0NzU6MToxOjMzMjAx_1.36n7im.webp` (image/webp (encoding: lossy), 132964 bytes, 1200x1906) |  |  |  |
