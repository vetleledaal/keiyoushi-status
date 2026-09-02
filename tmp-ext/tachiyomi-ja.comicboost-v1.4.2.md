# Extension Validation Report

- Extension: tachiyomi-ja.comicboost-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 23
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
- Selected manga input: popular offset 0: ツンリゼ～ツンデレ悪役令嬢リーゼロッテと実況の遠藤くんと解説の小林さん～ (`.../01700001`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | ツンリゼ～ツンデレ悪役令嬢リーゼロッテと実況の遠藤くんと解説の小林さん～ (`.../01700001`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | 姉に婚約者を寝取られたので訳あり令息と結婚して辺境へと向かいます～苦労の先に待っていたのは、まさかの溺愛と幸せでした～ (`.../01320001`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ツンリゼ～ツンデレ悪役令嬢リーゼロッテと実況の遠藤くんと解説の小林さん～ (`.../01700001`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ツンリゼ～ツンデレ悪役令嬢リーゼロッテと実況の遠藤くんと解説の小林さん～ (`.../01700001`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 10 | 第1話 (`.../01700001`) |  | 1-10s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ツンリゼ～ツンデレ悪役令嬢リーゼロッテと実況の遠藤くんと解説の小林さん～, URL=`.../01700001` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.comic-boost.com/.../S0170_kv_th.jpg` (image/jpeg, 132662 bytes, 360x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../01700001` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.comic-boost.com/.../S0170_kv_sp.jpg` (image/jpeg, 487470 bytes, 720x506) |  |  |  |
| details author | PASS | 恵ノ島すず, 今中千尋, えいひ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | コミカライズ, 異世界, 小説家になろう, アクション・バトル, ヒューマンドラマ, ファンタジー, コメディ, ホラー・サスペンス, 恋愛, 青春, 百合, 動物, グルメ, ほのぼの, 日常, ギャグ, ミステリー, スポーツ, 家族, SF, 旅, ショート, 歴史, エッセイ, アダルト, 映像化, 読み切り, たそがれ食堂, 連載作品, 火曜連載作品, 金曜連載作品, 読み切り, 連載終了, 異世界, ファンタジー, 恋愛, コミカライズ |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 「ツンが強い！ツンが強いぞリーゼロッテ！これはさすがにやりすぎかっ！？」 「リーゼロッテの今の言葉、単に『私もまぜてー』の意図なのでしょうが、婉曲すぎる物言いと日頃の尊大すぎる振る舞いとのせいで完全に誤解されてますね……」 ある日の中庭で、王太子ジークヴァルトに突如として降り注いだ神託。 実はこれ、日本の高校生2人による実況と解説だった！ 本当は健気でかわいいツンデレ悪役令嬢・リーゼロッテの破滅フラグをぶった切るため、「神の声」を頼りに、異世界と現代を股にかけたみんなの奮闘が始まる！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `null` at offsets 2, 3, 4, 5, 6 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | This chapter is locked. Log in via WebView and purchase this chapter to read. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
