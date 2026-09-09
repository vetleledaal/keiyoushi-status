# Extension Validation Report

- Extension: tachiyomi-ja.mangazegra-v1.4.5
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
- Source theme: comiciviewer
- Source ID: 1066937743995646358
- Source name: Manga Zegra
- Source language: ja
- Selected manga input: latest offset 0: 才能なしと言われたおっさんテイマーは、愛娘と共に無双する！～拾った娘が有能すぎて冒険者にスカウトされたけど、心配なのでついて行きます～ (`.../ba6bd0873a3e1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 役目を果たした日陰の勇者は、辺境で自由に生きていきます (`.../408e6a08a3ade`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | 才能なしと言われたおっさんテイマーは、愛娘と共に無双する！～拾った娘が有能すぎて冒険者にスカウトされたけど、心配なのでついて行きます～ (`.../ba6bd0873a3e1`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | モブ魂～下っ端ザコキャラに転生したので、ゲーム知識で無双したら最強パーティができました～ (`.../3665fb308573d`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 才能なしと言われたおっさんテイマーは、愛娘と共に無双する！～拾った娘が有能すぎて冒険者にスカウトされたけど、心配なのでついて行きます～ (`.../ba6bd0873a3e1`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 才能なしと言われたおっさんテイマーは、愛娘と共に無双する！～拾った娘が有能すぎて冒険者にスカウトされたけど、心配なのでついて行きます～ (`.../ba6bd0873a3e1`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 59 | 1 (`.../b0c7733eeb1be`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=才能なしと言われたおっさんテイマーは、愛娘と共に無双する！～拾った娘が有能すぎて冒険者にスカウトされたけど、心配なのでついて行きます～, URL=`.../ba6bd0873a3e1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20250530134822025AE34A08EA41D226B795442DF3370E3BC-sm.webp` (image/webp (encoding: lossy), 12992 bytes, 320x168) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ba6bd0873a3e1` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20250530134822025AE34A08EA41D226B795442DF3370E3BC.png` (image/png, 4016153 bytes, 2560x1344) |  |  |  |
| details author | PASS | 柊木 楸, 琥宮 千孝 |  |  |  |
| details artist | PASS | 柊木 楸, 琥宮 千孝 |  |  |  |
| details genres | PASS | 異世界・転生 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 才能がなく冒険者になれなかったウードは、田舎で狩猟を営んでいた。おっさんと言われる年齢になり、稼ぎも少なく、先が見えない日々――。そんな中、いつもの狩場で赤ん坊のクレスと出会う。保護者も見つからず、成り行きで一緒に生活することになったのだが、二人はまるで親子のように絆を深めていく。このままクレスとの仲睦まじい生活が続く……。そう思っていたら、成長したクレスには冒険者としてずば抜けた素質があって…!?<br>娘を一人で危険な目に遭わせられない、 ウードの親バカ炸裂!? 「小説家になろう」発、最強の愛娘とおっさんの冒険が始まる!! ※「小説家になろう」は株式会社ヒナプロジェクトの登録商標です。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 59 chapters |  |  |  |
| chapter dates | PASS | 59 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.manga-zegra.com/.../master-1747979954112-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 3, 4, 6, 9, 13, 11, 10, 15, 0, 5, 8, 2, 1, 12, 7\]` (image/jpeg, 465097 bytes, 1055x1500) |  |  |  |
