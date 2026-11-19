# Extension Validation Report

- Extension: tachiyomi-es.topcomicpornonet-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 16
- Lint: 0
- Warnings: 1
- Skipped: 18
- Failed: 2
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6831269326708750162
- Source name: TopComicPorno.net
- Source language: es
- Selected manga input: popular offset 0: Perdona pero es mi Habitación (`.../1886`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Perdona pero es mi Habitación (`.../1886`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Guro Gyaru Ni Natta Kara Shinyuu To Yatte Mita (`.../8815`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Todas mis antiguas compañeras de clase son putas (`.../16392`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | La dulce agonia de Adam (`.../8977`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 8 | Perdona pero es mi Habitación RAW (`.../4897`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 520 | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 520 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Perdona pero es mi Habitación, URL=`1886` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 108/108 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 108/108 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://topcomicporno.net/.../Captura-de-pantalla-2024-11-09-152459-350x476.png` -> 2 manga URLs (examples: `1886`, `4897`) |  |  |  |
| thumbnail | PASS | `https://topcomicporno.net/.../Captura-de-pantalla-2024-11-09-152459-350x476.png` (image/png, 212456 bytes, 350x476) |  |  |  |
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
