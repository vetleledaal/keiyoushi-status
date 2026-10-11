# Extension Validation Report

- Extension: tachiyomi-en.infernalvoidscans-v1.6.71
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 6311653253665366075
- Source name: Hive Scans
- Source language: en
- Selected manga input: popular offset 0: Lookism (`.../lookism`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Lookism (`.../lookism`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Silent Transfer Student (`.../silent-transfer-student`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Turns out, I’m the 3rd-generation chaebol (`.../turns-out-to-be-a-third-generation-chaebol`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | My Brother is a Vicious Dog (`.../my-brother-is-a-vicious-dog`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lookism (`.../lookism`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lookism (`.../lookism`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 637 | Chapter 1 - Ep. 1 (`.../chapter-1`) |  | <1s |
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
| thumbnail | PASS | `https://storage.hivetoon.com/.../76e2335d-35f4-4361-9d68-ee280e61b7c6.gif` (image/gif (format: 89a), 2937611 bytes, 336x448) |  |  |  |
| details identity | PASS | Details preserved selected URL `lookism#15` |  |  |  |
| details thumbnail URL | PASS | `https://storage.hivetoon.com/.../76e2335d-35f4-4361-9d68-ee280e61b7c6.gif` |  |  |  |
| details author | PASS | Park Tae Jun |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Drama, Shounen, Action, Comedy, School Life, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Daniel is an unattractive loner who wakes up in a different body. Now tall, handsome, and cooler than ever in his new form, Daniel aims to achieve everything he couldn’t before. How far will he go to keep his body… and his secrets?<br><br>Alternative Names: Lookism |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 500 name, chapter 501 name, chapter 502 name, chapter 503 name, chapter 504 name, chapter 505 name |  |  |  |
| chapters | PASS | 637 chapters |  |  |  |
| chapter dates | PASS | 637 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 92 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage.hivetoon.com/.../image_1_9c56338a.webp` (image/webp (encoding: lossy), 32964 bytes, 800x1000) |  |  |  |
