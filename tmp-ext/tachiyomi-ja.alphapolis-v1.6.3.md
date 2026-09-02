# Extension Validation Report

- Extension: tachiyomi-ja.alphapolis-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1943011614685426671
- Source name: Alphapolis
- Source language: ja
- Selected manga input: popular offset 0: 側妃は捨てられましたので (`.../992000738`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 側妃は捨てられましたので (`.../992000738`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 48 | Ｆ級テイマーは数の暴力で世界を裏か... (`.../166000762`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 48 | 利用されるだけの人生にさよならを ―... (`.../415000737`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 側妃は捨てられましたので (`.../992000738`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 側妃は捨てられましたので (`.../992000738`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | 第1回 (`.../11790`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 44 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=側妃は捨てられましたので, URL=`.../992000738` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 127/127 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 127/127 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-image.alphapolis.co.jp/.../670x300.webp` (image/webp (encoding: lossy), 90482 bytes, 670x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../992000738` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-image.alphapolis.co.jp/.../670x300.webp` |  |  |  |
| details author | PASS | なか |  |  |  |
| details artist | PASS | ましろぷに |  |  |  |
| details genres | PASS | 異世界, 恋愛, ファンタジー, 令嬢, ざまあ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 愚かな国王ランドルフによって、廃妃にされたクリスティーナ。実家に帰り、せめて心を休めたい……そう思っていたのに、実家でも廃妃にされたことを責められるばかり。幼い頃より妃教育に励み、若き国王となったランドルフを支えるため、寝る間を惜しんで執務に励んできたのに、誰も彼女のことを労わろうとはしない。努力を認めず自分の都合を押し付けてくる家族、自分の功績をすべてなかったことにする国王。その全員を捨てることにしたクリスティーナは、ランドルフを国王から引きずり下ろすために、国王に並ぶ権力を持つ辺境伯領へ向かうことに。辺境伯領では今までの努力を認められ、順風満帆と思っていたらランドルフが必死に追いすがってきて――!?　窮屈な人生から飛び出して、新天地から輝く人生始めます！　最高にスッキリする逆転劇、ここに開幕！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 44 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ot-image.alphapolis.co.jp/.../1080x1536.webp <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/webp (encoding: lossy), 978376 bytes, 1080x1536) |  |  |  |
