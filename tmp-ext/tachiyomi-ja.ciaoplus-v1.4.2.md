# Extension Validation Report

- Extension: tachiyomi-ja.ciaoplus-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1585589665574145721
- Source name: Ciao Plus
- Source language: ja
- Selected manga input: latest offset 0: でびるんしぇあはうすっ (`.../00741`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 上杉くんは女の子をやめたい (`.../00577`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | この恋が、罪だとしても (`.../00224`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 2 | でびるんしぇあはうすっ (`.../00741`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | でびるんしぇあはうすっ (`.../00741`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | でびるんしぇあはうすっ (`.../00741`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 35 | シェアハウスしよう.../%E3%82%AA%E3%83%A0%E3%83%A9%E3%82%A4%E3%82%B9 (`.../29612`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 2 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=でびるんしぇあはうすっ, URL=`.../00741` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=この恋が、罪だとしても, URL=`.../00224` at page 1 offset 25 and page 2 offset 0, title=イイネ！ＲＥＩＷＡギャル★あみるん plus, URL=`.../00572` at page 1 offset 26 and page 2 offset 1, title=溺愛ロワイヤル, URL=`.../00164` at page 1 offset 27 and page 2 offset 2, title=こいしか！～恋はしかく？～, URL=`.../00532` at page 1 offset 28 and page 2 offset 3, title=ヴァンパイアの花嫁, URL=`.../00163` at page 1 offset 29 and page 2 offset 4, title=見えないように, URL=`.../00043` at page 1 offset 30 and page 2 offset 5, title=極上!! めちゃモテ委員長-外伝-めちゃモテ委員長だった私が異世界でも極上めざします!!, URL=`.../00678` at page 1 offset 31 and page 2 offset 6, title=１２歳。, URL=`.../00121` at page 1 offset 32 and page 2 offset 7, title=君を知って恋になる, URL=`.../00622` at page 1 offset 33 and page 2 offset 8, title=お母さんの麦わらぼうし, URL=`.../00864` at page 1 offset 34 and page 2 offset 9, title=現実的理想王子, URL=`.../00646` at page 1 offset 35 and page 2 offset 10, title=逆転劇！〜悪役令嬢にお任せあれ〜, URL=`.../00835` at page 1 offset 36 and page 2 offset 11, title=帰り道, URL=`.../00862` at page 1 offset 37 and page 2 offset 12, title=1秒先は、恋, URL=`.../00777` at page 1 offset 38 and page 2 offset 13, title=キング様のいちばん星, URL=`.../00202` at page 1 offset 39 and page 2 offset 14, title=没落マイレディ, URL=`.../00613` at page 1 offset 40 and page 2 offset 15, title=会長様とひよこちゃん, URL=`.../00057` at page 1 offset 41 and page 2 offset 16, title=からぴちタウンへGO!!, URL=`.../00811` at page 1 offset 42 and page 2 offset 17, title=4年1組, URL=`.../00010` at page 1 offset 43 and page 2 offset 18, title=神さまと偽装カップルはじめました, URL=`.../00012` at page 1 offset 44 and page 2 offset 19, title=結婚してくれなきゃ死んでやる, URL=`.../00581` at page 1 offset 45 and page 2 offset 20, title=カケちがいボイス, URL=`.../00855` at page 1 offset 46 and page 2 offset 21, title=マイドリームラストステージ, URL=`.../00779` at page 1 offset 47 and page 2 offset 22, title=アクマでこれは恋じゃない！, URL=`.../00281` at page 1 offset 48 and page 2 offset 23, title=ちび☆デビ！, URL=`.../00138` at page 1 offset 49 and page 2 offset 24 |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 103/103 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 103/103 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.ciao.shogakukan.co.jp/.../banner_20250401152605b81958ea0e6f311eb5f1dbdd4d2f79b0.jpg` (image/jpeg, 202120 bytes, 1340x1005) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../00741` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | 桜庭あも,監修：ＡＮＹＣＯＬＯＲ株式会社 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ギャグ・エッセイ |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | VTuber事務所「にじさんじ」の獣2匹が不思議な世界でシェアハウスしちゃいます!? でびでび・でびるとルンルンがちゃおプラスに登場!!<br><br>毎月9日前後 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 35 chapters |  |  |  |
| chapter dates | PASS | 35 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.ciao.shogakukan.co.jp/.../aa0a951a1505afbadd7f07f795e7d60ba671782e117ff63cd651c810d6bdbddf.jpg <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 477057 bytes, 1303x2048) |  |  |  |
