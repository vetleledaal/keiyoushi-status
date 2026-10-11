# Extension Validation Report

- Extension: tachiyomi-ja.gaugaumonsterplus-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9220365500598403749
- Source name: がうがうモンスター＋
- Source language: ja
- Selected manga input: popular offset 0: 牢の中で目覚めた悪役令嬢は死にたくない ～処刑を回避したら、待っていたのは溺愛でした～ (`.../62c793f07765610f14040000`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | 牢の中で目覚めた悪役令嬢は死にたくない ～処刑を回避したら、待っていたのは溺愛でした～ (`.../62c793f07765610f14040000`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | ダンジョンで戦い続けて20年の童貞勇者、地上に戻ったら男女比1:1000の世界だった (`.../DU2K3XWBUsMVs7zsK0OVXUtKy`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 牢の中で目覚めた悪役令嬢は死にたくない ～処刑を回避したら、待っていたのは溺愛でした～ (`.../62c793f07765610f14040000`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 牢の中で目覚めた悪役令嬢は死にたくない ～処刑を回避したら、待っていたのは溺愛でした～ (`.../62c793f07765610f14040000`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 7 | 第1話 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=牢の中で目覚めた悪役令嬢は死にたくない ～処刑を回避したら、待っていたのは溺愛でした～, URL=`.../62c793f07765610f14040000` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gaugau.futabanet.jp/.../7b2a4d8a-8082-4e07-b980-52354b99dae0.jpg` (image/jpeg, 30576 bytes, 259x259) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../62c793f07765610f14040000` |  |  |  |
| details thumbnail URL | PASS | `https://gaugau.futabanet.jp/.../7b2a4d8a-8082-4e07-b980-52354b99dae0.jpg` |  |  |  |
| details author | PASS | 真夜中しんや, やきいもほくほく, 風ことら |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 恋愛, いじめ, 恋, 料理, 女主人公, シリアス, 歴史, ギャグ, 幼馴染, 結婚, 社畜, 成り上がり, 美人, 貴族, 悪役令嬢, 内政, 異世界, ラブコメ, 獣人, バトル, 転生・召喚, タイムリープ, 魔法, ループもの, 断罪, ざまぁ, 虐げられ, 溺愛, 婚約破棄, 王太子, 騎士, 令嬢, 胸キュン |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 親が遺した借金生活を送る天野璃々は、ある日突然、異世界の「悪女」になっていた。目を覚ますと、イケメン騎士が手取り足取り世話を焼いてくれて…？牢の中での運命の出会いを経て、特技と持ち前のポジティヴさで周囲を巻き込む彼女が辿りついた真実。そして胸キュン必至のハッピーエンドとは…！？小説家になろう×TOHAN第一回新人発掘コンテスト金賞作品、待望のコミカライズ！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | LINT | All 7 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=7 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://gaugau.futabanet.jp/.../M_H.jpg` (image/jpeg, 462108 bytes, 1126x1600) |  |  |  |
