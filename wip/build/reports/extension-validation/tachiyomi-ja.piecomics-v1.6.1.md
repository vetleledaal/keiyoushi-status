# Extension Validation Report

- Extension: tachiyomi-ja.piecomics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8591257649902401345
- Source name: PIE COMICS
- Source language: ja
- Selected manga input: popular offset 0: 箱庭綺談（はこにわきだん） (`.../hakoniwa`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | 箱庭綺談（はこにわきだん） (`.../hakoniwa`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 7 | まむゆん (`.../mamuyun`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 箱庭綺談（はこにわきだん） (`.../hakoniwa`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 箱庭綺談（はこにわきだん） (`.../hakoniwa`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | 【第一話】行雲流水（こううんりゅうすい） (`.../55330`) |  | <1s |
| pages | `getPageList(chapter)` | success | 42 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=箱庭綺談（はこにわきだん）, URL=`.../hakoniwa` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 18/18 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 18/18 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://comics.pie.co.jp/.../d5bd73a44c2b58e8d302601a98ea4380.jpg` (image/jpeg, 435851 bytes, 671x544) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hakoniwa` |  |  |  |
| details thumbnail URL | PASS | `https://comics.pie.co.jp/.../d5bd73a44c2b58e8d302601a98ea4380.jpg` |  |  |  |
| details author | PASS | 雪路凹子 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **※こちらで公開しているものはWeb連載版です。単行本収録時に、一部加筆修正をしているため単行本版と異なる箇所があります。**<br><br>\[**単行本第2巻好評発売中！！！**\](https://pie.co.jp/.../6027)<br><br>クラシカルな世界観で描かれる、寄宿舎に集う曰くありげな少年たちの群像劇。<br>耽美BL＋シュールギャグの名手、雪路凹子の新境地。<br><br>※こちらは、スクリーンショット投稿可能作品です。\[ガイドライン\](https://pie.co.jp/.../4884372)を必ずお読みのうえ、感想投稿等にご利用ください。<br><br>**編集部コメント:** いよいよ単行本第2巻が発売となりました！ よろしくお願いします。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s3-ap-northeast-1.amazonaws.com/.../M_H.jpg <redacted query values: dmytime>` (image/jpeg, 595098 bytes, 1128x1600) |  |  |  |
