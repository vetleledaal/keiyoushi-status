# Extension Validation Report

- Extension: tachiyomi-all.everiaclub-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7698513740234984368
- Source name: Everia.club
- Source language: all
- Selected manga input: popular offset 0: Yeha 예하 – PhotoBook X-Level 「Kidnapping」 (`.../yeha-%EC%98%88%ED%95%98-photobook-x-level-%E3%80%8Ckidnapping%E3%80%8D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Yeha 예하 – PhotoBook X-Level 「Kidnapping」 (`.../yeha-%EC%98%88%ED%95%98-photobook-x-level-%E3%80%8Ckidnapping%E3%80%8D`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Misao Oguri 小栗操 – REbecca 写真集 「Misao 蒼春プールサイド」 (`.../misao-oguri-%E5%B0%8F%E6%A0%97%E6%93%8D-rebecca-%E5%86%99%E7%9C%9F%E9%9B%86-%E3%80%8Cmisao-%E8%92%BC%E6%98%A5%E3%83%97%E3%83%BC%E3%83%AB%E3%82%B5%E3%82%A4%E3%83%89%E3%80%8D`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Cosplay 魅瞳Meroko – 大凤花嫁 (`.../cosplay-%E9%AD%85%E7%9E%B3meroko-%E5%A4%A7%E5%87%A4%E8%8A%B1%E5%AB%81`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Yeha 예하 – PhotoBook X-Level 「Kidnapping」 (`.../yeha-%EC%98%88%ED%95%98-photobook-x-level-%E3%80%8Ckidnapping%E3%80%8D`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../yeha-%EC%98%88%ED%95%98-photobook-x-level-%E3%80%8Ckidnapping%E3%80%8D`) |  | <1s |
| pages | `getPageList(chapter)` | success | 110 |  |  | 10s+ |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://karubox.top/.../KOR10A221_0.webp` (image/webp (encoding: lossy), 19774 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yeha-%EC%98%88%ED%95%98-photobook-x-level-%E3%80%8Ckidnapping%E3%80%8D` |  |  |  |
| details thumbnail URL | PASS | `https://karubox.top/.../KOR10A221_0.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | X-Level, Yeha 예하 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Yeha 예하 – PhotoBook X-Level 「Kidnapping」 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 110 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://karubox.top/.../KOR10A221_1.webp` (image/webp (encoding: lossy), 95656 bytes, 1000x1500) |  |  |  |
