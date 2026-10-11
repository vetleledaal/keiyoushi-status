# Extension Validation Report

- Extension: tachiyomi-ja.takecomic-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: comiciviewer
- Source ID: 5158991361251014104
- Source name: TakeComic
- Source language: ja
- Selected manga input: popular offset 0: 「死霊術師など穢らわしい」と処刑されたので、魔族に転身致します (`.../91391420de03c`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 「死霊術師など穢らわしい」と処刑されたので、魔族に転身致します (`.../91391420de03c`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | ポプテピピック (`.../8f3616ce97c36`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 俺だけ余裕の異世界サバイバル ～転移先の無人島で楽しむハーレムライフ～ (`.../67ea94c8a5795`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 「死霊術師など穢らわしい」と処刑されたので、魔族に転身致します (`.../91391420de03c`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 「死霊術師など穢らわしい」と処刑されたので、魔族に転身致します (`.../91391420de03c`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 20 | 1話 (`.../c2e787dddcf02`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=「死霊術師など穢らわしい」と処刑されたので、魔族に転身致します, URL=`91391420de03c` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20250924180918397061792CAEE8716146F97215A9BF4509B-lg.webp` (image/webp (encoding: lossy), 52236 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `91391420de03c` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20250924180918397061792CAEE8716146F97215A9BF4509B.png` (image/png, 5051650 bytes, 2560x1344) |  |  |  |
| details author | PASS | 早瀬黒絵, 要龍 |  |  |  |
| details artist | PASS | 早瀬黒絵, 要龍 |  |  |  |
| details genres | PASS | 異世界, 転生・転移, バトル・アクション, 異世界恋愛, 令嬢・宮廷, コミカライズ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 公爵令嬢にして王太子の婚約者......だった私、レイチェル＝シェリンガムは、闇属性の魔力を持ち、死霊術を操るがゆえ魔族に通じたと言われ処刑された。<br><br>その無念が力となり、私はリッチとして復活を果たす―――!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | PASS | 20 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.takecomic.jp/.../master-1754982985952-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 13, 1, 11, 6, 15, 12, 14, 4, 2, 0, 3, 8, 5, 9, 7\]` (image/jpeg, 408426 bytes, 844x1200) |  |  |  |
