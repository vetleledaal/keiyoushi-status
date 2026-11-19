# Extension Validation Report

- Extension: tachiyomi-ja.sugocomics-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 26
- Lint: 2
- Warnings: 2
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4036523004624942398
- Source name: Sugo Comics
- Source language: ja
- Selected manga input: popular offset 0: 完璧な彼女の (`.../86826`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | 完璧な彼女の (`.../86826`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | お嬢様系底辺ダンジョン配信者、迷惑系をボコったらバズって伝説になってますわ!?【単話】 (`.../1161746`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | ごきげんよう。皆様がうわさする悪役令嬢です。 〜この度、幸せを掴むことにいたしました〜 (`.../1174507`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 完璧な彼女の (`.../86826`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 完璧な彼女の (`.../86826`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 🔒 完璧な彼女の (`.../86826`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in via WebView and purchase this product to read. | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Log in via WebView and purchase this product to read. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=完璧な彼女の, URL=`86826` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 111/111 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 111/111 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nadeshiko-shoten.jp/.../20011-120597475-001-001.jpg` (image/png, 66509 bytes, 180x256) |  |  |  |
| details identity | PASS | Details preserved selected URL `86826` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://nadeshiko-shoten.jp/.../20011-120597475-001-001.png` was not downloaded |  |  |  |
| details author | PASS | 川邑司 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少年・青年, 青年コミック |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Publisher: 双葉社<br><br>毎朝モーニングコールしてくれるし、弁当も作ってくれる、その上セックスもイク時は毎回一緒（?）。そんな僕の“完璧な彼女”には超意外な、本気の“弱点”があったんだ……。表題作を始め、麗しき乙女たちが隠し持つ、人に言えないエッチなスイッチに迫る珠玉短編集!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView and purchase this product to read. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://nadeshiko-shoten.jp/.../list.php <redacted query values: mode and group_id>` to `https://nadeshiko-shoten.jp/.../list.php <redacted query values: back_ref, mode, group_id, and transactionid>` (2 redirects); popular: `https://nadeshiko-shoten.jp/.../reading.php <redacted query values: product_id>` to `https://account.nadeshiko-shoten.jp/.../login <redacted query values: redirect>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
