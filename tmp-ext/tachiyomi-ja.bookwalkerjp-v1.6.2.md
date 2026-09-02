# Extension Validation Report

- Extension: tachiyomi-ja.bookwalkerjp-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7753308828123873766
- Source name: BookWalker Japan
- Source language: ja
- Selected manga input: popular offset 0: 鬼畜英雄（GANMA！） (`.../344368`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | 鬼畜英雄（GANMA！） (`.../344368`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 60 | Lv2からチートだった元勇者候補のまったり異世界ライフ（ガルドコミックス） (`.../211352`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 60 | サザエさん（朝日新聞出版） (`.../594856`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 60 | ゴールデン・ガイ（ニチブンコミックス） (`.../265981`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 18 | 鬼畜英雄（GANMA！） (`.../344368`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 鬼畜英雄（GANMA！） (`.../344368`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 15 | 🔒 (Preview) 鬼畜英雄（１） (`.../683da0c4-988a-4017-9b31-a936d20a8941`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: No preview available, or you need to purchase this volume. | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: No preview available, or you need to purchase this volume. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=鬼畜英雄（GANMA！）, URL=`344368` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 258/258 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 258/258 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://c.bookwalker.jp/.../coverImage_4949686.jpg` (image/jpeg, 648896 bytes, 1453x2048; server Content-Type: binary/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `344368` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://member.bookwalker.jp/.../coverImage_4949686.jpg` (image/jpeg, 648896 bytes, 1453x2048; server Content-Type: binary/octet-stream) |  |  |  |
| details author | PASS | よのき |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 無双チート淫魔、異世界に降臨！<br>どんな女も即ハーレムファンタジー!!<br>──魔界に転生し、女性と性行為すればするほど無双チート化する伝説の種族「淫魔(インキュバス)」になった俺。<br>金も名誉も女も全部ゲットできたけど、本当に欲しいのはより強力なスキル。<br>次は人間かエルフとヤらないとスキルツリーが解放されないので、人間界にテレポート！<br>薬師のエルフ少女、SSランクアサシンの冷酷美女をさっそく支配下に!?<br>（著者名：よのき／1～8話・限定描き下ろし収録）<br><br>無双チート淫魔、異世界に降臨！<br>どんな女も即ハーレムファンタジー!!<br>──魔界に転生し、女性と性行為すればするほど無双チート化する伝説の種族「淫魔(インキュバス)」になった俺。<br>金も名誉も女も全部ゲットできたけど、本当に欲しいのはより強力なスキル。<br>次は人間かエルフとヤらないとスキルツリーが解放されないので、人間界にテレポート！<br>薬師のエルフ少女、SSランクアサシンの冷酷美女をさっそく支配下に!?<br>（著者名：よのき／1～8話・限定描き下ろし収録）<br><br>Alternative Title: キチクエイユウ<br><br>Publisher: GANMA!<br><br>Label: GANMA！<br><br>（C）よのき／ZERO-TWO MANGA CREATE INC..../COMISMA INC. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | LINT | All 15 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=15 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No preview available, or you need to purchase this volume. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
