# Extension Validation Report

- Extension: tachiyomi-en.madaradex-v1.4.55
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 2136088453725931591
- Source name: MadaraDex
- Source language: en
- Selected manga input: popular offset 0: Secret Class (Uncensored) (`.../secret-class-uncensored`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Secret Class (Uncensored) (`.../secret-class-uncensored`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 18 | My New Family Treats Me Well (`.../my-new-family-treats-me-well`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Cliterary Book Club (`.../cliterary-book-club`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | Wireless Onahole (`.../wireless-onahole`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 7 | Secret Class (Uncensored) (`.../secret-class-uncensored`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Secret Class (Uncensored) (`.../secret-class-uncensored`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 171 | Chapter 1 (`https://madaradex.org/.../chapter-1 <redacted query values: style>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 71 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class (Uncensored), URL=`.../secret-class-uncensored` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 79/79 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 79/79 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://madaradex.org/.../767.webp` (image/webp (encoding: lossy), 53110 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class-uncensored` |  |  |  |
| details thumbnail URL | PASS | `https://madaradex.org/.../767.webp` |  |  |  |
| details author | PASS | Iron King |  |  |  |
| details artist | PASS | Minachan |  |  |  |
| details genres | PASS | Comedy, Drama, Harem, Mature, Romance, Slice of Life, Manhwa, Uncensored |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | When Dae-Ho was a child his parents were killed in a tragic accident. Afterwards, he was taken in by his late father’s friend Mr.Cha and was raised with love and care. Now, at age 20, Mrs. Cha realizes that Dae-Ho hasn’t been properly taught about growing up into a man. He keeps having wet dreams and she feels he needs someone to show him how to relieve his urges. She takes it upon herself to show him how it’s done…<br><br>Alternative Names: 비밀 수업, 秘密教學, Bimilsueop |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 171 chapters |  |  |  |
| chapter dates | PASS | 171 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 171 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 71 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.madaradex.org/.../0.webp` (image/webp (encoding: lossy), 111936 bytes, 2000x1000) |  |  |  |
