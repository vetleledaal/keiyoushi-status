# Extension Validation Report

- Extension: tachiyomi-en.rosesquadscans-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 24
- Lint: 0
- Warnings: 0
- Skipped: 11
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 5475936177780301452
- Source name: Rose Squad Scans
- Source language: en
- Selected manga input: popular offset 0: Winter That Year (`.../194`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Winter That Year (`.../194`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Haga-kun wa Kamaretai (`.../279`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Kimi ni Koisuru Hazu ga Nai (`.../248`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Snail: Conqueror of Earth (`.../337`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Winter That Year (`.../194`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | java.io.IOException: It's necessary to login via WebView to access this source. | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.io.IOException: It's necessary to login via WebView to access this source. | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.io.IOException: It's necessary to login via WebView to access this source. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.io.IOException: It's necessary to login via WebView to access this source. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Winter That Year, URL=`194` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rosesquadscans.aishiteru.org/.../winter-175x238.png` (image/png, 91843 bytes, 175x238) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | It's necessary to login via WebView to access this source. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
