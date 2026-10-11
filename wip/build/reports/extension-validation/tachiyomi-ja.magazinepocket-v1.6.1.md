# Extension Validation Report

- Extension: tachiyomi-ja.magazinepocket-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 583369548372015159
- Source name: Magazine Pocket
- Source language: ja
- Selected manga input: latest offset 0: 戦車椅子-TANK CHAIR- (`.../01916`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | 魔女と傭兵 (`.../02368`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | 冰剣の魔術師が世界を統べる〜世界最強の魔術師である少年は、魔術学院に入学する〜 (`.../01150`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 637 | 戦車椅子-TANK CHAIR- (`.../01916`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 戦車椅子-TANK CHAIR- (`.../01916`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 戦車椅子-TANK CHAIR- (`.../01916`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 96 | 【TARGET01】 (`.../360093`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 59 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 637 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=戦車椅子-TANK CHAIR-, URL=`01916` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 688/688 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 688/688 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mgpk-cdn.magazinepocket.com/.../title_grid_wide_202610061121530e24f23f6d67695ed1699823660b7eb5.png` (image/png, 48314 bytes, 480x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `01916` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mgpk-cdn.magazinepocket.com/.../title_grid_square_20221020154124b31f2b28fd44f76df73516d5a2f61a1e.png` (image/png, 37003 bytes, 320x320) |  |  |  |
| details author | PASS | やしろ学 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 裏社会・アングラ・ヤンキー, アクション・バトル, アニメ化 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 妹を銃弾から守ったことで意識戻らぬ身となってしまった最強の殺し屋・平良凪（タイラナギ）。しかし彼は“殺意”を向けられると、わずかな時間だけ意識が戻る特殊体質の持ち主だった！完全覚醒を果たすため、今日も凪は改造車椅子で強敵達との“リハビリ”を始める――！鬼才・やしろ学が描く最凶のダークヒーローによるバイオレンス・アクション――ッ!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 96 chapters |  |  |  |
| chapter dates | PASS | 96 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 59 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mgpk-cdn.magazinepocket.com/.../47023261ad36de598166ae045e5d988d9385730146e4ffa457a8ca5297ae4064.jpg <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 423892 bytes, 1125x1600) |  |  |  |
