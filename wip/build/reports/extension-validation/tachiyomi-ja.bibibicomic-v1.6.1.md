# Extension Validation Report

- Extension: tachiyomi-ja.bibibicomic-v1.6.1
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
- Source ID: 3726193166490568923
- Source name: Bibibi Comic
- Source language: ja
- Selected manga input: popular offset 0: 超かぐやメシ！ (`.../41de76fc8df5f`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 超かぐやメシ！ (`.../41de76fc8df5f`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | グリーンアイズ (`.../3cd3fb36f1364`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | 恋する真核生物 (`.../eb019ed022488`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 超かぐやメシ！ (`.../41de76fc8df5f`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 超かぐやメシ！ (`.../41de76fc8df5f`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | 0話 (`.../96c69d0ae5a92`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=超かぐやメシ！, URL=`41de76fc8df5f` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 75/75 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 75/75 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20260910232558789BE5D056026CFDCCB838AD8A4CF3B7CD5-lg.webp` (image/webp (container: extended), 22100 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `41de76fc8df5f` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20260910232558789BE5D056026CFDCCB838AD8A4CF3B7CD5.png` (image/png, 1874951 bytes, 2560x1344) |  |  |  |
| details author | PASS | テルヤ, 山下清悟 / フジヤマルリ |  |  |  |
| details artist | PASS | テルヤ, 山下清悟 / フジヤマルリ |  |  |  |
| details genres | PASS | ギャグ・コメディー, 一般マンガ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 【毎月第2金曜日更新】<br>8000年ぶりに味覚を取り戻したら最初に何食べたい？かぐやが美味しいものを食べて食べて食べまくる！<br>“めでたし"の、その先を描く『超かぐや姫！』公式スピンオフグルメコメディ。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.bibibi-comic.com/.../master-1786013982189-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 0, 7, 10, 1, 8, 12, 5, 15, 14, 2, 9, 11, 4, 6, 3\]` (image/jpeg, 326402 bytes, 850x1200) |  |  |  |
