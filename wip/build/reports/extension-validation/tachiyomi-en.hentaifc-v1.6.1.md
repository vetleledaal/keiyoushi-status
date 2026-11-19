# Extension Validation Report

- Extension: tachiyomi-en.hentaifc-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Selected manga input: popular offset 0: Mutsumizuki -Arcueid- (`.../91169`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Mutsumizuki -Arcueid- (`.../91169`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Dada One Piece Paizuri (`.../91145`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mutsumizuki -Arcueid- (`.../91169`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 0 (`.../c0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | <1s |

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
| thumbnail | PASS | `https://s3.hentaifc.com/.../cover.jpg` (image/webp (encoding: lossy), 30476 bytes, 700x988; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `e/91169` |  |  |  |
| details thumbnail URL | PASS | `https://s3.hentaifc.com/.../cover.jpg` |  |  |  |
| details author | PASS | Sakai Hamachi |  |  |  |
| details artist | PASS | Sakai Hamachi |  |  |  |
| details genres | PASS | Big Breasts, Sole Female, Sole Male, Glasses, Nakadashi, Big Penis, Urination, Cunnilingus, Kissing, Squirting, Vampire |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hentaifc.com <redacted query values: search and search_by>` to `https://hentaifc.com/.../91169` (1 redirects) |  |  |  |
| page load | PASS | `https://s3.hentaifc.com/.../0.jpg` (image/webp (encoding: lossy), 20804 bytes, 400x565; server Content-Type: application/octet-stream) |  |  |  |
