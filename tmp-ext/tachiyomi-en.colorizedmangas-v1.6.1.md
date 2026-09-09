# Extension Validation Report

- Extension: tachiyomi-en.colorizedmangas-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 28
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2348696469980851942
- Source name: Colorized Mangas
- Source language: en
- Selected manga input: popular offset 0: One Piece (`.../one-piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 85 | One Piece (`.../one-piece`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | One Piece (`.../one-piece`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../one-piece`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1153 | Chapter 1 - Romance Dawn (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 51 |  |  | <1s |

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
| popular listing | PASS | 85 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`.../one-piece` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 86/86 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 86/86 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://colorizedmangas.com/.../one-piece.jpg` (image/jpeg, 337169 bytes, 1200x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-piece` |  |  |  |
| details thumbnail URL | PASS | `https://colorizedmangas.com/.../one-piece.jpg` |  |  |  |
| details author | PASS | Eiichiro Oda |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Comedy |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Read the colorized One Piece manga online for free — 1,151 chapters of Eiichiro Oda's legendary series fully colored in high definition, plus two chapters with clearly labeled partial-color page sets. Follow Monkey D. Luffy and the Straw Hat Pirates from Romance Dawn and the East Blue through Alabasta, Enies Lobby, Marineford, Dressrosa, Wano and the latest arc. No signup or paywall, with pinch-to-zoom on every page. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1153 chapters |  |  |  |
| chapter dates | LINT | All 1153 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1153 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.jsdelivr.net/.../001.webp` (image/webp (encoding: lossy), 224634 bytes, 1080x1755) |  |  |  |
