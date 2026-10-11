# Extension Validation Report

- Extension: tachiyomi-th.ntrmanga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 2123874844305574539
- Source name: NTR-Manga
- Source language: th
- Selected manga input: popular offset 0: A Wonderful New World (`.../a-wonderful-new-world`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | A Wonderful New World (`.../a-wonderful-new-world`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Go Ahead, Mom (`.../go-ahead-mom`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | The Breeding Game has Become Reality (`.../the-breeding-game-has-become-reality`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Believe Me! I Offer You My First (`.../believe-me-i-offer-you-my-first`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Wonderful New World (`.../a-wonderful-new-world`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Wonderful New World (`.../a-wonderful-new-world`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 262 | Chapter 1 (`.../a-wonderful-new-world-a-wonderful-new-world-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 93 |  |  | 1-10s |

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
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 262 chapters |  |  |  |
| chapter dates | PASS | 262 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 93 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://img.ntr-manga.com/.../Upload-A-Wonderful-New-World-1-NDIRH-108read.jpg` to `https://img.ntr-manga.net/.../Upload-A-Wonderful-New-World-1-NDIRH-108read.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://img.ntr-manga.com/.../Upload-A-Wonderful-New-World-1-NDIRH-108read.jpg` (image/jpeg, 67947 bytes, 1000x3472) |  |  |  |
