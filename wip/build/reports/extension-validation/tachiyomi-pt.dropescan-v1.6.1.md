# Extension Validation Report

- Extension: tachiyomi-pt.dropescan-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7529658920665636296
- Source name: Drope Scan
- Source language: pt-BR
- Selected manga input: popular offset 0: Ganbare, Douki-chan (Webcomic) (`.../002f0e5c-7621-454d-997f-2fc2eb347da9`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Ganbare, Douki-chan (Webcomic) (`.../002f0e5c-7621-454d-997f-2fc2eb347da9`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Sekai Saikyou no Assassin, Isekai Kizoku ni Tensei Suru (`.../12a30c81-db03-47e4-9854-e4e36afeae9b`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 3 | Onii-chan wa Oshimai! (`.../1297a80e-1643-45e0-bce0-6f6252e5cbd6`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 3 | My Wife is the Student Council President! (`.../659a757b-778b-442f-ad05-b3a50ac02c17`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | Ganbare, Douki-chan (Webcomic) (`.../002f0e5c-7621-454d-997f-2fc2eb347da9`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ganbare, Douki-chan (Webcomic) (`.../002f0e5c-7621-454d-997f-2fc2eb347da9`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 238 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 2 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 3 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ganbare, Douki-chan (Webcomic), URL=`.../002f0e5c-7621-454d-997f-2fc2eb347da9` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 66/66 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 66/66 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bucket-1.dropescan.com/.../c177bf13-7c0c-4660-85a5-aaa45ac8c03c.webp` (image/webp (encoding: lossy), 189502 bytes, 2151x3036) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../002f0e5c-7621-454d-997f-2fc2eb347da9` |  |  |  |
| details thumbnail URL | PASS | `https://bucket-1.dropescan.com/.../c177bf13-7c0c-4660-85a5-aaa45ac8c03c.webp` |  |  |  |
| details author | PASS | Yom |  |  |  |
| details artist | PASS | Yom |  |  |  |
| details genres | PASS | Drama, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 2020<br><br>História de amor "fofa" de garotas que não vão parar por nada além de tornar o protagonista sem olhos seu!<br><br>**Títulos alternativos:**<br>- ESFUERZATE, DOUKI<br>- DO YOUR BEST, DOUKI-CHAN<br>- がんばれ同期ちゃん<br>- 加油！同期醬 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 238 chapters |  |  |  |
| chapter dates | PASS | 238 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://bucket-1.dropescan.com/.../0001.webp` (image/webp (encoding: lossy), 341396 bytes, 2400x1697) |  |  |  |
