# Extension Validation Report

- Extension: tachiyomi-ja.rimacomiplus-v1.6.1
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
- Source ID: 8784054084293367959
- Source name: RimacomiPlus
- Source language: ja
- Selected manga input: popular offset 0: この戦いが終わったら一緒になろうと約束していた勇者は、私の目の前で皇女様との結婚を選んだ (`.../d062b264405c6`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | この戦いが終わったら一緒になろうと約束していた勇者は、私の目の前で皇女様との結婚を選んだ (`.../d062b264405c6`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 女王の烙印～滅びの国の夜伽巫女～ (`.../d4ec3626b0af5`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 育てのおやは死神です。 (`.../57fe7849c6f77`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | この戦いが終わったら一緒になろうと約束していた勇者は、私の目の前で皇女様との結婚を選んだ (`.../d062b264405c6`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | この戦いが終わったら一緒になろうと約束していた勇者は、私の目の前で皇女様との結婚を選んだ (`.../d062b264405c6`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 9 | 第1話 (`.../b94fe953cb656`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=この戦いが終わったら一緒になろうと約束していた勇者は、私の目の前で皇女様との結婚を選んだ, URL=`d062b264405c6` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.rimacomiplus.jp/.../20260323131647667E4FE3513E74225188CAF76039A61169E-lg.webp` (image/webp (encoding: lossy), 40402 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `d062b264405c6` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.rimacomiplus.jp/.../20260323131647667E4FE3513E74225188CAF76039A61169E.png` (image/png, 4212174 bytes, 2560x1344) |  |  |  |
| details author | PASS | さぎり和紗, めぐめぐ（エブリスタ） |  |  |  |
| details artist | PASS | さぎり和紗, めぐめぐ（エブリスタ） |  |  |  |
| details genres | PASS | デジタルマーガレット, 再出発, 勇者, 異世界, 神官, 魔王 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 「この戦いが終わったら一緒になろう」神官アウラは、勇者ダグと交わした約束を信じ、ついに魔王討伐を成し遂げた。しかしその命がけの恋は、残酷な裏切りで終わる。ダグは目の前で皇女との結婚を誓い、あざ笑うように「もう用なしだ」と言い放ったのだ。傷心したアウラに手を差し伸べたのは、パーティ仲間の盾役マーヴィ。彼に誘われ、たどり着いた異郷の街で待っていたのは、優しい人々と、穏やかな日常、そしてーー。勇者に“使い捨て”にされた一行の、温かな再出発ストーリー！<br>※本商品は一部、雑誌掲載時および連載時のコンテンツを含み、単行本版と収録内容が異なる場合がございます。漫画内の告知等は過去のものとなりますので、ご注意ください。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.rimacomiplus.jp/.../master-1773898624713-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 10, 0, 6, 5, 15, 13, 9, 14, 3, 8, 7, 1, 11, 2, 12\]` (image/jpeg, 773043 bytes, 1440x2048) |  |  |  |
