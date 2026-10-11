# Extension Validation Report

- Extension: tachiyomi-en.doujinio-v1.6.4
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 0
- Warnings: 1
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2738692054520731722
- Source name: Doujin.io - J18
- Source language: en
- Selected manga input: popular offset 0: Jasim: Futanari Sword Dancer Anthology (`.../443799655`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Jasim: Futanari Sword Dancer Anthology (`.../443799655`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Jasim: Futanari Sword Dancer Anthology (`.../443799655`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Queen Marika the Eternal (`.../316019087`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Jasim: Futanari Sword Dancer Anthology (`.../443799655`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jasim: Futanari Sword Dancer Anthology (`.../443799655`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | ⁣Part 1 (`.../1681097070`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: Login through WebView to read | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: Login through WebView to read | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jasim: Futanari Sword Dancer Anthology, URL=`.../443799655` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 54/54 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 54/54 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ecchi.b-cdn.net/.../thumb_jpeg` (image/jpeg, 46874 bytes, 500x700) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../443799655` |  |  |  |
| details thumbnail URL | PASS | `https://ecchi.b-cdn.net/.../thumb_jpeg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Erect Sawaru |  |  |  |
| details genres | PASS | Aggressive Sex, Dark Skin, Futanari, Group, Big Breasts, Solo Action, Muscle, Old Man, Kemonomimi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | The willpower of even the strongest female knight will never triumph over the desires of her dick! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Login through WebView to read |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://doujin.io/.../manifest` to `https://doujin.io/.../login` (1 redirects); popular: `https://ecchi.b-cdn.net/.../thumb_jpeg` to `https://doujin-io-manga.b-cdn.net/.../thumb_jpeg_0426a436-b77e-425f-9fed-44a86c4f6175.jpg` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
