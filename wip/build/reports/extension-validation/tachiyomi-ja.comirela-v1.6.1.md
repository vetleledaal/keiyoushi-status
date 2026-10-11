# Extension Validation Report

- Extension: tachiyomi-ja.comirela-v1.6.1
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
- Source ID: 58641447023846824
- Source name: Comirela
- Source language: ja
- Selected manga input: popular offset 0: キスのあとまで教えてあげる (`.../e0c936605f990`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | キスのあとまで教えてあげる (`.../e0c936605f990`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 鬼の花嫁 (`.../9add6ede462dc`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 暴君のシンデレラ～大正溺愛浪漫譚～ (`.../8e7d449975a0b`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | キスのあとまで教えてあげる (`.../e0c936605f990`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | キスのあとまで教えてあげる (`.../e0c936605f990`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 38 | 1 (`.../abab57393f747`) |  | <1s |
| pages | `getPageList(chapter)` | success | 35 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=キスのあとまで教えてあげる, URL=`e0c936605f990` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20260616105900786A70A03477E421DE8339856E21E2D3642-lg.webp` (image/webp (encoding: lossy), 29492 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `e0c936605f990` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20260616105900786A70A03477E421DE8339856E21E2D3642.png` (image/png, 3377353 bytes, 2560x1344) |  |  |  |
| details author | PASS | 進月ノア, Ena. |  |  |  |
| details artist | PASS | 進月ノア, Ena. |  |  |  |
| details genres | PASS | noicomi, 少女マンガ, 恋愛 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | こんなアブない雰囲気をまとった八千代くんなんて…私は知らない――。<br> ある日クラスメイトである八千代くんの首筋にキスマークを発見した蓮。大人っぽくて物静かな八千代くんの意外な一面が気になって仕方ない蓮は、2人きりになったタイミングで思わず真相を聞いてしまう。すると八千代くんの様子が豹変！？初めて見る八千代くんは不用意に近づいてはいけないようなどこかキケンな雰囲気を醸していて――。<br> 「倉木ってガードゆるゆる――気をつけようね」本当の姿はどっち！？超ギャップ男子にドキドキしっぱなしの翻弄ラブ！！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 38 chapters |  |  |  |
| chapter dates | PASS | 38 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.comirela.com/.../master-1780653554683-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 13, 9, 8, 6, 10, 14, 5, 3, 11, 15, 1, 0, 4, 2, 12\]` (image/jpeg, 228877 bytes, 1055x1500) |  |  |  |
