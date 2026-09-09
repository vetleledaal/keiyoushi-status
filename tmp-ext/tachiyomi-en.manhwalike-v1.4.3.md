# Extension Validation Report

- Extension: tachiyomi-en.manhwalike-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3472935303493224823
- Source name: Manhwalike
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../manga-secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 6 | Secret Class (`.../manga-secret-class`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Taming A Female Bully Raw (`.../manga-taming-a-female-bully-raw`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Secret Class (`.../manga-secret-class`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Secret Class (`.../manga-secret-class`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 315 | Chapter 1 (`.../manga-secret-class-chapter-1-ch637`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 22 |  |  | 1-10s |

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
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../manga-secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.manhwalike.com/.../secret-class.jpg` (image/jpeg, 32681 bytes, 300x431) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manga-secret-class` |  |  |  |
| details thumbnail URL | PASS | `https://media.manhwalike.com/.../secret-class.jpg` |  |  |  |
| details author | PASS | Wang Kang Cheol, Minachan |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Romance, Full Color, Webtoon, Manhwa, Adult, Smut, Mature |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Secret Class manga is updated earliest and fully at ManhwaLike. Readers, don't forget to comment and share, support ManhwaLike to release the latest chapters of the Secret Class series. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 315 chapters |  |  |  |
| chapter dates | PASS | 315 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.manhwalike.com/.../secret-class-chapter-1-c1.jpg` (image/jpeg, 163443 bytes, 720x880) |  |  |  |
