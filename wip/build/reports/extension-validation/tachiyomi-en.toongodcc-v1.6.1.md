# Extension Validation Report

- Extension: tachiyomi-en.toongodcc-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: yiimanga
- Source ID: 339438238793535753
- Source name: ToonGod (Unoriginal)
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Secret Class (`.../secret-class`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Trapped in the Academy’s Eroge (`.../trapped-in-the-academys-eroge`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Surviving The Game as a Barbarian (`.../surviving-the-game-as-a-barbarian`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Genius Archer’s Streaming (`.../genius-archers-streaming`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Secret Class (`.../secret-class`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../secret-class`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 339 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://toongod.cc/.../secret-class-cover.jpg` (image/jpeg, 19600 bytes, 247x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class` |  |  |  |
| details thumbnail URL | PASS | `https://toongod.cc/.../secret-class-cover.jpg` |  |  |  |
| details author | PASS | Gang-cheol Wang |  |  |  |
| details artist | PASS | Minachan |  |  |  |
| details genres | PASS | Comedy, Harem, Mature, Romance, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dae Ho, who became an orphan at the age of 13, was adopted by his father’s friend. However, Dae Ho in adulthood knew nothing about the relationship between men and women. Aunt and sisters decided to give pure Dae Ho a secret class…<br><br>This story is about a wife of two cheating on her husband with whom she has two daughters and a boy they took in.<br><br>Alternative names: Bimilsueop/비밀 수업.../%E7%A7%98%E5%AF%86%E6%95%99%E5%AD%B8 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 339 chapters |  |  |  |
| chapter dates | LINT | 1 of 339 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img03.toongod.cc/.../1-a2e.jpg` (image/webp (encoding: lossy), 41812 bytes, 720x880; server Content-Type: image/jpeg) |  |  |  |
