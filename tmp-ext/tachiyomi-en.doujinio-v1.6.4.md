# Extension Validation Report

- Extension: tachiyomi-en.doujinio-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 27
- Lint: 0
- Warnings: 1
- Skipped: 7
- Failed: 2
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2738692054520731722
- Source name: Doujin.io - J18
- Source language: en
- Selected manga input: popular offset 0: r[E]:2B9S (`.../778577755`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | r[E]:2B9S (`.../778577755`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | r[E]:2B9S (`.../778577755`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Don't Feed the Trolls (`.../1405262504`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | r[E]:2B9S (`.../778577755`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | ⁣r[E]:2B9S (`.../1247207788`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: Login through WebView to read | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: Login through WebView to read | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | SKIP | HTTP error 500 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ecchi.b-cdn.net/.../thumb_jpeg` (image/jpeg, 46821 bytes, 500x700) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../778577755` |  |  |  |
| details thumbnail URL | PASS | `https://ecchi.b-cdn.net/.../thumb_jpeg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Aoin |  |  |  |
| details genres | PASS | Creampie |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | THIS     CAN     CONTINUE |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Login through WebView to read |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://doujin.io/.../manifest` to `https://doujin.io/.../login` (1 redirects); popular: `https://ecchi.b-cdn.net/.../thumb_jpeg` to `https://doujin-io-manga.b-cdn.net/.../thumb_jpeg_3014b354-9151-4531-b636-5e9b05da6384.jpg` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
