# Extension Validation Report

- Extension: tachiyomi-all.onepiecefans-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 26
- Lint: 2
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 6602141352900990132
- Source name: One Piece Fans
- Source language: en
- Selected manga input: popular offset 0: One Piece (Todos los capitulos) (`.../all`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 2 | One Piece (Todos los capitulos) (`.../all`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | One Piece (Todos los capitulos) (`.../all`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | One Piece (Todos los capitulos) (`.../all`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 217 | Chapter 975 (`.../975`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 18 |  |  | <1s |

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
| popular listing | PASS | 2 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece (Todos los capitulos), URL=`all` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 4/4 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 4/4 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://one-piece-fans2.com/.../luffy.png` -> all 2 manga URLs (examples: `all`, `full-color`) |  |  |  |
| thumbnail | PASS | `https://one-piece-fans2.com/.../luffy.png` (image/png, 24832 bytes, 570x428) |  |  |  |
| details identity | PASS | Details preserved selected URL `all` |  |  |  |
| details thumbnail URL | PASS | `https://one-piece-fans2.com/.../luffy.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 217 chapters |  |  |  |
| chapter dates | LINT | All 217 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=217 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://one-piece-fans2.com/.../01.jpg` (image/jpeg, 472769 bytes, 1067x1600) |  |  |  |
