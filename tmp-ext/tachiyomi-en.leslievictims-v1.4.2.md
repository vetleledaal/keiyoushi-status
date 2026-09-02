# Extension Validation Report

- Extension: tachiyomi-en.leslievictims-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1228130671216317629
- Source name: Leslie&Victims
- Source language: en
- Selected manga input: popular offset 0: Accidental Love (`<redacted URL #1: manga resource; relative; no scheme; query parameters: series>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 4 | Accidental Love (`<redacted URL #1: selected resource; relative; no scheme; query parameters: series>`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Accidental Love (`<redacted URL #1: selected resource; relative; no scheme; query parameters: series>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Accidental Love (`<redacted URL #1: selected resource; relative; no scheme; query parameters: series>`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 97 | Chapter 00 (`<redacted URL #2: selected resource; relative; no scheme; query parameters: series and ch>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 6 |  |  | <1s |

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
| popular listing | PASS | 4 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Accidental Love, URL=`<redacted URL #1: resource; relative; no scheme; query parameters: series>` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 5/5 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 5/5 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://leslie-victims.pages.dev/.../Accidental Love/cover.webp` (image/webp (encoding: lossy), 39970 bytes, 400x507) |  |  |  |
| details identity | PASS | Details preserved selected URL `<redacted URL #1: resource; relative; no scheme; query parameters: series>` |  |  |  |
| details thumbnail URL | PASS | `https://leslie-victims.pages.dev/.../Accidental Love/cover.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 97 chapters |  |  |  |
| chapter dates | LINT | All 97 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=97 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://pub-bbb8fb21be124a2aac670aec2e38d9d1.r2.dev/.../01.webp` (image/webp (encoding: lossy), 421086 bytes, 1200x8559) |  |  |  |
