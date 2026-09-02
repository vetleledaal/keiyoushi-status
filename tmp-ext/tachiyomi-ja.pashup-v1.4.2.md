# Extension Validation Report

- Extension: tachiyomi-ja.pashup-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4500173675620672840
- Source name: Pash Up!
- Source language: ja
- Selected manga input: popular offset 0: くま　クマ　熊　ベアー (`.../00000001`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | くま　クマ　熊　ベアー (`.../00000001`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | 攻略! 大ダンジョン時代 俺だけスキルがやたらポエミーなんだけど (`.../00001924`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | 私の主人は大きな犬系騎士様 (`.../00003088`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | くまクマ熊ベアー外伝〜ユナのよりみち手帖〜 (`.../00001756`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 7 | くまクマ熊ベアー外伝〜ユナのよりみち手帖〜 (`.../00001756`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | くま　クマ　熊　ベアー (`.../00000001`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 15 | 🔒 くま　クマ　熊　ベアー１ (`.../00000001`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in via WebView and purchase this product to read. | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Log in via WebView and purchase this product to read. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=くま　クマ　熊　ベアー, URL=`00000001` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.pash-up.jp/.../00000001-t.jpg` (image/jpeg, 120250 bytes, 300x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `00000001` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.pash-up.jp/.../00000001-t.jpg` |  |  |  |
| details author | PASS | 漫画: せるげい, 原作: くまなの, キャラクター原案: 029 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | アニメ２期大好評! |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 【TVアニメ２期も大好評！】 15歳の引きこもりゲーマー・ユナ。ある日、いつものようにファンタジーRPGにログインしたら、どうやら異世界に入り込んじゃったみたい!? そして、与えられた装備は「クマセット」…って、なんじゃこりゃーー!? 魔物退治に人助け、美味の探求etc…チートなクマさん装備に身を包んだ最恐クマっ娘（脱げばただの運動不足な少女）の、自由気ままな異世界（？）生活！　PASH!ブックスの大人気小説、痛快異世界冒険譚が満を持してコミカライズ!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | PASS | 15 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView and purchase this product to read. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
