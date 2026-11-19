# Extension Validation Report

- Extension: tachiyomi-ja.tonarinoyoungjump-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 5726629019734498294
- Source name: Tonari no Young Jump
- Source language: ja
- Selected manga input: popular offset 0: 田舎者のおっさんは無自覚に無双する～たった一人で門番をしてたら、いつの間にか最強になっていた～ (`.../12207421984480439052`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 204 | 田舎者のおっさんは無自覚に無双する～たった一人で門番をしてたら、いつの間にか最強になっていた～ (`.../12207421984480439052`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 204 | ワンパンマン (`.../13932016480028984490`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 田舎者のおっさんは無自覚に無双する～たった一人で門番をしてたら、いつの間にか最強になっていた～ (`.../12207421984480439052`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 田舎者のおっさんは無自覚に無双する～たった一人で門番をしてたら、いつの間にか最強になっていた～ (`.../12207421984480439052`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | [第1話] 田舎者のおっさんは無自覚に無双する～たった一人で門番をしてたら、いつの間にか最強になっていた～ (`.../12207421984480485123`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 66 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 204 entries |  |  |  |
| latest listing | PASS | 204 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=田舎者のおっさんは無自覚に無双する～たった一人で門番をしてたら、いつの間にか最強になっていた～, URL=`12207421984480439052` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 409/409 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 409/409 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.tonarinoyj.jp/.../12207421984480439052-8b4d5207554576667c7e9fb0a054ea6b <redacted query values: 1794820860>` (image/jpeg, 352820 bytes, 500x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421984480439052` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.tonarinoyj.jp/.../12207421984480439052-8b4d5207554576667c7e9fb0a054ea6b <redacted query values: 1794820860>` |  |  |  |
| details author | PASS | kimimaro/斉藤尚武 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 祖父の代から守ってきた田舎の砦の、門番の仕事を、奪われてしまったディアン。気付けば25年、門番しかしてなかった…！手に職の無い中年のディアンは、仕方なく冒険者となるため、遠くの街へ向かう。しかしその道中、S級冒険者のカグヤと出会い…！？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 66 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.tonarinoyj.jp/.../12207421984516829218-1493b99c1355a250115031040de0256d` (image/jpeg, 364562 bytes, 800x1137) |  |  |  |
