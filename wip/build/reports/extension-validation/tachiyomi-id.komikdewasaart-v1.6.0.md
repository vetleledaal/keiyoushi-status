# Extension Validation Report

- Extension: tachiyomi-id.komikdewasaart-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 1
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 6053881646324024096
- Source name: Komik Dewasa Art
- Source language: id
- Selected manga input: popular offset 0: Komik Fasik Surti (NO SENSOR) (`.../komik-fasik-surti`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Komik Fasik Surti (NO SENSOR) (`.../komik-fasik-surti`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Adik Yang Merepotkan (`.../adik-yang-merepotkan`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Perjalanan Mencari Cinta (`.../perjalanan-mencari-cinta`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Harem Zombie: Wanita Cantik yang Terkontaminasi, Siap Dihamili (`.../harem-zombie-wanita-cantik-yang-terkontaminasi-siap-dihamili`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Komik Fasik Surti (NO SENSOR) (`.../komik-fasik-surti`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 15 | Chapter 01 - Tertahan (`.../komik-fasik-surti-chapter-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../Surti-Surti-Tertahan-06.jpg <redacted query values: resize>` (image/jpeg, 22979 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../komik-fasik-surti` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../Surti-Surti-Tertahan-06.jpg` (image/jpeg, 49592 bytes, 292x286) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hijab 3dx, Comic |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | PASS | 15 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://warungkomikcdn.icu/.../Surti-Surti-Tertahan-01.jpg` (image/jpeg, 124348 bytes, 605x739) |  |  |  |
