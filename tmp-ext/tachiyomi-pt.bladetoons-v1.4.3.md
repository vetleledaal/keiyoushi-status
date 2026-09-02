# Extension Validation Report

- Extension: tachiyomi-pt.bladetoons-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 7
- Lint: 0
- Warnings: 0
- Skipped: 25
- Failed: 4
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7671549037049858081
- Source name: Bladetoons
- Source language: pt-BR
- Selected manga input: popular offset 0: Desafio da Queda (`.../446`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Desafio da Queda (`.../446`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | <1s |
| details | `fetchMangaDetails(manga)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | <1s |
| chapters | `fetchChapterList(manga)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | <1s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | HTTP error 401 |  |  |  |
| search listing | SKIP | HTTP error 401 |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | HTTP error 401 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 10/10 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 10/10 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.bladetoons.com/.../capa` (image/webp (container: extended), 276690 bytes, 1792x2400) |  |  |  |
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
| page load | SKIP | No pages to load |  |  |  |
