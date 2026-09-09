# Extension Validation Report

- Extension: tachiyomi-en.stonescape-v1.4.50
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5914422711950728870
- Source name: StoneScape
- Source language: en
- Selected manga input: latest offset 0: Ghost Dating Simulation (`.../ghost-dating-simulation`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Plaything (`.../plaything`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Ghost Dating Simulation (`.../ghost-dating-simulation`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Ghost Story Club (`.../ghost-story-club`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Ghost Dating Simulation (`.../ghost-dating-simulation`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ghost Dating Simulation (`.../ghost-dating-simulation`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 67 | Chapter 1 (`.../ch-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 21 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ghost Dating Simulation, URL=`.../ghost-dating-simulation` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://stonescape.xyz/.../1554e671-459c-456b-a2ea-359a85e39224.webp` (image/webp (encoding: lossless), 351728 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ghost-dating-simulation` |  |  |  |
| details thumbnail URL | PASS | `https://stonescape.xyz/.../1554e671-459c-456b-a2ea-359a85e39224.webp` |  |  |  |
| details author | PASS | DONG9 |  |  |  |
| details artist | PASS | DONG9 |  |  |  |
| details genres | PASS | Harem, Drama, Mystery, Thriller, Supernatural, Webtoons, Tragedy, Ecchi, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Struggling streamer Doyeon Choi downloads a mysterious dating sim game, Heart-Racing Ghost Dating Sim, only to find himself trapped in a deadly loop-- where the love interests are real-life ghosts with unresolved deaths. From haunted highways to murder cases, Doyeon must navigate a world where romance, horror, and mystery collide. Every wrong move could cost him his life...again. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 67 chapters |  |  |  |
| chapter dates | PASS | 67 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://stonescape.xyz/.../65f96ab1-0da8-49ab-a926-c4592bbc5414.webp` (image/webp (encoding: lossless), 4126224 bytes, 690x9936) |  |  |  |
