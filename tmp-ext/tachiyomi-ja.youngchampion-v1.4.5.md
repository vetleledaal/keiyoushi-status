# Extension Validation Report

- Extension: tachiyomi-ja.youngchampion-v1.4.5
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
- Source ID: 162182610453532778
- Source name: Young Champion
- Source language: ja
- Selected manga input: popular offset 0: 片田舎のおっさん、剣聖になる～ただの田舎の剣術師範だったのに、大成した弟子たちが俺を放ってくれない件～ (`.../bf2c9e592b7ee`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 片田舎のおっさん、剣聖になる～ただの田舎の剣術師範だったのに、大成した弟子たちが俺を放ってくれない件～ (`.../bf2c9e592b7ee`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | 大人はイジメをやめられない〜弱者の生存戦略〜 (`.../f91c6d9d5f931`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 3 | 追放されるたびにスキルを手に入れた俺が、100の異世界で2周目無双 (`.../61cda1dd15752`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 片田舎のおっさん、剣聖になる～ただの田舎の剣術師範だったのに、大成した弟子たちが俺を放ってくれない件～ (`.../bf2c9e592b7ee`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 片田舎のおっさん、剣聖になる～ただの田舎の剣術師範だったのに、大成した弟子たちが俺を放ってくれない件～ (`.../bf2c9e592b7ee`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 97 | 第1話 (`.../82963d77c8743`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=片田舎のおっさん、剣聖になる～ただの田舎の剣術師範だったのに、大成した弟子たちが俺を放ってくれない件～, URL=`.../bf2c9e592b7ee` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../202510291849596545821F72A5EA680388F15B8A95D878E5C-lg.webp` (image/webp (encoding: lossy), 57884 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../bf2c9e592b7ee` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../202510291849596545821F72A5EA680388F15B8A95D878E5C.png` (image/png, 4405205 bytes, 2560x1344) |  |  |  |
| details author | PASS | 乍藤和樹, 佐賀崎しげる, 鍋島テツヒロ |  |  |  |
| details artist | PASS | 乍藤和樹, 佐賀崎しげる, 鍋島テツヒロ |  |  |  |
| details genres | PASS | ファンタジー・SF, どこでもヤングチャンピオン, 異世界・転生, アクション, 少年・青年誌, アニメ化, ヤンチャンWebオリジナル |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 2025年4月原作ノベルTVアニメ放送開始！「ベリル先生を騎士団付きの特別指南役として推薦しました」。片田舎の村で細々と剣術道場を営む男、ベリル・ガーデナント。そこへ若き王国騎士団長に昇り詰めたかつての教え子、アリューシアが訪れ騎士団付きの特別指南役として王都へ行く事に。大成した弟子達と再会し、盛り立てられるベリルの運命は?おっさん成り上がりファンタジーの決定版、コミカライズ!　<br>【アニメ公式サイト】\[https://ossan-kensei.com/.../ossan-kensei.com) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 97 chapters |  |  |  |
| chapter dates | PASS | 97 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.youngchampion.jp/.../master-1679983521598-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 13, 9, 1, 12, 7, 10, 11, 5, 6, 2, 14, 8, 3, 0, 15\]` (image/jpeg, 210587 bytes, 844x1200) |  |  |  |
