# Extension Validation Report

- Extension: tachiyomi-en.infernalvoidscans-v1.6.71
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6311653253665366075
- Source name: Hive Scans
- Source language: en
- Selected manga input: popular offset 0: Lookism (`.../lookism`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Lookism (`.../lookism`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | Hanlim Gym (`.../hanlim-gym`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Our High School Music Genius Is Paganini's Reincarnate (`.../our-high-school-music-genius-is-paganini's-reincarnate`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Silent Transfer Student (`.../silent-transfer-student`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lookism (`.../lookism`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lookism (`.../lookism`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 631 | Chapter 1 - Ep. 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 92 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lookism, URL=`lookism#15` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.hivetoon.com/.../cd3034dd-8bef-43ae-aab5-d764fa9918e8.gif` (image/gif (format: 89a), 3643749 bytes, 262x356) |  |  |  |
| details identity | PASS | Details preserved selected URL `lookism#15` |  |  |  |
| details thumbnail URL | PASS | `https://storage.hivetoon.com/.../cd3034dd-8bef-43ae-aab5-d764fa9918e8.gif` |  |  |  |
| details author | PASS | Park Tae Jun |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Drama, Shounen, Action, Comedy, School Life, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Daniel is an unattractive loner who wakes up in a different body. Now tall, handsome, and cooler than ever in his new form, Daniel aims to achieve everything he couldn’t before. How far will he go to keep his body… and his secrets?<br><br>Alternative Names: Lookism |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 494 name, chapter 495 name, chapter 496 name, chapter 497 name, chapter 498 name, chapter 499 name |  |  |  |
| chapters | PASS | 631 chapters |  |  |  |
| chapter dates | PASS | 631 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 92 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://storage.hivetoon.com/.../image_1_9c56338a.webp` (image/webp (encoding: lossy), 32964 bytes, 800x1000) |  |  |  |
