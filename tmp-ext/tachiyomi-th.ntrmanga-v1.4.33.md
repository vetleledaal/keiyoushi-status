# Extension Validation Report

- Extension: tachiyomi-th.ntrmanga-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 2123874844305574539
- Source name: NTR-Manga
- Source language: th
- Selected manga input: latest offset 0: A Quiet Cat (`.../a-quiet-cat`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | A Wonderful New World (`.../a-wonderful-new-world`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Go Ahead, Mom (`.../go-ahead-mom`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | A Quiet Cat (`.../a-quiet-cat`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | A Secret Married Woman (`.../a-secret-married-woman`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | A Quiet Cat (`.../a-quiet-cat`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | A Quiet Cat (`.../a-quiet-cat`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 9 | Chapter 1 (`.../1-a-quiet-cat`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 51 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Quiet Cat, URL=`.../a-quiet-cat` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.ntr-manga.net/.../894969a44011e2ad5b34d1b90b96365e-1.jpg` (image/jpeg, 50358 bytes, 400x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-quiet-cat` |  |  |  |
| details thumbnail URL | PASS | `https://www.ntr-manga.net/.../894969a44011e2ad5b34d1b90b96365e-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Drama, Fantasy, Harem, Romance |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.ntr-manga.net/.../RASUN_20260527232905.jpg` (image/jpeg, 364668 bytes, 1000x5813) |  |  |  |
