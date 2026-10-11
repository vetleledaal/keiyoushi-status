# Extension Validation Report

- Extension: tachiyomi-ja.asacomi-v1.6.1
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
- Source ID: 6455606609436338494
- Source name: Asacomi
- Source language: ja
- Selected manga input: popular offset 0: 邪神X (`.../9148ce381c551`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 邪神X (`.../9148ce381c551`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 猫を拾った話。 (`.../da8497824b617`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Hold me tight (`.../1d8581756a2c7`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 邪神X (`.../9148ce381c551`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 邪神X (`.../9148ce381c551`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 18 | 第1話 (`.../beffb37efc0a2`) |  | <1s |
| pages | `getPageList(chapter)` | success | 49 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=邪神X, URL=`9148ce381c551` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20260728113241916FF5EA254BFD21826B5ED328E28B28760-lg.webp` (image/webp (container: extended), 55826 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `9148ce381c551` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20260728113241916FF5EA254BFD21826B5ED328E28B28760.png` (image/png, 4788783 bytes, 2560x1344) |  |  |  |
| details author | PASS | 熊田龍泉 |  |  |  |
| details artist | PASS | 熊田龍泉 |  |  |  |
| details genres | PASS | コミックZOTTO, ホラー |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 会社の慰安旅行で秘湯に向かおうとしていたバスが落石により転落。周囲何十キロに民家がない状況で遭難してしまう。しかしそこで主人公たちを助けてくれたのは、人目を離れて自給自足生活を行っている“山有心の里”の人々だった。主人公たちは助けてくれたことに感謝していたが、何日たっても救助は来ず、次第に“山有心の里”の異常さがあらわになっていく。そして――。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 18 chapters |  |  |  |
| chapter dates | PASS | 18 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 49 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.asacomi.jp/.../master-1788320920758-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 0, 3, 11, 4, 14, 2, 13, 9, 1, 15, 12, 5, 6, 8, 7\]` (image/jpeg, 2503455 bytes, 1765x2509) |  |  |  |
