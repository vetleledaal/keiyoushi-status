# Extension Validation Report

- Extension: tachiyomi-ja.comicboost-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 24
- Lint: 1
- Warnings: 1
- Skipped: 9
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1188951475836296058
- Source name: Comic Boost
- Source language: ja
- Selected manga input: popular offset 0: 28歳OL、悪役王子を始めました～不自由な異世界を改革します！～ (`.../01730001`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | 28歳OL、悪役王子を始めました～不自由な異世界を改革します！～ (`.../01730001`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | 木戸番の番太郎　昔の噺と食の愉しみ (`.../00870001`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 28歳OL、悪役王子を始めました～不自由な異世界を改革します！～ (`.../01730001`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 28歳OL、悪役王子を始めました～不自由な異世界を改革します！～ (`.../01730001`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 9 | ACT:１ 天川織羽の新しい事情 (`.../01730001`) |  | <1s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: This chapter is locked. Log in via WebView and purchase this chapter to read. | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: This chapter is locked. Log in via WebView and purchase this chapter to read. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=28歳OL、悪役王子を始めました～不自由な異世界を改革します！～, URL=`.../01730001` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.comic-boost.com/.../S0173_kv_th.jpg` (image/jpeg, 123578 bytes, 360x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../01730001` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.comic-boost.com/.../S0173_kv_sp.jpg` (image/jpeg, 414508 bytes, 720x506) |  |  |  |
| details author | PASS | 六格レンチ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | コミカライズ, 異世界, 小説家になろう, アクション・バトル, ヒューマンドラマ, ファンタジー, コメディ, ホラー・サスペンス, 恋愛, 青春, 百合, 動物, グルメ, ほのぼの, 日常, ギャグ, ミステリー, スポーツ, 家族, SF, 旅, ショート, 歴史, エッセイ, アダルト, 映像化, 読み切り, たそがれ食堂, 連載作品, 火曜連載作品, 金曜連載作品, 読み切り, 連載終了, 異世界, ファンタジー, 恋愛 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 散々な一日の終わり、OLの天川織羽は、世界に絶望しながら帰り道を歩いていた。すると突然雷が落ちてきて──気づけば見知らぬ世界の、見知らぬ王子に転生していた！？ 大混乱しつつ、少しずつ状況を把握していくと、どうやら身体の元の持ち主、オリバーは、悪い噂の絶えない冷酷非道な性格で、あらゆる人から嫌われまくっているとんでもない悪役王子だった……！！　 なんとか汚名を返上すべく、世のため人のため、必死に奔走する織羽。最低の嫌われ者に転生してしまったシゴデキOLの、新しい人生が始まる！？　異世界【革命】ファンタジー！！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `null` at offsets 1, 2, 3, 4, 5 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | This chapter is locked. Log in via WebView and purchase this chapter to read. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
