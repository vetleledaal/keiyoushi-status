# Extension Validation Report

- Extension: tachiyomi-ja.herosweb-v1.6.1
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
- Source ID: 6981500022236807277
- Source name: HERO'S Web
- Source language: ja
- Selected manga input: popular offset 0: 仮面ライダークウガ (`.../e5c7cc354cc05`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 仮面ライダークウガ (`.../e5c7cc354cc05`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | キリングバイツ (`.../96d8b6b8d5d64`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 俺がいないとすぐ××（チョメ）る儚木かすみ (`.../f4009c1391f97`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 仮面ライダークウガ (`.../e5c7cc354cc05`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 仮面ライダークウガ (`.../e5c7cc354cc05`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 143 | EPISODE.01　復活 (`.../ecca9c98b6dbe`) |  | <1s |
| pages | `getPageList(chapter)` | success | 62 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=仮面ライダークウガ, URL=`e5c7cc354cc05` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20260508160208916BDA42E54A7EBD28178DAE12AD41633D3-lg.webp` (image/webp (encoding: lossy), 51920 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `e5c7cc354cc05` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20260508160208916BDA42E54A7EBD28178DAE12AD41633D3.png` (image/png, 5265900 bytes, 2560x1344) |  |  |  |
| details author | PASS | 石ノ森章太郎, 井上敏樹, 横島一, 白倉伸一郎 |  |  |  |
| details artist | PASS | 石ノ森章太郎, 井上敏樹, 横島一, 白倉伸一郎 |  |  |  |
| details genres | PASS | ヒーロー・能力者, バトル・アクション, 人間ドラマ, ヒーローズ, 青年マンガ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 東京都内で連続して起こる猟奇殺人事件。その人間離れした犯人の残虐性に、怒りの炎を燃やす警視庁捜査一課の面々だったが、若きエリート刑事・一条薫は、冷静に物事をみつめる「正眼の構え」で、捜査に臨んでいた。<br>時を同じくして起こる、長野県・九郎ヶ岳遺跡の研究員惨殺。一見無関係な二つの事件をつなぐのは、「人間性」の介在しない、ある「生物」の存在だった————。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 143 chapters |  |  |  |
| chapter dates | PASS | 143 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://comicsviewer.heros-web.com/.../master-1778223598273-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 13, 9, 10, 1, 5, 15, 0, 14, 6, 4, 3, 2, 7, 8, 12\]` (image/jpeg, 422814 bytes, 844x1200) |  |  |  |
