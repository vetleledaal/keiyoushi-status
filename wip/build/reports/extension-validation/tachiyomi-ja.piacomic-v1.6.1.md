# Extension Validation Report

- Extension: tachiyomi-ja.piacomic-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 2932724617903419016
- Source name: PiaComic
- Source language: ja
- Selected manga input: popular offset 0: 敗戦国から賠償品として来ましたが、王太子殿下は優しく甘えん坊の精霊もいるので、幸せに暮らしています。 (`.../5d4aa42006270`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | 敗戦国から賠償品として来ましたが、王太子殿下は優しく甘えん坊の精霊もいるので、幸せに暮らしています。 (`.../5d4aa42006270`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 14 | イケオジ王弟殿下との白い結婚～君を愛するつもりはないと言った旦那様が過保護に溺愛してきます～ (`.../17bc083b6615d`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 敗戦国から賠償品として来ましたが、王太子殿下は優しく甘えん坊の精霊もいるので、幸せに暮らしています。 (`.../5d4aa42006270`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 敗戦国から賠償品として来ましたが、王太子殿下は優しく甘えん坊の精霊もいるので、幸せに暮らしています。 (`.../5d4aa42006270`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | 第1話（１） (`.../1366bfa22cb59`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=敗戦国から賠償品として来ましたが、王太子殿下は優しく甘えん坊の精霊もいるので、幸せに暮らしています。, URL=`5d4aa42006270` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 29/29 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 29/29 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20260821155437566B88F5BB9B5C427DA89DD51E09A5D4E00-lg.webp` (image/webp (encoding: lossy), 59318 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `5d4aa42006270` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20260821155437566B88F5BB9B5C427DA89DD51E09A5D4E00.png` (image/png, 5179727 bytes, 2560x1344) |  |  |  |
| details author | PASS | Emi＋, 琴乃葉, 倉吉サム |  |  |  |
| details artist | PASS | Emi＋, 琴乃葉, 倉吉サム |  |  |  |
| details genres | PASS | COMIC LuPIA, ファンタジー, 女性マンガ, 恋愛 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | レイチェルは、敗戦国シリルの孤独な王女。<br>実の父親の命で、敵国だったドーランに「賠償品」として献上されたのだ。<br>あてがわれたのは、ドーランの荒れ果てた離宮。<br>…けれど、祖国でも塔に幽閉されていたレイチェルにとって、ここは自由な天国！<br>唯一の友だち精霊ピットと、不遇な境遇をものともせず、異国での生活を明るく作り替えていく。<br><br>そんな「賠償品」を何かと気にかけるドーランの王太子フェンシル。<br>次第に距離が縮まる二人に、やきもちをやくピットの警戒心は最高潮に！？<br><br>敗戦国王女が自分の居場所を見つけていく、爽快＆ピュアな異世界シンデレラストーリー！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.piacomic.jp/.../master-1787283937177-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 12, 13, 15, 4, 10, 2, 0, 7, 6, 5, 8, 9, 1, 14, 3\]` (image/jpeg, 339643 bytes, 849x1199) |  |  |  |
