# Extension Validation Report

- Extension: tachiyomi-ja.cycomi-v1.6.2
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
- Source ID: 8354556596244088751
- Source name: CyComi
- Source language: ja
- Selected manga input: popular offset 0: TSUYOSHI 誰も勝てない、アイツには (`.../96`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | TSUYOSHI 誰も勝てない、アイツには (`.../96`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | TSUYOSHI 誰も勝てない、アイツには (`.../96`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | TSUYOSHI 誰も勝てない、アイツには (`.../96`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | TSUYOSHI 誰も勝てない、アイツには (`.../96`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 412 | 第１話 - 最強を求めて (`.../6029`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 52 |  |  | <1s |

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
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=TSUYOSHI 誰も勝てない、アイツには, URL=`96` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://assets-web-prd.akamaized.net/.../1.png <redacted query values: ver>` (image/png, 491645 bytes, 1400x735) |  |  |  |
| details identity | PASS | Details preserved selected URL `96` |  |  |  |
| details thumbnail URL | PASS | `https://assets-web-prd.akamaized.net/.../1.png <redacted query values: ver>` |  |  |  |
| details author | PASS | 丸山恭右　原作：Zoo |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 子分のため、心の平穏のため、組長・ツヨシの仁義なき戦いが始まる。<br>暴力マシマシ！　危険度高め！　“日本統一編”好評連載中！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 412 chapters |  |  |  |
| chapter dates | PASS | 412 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://contents.cycomi.com/.../1.jpg <redacted query values: ver, Expires, Signature, and Key-Pair-Id>` (image/jpeg, 332137 bytes, 960x1364) |  |  |  |
