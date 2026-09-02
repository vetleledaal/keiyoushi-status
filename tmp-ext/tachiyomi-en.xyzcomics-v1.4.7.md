# Extension Validation Report

- Extension: tachiyomi-en.xyzcomics-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 923206914242009120
- Source name: XYZ Comics
- Source language: en
- Selected manga input: popular offset 0: Tomb Tart 2 – JabComix (`.../tomb-tart-2-jabcomix`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Tomb Tart 2 – JabComix (`.../tomb-tart-2-jabcomix`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 19 | Pegasus Smith – Au Naturel 29 (`.../pegasus-smith-au-naturel-29`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Tomb Tart 2 – JabComix (`.../tomb-tart-2-jabcomix`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../tomb-tart-2-jabcomix`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 12 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 39/39 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 39/39 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://xyzcomics.com/.../Tomb-Tart-2-1-1-392x600.webp` (image/webp (container: extended), 58778 bytes, 392x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tomb-tart-2-jabcomix` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://xyzcomics.com/.../001-3-scaled.webp` (image/webp (encoding: lossy), 459304 bytes, 1696x2560) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | anal, Big Breasts, blowjob, double penetration, parody |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://xyzcomics.com/.../001-3-scaled.webp` (image/webp (encoding: lossy), 459304 bytes, 1696x2560) |  |  |  |
