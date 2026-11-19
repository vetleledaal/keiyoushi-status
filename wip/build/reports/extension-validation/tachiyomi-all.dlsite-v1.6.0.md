# Extension Validation Report

- Extension: tachiyomi-all.dlsite-v1.6.0
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
- Source implementation: keiyoushi.source.d
- Source ID: 4210329134305024062
- Source name: DLsite
- Source language: en
- Selected manga input: popular offset 0: Furina & Hu Tao's Conception Journal (`.../RJ01733143`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Furina & Hu Tao's Conception Journal (`.../RJ01733143`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | W&W第15話「二人の女と海賊の流儀」 (`.../RJ01711067`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | TS SPY BIG OPERATION (`.../RJ01773789`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Operation Terminal Euphoria (`.../RJ01713188`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Furina & Hu Tao's Conception Journal (`.../RJ01733143`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Furina & Hu Tao's Conception Journal (`.../RJ01733143`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Sample (`.../RJ01733143`) |  | <1s |
| pages | `getPageList(chapter)` | success | 6 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Furina & Hu Tao's Conception Journal, URL=`RJ01733143` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.dlsite.jp/.../RJ01733143_img_main.jpg` (image/jpeg, 213809 bytes, 560x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `RJ01733143` |  |  |  |
| details thumbnail URL | PASS | `https://img.dlsite.jp/.../RJ01733143_img_main.jpg` |  |  |  |
| details author | PASS | MだSたろう, UだSなり |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Cross-section View, Swimwear, Pure Love, Reverse Rape, Internal Cumshot, Pregnancy / Impregnation |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★★★ 4.82 (1019)<br><br>Conception isn't going well for Furina -- is it time for a whole new approach?!<br><br>**Circle:** toxtutokoStarou · **Event:** Comic Market 107 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.dlsite.jp/.../RJ01733143_img_smp1.jpg` (image/jpeg, 1184595 bytes, 1261x1767) |  |  |  |
