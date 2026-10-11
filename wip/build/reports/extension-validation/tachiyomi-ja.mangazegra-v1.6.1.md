# Extension Validation Report

- Extension: tachiyomi-ja.mangazegra-v1.6.1
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
- Source ID: 1066937743995646358
- Source name: Manga Zegra
- Source language: ja
- Selected manga input: popular offset 0: 役目を果たした日陰の勇者は、辺境で自由に生きていきます (`.../408e6a08a3ade`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 役目を果たした日陰の勇者は、辺境で自由に生きていきます (`.../408e6a08a3ade`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 追放された転生貴族、外れスキルで内政無双～気ままに領地運営するはずが、スキル『ガチャ』のお陰で最強領地を作り上げてしまった～ (`.../1b79d2289462b`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 才能なしと言われたおっさんテイマーは、愛娘と共に無双する！～拾った娘が有能すぎて冒険者にスカウトされたけど、心配なのでついて行きます～ (`.../ba6bd0873a3e1`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 役目を果たした日陰の勇者は、辺境で自由に生きていきます (`.../408e6a08a3ade`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 役目を果たした日陰の勇者は、辺境で自由に生きていきます (`.../408e6a08a3ade`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 58 | 1 (`.../a83a22580538a`) |  | <1s |
| pages | `getPageList(chapter)` | success | 50 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=役目を果たした日陰の勇者は、辺境で自由に生きていきます, URL=`408e6a08a3ade` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../202505301323275484BD48662B22B064DD539939CAAE52B24-lg.webp` (image/webp (encoding: lossy), 36560 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `408e6a08a3ade` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../202505301323275484BD48662B22B064DD539939CAAE52B24.png` (image/png, 3651648 bytes, 2560x1344) |  |  |  |
| details author | PASS | 船野真帆, 丘野優, 布施龍太 |  |  |  |
| details artist | PASS | 船野真帆, 丘野優, 布施龍太 |  |  |  |
| details genres | PASS | 異世界・転生 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 王子率いる勇者パーティーの荷物持ちでありながら、単独で魔王を討伐したクレイ。しかし、その功績はこれからの国を担う王子に譲り、邪魔になりたくない彼は姿を消した。<br>ただの村人に戻ったクレイが向かったのは、誰もが開拓を諦めた辺境の地獄――“辺獄”。【鑑定】と【模倣】のスキルで勇者パーティーの技術を吸収した彼は、怪物ひしめく未開の地を自由に切り拓いていく。<br>だが、異次元の強さを誇るクレイを、元仲間も敵も…周りが放っておくはずがなく――!? 引退した真の勇者が挑む、辺境開拓ファンタジー！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 58 chapters |  |  |  |
| chapter dates | PASS | 58 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.manga-zegra.com/.../master-1747980026507-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 1, 3, 15, 12, 5, 2, 13, 9, 8, 7, 6, 0, 10, 11, 4\]` (image/jpeg, 446959 bytes, 1055x1500) |  |  |  |
