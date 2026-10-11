# Extension Validation Report

- Extension: tachiyomi-id.cosmicscansid-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 15
- Lint: 0
- Warnings: 1
- Skipped: 18
- Failed: 3
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6559481336553833282
- Source name: CosmicScans
- Source language: id
- Selected manga input: popular offset 0: Nani no Torie mo Nai Heibon na Ore ga Bijin Futago Shimai wo Inochigake de Tasuketa Kekka, Jitsu wa Yandere datta Futari wo Gachi Bore Sasete Shimatta (`.../nani-no-torie-mo-nai-heibon-na-ore-ga-bijin-futago-shimai-wo-inochigake-de-tasuketa-kekka-jitsu-wa-yandere-datta-futari-wo-gachi-bore-sasete-shimatta`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Nani no Torie mo Nai Heibon na Ore ga Bijin Futago Shimai wo Inochigake de Tasuketa Kekka, Jitsu wa Yandere datta Futari wo Gachi Bore Sasete Shimatta (`.../nani-no-torie-mo-nai-heibon-na-ore-ga-bijin-futago-shimai-wo-inochigake-de-tasuketa-kekka-jitsu-wa-yandere-datta-futari-wo-gachi-bore-sasete-shimatta`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | The Devil Classroom (`.../the-devil-classroom`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Mezametara Saikyou Soubi to Uchuusen Mochi datta no de, Ikkodate Mezashite Youhei to shite Jiyuu ni Ikitai (`.../mezametara-saikyou-soubi-to-uchuusen-mochi-datta-no-de-ikkodate-mezashite-youhei-to-shite-jiyuu-ni-ikitai`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The Hero Returns (`.../the-hero-returns`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 100 | Isekai Yanikasu (`.../isekai-yanikasu`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 100 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 196/196 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 184/196 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdncid.csmcscns.id/.../295a24d9007ff41afd9f7509e1ed6b0c.png` (image/png, 1112875 bytes, 768x1082) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | SKIP | No details metadata to check |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
