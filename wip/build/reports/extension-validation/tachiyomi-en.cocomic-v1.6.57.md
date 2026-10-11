# Extension Validation Report

- Extension: tachiyomi-en.cocomic-v1.6.57
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3544369893051520689
- Source name: Cocomic
- Source language: en
- Selected manga input: popular offset 0: The Cheat Batter Takes All (`.../59528`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | The Cheat Batter Takes All (`.../59528`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | The Ramparts of Ice (`.../73113`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | The Joseon prince went to America and didn’t return (`.../90475`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Raising a Cat Friend (`.../83944`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Cheat Batter Takes All (`.../59528`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Cheat Batter Takes All (`.../59528`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 105 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 259 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Cheat Batter Takes All, URL=`59528` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 100/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cocomic.co/.../4ea8ed275eb81812160b5833c9d76098b4a0ce05_720_960_196488-350x476.jpeg` (image/jpeg, 30339 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `59528` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://img.cocomic.co/.../the-cheat-batter-takes-all.jpeg` (image/jpeg, 61177 bytes, 600x800) |  |  |  |
| details author | PASS | Epiphany |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Cheating/Infidelity, Comedy, Drama, Fetish, Full Color, Harem, Mature, Romance, Seinen(M), Smut, Sports, Super power, Supernatural, Webtoon |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 105 chapters |  |  |  |
| chapter dates | PASS | 105 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 259 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.cocomic.co/.../001.webp` (image/webp (encoding: lossy), 766 bytes, 720x500) |  |  |  |
