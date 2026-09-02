# Extension Validation Report

- Extension: tachiyomi-en.porncomix-v1.4.49
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6627320413337959683
- Source name: PornComix
- Source language: en
- Selected manga input: popular offset 0: Jabcomix – Tomb Tart Ch.2 (`.../jabcomix-tomb-tart-ch-2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Jabcomix – Tomb Tart Ch.2 (`.../jabcomix-tomb-tart-ch-2`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Mania [Romulo Melkor Mancin] (`.../mania-romulo-melkor-mancin`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Jabcomix – Tomb Tart Ch.2 (`.../jabcomix-tomb-tart-ch-2`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Jabcomix – Tomb Tart Ch.2 (`.../jabcomix-tomb-tart-ch-2`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | CHAPTER (`.../jabcomix-tomb-tart-ch-2`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jabcomix – Tomb Tart Ch.2, URL=`.../jabcomix-tomb-tart-ch-2` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bestporncomix.com/.../Tomb-Tart-2-1-1-415x600.webp` (image/webp (container: extended), 58876 bytes, 415x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../jabcomix-tomb-tart-ch-2` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://bestporncomix.com/.../001-230x325.webp` (image/webp (encoding: lossy), 23220 bytes, 230x325) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Jab Comix |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Jab Comix |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://bestporncomix.com/.../001-scaled.webp` (image/webp (encoding: lossy), 740774 bytes, 2650x4000) |  |  |  |
