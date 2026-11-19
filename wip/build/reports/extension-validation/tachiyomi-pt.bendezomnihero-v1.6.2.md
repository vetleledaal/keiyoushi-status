# Extension Validation Report

- Extension: tachiyomi-pt.bendezomnihero-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4869303402178317312
- Source name: BenDezOmniHero
- Source language: pt
- Selected manga input: popular offset 0: Ben 10 Rise of the Omnihero #2 (English Version) (`.../ben-10-rise-of-omnihero-2-english.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 5 | Ben 10 Rise of the Omnihero #2 (English Version) (`.../ben-10-rise-of-omnihero-2-english.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ben 10 Rise of the Omnihero #2 (English Version) (`.../ben-10-rise-of-omnihero-2-english.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ben 10 Rise of the Omnihero #2 (English Version) (`.../ben-10-rise-of-omnihero-2-english.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oneshot (`.../ben-10-rise-of-omnihero-2-english.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 71 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ben 10 Rise of the Omnihero #2 (English Version), URL=`.../ben-10-rise-of-omnihero-2-english.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 6/6 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 6/6 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../Cap%202.png` (image/png, 130823 bytes, 216x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ben-10-rise-of-omnihero-2-english.html` |  |  |  |
| details thumbnail URL | PASS | `https://blogger.googleusercontent.com/.../Cap%202.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 71 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../Cap%202.png` (image/png, 2073226 bytes, 1181x1748) |  |  |  |
