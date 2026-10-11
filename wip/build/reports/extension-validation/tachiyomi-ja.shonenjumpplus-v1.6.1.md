# Extension Validation Report

- Extension: tachiyomi-ja.shonenjumpplus-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 25
- Lint: 2
- Warnings: 1
- Skipped: 8
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 5161357527629843269
- Source name: Shonen Jump+
- Source language: ja
- Selected manga input: popular offset 0: 打ち切られ漫画家と同人女 (`.../17107094915405001773`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 95 | 打ち切られ漫画家と同人女 (`.../17107094915405001773`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | イッピツアヤル (`.../9253191256479706037`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | 打ち切られ漫画家と同人女 (`.../17107094915405001773`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 打ち切られ漫画家と同人女 (`.../17107094915405001773`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 19 | 💴 (Volume) 打ち切られ漫画家と同人女 1 (`.../9253191253631646600`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: This chapter is either unavailable or must be purchased. | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: This chapter is either unavailable or must be purchased. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 95 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=打ち切られ漫画家と同人女, URL=`17107094915405001773` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 108/108 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 108/108 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-ak-img.shonenjumpplus.com%2Fpublic%2Fseries-thumbnail%2F17107094915405001773-a4f5fef4c93c80138aad5c3a3b3f05b4%3F1791345775` (image/jpeg, 23980 bytes, 216x216) |  |  |  |
| details identity | PASS | Details preserved selected URL `17107094915405001773` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-ak-img.shonenjumpplus.com/.../17107094915405001773-a4f5fef4c93c80138aad5c3a3b3f05b4 <redacted query values: 1791345775>` (image/jpeg, 117530 bytes, 482x482) |  |  |  |
| details author | PASS | 澄ヒビト |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 売れない漫画家・RO傍先生こと行来はついに連載打ち切りに…失意の中、SNSを開くと、なんと自分の作品に萌えまくってるアカウントが！行来の作品で同人誌をイベントで頒布すると知って、少しでも自分の作品を好きだと言ってくれる人に会いたいと思い、行来は同人即売会へ足を運ぶのだったが――…!?SNSトレンド入りの大人気読切が連載化！オタクの生態に迫りつつ、漫画家のリアルをコメディタッチで描く、漫画家（＝神）とオタク（＝信者）のすれ違いコメディ!! \[JC2巻発売中\] |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 19 chapters |  |  |  |
| chapter dates | LINT | 2 of 19 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | This chapter is either unavailable or must be purchased. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
