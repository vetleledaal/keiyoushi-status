# Extension Validation Report

- Extension: tachiyomi-en.reimanga-v1.6.6
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 24
- Lint: 1
- Warnings: 1
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5627909338430537186
- Source name: ReiManga
- Source language: en
- Selected manga input: popular offset 0: Dog and Bird (`.../dog-and-bird-91521`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | Dog and Bird (`.../dog-and-bird-91521`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Jinx (`.../jinx-82002`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Monkey Peak the Rock (`.../monkey-peak-the-rock-10000114`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | I Live in Such a Rural Area That I'm The Only Dungeon Explorer Here (`.../i-live-in-such-a-rural-area-that-im-the-only-dungeon-explorer-here-104854`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Cat Bird Dog (`.../cat-bird-dog-106001`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Dog and Bird (`.../dog-and-bird-91521`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Dog and Bird, URL=`dog-and-bird-91521` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Dear Door, URL=`dear-door-o38a7ec-47331` at page 1 offset 8 and page 2 offset 14, title=Dangerous Convenience Store, URL=`dangerous-convenience-store-qw-64958` at page 1 offset 11 and page 2 offset 9, title=Roses and Champagne, URL=`roses-and-champagne-71208` at page 1 offset 19 and page 2 offset 1, title=Shutline, URL=`shutline-b-69533` at page 1 offset 26 and page 2 offset 8 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 174/174 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 174/174 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://reimanga.net/.../thumbnail.png` (image/jpeg, 10504 bytes, 160x227; server Content-Type: image/png) |  |  |  |
| details identity | PASS | Details preserved selected URL `dog-and-bird-91521` |  |  |  |
| details thumbnail URL | PASS | `https://reimanga.net/.../thumbnail.png` |  |  |  |
| details author | PASS | Junggak, Peppermint Candy |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Romance, Long Strip, Boys' Love, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★☆ 8.22<br><br>After a night out, Gyuha finds himself waking up next to his childhood friend, Chayoung. While Gyuha begins to realize Chayoung might be his ideal type, despite being a little taller than he usually prefers, their encounters become more frequent and intense. However, Chayoung remains set on finding an omega partner, unaware that Gyuha is not the beta he pretends to be. Set in a contemporary urban environment, the story explores the developing relationship between these two men, blending elements of romance and dramatic tension. The art style is characterized by its detailed character designs, particularly the musculature and expressive faces of the protagonists, rendered with a clean, digital aesthetic. The visual storytelling emphasizes the characters' emotions and the growing intimacy between them, often using close-ups and subtle character expressions to convey the mood.<br><br>Alternative Titles:<br>- Chó và Chim<br>- Dogs and Birds<br>- 狗与飞鸟<br>- 개와 새<br>- <br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
