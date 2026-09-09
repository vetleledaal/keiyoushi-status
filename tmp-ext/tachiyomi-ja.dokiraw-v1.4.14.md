# Extension Validation Report

- Extension: tachiyomi-ja.dokiraw-v1.4.14
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: liliana
- Source ID: 3967449247820755680
- Source name: Dokiraw
- Source language: ja
- Selected manga input: popular offset 0: 婚約破棄されたので、好きにすることにした。 (`.../hun-yue-po-qi-saretanode-hao-kinisurukotonishita`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 36 | 婚約破棄されたので、好きにすることにした。 (`.../hun-yue-po-qi-saretanode-hao-kinisurukotonishita`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 36 | 帝乃三姉妹は案外、チョロい。 (`.../di-nai-san-zi-mei-haan-wai-chiyoroi`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 婚約破棄されたので、好きにすることにした。 (`.../hun-yue-po-qi-saretanode-hao-kinisurukotonishita`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 婚約破棄されたので、好きにすることにした。 (`.../hun-yue-po-qi-saretanode-hao-kinisurukotonishita`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 101 | 第1.1話 (`.../chapter-1.1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 12 |  |  | <1s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=婚約破棄されたので、好きにすることにした。, URL=`.../hun-yue-po-qi-saretanode-hao-kinisurukotonishita` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://admin.mangarawad.asia/.../cover.jpg` (image/jpeg, 29405 bytes, 320x455) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hun-yue-po-qi-saretanode-hao-kinisurukotonishita` |  |  |  |
| details thumbnail URL | PASS | `https://admin.mangarawad.asia/.../cover.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | メルディカル侯爵令嬢のクロエは、男尊女卑の根強いアダナーニ王国の第二王子・キリフのお飾り婚約者。しかしキリフに婚約破棄を突き付けられたショックで、OL・橘美紗としての前世の記憶を思い出した！「せっかく生まれ変わったのだから、もっと人生を楽しみたい――」すべてを捨てて自由に生きようと決意したクロエは、騒動に便乗して近衛騎士を辞めてきたエーリヒを相棒に、自由を求めて旅立った！！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 101 chapters |  |  |  |
| chapter dates | PASS | 101 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://iphotomg.com/.../page_0.jpg` (image/jpeg, 169574 bytes, 720x1024) |  |  |  |
