# Extension Validation Report

- Extension: tachiyomi-ja.hentaione-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4943901964119803158
- Source name: Hentai-One
- Source language: ja
- Selected manga input: popular offset 0: えろびいき (`.../3939320`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | えろびいき (`.../3939320`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | 元ヒロインと2年越しの恋を叶えるまで！ (`.../4336658`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | 長波×透けバニー (`.../4341196`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 春雨ちゃん改二記念！ (`.../4341086`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 30 | エロキツネ (`.../3852206`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | えろびいき (`.../3939320`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../viewer <redacted query values: articleId and page>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 173 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 30 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=ウチのヤンデレな飼い猫ちゃん×2にメチャクチャに絞られちゃう話, URL=`.../4331660` at page 1 offset 20 and page 2 offset 8, title=SK-H ZIP ふた, URL=`.../2680436` at page 1 offset 21 and page 2 offset 21 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=春雨ちゃん改二記念！, URL=`.../4341086` at page 1 offset 21 and page 2 offset 0, title=やまはじめ♡, URL=`.../4341085` at page 1 offset 22 and page 2 offset 1, title=村雨嬢を後ろから, URL=`.../4341084` at page 1 offset 23 and page 2 offset 2, title=おこさまじゃないもん！🔞, URL=`.../4341083` at page 1 offset 24 and page 2 offset 3, title="見"せてくれるろーちゃん♡🔞, URL=`.../4341082` at page 1 offset 25 and page 2 offset 4, title=🔞シュポガキ(左)に数えてもらうだけ❤, URL=`.../4341077` at page 1 offset 26 and page 2 offset 5, title=みぃむちゃん❤, URL=`.../4341072` at page 1 offset 27 and page 2 offset 6, title=響とビキニって似てますよねぇ！！, URL=`.../4341071` at page 1 offset 28 and page 2 offset 7, title=響とあせだくえっち🔞, URL=`.../4341070` at page 1 offset 29 and page 2 offset 8 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 150/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.imagedeliveries.com/.../cover.webp` (image/webp (encoding: lossy), 34310 bytes, 350x497) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../3939320` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.imagedeliveries.com/.../cover.webp` |  |  |  |
| details author | PASS | えこひいき |  |  |  |
| details artist | PASS | えこひいき |  |  |  |
| details genres | PASS | エロ漫画, ショタ, 単行本, digital |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 173ページ · **原作:** オリジナル |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 173 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.imagedeliveries.com/.../1.webp` (image/webp (encoding: lossy), 253166 bytes, 1762x2500) |  |  |  |
