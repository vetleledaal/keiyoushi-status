# Extension Validation Report

- Extension: tachiyomi-ja.ciaoplus-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
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
- Selected manga input: latest offset 0: 極上!! めちゃモテ委員長-外伝-めちゃモテ委員長だった私が異世界でも極上めざします!! (`.../00678`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | シャイニング！ (`.../00279`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | ビューティーポップ Returns (`.../00759`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 5 | 極上!! めちゃモテ委員長-外伝-めちゃモテ委員長だった私が異世界でも極上めざします!! (`.../00678`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 極上!! めちゃモテ委員長-外伝-めちゃモテ委員長だった私が異世界でも極上めざします!! (`.../00678`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 極上!! めちゃモテ委員長-外伝-めちゃモテ委員長だった私が異世界でも極上めざします!! (`.../00678`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 89 | Lesson.0 (`.../27268`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| latest listing | PASS | 5 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=極上!! めちゃモテ委員長-外伝-めちゃモテ委員長だった私が異世界でも極上めざします!!, URL=`.../00678` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=ビューティーポップ Returns, URL=`.../00759` at page 1 offset 25 and page 2 offset 0, title=春恋リセット, URL=`.../00836` at page 1 offset 26 and page 2 offset 1, title=見えないように, URL=`.../00043` at page 1 offset 27 and page 2 offset 2, title=でびるんしぇあはうすっ, URL=`.../00741` at page 1 offset 28 and page 2 offset 3, title=溺愛ロワイヤル, URL=`.../00164` at page 1 offset 29 and page 2 offset 4, title=スマホ探偵 小鳥遊凛, URL=`.../00749` at page 1 offset 30 and page 2 offset 5, title=おねがいアイプリ　フルカラーおさらい4コマ, URL=`.../00842` at page 1 offset 31 and page 2 offset 6, title=会長様とひよこちゃん, URL=`.../00057` at page 1 offset 32 and page 2 offset 7, title=いじめ, URL=`.../00066` at page 1 offset 33 and page 2 offset 8, title=からぴちタウンへGO!!, URL=`.../00811` at page 1 offset 34 and page 2 offset 9, title=キング様のいちばん星, URL=`.../00202` at page 1 offset 35 and page 2 offset 10, title=神さまと偽装カップルはじめました, URL=`.../00012` at page 1 offset 36 and page 2 offset 11, title=奏くんのヒミツごと, URL=`.../00668` at page 1 offset 37 and page 2 offset 12, title=4年1組, URL=`.../00010` at page 1 offset 38 and page 2 offset 13, title=僕は人魚姫を食べたい, URL=`.../00674` at page 1 offset 39 and page 2 offset 14, title=ゆるいるかぷらす！, URL=`.../00697` at page 1 offset 40 and page 2 offset 15, title=逆転劇！〜悪役令嬢にお任せあれ〜, URL=`.../00835` at page 1 offset 41 and page 2 offset 16, title=ゲキカワ♥デビル, URL=`.../00102` at page 1 offset 42 and page 2 offset 17, title=青いエールを浴びて、キミと, URL=`.../00843` at page 1 offset 43 and page 2 offset 18, title=青のアイリス, URL=`.../00097` at page 1 offset 44 and page 2 offset 19, title=アクマでこれは恋じゃない！, URL=`.../00281` at page 1 offset 45 and page 2 offset 20, title=結婚してくれなきゃ死んでやる, URL=`.../00581` at page 1 offset 46 and page 2 offset 21, title=1秒先は、恋, URL=`.../00777` at page 1 offset 47 and page 2 offset 22, title=没落マイレディ, URL=`.../00613` at page 1 offset 48 and page 2 offset 23, title=はろー！ マイベイビーＳ, URL=`.../00637` at page 1 offset 49 and page 2 offset 24 |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 106/106 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 106/106 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.ciao.shogakukan.co.jp/.../banner_202509161046541d0291026f9dda942a078eceef49e4ae.jpg` (image/jpeg, 301514 bytes, 1340x1005) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../00678` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | にしむらともこ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ラブ, 異世界 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | あの大人気「めちゃモテ委員長」が帰ってきた！しかも舞台はまさかの異世界——！？貧乏貴族に転生しためちゃモテ委員長は、異世界でも極上を目指してとことん頑張りますっ！<br><br>毎月9日前後 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 89 chapters |  |  |  |
| chapter dates | PASS | 89 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.ciao.shogakukan.co.jp/.../a04f6bd4ba1984da0b523bdcc5c6725971d12f2a87e050720b0d66ee8034bcab.jpg <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 595801 bytes, 1303x2048) |  |  |  |
