# Extension Validation Report

- Extension: tachiyomi-ja.bigcomics-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2944603286439592172
- Source name: Big Comics
- Source language: ja
- Selected manga input: popular offset 0: RAINBOW —二舎六房の七人— (`.../77f49f037618e`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | RAINBOW —二舎六房の七人— (`.../77f49f037618e`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | 忘却のサチコ (`.../45650cfc78109`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 9 | 婚活ストラテジー (`.../ebbee8485c427`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | RAINBOW —二舎六房の七人— (`.../77f49f037618e`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 235 | CRIME1. After the rain (`.../8535d64dab7df`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.bigcomics.jp/.../202306261004116527A44A892DAD19BD72CCCE50C5E1D3E0B-lg.webp` (image/webp (encoding: lossy), 44878 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../77f49f037618e` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.bigcomics.jp/.../202306261004116527A44A892DAD19BD72CCCE50C5E1D3E0B.png` (image/png, 1564859 bytes, 1280x672) |  |  |  |
| details author | PASS | 安部譲二, 柿崎正澄 |  |  |  |
| details artist | PASS | 安部譲二, 柿崎正澄 |  |  |  |
| details genres | PASS | ヒューマンドラマ, ヤングサンデー, 裏社会・アングラ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 昭和30年7月。水上真理雄をはじめ、凶悪犯とされる六人の少年たちが、湘南特別少年院に送られてきた。教官から虫ケラのように扱われ、屈辱的な身体検査を受けた後、彼らは二舎六房という部屋に入れられる。そこには桜木六郎太という年長者がいて…。俺たちは生き残る。いつか必ず外（シャバ）に出る！昭和30年、湘南特別少年院の二舎六房に入れられた七人の少年たちを描く、壮絶な時代の青春群像！！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 235 chapters |  |  |  |
| chapter dates | PASS | 235 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.bigcomics.jp/.../master-1686162967976-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 2, 7, 3, 9, 1, 5, 14, 11, 13, 8, 4, 6, 10, 0, 15\]` (image/jpeg, 333656 bytes, 841x1200) |  |  |  |
