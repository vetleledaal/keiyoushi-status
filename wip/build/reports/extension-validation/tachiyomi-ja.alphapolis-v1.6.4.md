# Extension Validation Report

- Extension: tachiyomi-ja.alphapolis-v1.6.4
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
- Source ID: 1943011614685426671
- Source name: Alphapolis
- Source language: ja
- Selected manga input: popular offset 0: 勘違いの工房主 (`.../895000315`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 勘違いの工房主 (`.../895000315`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 48 | アズラエル家の次男は半魔 [R18] (`.../462000631`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 48 | 地味薬師令嬢はもう契約更新いたしま... (`.../20000659`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 勘違いの工房主 (`.../895000315`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 勘違いの工房主 (`.../895000315`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 74 | 第1回『そんなよくある物語』 (`.../3502`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=勘違いの工房主, URL=`.../895000315` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 127/127 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 127/127 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-image.alphapolis.co.jp/.../670x300.webp` (image/webp (encoding: lossy), 101530 bytes, 670x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../895000315` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-image.alphapolis.co.jp/.../670x300.webp` |  |  |  |
| details author | PASS | 時野洋輔 |  |  |  |
| details artist | PASS | 古川奈春 |  |  |  |
| details genres | PASS | ファンタジー, 異世界, 生産系, 追放, チート |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ある日突然「役立たずだから」と英雄パーティを追い出されてしまった心優しい少年・クルト。武器も魔法も、戦闘に関するあらゆる適性が最低ランクだと判明した彼は、生計を立てるため城壁工事や採掘の仕事を買って出るのだが――なんとそこでは人間業とは思えぬ技術で大活躍！ 実はクルトは、料理に建築、採掘に魔道具作り……戦闘以外のあらゆる適性が最高のSSSランクだったのだ。しかし当人はその才能にまったく気づいておらず、無自覚な行動で人を、町を、果ては国まで救ってしまうことに⁉ アルファポリスファンタジー小説大賞、読者賞受賞の話題作が待望のコミカライズ！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 74 chapters |  |  |  |
| chapter dates | LINT | 44 of 74 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=44 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ot-image.alphapolis.co.jp/.../1080x1536.webp <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/webp (encoding: lossy), 991698 bytes, 1080x1536) |  |  |  |
