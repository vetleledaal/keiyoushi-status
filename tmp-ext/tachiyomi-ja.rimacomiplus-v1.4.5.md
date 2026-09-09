# Extension Validation Report

- Extension: tachiyomi-ja.rimacomiplus-v1.4.5
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
- Source theme: comiciviewer
- Source ID: 8784054084293367959
- Source name: RimacomiPlus
- Source language: ja
- Selected manga input: popular offset 0: 籠のなかの竜聖女 ―虐げられた伯爵令嬢は、今日も溺愛されています―  (`.../c9dfec578c769`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 籠のなかの竜聖女 ―虐げられた伯爵令嬢は、今日も溺愛されています―  (`.../c9dfec578c769`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | 女王の烙印～滅びの国の夜伽巫女～ (`.../d4ec3626b0af5`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | シュガーレスロマンス (`.../be749ab5ff5e3`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 籠のなかの竜聖女 ―虐げられた伯爵令嬢は、今日も溺愛されています―  (`.../c9dfec578c769`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 籠のなかの竜聖女 ―虐げられた伯爵令嬢は、今日も溺愛されています―  (`.../c9dfec578c769`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 24 | 第1話 (`.../6fb055b9293ca`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 34 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=籠のなかの竜聖女 ―虐げられた伯爵令嬢は、今日も溺愛されています― , URL=`.../c9dfec578c769` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.rimacomiplus.jp/.../202412251358039115779292282B11B46F9889069525D97A6-lg.webp` (image/webp (encoding: lossy), 29160 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../c9dfec578c769` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.rimacomiplus.jp/.../202412251358039115779292282B11B46F9889069525D97A6.png` (image/png, 3295607 bytes, 2560x1344) |  |  |  |
| details author | PASS | 氷室亮, 屋月トム伽 |  |  |  |
| details artist | PASS | 氷室亮, 屋月トム伽 |  |  |  |
| details genres | PASS | デジタルマーガレット, ファンタジー, 健気, 年上男子, 異世界, 異種族 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 【一度、結婚を断られたはずなのに……!?】エルヴァスティ国を守る黒緋竜のお世話を任されている竜聖女は、この国の王子の正式な婚約者と定められている。現在の竜聖女・リューディアは、幼い頃から巨大な鳥籠の中で住まう黒緋竜・グラムヴィントのお世話に励み、王子であるエディクの婚約者であった。しかしある日、突然エディクに呼び出されたリューディアは、竜聖女の解任と婚約の破棄を言い渡されてしまう。なんと次の竜聖女になったのは、義姉のレイラ。しかもエディクは、次の行き先として漆黒将軍・ヴィルフリードと結婚してもらうとリューディアに言ってくるが、ヴィルフリードからは「私とあなたでは釣り合わない」と結婚を断られてしまい……!? |  |  |  |
| metadata trimming | LINT | Untrimmed fields: title |  |  |  |
| chapters | PASS | 24 chapters |  |  |  |
| chapter dates | PASS | 24 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 34 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.rimacomiplus.jp/.../master-1733902869710-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 6, 15, 9, 12, 5, 11, 4, 8, 7, 3, 0, 13, 2, 14, 1\]` (image/jpeg, 847602 bytes, 1440x2048) |  |  |  |
