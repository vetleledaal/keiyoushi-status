# Extension Validation Report

- Extension: tachiyomi-ja.mangatoshokanz-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 2
- Warnings: 0
- Skipped: 6
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7564150377964448106
- Source name: マンガ図書館Z
- Source language: ja
- Selected manga input: popular offset 0: グルームパーティー (`.../49131`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 100 | グルームパーティー (`.../49131`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 50 | ウチ姫４koma (`.../228341`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 50 | What has happened to me ～Testimony of an Uyghur woman 2～ (`.../221541`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | グルームパーティー 第1巻 (`.../49131`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | グルームパーティー (`.../49131`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 5 | 第1巻 (`.../49131`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=グルームパーティー 第1巻, URL=`49131` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 202/202 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 202/202 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaz-books.j-comi.jp/.../cover1716707994.webp` (image/webp (encoding: lossy), 16038 bytes, 420x595) |  |  |  |
| details identity | PASS | Details preserved selected URL `49131` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | 川島 よしお |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 川島 よしお, グルームパーティー, 4コマ, 5巻以内に完結するマンガ, さくらんぼ論理, ギャグ, お色気, 週刊少年チャンピオン, 少年漫画, 1990年代, 少年チャンピオン・コミックス, 月刊少年チャンピオン, ヤングチャンピオン, 青年漫画, エレガンスイブ, かわいい, 全5巻 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 1995年、秋田書店「週刊少年チャンピオン」連載。全5巻。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | LINT | All 5 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=5 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 500 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
