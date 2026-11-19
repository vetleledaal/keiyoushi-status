# Extension Validation Report

- Extension: tachiyomi-ja.jumptoon-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2618336401735517644
- Source name: Jump Toon
- Source language: ja
- Selected manga input: popular offset 0: あざといちゃんとヤンキーくん (`.../JT00059`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | あざといちゃんとヤンキーくん (`.../JT00059`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 42 | パーフェクトナンバー (`.../JT00118`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | あざといちゃんとヤンキーくん (`.../JT00059`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | あざといちゃんとヤンキーくん (`.../JT00059`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 96 | 第1話 - あざとい愛梨ちゃん (`.../14219`) |  | <1s |
| pages | `getPageList(chapter)` | success | 104 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 42 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=あざといちゃんとヤンキーくん, URL=`JT00059` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://assets.jumptoon.com/.../Qi26LGoZTuyyISNqY3xbeA.png` (image/png, 683229 bytes, 720x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `JT00059` |  |  |  |
| details thumbnail URL | PASS | `https://assets.jumptoon.com/.../Qi26LGoZTuyyISNqY3xbeA.png` |  |  |  |
| details author | PASS | ゆず未来 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少女, 青春・学園, ラブコメ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 高校1年生の中谷愛梨は顔も性格も可愛くて、明るくて愛嬌があって、ちょっぴりあざとい。<br>おかげで学校の全男子にモテる愛梨だったが、どうしても1人だけオトせない男子がいた。<br>同じクラスのヤンキー・橘蓮太郎はどんなにあざとい仕草で仕掛けても愛梨になびかない。<br>そんな蓮太郎にはある秘密があって…？<br>器用だけど不器用な2人のニヤニヤきゅんきゅんラブコメ♡<br><br>©ゆず未来／集英社 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 96 chapters |  |  |  |
| chapter dates | PASS | 96 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 104 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://contents.jumptoon.com/.../ef3ac23a174712ea3ac0fe155d4855d6e7073ed757f3c031a0a89e3de92ba489.webp <redacted query values: bit, expiration, and signature>` (image/webp (encoding: lossy), 249138 bytes, 760x1000) |  |  |  |
