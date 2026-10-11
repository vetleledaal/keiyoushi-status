# Extension Validation Report

- Extension: tachiyomi-ja.booklistastudio-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 3
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 4993360009034397146
- Source name: Booklista Studio
- Source language: ja
- Selected manga input: popular offset 0: 追放戦士の反省譚〜最強ギルドを追放されて反省し、効率厨をやめて非効率な恋と友情に目覚める話〜 (`.../6ade0e67637b0`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 17 | 追放戦士の反省譚〜最強ギルドを追放されて反省し、効率厨をやめて非効率な恋と友情に目覚める話〜 (`.../6ade0e67637b0`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 悪妃エリーゼは死にました (`.../416d7e1ee5e93`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 21 | 曇天の燕 (`.../b4ee5e332ee7a`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 追放戦士の反省譚〜最強ギルドを追放されて反省し、効率厨をやめて非効率な恋と友情に目覚める話〜 (`.../6ade0e67637b0`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 追放戦士の反省譚〜最強ギルドを追放されて反省し、効率厨をやめて非効率な恋と友情に目覚める話〜 (`.../6ade0e67637b0`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 9 | 第1話 (`.../080e3f6d190c6`) |  | <1s |
| pages | `getPageList(chapter)` | success | 58 |  |  | 1-10s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=追放戦士の反省譚〜最強ギルドを追放されて反省し、効率厨をやめて非効率な恋と友情に目覚める話〜, URL=`6ade0e67637b0` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20230227095629344CB933CA1C7975E3C7E39A6F48F6655D7-lg.png` (image/png, 469910 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `6ade0e67637b0` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20230227095629344CB933CA1C7975E3C7E39A6F48F6655D7.png` (image/png, 1294906 bytes, 1280x672) |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ※制作進行の都合により、更新をしばらくお休みさせていただきます。<br>【もう一つの現実】と称賛され、欧米で大ヒット中のVRMMORPG「アトランティス・オンライン」。<br>九鬼勇児は、効率偏重なプレイスタイルと裏技を駆使し、『世界最強の魔法戦士シュテル』として名を馳せていた。<br>しかし、効率偏重なプレイスタイルは不協和音を生み、仲間と恋人に裏切られ、自身が築き上げた最強ギルドからも追放されてしまう。<br>最強の座からの転落。失意の中、勇児は効率のために無視してきた友情や恋と向かい合いーー<br>世界的に大ヒットしたMMORPGのトッププレイヤーだった原作者が紡ぐ、追放戦士の反省譚、開幕！<br><br>原作：茶谷葉<br>原作協力：青木健生<br>作画：Mediassort Inc. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 58 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.studio.booklista.co.jp/.../master-1668598879444-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 4, 11, 15, 10, 0, 6, 12, 13, 3, 14, 9, 1, 7, 2, 5\]` (image/jpeg, 406422 bytes, 760x2560) |  |  |  |
