# Extension Validation Report

- Extension: tachiyomi-en.madaradex-v1.6.58
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 2136088453725931591
- Source name: MadaraDex
- Source language: en
- Selected manga input: popular offset 0: Secret Class (Uncensored) (`.../767`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Secret Class (Uncensored) (`.../767`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Circles (`.../419`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Mother’s Friends (`.../3303`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Kingdom of Innocence (Uncensored) (`.../2568`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 7 | Secret Class (Uncensored) (`.../767`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (Uncensored) (`.../767`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 171 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 71 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class (Uncensored), URL=`767` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 107/107 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 107/107 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://madaradex.org/.../767.webp` (image/webp (encoding: lossy), 53110 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `767` |  |  |  |
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
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 71 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.madaradex.org/.../0.webp` (image/webp (encoding: lossy), 111936 bytes, 2000x1000) |  |  |  |
