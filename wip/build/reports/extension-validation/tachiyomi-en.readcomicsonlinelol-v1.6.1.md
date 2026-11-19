# Extension Validation Report

- Extension: tachiyomi-en.readcomicsonlinelol-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3920948196044407056
- Source name: ReadComicsOnline.lol
- Source language: en
- Selected manga input: popular offset 0: Absolute Batman (`.../Absolute-Batman`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 218 | Absolute Batman (`.../Absolute-Batman`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Nightwing (2016) (`.../Nightwing-2016`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Marvel Rivals Infinity Comic (2024-) (`.../marvel-rivals-infinity-comic-2024`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Absolute Batman (`.../Absolute-Batman`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Absolute Batman (`.../Absolute-Batman`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 27 | Absolute Batman Issue #1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 45 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 218 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Absolute Batman, URL=`.../Absolute-Batman` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 260/260 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 260/260 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.readcomicsonline.lol/.../1.webp` (image/webp (encoding: lossy), 87700 bytes, 800x1231) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Absolute-Batman` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.readcomicsonline.lol/.../1.webp` |  |  |  |
| details author | PASS | Scott Snyder |  |  |  |
| details artist | PASS | Frank Martin, Nick Dragotta |  |  |  |
| details genres | PASS | Action, Superhero |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | BATMAN LEGEND SCOTT SNYDER AND ICONIC ARTIST NICK DRAGOTTA TRANSFORM THE DARK KNIGHT'S TALE FOR THE MODERN AGE! Without the mansion... without the money... without the butler... what's left is the Absolute Dark Knight!<br><br>**Publisher:** DC Comics |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 27 chapters |  |  |  |
| chapter dates | PASS | 27 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.readcomicsonline.lol/.../p001.webp` (image/webp (encoding: lossy), 138638 bytes, 936x1440) |  |  |  |
