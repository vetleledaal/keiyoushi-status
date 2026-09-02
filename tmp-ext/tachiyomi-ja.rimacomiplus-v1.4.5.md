# Extension Validation Report

- Extension: tachiyomi-ja.rimacomiplus-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8784054084293367959
- Source name: RimacomiPlus
- Source language: ja
- Selected manga input: popular offset 0: はじめてのおにいちゃん (`.../debc3e10c6866`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | はじめてのおにいちゃん (`.../debc3e10c6866`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | HIGH SCORE (`.../d1106a1146b52`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | それは国家機密です！　女装王子が愛らしい伯爵令嬢に一目ぼれしてしまいました (`.../c92ddb6f06f8b`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | はじめてのおにいちゃん (`.../debc3e10c6866`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | はじめてのおにいちゃん (`.../debc3e10c6866`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 18 | 第1話 (`.../19a8cda482401`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=はじめてのおにいちゃん, URL=`.../debc3e10c6866` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.rimacomiplus.jp/.../20250227180444449B99A50D9173AA66D12F302A0E1F27444-lg.webp` (image/webp (encoding: lossy), 35160 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../debc3e10c6866` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.rimacomiplus.jp/.../20250227180444449B99A50D9173AA66D12F302A0E1F27444.png` (image/png, 4025804 bytes, 2560x1344) |  |  |  |
| details author | PASS | 香純裕子 |  |  |  |
| details artist | PASS | 香純裕子 |  |  |  |
| details genres | PASS | りぼん, ラブコメ, 元気, 胸キュン, 元カレ, 同居生活 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ある日突然、元カレがお兄ちゃんに！？ 愛が重めな”お兄ちゃん”との禁断の共同生活が始まる…♡<br><br>※本商品は一部、雑誌掲載時および連載時のコンテンツを含み、単行本版と収録内容が異なる場合がございます。漫画内の告知等は過去のものとなりますので、ご注意ください。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 18 chapters |  |  |  |
| chapter dates | PASS | 18 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.rimacomiplus.jp/.../master-1740636848607-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 14, 8, 5, 15, 3, 1, 12, 6, 4, 7, 2, 0, 10, 9, 13\]` (image/jpeg, 272092 bytes, 836x1200) |  |  |  |
