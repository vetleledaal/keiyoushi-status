# Extension Validation Report

- Extension: tachiyomi-all.plumics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 6032776058439691872
- Source name: Plumics
- Source language: en
- Selected manga input: latest offset 0: Mercy Sanaga Akwa (`.../mercy-sanaga-akwa_2536`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 27 | A Match in 6 Actions (`.../a-match-in-6-actions_715`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 5 | JE VEUX SA (Kore Oishi) (`.../je-veux-sa-kore-oishi_1668`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 27 | Mercy Sanaga Akwa (`.../mercy-sanaga-akwa_2536`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 5 | The Infinity (`.../the-infinity_934`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mercy Sanaga Akwa (`.../mercy-sanaga-akwa_2536`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 11 | Chapter 1: Secret beauty (`.../7484`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| popular listing | PASS | 27 entries |  |  |  |
| latest listing | PASS | 27 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 64/64 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 64/64 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://plumics.com/.../cover67643659d08cf.jpg` (image/jpeg, 42020 bytes, 300x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mercy-sanaga-akwa_2536` |  |  |  |
| details thumbnail URL | PASS | `https://plumics.com/.../cover67643659d08cf.jpg` |  |  |  |
| details author | PASS | Cédric Minlo |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Webtoon, Comedy, Parody, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Mercy, Akwa, and Sanaga have recently started sharing an apartment, and their daily lives are a series of adventures that are as funny as they are surprising. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://plumics.com/.../48259` (image/webp (container: extended), 21468 bytes, 998x1000) |  |  |  |
