# Extension Validation Report

- Extension: tachiyomi-ja.mangaraw-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7355525645759373300
- Source name: MangaRaw
- Source language: ja
- Selected manga input: popular offset 0: アオアシ (`.../1026`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | アオアシ (`.../1026`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | 平民出身の帝国将官、無能な貴族上官を蹂躙して成り上がる (`.../1526`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | 後宮食医の薬膳帖 廃姫は毒を喰らいて薬となす (`.../10450`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | チート薬師のスローライフ ​異世界に作ろうドラッグストア (`.../10115`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | アオアシ ブラザーフット (`.../8580`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | アオアシ (`.../1026`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 408 | 第1話 (`.../58765`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 63 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=アオアシ, URL=`1026` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=ゴールデンドロップ, URL=`416` at page 1 offset 14 and page 2 offset 4, title=信じていた仲間達にダンジョン奥地で殺されかけたがギフト『無限ガチャ』でレベル9999の仲間達を手に入れて元パーティーメンバーと世界に復讐＆『ざまぁ！』します！, URL=`2135` at page 1 offset 19 and page 2 offset 2, title=ハリガネサービス, URL=`6588` at page 1 offset 20 and page 2 offset 5, title=HUNTER X HUNTER, URL=`2660` at page 1 offset 21 and page 2 offset 1, title=僕のヒーローアカデミア, URL=`3165` at page 1 offset 22 and page 2 offset 6, title=妹は知っている, URL=`257` at page 1 offset 23 and page 2 offset 8 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 98/98 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 98/98 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangaraw123.com/.../aoasi.jpg` (image/webp (encoding: lossy), 71472 bytes, 480x640) |  |  |  |
| details identity | PASS | Details preserved selected URL `1026` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.mangaraw123.com/.../aoasi.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Slice of Life, Sports, School, 学園, サッカー, 感動, 人情, 日常, スポーツ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 愛媛に暮らす中学三年生・青井葦人（あおいアシト）。粗削りながら、強烈なサッカーの才能を秘めているアシトだったが、まっすぐすぎる性格が災いして、大きな挫折を経験することに―――そんなアシトの前に、東京にある強豪Ｊクラブ「東京シティ・エスペリオン」のユースチーム監督・福田達也（ふくだたつや）が現れる。アシトの無限の可能性を見抜いた福田は、東京で開催される自チームのセレクションを受けるよう勧めて！？将来、日本のサッカーに革命を起こすことになる少年の運命は、ここから急速に回り始める！！<br><br>Aoashi |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 408 chapters |  |  |  |
| chapter dates | PASS | 408 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 63 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage.mangabuzz.org/.../0.webp` (image/jpeg, 192677 bytes, 836x1194; server Content-Type: image/webp) |  |  |  |
