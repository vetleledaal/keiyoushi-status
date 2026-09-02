# Extension Validation Report

- Extension: tachiyomi-th.ntrmanga-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2123874844305574539
- Source name: NTR-Manga
- Source language: th
- Selected manga input: popular offset 0: A Wonderful New World (`.../a-wonderful-new-world`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | A Wonderful New World (`.../a-wonderful-new-world`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Go Ahead, Mom (`.../go-ahead-mom`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | In Her Place (`.../in-her-place`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Sorry I Have No Thoughts of Dating (`.../sorry-i-have-no-thoughts-of-dating`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | A Wonderful New World (`.../a-wonderful-new-world`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | A Wonderful New World (`.../a-wonderful-new-world`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 262 | Chapter 1 (`.../a-wonderful-new-world-a-wonderful-new-world-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 93 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Wonderful New World, URL=`.../a-wonderful-new-world` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.ntr-manga.net/.../a7ab87b0968e724c3e6bb4d05724f487_A-Wonderful-New-World-1.jpg` (image/jpeg, 191714 bytes, 400x566) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-wonderful-new-world` |  |  |  |
| details thumbnail URL | PASS | `https://www.ntr-manga.net/.../a7ab87b0968e724c3e6bb4d05724f487_A-Wonderful-New-World-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Drama, Harem, Romance, Seinen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 262 chapters |  |  |  |
| chapter dates | PASS | 262 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 93 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.ntr-manga.com/.../Upload-A-Wonderful-New-World-1-NDIRH-108read.jpg` (image/jpeg, 67947 bytes, 1000x3472) |  |  |  |
