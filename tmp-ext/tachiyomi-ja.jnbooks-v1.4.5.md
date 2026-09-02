# Extension Validation Report

- Extension: tachiyomi-ja.jnbooks-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 0
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2876739237900975302
- Source name: J-N Books
- Source language: ja
- Selected manga input: popular offset 0: 女神たちの二重奏─第Ⅱ楽章─ (`.../caed8ccb26dfa`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 19 | 女神たちの二重奏─第Ⅱ楽章─ (`.../caed8ccb26dfa`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 女神たちの二重奏─第Ⅱ楽章─ (`.../caed8ccb26dfa`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 女神たちの二重奏─第Ⅱ楽章─ (`.../caed8ccb26dfa`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 128 | 第0話 (`.../bf64a6d70d92d`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 26 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=女神たちの二重奏─第Ⅱ楽章─, URL=`.../caed8ccb26dfa` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 20/20 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 20/20 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20241001195320565A9F3215FE6B51210914E787441398BD7-sm.webp` (image/webp (encoding: lossy), 10848 bytes, 320x168; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../caed8ccb26dfa` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20241001195320565A9F3215FE6B51210914E787441398BD7.png` (image/png, 1249206 bytes, 1280x672) |  |  |  |
| details author | PASS | 花小路ゆみ |  |  |  |
| details artist | PASS | 花小路ゆみ |  |  |  |
| details genres | PASS | シチュエーションコメディ, リュエル, ロマンス, 女性向け, 恋愛 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 偶然に出会ってしまった瓜ふたつの二人が、互いの人生を交換する愛と欲望の物語「女神たちの二重奏」の続編がついにスタート！ 第II楽章では「第3の女」下村真理絵が登場して波瀾の幕開けに!!同じ容姿をもつ3人の女が複雑に絡み合い、少しずつ混乱を招きはじめていく… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 128 chapters |  |  |  |
| chapter dates | PASS | 128 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.comic.j-nbooks.jp/.../master-1726806190436-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 8, 10, 4, 7, 13, 12, 5, 3, 14, 2, 11, 1, 15, 9, 0\]` (image/jpeg, 313705 bytes, 852x1200) |  |  |  |
