# Extension Validation Report

- Extension: tachiyomi-en.hentaifc-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4541545529482216024
- Source name: HentaiFC
- Source language: en
- Selected manga input: popular offset 0: MotoYan no Otto o Motsu, Bentou-ya no Oba-san o Netotte Shimatta Hanashi. Boku wa Korosareru no Kamo Shirenai. (`.../89569`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | MotoYan no Otto o Motsu, Bentou-ya no Oba-san o Netotte Shimatta Hanashi. Boku wa Korosareru no Kamo Shirenai. (`.../89569`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Osakabehime wa Otosenai (`.../89545`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | MotoYan no Otto o Motsu, Bentou-ya no Oba-san o Netotte Shimatta Hanashi. Boku wa Korosareru no Kamo Shirenai. (`.../89569`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 0 (`.../c0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 43 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s3.hentaifc.com/.../cover.jpg` (image/webp (encoding: lossy), 19462 bytes, 700x990; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `e/89569` |  |  |  |
| details thumbnail URL | PASS | `https://s3.hentaifc.com/.../cover.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Big Breasts, Sole Female, Nakadashi, Blowjob, Ahegao, Mosaic Censorship, Paizuri, Milf, Dark Skin, Dilf, Cheating, Big Ass, Pregnant, Big Penis, Hairy, Bbw, Kissing, Gokkun, Voyeurism, Netorare |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 43 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hentaifc.com <redacted query values: search and search_by>` to `https://hentaifc.com/.../89569` (1 redirects) |  |  |  |
| page load | PASS | `https://s3.hentaifc.com/.../0.jpg` (image/webp (encoding: lossy), 14008 bytes, 400x566; server Content-Type: application/octet-stream) |  |  |  |
