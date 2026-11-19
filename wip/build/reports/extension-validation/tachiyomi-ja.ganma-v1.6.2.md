# Extension Validation Report

- Extension: tachiyomi-ja.ganma-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8045942616403978870
- Source name: GANMA!
- Source language: ja
- Selected manga input: popular offset 0: 子連れバツイチ、最後の恋は沼でした。 (`.../kozurenuma`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 35 | 子連れバツイチ、最後の恋は沼でした。 (`.../kozurenuma`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | 地雷なんですか？地原さん (`.../chiharasan`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 9 | 婚約相手の公爵様に塩対応されています (`.../yomikiri202603_27`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | 子連れバツイチ、最後の恋は沼でした。 (`.../kozurenuma`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 子連れバツイチ、最後の恋は沼でした。 (`.../kozurenuma`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 85 | 第1話 パートナーなんてもういらない (`.../074b6c90-8cca-11ee-8d15-e65e7f1fda06`) |  | <1s |
| pages | `getPageList(chapter)` | success | 49 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 35 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=子連れバツイチ、最後の恋は沼でした。, URL=`kozurenuma` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 84/84 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 84/84 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://d1bzi54d5ruxfk.cloudfront.net/.../3abe18f4-0af6-4708-b0c2-4238dba70f88.jpg <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/jpeg, 644603 bytes, 1180x1770) |  |  |  |
| details identity | PASS | Details preserved selected URL `kozurenuma` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://d1bzi54d5ruxfk.cloudfront.net/.../1adae790-9265-11ee-a8d1-d61a836115a9.jpg <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/jpeg, 367003 bytes, 1180x1180) |  |  |  |
| details author | PASS | 餅本もよ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ラブコメ, 恋愛, ドラマ, 女性向け, ハートフル, 広告掲載中, バツ沼 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 男ギライのシングルマザーのお隣さんは、女を沼らせる年下男子！？クズのくせに、特技は料理と育児。それなんてスパダリ？？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 85 chapters |  |  |  |
| chapter dates | PASS | 85 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 49 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://d1bzi54d5ruxfk.cloudfront.net/.../1.jpg <redacted query values: Policy, Signature, Key-Pair-Id, and w>` (image/webp (container: extended), 284400 bytes, 1313x1850) |  |  |  |
