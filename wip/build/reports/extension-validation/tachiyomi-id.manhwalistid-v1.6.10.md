# Extension Validation Report

- Extension: tachiyomi-id.manhwalistid-v1.6.10
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3111049819536223391
- Source name: Manhwa List
- Source language: id
- Selected manga input: popular offset 0: Lookism (`.../lookism`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Lookism (`.../lookism`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Death God (`.../death-god`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Lookism (`.../lookism`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Zodiac Girl (`.../zodiac-girls`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lookism (`.../lookism`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lookism (`.../lookism`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Chapter 633 (`.../lookism-chapter-633-indonesia`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lookism, URL=`.../lookism` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../Lookism.jpg <redacted query values: resize>` (image/jpeg, 8188 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lookism` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../Lookism.jpg` (image/jpeg, 98337 bytes, 736x1104) |  |  |  |
| details author | PASS | Park Tae Jun |  |  |  |
| details artist | PASS | PARK Tae Jun |  |  |  |
| details genres | PASS | Action, Comedy, Drama, School life, Shounen, Supernatural, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Read the original webcomic behind Netflix’s new animated series! Daniel is an unattractive loner who wakes up in a different body. Now tall, handsome, and cooler than ever in his new form, Daniel aims to achieve everything he couldn’t before. How far will he go to keep his body… and his secrets?<br><br>Alternative Names: <br>- Apari3ncias<br>- Görünüşçülük<br>- Дискриминация по внешности<br>- Лукизм<br>- ลุกคิซึม<br>- 外見至上主義<br>- 外貌至上主義<br>- 看脸时代<br>- 看臉時代<br>- 외모지상주의 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.ibb.co.com/.../01.jpg` (image/jpeg, 558781 bytes, 800x9530) |  |  |  |
