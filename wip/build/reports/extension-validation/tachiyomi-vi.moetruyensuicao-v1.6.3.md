# Extension Validation Report

- Extension: tachiyomi-vi.moetruyensuicao-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 13
- Lint: 0
- Warnings: 0
- Skipped: 20
- Failed: 4
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7257946851767599928
- Source name: MoeTruyenSuiCao (unoriginal)
- Source language: vi
- Selected manga input: popular offset 0: Chị em nhà Mikadono dễ đối phó thật đấy (`.../219`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Chị em nhà Mikadono dễ đối phó thật đấy (`.../219`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Goblin Slayer (`.../1099`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Ma vương tái sinh trở thành pháp sư mạnh nhất (`.../788`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 521 | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 521 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 521 | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 521 | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 521 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 521 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| details operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 521 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 521 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | SKIP | HTTP error 521 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | HTTP error 521 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://u.truyen.moe/.../219-ba-chi-em-nha-mikadono-de-doi-pho-that-day.webp <redacted query values: t>` (image/webp (encoding: lossy), 56108 bytes, 358x514) |  |  |  |
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
