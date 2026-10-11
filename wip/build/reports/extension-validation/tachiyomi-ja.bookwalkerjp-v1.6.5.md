# Extension Validation Report

- Extension: tachiyomi-ja.bookwalkerjp-v1.6.5
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 28
- Lint: 2
- Warnings: 2
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7753308828123873766
- Source name: BookWalker Japan
- Source language: ja
- Selected manga input: popular offset 0: 干物妹！うまるちゃん（ヤングジャンプコミックスDIGITAL） (`.../16055`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | 干物妹！うまるちゃん（ヤングジャンプコミックスDIGITAL） (`.../16055`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 60 | 転生ゴブリンだけど質問ある？（ヤングジャンプコミックスDIGITAL） (`.../250018`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 60 | サザエさん（朝日新聞出版） (`.../594856`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 60 | 思い出食堂（ぐる漫） (`.../105238`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | 干物妹！うまるちゃん（ヤングジャンプコミックスDIGITAL） (`.../16055`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 干物妹！うまるちゃん（ヤングジャンプコミックスDIGITAL） (`.../16055`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 15 | 🔒 (Preview) 干物妹！うまるちゃん 1 (`.../b052cbeb-fe89-4a93-adfb-0e60f43910a9`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: No preview available, or you need to purchase this volume. | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: No preview available, or you need to purchase this volume. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=干物妹！うまるちゃん（ヤングジャンプコミックスDIGITAL）, URL=`16055` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 243/243 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 243/243 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://c.bookwalker.jp/.../coverImage_3031702.jpg` (image/jpeg, 617620 bytes, 964x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `16055` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://member.bookwalker.jp/.../coverImage_3031702.jpg` (image/jpeg, 617620 bytes, 964x1200) |  |  |  |
| details author | PASS | サンカクヘッド |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 妹の“うまる”は、容姿端麗！　文武両道！　誰もが羨む完璧JK。しかし、この美妹には、秘密があった!!　一度、玄関をくぐれば…　あっちにゴロゴロ♪こっちにゴロゴロ♪　“食う・寝る・遊ぶ”の干物妹ライフ!?　内弁慶の外美人！　“うまる”の生態を追ったニュータイプ兄妹コミック待望の第1巻ッ!!!<br><br>Alternative Title: ヒモウトウマルチャン<br><br>Publisher: 集英社<br><br>Label: ヤングジャンプコミックスDIGITAL<br><br>（C）サンカクヘッド.../%E9%9B%86%E8%8B%B1%E7%A4%BE |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | LINT | All 15 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=15 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No preview available, or you need to purchase this volume. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://bookwalker.jp/.../deb052cbeb-fe89-4a93-adfb-0e60f43910a9 <redacted query values: sample>` to `https://viewer.bookwalker.jp/.../viewer.html <redacted query values: cid and cty>` (2 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
