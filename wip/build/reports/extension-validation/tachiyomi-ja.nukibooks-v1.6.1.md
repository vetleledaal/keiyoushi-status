# Extension Validation Report

- Extension: tachiyomi-ja.nukibooks-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5179763109109786309
- Source name: ヌキブックス
- Source language: ja
- Selected manga input: popular offset 0: 時間停止教師 (`.../2432776`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | 時間停止教師 (`.../2432776`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | COMIC アンスリウム 2026年12月号 (`.../4340983`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 28 | 寝取られの果てに (`.../4331075`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 28 | 時間停止教師 (`.../2432776`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 時間停止教師 (`.../2432776`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../2432776`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | <1s |

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
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=時間停止教師, URL=`.../2432776` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 184/184 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 184/184 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gazou.nukibooks.com/.../cover.webp` (image/webp (encoding: lossy), 22272 bytes, 350x263) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2432776` |  |  |  |
| details thumbnail URL | PASS | `https://gazou.nukibooks.com/.../cover.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | イケオジ, フルカラー, 中出し, ポニーテール, レイプ・強姦, 制服, 男性一人, 先生, 時間停止 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 24ページ · **原作:** オリジナル |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://gazou.nukibooks.com/.../1.webp` (image/webp (encoding: lossy), 39664 bytes, 560x420) |  |  |  |
