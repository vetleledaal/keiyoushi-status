# Extension Validation Report

- Extension: tachiyomi-ja.younganimal-v1.6.1
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
- Source ID: 3590997004623427971
- Source name: Young Animal
- Source language: ja
- Selected manga input: popular offset 0: SNSの怪物 (`.../77a1b49776478`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | SNSの怪物 (`.../77a1b49776478`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 拷問バイトくんの日常 (`.../8f24a114d125e`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 最弱のオダ ～小田氏治物語～ (`.../417f74cf7304f`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | SNSの怪物 (`.../77a1b49776478`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | SNSの怪物 (`.../77a1b49776478`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 130 | 第1話 (`.../13da16b27363e`) |  | <1s |
| pages | `getPageList(chapter)` | success | 43 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=SNSの怪物, URL=`77a1b49776478` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20240426135018611147A5456B52BEA5A73F4F7A6CEA66DB7-lg.webp` (image/webp (encoding: lossy), 50494 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `77a1b49776478` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20240426135018611147A5456B52BEA5A73F4F7A6CEA66DB7.png` (image/png, 1809480 bytes, 1280x672) |  |  |  |
| details author | PASS | 望月美乃 |  |  |  |
| details artist | PASS | 望月美乃 |  |  |  |
| details genres | PASS | サイコ・スリラー, ミステリー・サスペンス, 社会派, 黒蜜 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | とある女子中学生のSNSアカウント。コンタクトを取ってきたのは、とある中学教師の男。だが彼は自身を芸能プロデューサーだと偽って…？　無邪気な子供を狙う卑劣で下劣な大人が、SNSにはいる。こいつらは怪物。「SNSの怪物」の真実とリアルを描く、吐き気をもよおす衝撃の"SNSの裏側"ドラマ！<br>望月先生X（旧Twitter）：@mochinoYoshino3 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 130 chapters |  |  |  |
| chapter dates | PASS | 130 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 43 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.younganimal.com/.../master-1727756769638-01.webp <redacted query values: Expires, Signature, and Key-Pair-Id> 13, 9, 6, 11, 15, 3, 4, 2, 1, 5, 8, 7, 0, 10, 14\]` (image/jpeg, 292267 bytes, 960x1365; server Content-Type: image/webp) |  |  |  |
