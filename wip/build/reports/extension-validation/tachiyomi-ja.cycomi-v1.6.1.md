# Extension Validation Report

- Extension: tachiyomi-ja.cycomi-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 8354556596244088751
- Source name: CyComi
- Source language: ja
- Selected manga input: popular offset 0: 終の退魔師―エンダーガイスター― (`.../139`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 終の退魔師―エンダーガイスター― (`.../139`) |  | 10s+ |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 22 | 終の退魔師―エンダーガイスター― (`.../139`) |  | 10s+ |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 終の退魔師―エンダーガイスター― (`.../139`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 終の退魔師―エンダーガイスター― (`.../139`) |  | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 375 | 第１話 - オーガスト・ウォーズ (`.../8007`) |  | 10s+ |
| pages | `getPageList(chapter)` | success | 69 |  |  | 10s+ |

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
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=終の退魔師―エンダーガイスター―, URL=`139` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 43/43 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 43/43 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://assets-web-prd.akamaized.net/.../1.png <redacted query values: ver>` (image/png, 254284 bytes, 1400x735) |  |  |  |
| details identity | PASS | Details preserved selected URL `139` |  |  |  |
| details thumbnail URL | PASS | `https://assets-web-prd.akamaized.net/.../1.png <redacted query values: ver>` |  |  |  |
| details author | PASS | 四方山 貴史 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 累計350万部越え、世界５カ国で翻訳されている大人気アクション。<br>他にはない映画的バトル＆心理戦と張り巡らされた伏線から目が離せない！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 375 chapters |  |  |  |
| chapter dates | PASS | 375 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 69 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://contents.cycomi.com/.../1.jpg <redacted query values: ver, Expires, Signature, and Key-Pair-Id>` (image/jpeg, 369663 bytes, 960x1364) |  |  |  |
