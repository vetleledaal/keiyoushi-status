# Extension Validation Report

- Extension: tachiyomi-all.luscious-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 2774395484485436593
- Source name: Luscious
- Source language: en
- Selected manga input: popular offset 0: gifs (`.../gifs_486525`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 26 | gifs (`.../gifs_486525`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 26 | Artist: Ririko (`.../artist-ririko_472425`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 29 | Body writing (`.../body-writing_596683`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 29 | yuri collection (`.../yuri-collection_285403`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 30 | GIF's (`.../gifs_592348`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | gifs (`.../gifs_486525`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Part 1 (`.../gifs_486525 <redacted query values: chunk>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1000 |  |  | <1s |

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
| popular listing | PASS | 26 entries |  |  |  |
| latest listing | PASS | 29 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 30 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 140/140 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 140/140 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn3.luscious.net/.../wtkclkuq5o1i1_01M7GV7DN6K8S50BGK7JZVV950.320x0.avif` (image/avif (format: avif), 9017 bytes, 320x171) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../gifs_486525` |  |  |  |
| details thumbnail URL | PASS | `https://cdn3.luscious.net/.../wtkclkuq5o1i1_01M7GV7DN6K8S50BGK7JZVV950.320x0.avif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Other, hot, Amateurs, Straight Sex, amateurs, Real People |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | <br><br>Pictures: 1857<br>Animated Pictures: 1843 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1000 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ah-img.luscious.net/.../1-11_01GPM3KBEVP7M9HWZJ31NTD4CK.gif` (image/gif (format: 89a), 3812407 bytes, 380x380) |  |  |  |
