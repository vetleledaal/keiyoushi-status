# Extension Validation Report

- Extension: tachiyomi-en.mangade-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3447999145778061665
- Source name: MangaDE
- Source language: en
- Selected manga input: latest offset 0: Exclusive Stewardess of Mr. CEO (`.../exclusive-stewardess-of-mr-ceo <redacted query values: mid>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Maou to Ryuuou ni Sodaterareta Shounen wa Gakuen Seikatsu wo Musou suru You desu (`.../maou-to-ryuuou-ni-sodaterareta-shounen-wa-gakuen-seikatsu-wo-musou-suru-you-desu <redacted query values: mid>`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | When Doctor Chu Wants Romance (`.../when-doctor-chu-wants-romance <redacted query values: mid>`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Exclusive Stewardess of Mr. CEO (`.../exclusive-stewardess-of-mr-ceo <redacted query values: mid>`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Domestic na Kanojo (`.../domestic-na-kanojo <redacted query values: mid>`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Exclusive Stewardess of Mr. CEO (`.../exclusive-stewardess-of-mr-ceo <redacted query values: mid>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Exclusive Stewardess of Mr. CEO (`.../exclusive-stewardess-of-mr-ceo <redacted query values: mid>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 45 | Chapter 1 (`.../chapter-1 <redacted query values: cid and mid>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 81 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Exclusive Stewardess of Mr. CEO, URL=`.../exclusive-stewardess-of-mr-ceo <redacted query values: mid>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s3-load.ttr.group/.../1756610103477_image.jpg` (image/png, 309968 bytes, 386x556; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../exclusive-stewardess-of-mr-ceo <redacted query values: mid>` |  |  |  |
| details thumbnail URL | PASS | `https://s3-load.ttr.group/.../1756610103477_image.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Josei |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | He Xinran works as a stewardess. One day, she accidentally finds that her boyfriend dates one of her friends. The frustration in love has made her depressed for quite a long time. However, she comes across a radio host of a midnight programme. And then, by accident, they meet each other in reality. Is he a real radio host? What stories will happen between them? Will He Xinran walk out of the shadows in the end? Will they gain success and love? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 45 chapters |  |  |  |
| chapter dates | PASS | 45 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 81 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s3-load.ttr.group/.../1756610109487_867_image.jpg` (image/jpeg, 181421 bytes, 800x1131) |  |  |  |
