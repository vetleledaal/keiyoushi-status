# Extension Validation Report

- Extension: tachiyomi-ja.kimicomi-v1.6.1
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
- Source ID: 645302785022492537
- Source name: KimiComi
- Source language: ja
- Selected manga input: popular offset 0: ドローイング　最強漫画家はお絵描きスキルで異世界無双する！ (`.../e7d43a4edbf83`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | ドローイング　最強漫画家はお絵描きスキルで異世界無双する！ (`.../e7d43a4edbf83`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | ワインガールズ (`.../f42014b3e7df6`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | ゲーマーが異世界魂転してハーレム人生へコンティニューするそうです　THE COMIC (`.../26ef5a039f575`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ドローイング　最強漫画家はお絵描きスキルで異世界無双する！ (`.../e7d43a4edbf83`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ドローイング　最強漫画家はお絵描きスキルで異世界無双する！ (`.../e7d43a4edbf83`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 211 | sketch01 (`.../7794ea6e76142`) |  | <1s |
| pages | `getPageList(chapter)` | success | 66 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ドローイング　最強漫画家はお絵描きスキルで異世界無双する！, URL=`e7d43a4edbf83` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20250625105058729C0470AF82604FBDF1D2FDC13DB145BA0-lg.webp` (image/webp (encoding: lossy), 43548 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `e7d43a4edbf83` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20250625105058729C0470AF82604FBDF1D2FDC13DB145BA0.png` (image/png, 3712620 bytes, 2560x1344) |  |  |  |
| details author | PASS | 林達永, 金光鉉 |  |  |  |
| details artist | PASS | 林達永, 金光鉉 |  |  |  |
| details genres | PASS | コミックヴァルキリー, 異世界・転生, バトル・アクション, ファンタジー・SF, 恋愛 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 漫画家として大成功を収めている神代彰は、<br>血液ガンの発覚をきっかけに<br>空虚な人間関係しか築けなかった自分の人生を後悔する。<br>金の無心しかしてこない母親への怒りをぶちまけた勢いで<br>自損事故で死んでしまった彼を待っていたのは、<br>自分で母親を選んで異世界転生するチャンスだった。<br><br>平凡で居場所のある人生を願った彰は、<br>記憶をもったまま魔法商店の一人息子アキラとして転生。<br>剣術も魔法もダメダメだが家族に愛される<br>理想の暮らしを送っていたのだが、<br>あるとき「絵を描く」ことでいろいろなものを具現化できる<br>チート能力に気がついてしまって……？<br><br>平凡を望むアキラが織りなす、<br>居場所を守るための異世界冒険譚!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 211 chapters |  |  |  |
| chapter dates | PASS | 211 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 66 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.kimicomi.com/.../master-1750896897926-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 13, 10, 8, 7, 1, 2, 14, 12, 6, 3, 5, 4, 0, 9, 15\]` (image/jpeg, 548866 bytes, 1350x1920) |  |  |  |
