# Extension Validation Report

- Extension: tachiyomi-ja.pixivcomic-v1.6.5
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2937751339618832603
- Source name: Pixivコミック
- Source language: ja
- Selected manga input: popular offset 0: 前世、弟子だった最強魔術師が俺を諦めてくれない (`.../13798`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 前世、弟子だった最強魔術師が俺を諦めてくれない (`.../13798`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | 死に戻り聖女は毒家族と決別する〜未来を変えたら、狂暴王子様の溺愛が待ってました⁉︎〜 (`.../13636`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | 団地のふたり (`.../13585`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | クールぶり男子と激重男子 (`.../13545`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 31 | 前世、弟子だった最強魔術師が俺を諦めてくれない (`.../13798`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 前世、弟子だった最強魔術師が俺を諦めてくれない (`.../13798`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 第１話①: 婚約破棄されたら弟子を拾いました① (`.../250689`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=前世、弟子だった最強魔術師が俺を諦めてくれない, URL=`13798` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://public-img-comic.pximg.net/.../13798.jpg <redacted query values: 20261009143738>` (image/jpeg, 539840 bytes, 640x860) |  |  |  |
| details identity | PASS | Details preserved selected URL `13798` |  |  |  |
| details thumbnail URL | PASS | `https://public-img-comic.pximg.net/.../13798.jpg <redacted query values: 20261009143738>` |  |  |  |
| details author | PASS | 原作：ヒラヲ 漫画：蜂屋すずめ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | BL異世界, ウィリアム, ヤンデレ, 転生, 乙女ゲーム, 溺愛, BL, 師弟, 攻略, 二度目 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 乙女ゲームの世界に転生したウィリアム。攻略対象を育てる師匠になるはずが途中で死んでしまった。二度目の転生では、なぜかその弟子に溺愛されちゃって…⁉ヤンデレ弟子に溺愛される！師弟関係×異世界転生BL☆<br><br>Magazine: Palcy |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img-comic.pximg.net/.../1.jpg <redacted query values: 20261007173645>` (image/jpeg, 305615 bytes, 720x1024) |  |  |  |
