# Extension Validation Report

- Extension: tachiyomi-en.pmscans-v1.6.7
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 263040414613624318
- Source name: Rackus
- Source language: en
- Selected manga input: popular offset 0: Winning Shot! (`.../winning-shot`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 29 | Winning Shot! (`.../winning-shot`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 29 | Ryuna (`.../ryuna`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Winning Shot! (`.../winning-shot`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Winning Shot! (`.../winning-shot`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 92 | Chapter 1 - Enchantment (`.../winning-shot-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 29 entries |  |  |  |
| latest listing | PASS | 29 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Winning Shot!, URL=`.../winning-shot` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rackusreads.com/.../COVER-WS-S2-207x300.webp` (image/webp (encoding: lossy), 16212 bytes, 207x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../winning-shot` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://rackusreads.com/.../COVER-WS-S2.webp` (image/webp (encoding: lossy), 60938 bytes, 690x1000) |  |  |  |
| details author | PASS | Kang Kyeon |  |  |  |
| details artist | PASS | Si Ba Gyeon |  |  |  |
| details genres | PASS | Drama, School life, Shounen, Sports, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ahn Shiyun is a pitcher who doesn’t mind his team losing streak, as long as he can play baseball. After continuing his dream in middle school, his life begins to change when he meets Baek Tae-Oh, a catcher of the opposing team. This is the story of amazing people who can throw powerful winning shots at the top of high school baseball’s elite!<br><br>Alternative Names: <br>- Coup gagnant!<br>- Победный выстрел!<br>- 決勝好球帶！<br>- 위닝샷! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 92 chapters |  |  |  |
| chapter dates | PASS | 92 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rackusreads.com/.../WS-CH01E-01.webp` (image/webp (container: extended), 411032 bytes, 700x6487) |  |  |  |
