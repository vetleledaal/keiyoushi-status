# Extension Validation Report

- Extension: tachiyomi-ja.cmoa-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 1
- Warnings: 1
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1222039348961733003
- Source name: C'moA
- Source language: ja
- Selected manga input: popular offset 0: 契約婚した相手が鬼宰相でしたが、この度宰相室専任補佐官に任命された地味文官（変装中）は私です。 (`.../323254`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 200 | 契約婚した相手が鬼宰相でしたが、この度宰相室専任補佐官に任命された地味文官（変装中）は私です。 (`.../323254`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 90 | 成瀬社長は面倒見が良すぎる。【単話版】 (`.../341595`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 90 | 玉佩輪廻～この陰謀、死に戻りで制します【タテヨミ】 (`.../331541`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 5 | 契約婚した相手が鬼宰相でしたが、この度宰相室専任補佐官に任命された地味文官（変装中）は私です。 (`.../323254`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 契約婚した相手が鬼宰相でしたが、この度宰相室専任補佐官に任命された地味文官（変装中）は私です。 (`.../323254`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 4 | （1） (`.../sample <redacted query values: title_id and content_id>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in via WebView and purchase this product to read. | 1-10s |

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
| popular listing | PASS | 200 entries |  |  |  |
| latest listing | PASS | 90 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=契約婚した相手が鬼宰相でしたが、この度宰相室専任補佐官に任命された地味文官（変装中）は私です。, URL=`323254` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 385/385 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 385/385 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cmoa.akamaized.net/.../100003232540004.jpg` (image/jpeg, 23275 bytes, 180x256) |  |  |  |
| details identity | PASS | Details preserved selected URL `323254` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cmoa.akamaized.net/.../100003232540001.jpg` (image/jpeg, 23430 bytes, 180x256) |  |  |  |
| details author | PASS | 月白セブン, 大川なぎ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少女マンガ, ファンタジー, 恋愛, 異世界・転生, 広告掲載中, ファンタジー, 恋愛, 異世界・転生, 広告掲載中 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | クリスティーヌが暮らす王国では現王が庶民の女性と結婚してから、恋愛結婚がもてはやされていた。果てには既婚者であっても「運命の愛」ならば離婚もいとわないという風潮だった。そんな結婚観に辟易していた時クリスティーヌは、たまたま出会ったレオンと「離婚はしない」という約束のもと契約結婚をしたが、レオンの正体は宰相閣下だった！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | LINT | All 4 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=4 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView and purchase this product to read. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
