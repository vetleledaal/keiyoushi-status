# Extension Validation Report

- Extension: tachiyomi-all.peppercarrot-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 0
- Warnings: 1
- Skipped: 8
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 279282683217001983
- Source name: Pepper&Carrot
- Source language: all
- Selected manga input: popular offset 0: Pepper&Carrot (`.../en`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 13 | Pepper&Carrot (`.../en`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.Exception: No search | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Pepper&Carrot (`.../en`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 39 | Episode 1: The Potion of Flight (`.../ep01_Potion-of-Flight.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 6 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | ERROR | java.lang.Exception: No search | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | No search |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 13/13 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 13/13 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.peppercarrot.com/.../2015-10-12_logo_by-David-Revoy.jpg` -> 11 manga URLs (examples: `#artworks`, `#wallpapers`, `#sketchbook`) |  |  |  |
| thumbnail | PASS | `https://www.peppercarrot.com/.../2016-02-24_vertical-cover_remake_by-David-Revoy.jpg` (image/jpeg, 168529 bytes, 747x1080) |  |  |  |
| details identity | PASS | Details preserved selected URL `en` |  |  |  |
| details thumbnail URL | PASS | `https://www.peppercarrot.com/.../2016-02-24_vertical-cover_remake_by-David-Revoy.jpg` |  |  |  |
| details author | PASS | David Revoy |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Language: English<br>Translators: Alex Gryson, David Revoy, Amireti |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 39 chapters |  |  |  |
| chapter dates | PASS | 39 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.peppercarrot.com/.../en_Pepper-and-Carrot_by-David-Revoy_E01.jpg` (image/jpeg, 241149 bytes, 1100x765) |  |  |  |
