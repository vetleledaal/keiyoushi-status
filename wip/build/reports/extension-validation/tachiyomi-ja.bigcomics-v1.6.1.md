# Extension Validation Report

- Extension: tachiyomi-ja.bigcomics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 2944603286439592172
- Source name: Big Comics
- Source language: ja
- Selected manga input: popular offset 0: 新九郎、奔る！ (`.../bcf25ae43b456`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 新九郎、奔る！ (`.../bcf25ae43b456`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 何の怪異かわかりません (`.../4674cfc2a4d3f`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 国宝 (`.../ea20678910984`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 新九郎、奔る！ (`.../bcf25ae43b456`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 新九郎、奔る！ (`.../bcf25ae43b456`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 165 | 第一話 伊勢守の戦さ (`.../f69798fea83b9`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=新九郎、奔る！, URL=`bcf25ae43b456` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.bigcomics.jp/.../20231026111602779C7A85A3ABE1EA0C044A4AB607E21BDA5-lg.webp` (image/webp (encoding: lossy), 23978 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `bcf25ae43b456` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.bigcomics.jp/.../20231026111602779C7A85A3ABE1EA0C044A4AB607E21BDA5.png` (image/png, 678743 bytes, 1280x672) |  |  |  |
| details author | PASS | ゆうきまさみ |  |  |  |
| details artist | PASS | ゆうきまさみ |  |  |  |
| details genres | PASS | お仕事, 歴史・伝記・戦争, 週刊スピリッツ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 室町のリアルを描く唯一無二の本格大河！戦国大名の先駆け・「北条早雲」の物語!!<br>時は戦国武将たちが活躍しはじめる少し前。<br>戦乱の世の始まりを切り拓いた男がいた。<br>その男の名は伊勢新九郎盛時。<br>伊勢宗瑞、または「北条早雲」として知られる男は<br>いかにして戦国大名になったのか。<br>そもそも彼は何者だったのか。<br>「下克上の素浪人」のイメージを覆す、新しい「北条早雲」こと伊勢新九郎の姿がここにある！<br>名門伊勢一門出身だったという最新の研究結果を基に描く、唯一無二の本格室町大河!!<br>文正の政変、応仁の乱、細川勝元、足利義政、太田道灌、細川政元、享徳の乱……時代の変革とその中心人物から学び、成長していく真面目な男の一代記。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 165 chapters |  |  |  |
| chapter dates | PASS | 165 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.bigcomics.jp/.../master-1685663396087-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 12, 0, 5, 9, 10, 13, 8, 14, 2, 4, 11, 15, 7, 6, 1\]` (image/jpeg, 329885 bytes, 847x1200) |  |  |  |
