# Extension Validation Report

- Extension: tachiyomi-ja.mangacross-v1.4.10
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
- Source ID: 4711824862797870329
- Source name: Champion Cross
- Source language: ja
- Selected manga input: popular offset 0: 僕の心のヤバイやつ【最新話無料】 (`.../899dda204c3f2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 僕の心のヤバイやつ【最新話無料】 (`.../899dda204c3f2`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | チキン 「ドロップ」前夜の物語 (`.../20ba2453c3201`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | 修学旅行〜京都・奈良4泊4日～ (`.../14042b60b48c0`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 僕の心のヤバイやつ【最新話無料】 (`.../899dda204c3f2`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 僕の心のヤバイやつ【最新話無料】 (`.../899dda204c3f2`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 200 | Karte.1 僕は奪われた (`.../b93aa70547cb2`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=僕の心のヤバイやつ【最新話無料】, URL=`.../899dda204c3f2` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20240514165016604FC0B8E1EB60C6CC81C01AEC9EDC89401-lg.webp` (image/webp (container: extended), 32802 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../899dda204c3f2` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20240514165016604FC0B8E1EB60C6CC81C01AEC9EDC89401.png` (image/png, 1015715 bytes, 1280x672) |  |  |  |
| details author | PASS | 桜井のりお |  |  |  |
| details artist | PASS | 桜井のりお |  |  |  |
| details genres | PASS | 恋愛, アニメ化, コメディ, 学園モノ, 少年・青年誌, 青春, チャンピオンクロスオリジナル |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | TVアニメPrime Videoにて見放題独占配信中！<br>累計700万部突破！<br>SNSで超話題の陰キャ少年と陽キャ美少女の極甘青春ラブコメディ!!<br><br>宝島社「このマンガがすごい! 」オトコ編、2年連続ランクイン!! 2020年第3位、2021年第9位!!<br>次にくるマンガ大賞2020 Webマンガ部門 第1位!!<br>Anime Japan2021 第4回アニメ化してほしいマンガランキング第1位!!<br>第5回みんなが選ぶTSUTAYAコミック大賞第1位!!「王様のブランチ」など各メディアでも大絶賛!!<br><br>陽キャが憎くてたまらない…。只今、中二病真っ最中の市川京太郎は、学園カースト頂点の美少女・山田杏奈の殺害を企む！<br>だが、山田の意外な一面を知ってしまい…!?<br><br>陽キャ美少女と陰キャ男子。縮まるハズのない２人の距離に奇跡は起きるか!?<br>陰キャ・京太郎の青春が今、かなり静かに動き出す…!!<br>【\[番外編「ツイヤバ」はこちら\](https://championcross.jp/.../56a72715d1789)】 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 200 chapters |  |  |  |
| chapter dates | PASS | 200 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.championcross.jp/.../master-1678839049063-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 15, 7, 6, 11, 8, 10, 14, 12, 9, 4, 13, 0, 5, 2, 3\]` (image/jpeg, 828265 bytes, 1326x2048) |  |  |  |
