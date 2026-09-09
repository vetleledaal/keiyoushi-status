# Extension Validation Report

- Extension: tachiyomi-ja.ganma-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8045942616403978870
- Source name: GANMA!
- Source language: ja
- Selected manga input: latest offset 0: 君に捧げる男前 (`.../otokomae`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 35 | 子連れバツイチ、最後の恋は沼でした。 (`.../kozurenuma`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | 君に捧げる男前 (`.../otokomae`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | 大人として小春くんには手を出しません (`.../yomikiri202507_31`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | 君に捧げる男前 (`.../otokomae`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 君に捧げる男前 (`.../otokomae`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 169 | 第1話 思った以上に男前だった話 (`.../ca0a0ce0-29c0-11ee-a728-c63d24def2b0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=君に捧げる男前, URL=`otokomae` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 85/85 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 85/85 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://d1bzi54d5ruxfk.cloudfront.net/.../f98276c0-4beb-11f0-94ed-469351b678be.jpg <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/jpeg, 477682 bytes, 1920x1276) |  |  |  |
| details identity | PASS | Details preserved selected URL `otokomae` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://d1bzi54d5ruxfk.cloudfront.net/.../d6768010-2f30-11ee-8378-b6b1bae27fd5.jpg <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/jpeg, 356938 bytes, 1180x1180) |  |  |  |
| details author | PASS | 文之助 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 恋愛, ラブコメ, 女性向け, きみささ, 1か月先読み |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 「毎日 愛を伝えに行きます！」年下イケメンが初対面で告白!?犬系男子×男前女子の凸凹な恋が始まる──── |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 169 chapters |  |  |  |
| chapter dates | PASS | 169 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://d1bzi54d5ruxfk.cloudfront.net/.../1.jpg <redacted query values: Policy, Signature, Key-Pair-Id, and w>` (image/jpeg, 1644605 bytes, 1975x2783) |  |  |  |
