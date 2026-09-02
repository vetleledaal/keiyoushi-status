# Extension Validation Report

- Extension: tachiyomi-ja.mangalt-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1153097454471755439
- Source name: Mangalt
- Source language: ja
- Selected manga input: popular offset 0: 漫画ルポ 中年童貞 (`.../78712116bba34`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 漫画ルポ 中年童貞 (`.../78712116bba34`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | みやこまちクロニクル (`.../c8808ae2fa22c`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | 宙に参る (`.../318819c8b9ad2`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 漫画ルポ 中年童貞 (`.../78712116bba34`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 漫画ルポ 中年童貞 (`.../78712116bba34`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 20 | 第一章　「中年童貞」の受け皿となる介護業界 前編 ［1］ (`.../6ed51a89ec563`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=漫画ルポ 中年童貞, URL=`.../78712116bba34` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../202603191359065664CDED9F34BF771FD6DCD44877E43BDE1-lg.webp` (image/webp (encoding: lossy), 27536 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../78712116bba34` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../202603191359065664CDED9F34BF771FD6DCD44877E43BDE1.png` (image/png, 1526901 bytes, 2560x1344) |  |  |  |
| details author | PASS | 桜壱バーゲン, 中村淳彦 |  |  |  |
| details artist | PASS | 桜壱バーゲン, 中村淳彦 |  |  |  |
| details genres | PASS | 青年マンガ, ルポ・エッセイ, ナイトビジネス・闇社会, ヒューマンドラマ, ホラー, 社会派 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 「中年童貞」という生き地獄を描く衝撃のルポ!!<br><br>社会からも女性からも排除された、この「生き地獄」<br>30歳を超えて性交未経験の「中年童貞」。<br>彼らの姿をインタビューを通じてえぐる衝撃のルポが漫画になった！<br>『名前のない女たち』（宝島社・シリーズ累計30万部）<br>『職業としてのAV女優』（幻冬舎新書・6万部）<br>『日本の風俗嬢』（新潮新書・9万部）<br>――日本の性にまつわる取材を続けるノンフィクション作家・中村淳彦があぶり出した「中年童貞という生き地獄」を『絶望の犯島』（双葉社・櫻井稔文名義）の変態男＆ヤクザ集団の緻密描写でカルトな人気を築いた桜壱バーゲンが可視化する!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | PASS | 20 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.mangalt.jp/.../master-1775708670642-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 2, 9, 1, 4, 8, 3, 10, 0, 11, 7, 12, 5, 13, 15, 6\]` (image/jpeg, 956889 bytes, 1444x2048) |  |  |  |
