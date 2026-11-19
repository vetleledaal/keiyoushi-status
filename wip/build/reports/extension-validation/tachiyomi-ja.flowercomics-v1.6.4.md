# Extension Validation Report

- Extension: tachiyomi-ja.flowercomics-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6525907185900913523
- Source name: Flower Comics
- Source language: ja
- Selected manga input: popular offset 0: 青の花　器の森 (`.../712`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 青の花　器の森 (`.../712`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 44 | 緋のつがい (`.../1286`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 青の花　器の森 (`.../712`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 青の花　器の森 (`.../712`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 101 | 第1話 -1 (`.../22246`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 44 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=青の花　器の森, URL=`712` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.flowercomics.jp/.../712.webp <redacted query values: h and e>` (image/webp (encoding: lossy), 138602 bytes, 1920x1440) |  |  |  |
| details identity | PASS | Details preserved selected URL `712` |  |  |  |
| details thumbnail URL | PASS | `https://img.flowercomics.jp/.../712.webp <redacted query values: h and e>` |  |  |  |
| details author | PASS | 小玉ユキ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 恋愛.../%E5%A4%A7%E4%BA%BA, 恋愛, ヒューマンドラマ, お仕事, 完結, 月刊ｆｌｏｗｅｒｓ |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 長崎・波佐見を舞台に始まる、器と恋の物語 波佐見焼きの窯で絵付けの仕事をしている青子。その窯に、海外で作陶していたという龍生がやってきた。無愛想で人を寄せ付けない龍生に「絵付けされた器に興味ない」と言われ、自分の生き方まで否定された気持ちの青子だが、反発しながらも龍生の器に惹かれていき…？ 器に魅せられた男女が出会ったことで、恋が動き出す－－！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 101 chapters |  |  |  |
| chapter dates | PASS | 101 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://flowercomics.jp/.../ranking` to `https://flowercomics.jp/.../ranking <redacted query values: _rsc>` (1 redirects); popular: `https://flowercomics.jp/.../rensai` to `https://flowercomics.jp/.../rensai <redacted query values: _rsc>` (1 redirects); popular: `https://flowercomics.jp/.../viewer` to `https://flowercomics.jp/.../viewer <redacted query values: _rsc>` (1 redirects) |  |  |  |
| page load | PASS | `https://img.flowercomics.jp/.../1.webp.enc <redacted query values: h and e>` (image/webp (encoding: lossy), 214320 bytes, 764x1200; server Content-Type: application/octet-stream) |  |  |  |
