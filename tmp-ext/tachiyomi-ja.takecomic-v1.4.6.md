# Extension Validation Report

- Extension: tachiyomi-ja.takecomic-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5158991361251014104
- Source name: TakeComic
- Source language: ja
- Selected manga input: popular offset 0: メイドインアビス (`.../3f846451aff2d`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | メイドインアビス (`.../3f846451aff2d`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | 魔剣師の魔剣による魔剣のためのハーレムライフ (`.../c7bf3ad334248`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 6 | 描いたものを実体化する能力でモテない俺がハーレム生活 (`.../c66811a2f90a6`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | メイドインアビス (`.../3f846451aff2d`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | メイドインアビス (`.../3f846451aff2d`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 73 | 1話 (`.../74f33031e13cd`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 31 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=メイドインアビス, URL=`.../3f846451aff2d` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20250813144042253661A3C12D9B076961839F2B0E2D301E6-lg.webp` (image/webp (encoding: lossy), 39360 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../3f846451aff2d` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20250813144042253661A3C12D9B076961839F2B0E2D301E6.png` (image/png, 4471222 bytes, 2560x1344) |  |  |  |
| details author | PASS | つくしあきひと |  |  |  |
| details artist | PASS | つくしあきひと |  |  |  |
| details genres | PASS | アニメ化, バトル・アクション, ファンタジー, 冒険 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 隅々まで探索されつくした世界に、唯一残された秘境の大穴『アビス』。<br>どこまで続くとも知れない深く巨大なその縦穴には、奇妙奇怪な生物たちが生息し、今の人類では作りえない貴重な遺物が眠っていた。アビスの不可思議に満ちた姿は人々を魅了し、冒険へと駆り立てた。そうして幾度も大穴に挑戦する冒険者たちは、次第に『探窟家』と呼ばれるようになっていく。<br><br>アビスの緑に築かれた街『オース』に暮らす孤児のリコは、いつか母のような偉大な探窟家になり、アビスの謎を解き明かすことを夢見ていた。<br>そんなある日、リコはアビスを探窟中に、少年の姿をしたロボットを拾い…？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 73 chapters |  |  |  |
| chapter dates | PASS | 73 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.takecomic.jp/.../master-1753867767923-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 0, 15, 9, 8, 11, 12, 6, 1, 5, 10, 4, 13, 2, 14, 7\]` (image/jpeg, 1242056 bytes, 2039x2894) |  |  |  |
