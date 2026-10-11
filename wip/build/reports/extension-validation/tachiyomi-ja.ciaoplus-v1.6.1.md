# Extension Validation Report

- Extension: tachiyomi-ja.ciaoplus-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 1585589665574145721
- Source name: Ciao Plus
- Source language: ja
- Selected manga input: latest offset 0: メイドは恋する蜂谷くん (`.../00247`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | 上杉くんは女の子をやめたい (`.../00577`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | ちゃおプラス新人まんが賞 結果発表 (`.../00442`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 726 | メイドは恋する蜂谷くん (`.../00247`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | メイドは恋する蜂谷くん (`.../00247`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | メイドは恋する蜂谷くん (`.../00247`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 61 | 第1話（前編） (`.../5555`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| latest listing | PASS | 726 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=メイドは恋する蜂谷くん, URL=`00247` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 777/777 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 777/777 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.ciao.shogakukan.co.jp/.../banner_20260220104232e47a5478c5c30a341c72e782832e9064.jpg` (image/jpeg, 258140 bytes, 1340x1005) |  |  |  |
| details identity | PASS | Details preserved selected URL `00247` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.ciao.shogakukan.co.jp/.../banner_20260220104232e47a5478c5c30a341c72e782832e9064.jpg` |  |  |  |
| details author | PASS | 小森チヒロ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ラブ |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 女装メイドがイケメン恋敵をオトす！？　俺は蜂谷。健全な男子高校生だ！ 愛する花園さんに告白するが、「親が決めた婚約者がいるから」とフラれてしまった。相手はお金持ちでイケメンでおまけに性格もいい池貝くん。つまり…全女子が婚約者ですって出されたら特に好きじゃなくてもまんざらでもないタイプの男。つまり…フツーに戦っても、俺の勝ち目はゼロ！ だが俺はいい案を思いついた。女装して池貝家のメイドになり、池貝くんをホレさせて婚約を破談にしてやるぜ！ ちょっぴりおバカな男の娘メイドが引き起こす、ドタバタ三角関係（？）コメディ！<br><br>毎月9日前後 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 61 chapters |  |  |  |
| chapter dates | PASS | 61 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.ciao.shogakukan.co.jp/.../d8ce2c935b8dca6e9bd371036b9c00076a64f83e858c8d2234560ce018a77557.jpg <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 772036 bytes, 1303x2048) |  |  |  |
