# Extension Validation Report

- Extension: tachiyomi-ja.yomonga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7561635982432447429
- Source name: Yomonga
- Source language: ja
- Selected manga input: popular offset 0: 陽がのぼり菜の花は咲く (`.../2572 <redacted query values: episode and cid>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 陽がのぼり菜の花は咲く (`.../2572 <redacted query values: episode and cid>`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | 親友炎上の女 ～あの子、あなたの悪口言ってたよ？～ (`.../2427 <redacted query values: episode and cid>`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 陽がのぼり菜の花は咲く (`.../2572 <redacted query values: episode and cid>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 陽がのぼり菜の花は咲く (`.../2572 <redacted query values: episode and cid>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Chapter.１ 第１話-１ (`.../10812`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=陽がのぼり菜の花は咲く, URL=`.../2572 <redacted query values: episode and cid>` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.yomonga.com/.../%E9%99%BD%E3%81%8C%E3%81%AE%E3%81%BC%E3%82%8A_%E5%9C%A7%E7%B8%AEnanohana_thum.jpg <redacted query values: v>` (image/jpeg, 199007 bytes, 504x717) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2572 <redacted query values: episode and cid>` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.yomonga.com/.../%E9%99%BD%E3%81%8C%E3%81%AE%E3%81%BC%E3%82%8A_%E5%9C%A7%E7%B8%AEnanohana_thum.jpg` (image/jpeg, 199007 bytes, 504x717) |  |  |  |
| details author | PASS | アケガタユウ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 連載中, 女性向け |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 仕事に行き詰まってある日突然、会社を辞めてしまった加藤咲。 何もかも投げ出し電車に飛び乗った彼女を待ち受けていたのは、一面黄色に染まった美しい菜の花畑と昔ながらの陶器屋を営む川口陽菜。 自分を見失い、身一つで見ず知らずの土地にやってきた咲が陽菜と出会い、やがて互いにかけがえのない存在になっていく――。 人生に迷ったふたりの女性が紡ぐ、食と器と絆の物語。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.yomonga.com/.../JXArhAvl.jpg` (image/jpeg, 916857 bytes, 1622x2307) |  |  |  |
