# Extension Validation Report

- Extension: tachiyomi-ja.mangakingdom-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 1
- Warnings: 2
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3806352284314527898
- Source name: Manga Kingdom
- Source language: ja
- Selected manga input: popular offset 0: 100日後に夫を棄てる妻の話 分冊版 (`.../222518`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | 100日後に夫を棄てる妻の話 分冊版 (`.../222518`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 100 | 毒バラの魔女は静かに暮らしたいのに～騎士様からの一途な求婚お断り～【単話版】 (`.../240857`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 100 | S級ダンジョンの女主人は悪魔にも勇者にも溺愛される（フルカラー） (`.../220606`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 100日後に夫を棄てる妻の話 分冊版 (`.../222518`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 100日後に夫を棄てる妻の話 分冊版 (`.../222518`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 17 | (1) (`.../1`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.NullPointerException | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=100日後に夫を棄てる妻の話 分冊版, URL=`222518` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 301/301 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 301/301 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cf.image-cdn.k-manga.jp/.../b222518_1_200.jpg` (image/jpeg, 26847 bytes, 200x284) |  |  |  |
| details identity | PASS | Details preserved selected URL `222518` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cf.image-cdn.k-manga.jp/.../b222518_1_320.jpg` (image/jpeg, 52235 bytes, 320x455) |  |  |  |
| details author | PASS | あいか, 青石ケイ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 女性漫画, ヒューマンドラマ |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 束縛する！料理にケチをつける！否定と見下しの嵐！…そんな超クズ男を夫に持つ専業主婦・優香。モラハラを受ける生活だけでも辟易していたのに、夫は不倫までしていた！　本人は巧妙に隠しているつもりみたいだけど、イマドキ女子な不倫相手はSNSで匂わせ投稿をたっぷり披露中。でも優香のことを「世間知らずな冴えない女」だと決めつけて高を括る夫の思惑とは裏腹に、優香は不倫相手と全然同世代！デジタルネイティブ！　つまり、証拠はガンガン集まっていく。娘と幸せに生きていくためにも、“ただ何も準備せずに離婚”なんて生温いことはせず、しっかり復讐して養育費も慰謝料も搾り取ってやらねば!!!　月間1000万PVの大人気ブロガー・あいか原作の、爽快ざまぁストーリー！【第1話「だったら復讐計画を。」収録】 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | LINT | All 17 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=17 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | pages operation did not complete successfully |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://comic.k-manga.jp/.../0` to `https://comic.k-manga.jp/.../viewer.html <redacted query values: p0, p1, p2, p3, p4, p5, p8, p9, p10, p15, p16, p19, p20, p21, and p23>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
