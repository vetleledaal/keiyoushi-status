# Extension Validation Report

- Extension: tachiyomi-en.wearehunger-v1.6.57
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 58992897252080929
- Source name: KokoMangas
- Source language: en
- Selected manga input: popular offset 0: You Did It, Didn’t You!? (`.../123`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | You Did It, Didn’t You!? (`.../123`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Teisou Gyakuten Sekai de Tanomeba Yareru to Uwasa no Ore (`.../114`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Whenever I Get Home, There’s Always a Kukkoro Waiting for Me. (`.../104`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Ore ni Tsugou ga Yosugiru Machi ~Shihaisha Skill de Isekai Harem Musou~ (`.../154`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | You Did It, Didn’t You!? (`.../123`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 17 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | <1s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kokomangas.com/.../Gyarus.jpg` (image/jpeg, 1507832 bytes, 1115x1583) |  |  |  |
| details identity | PASS | Details preserved selected URL `123` |  |  |  |
| details thumbnail URL | PASS | `https://kokomangas.com/.../Gyarus.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Hanamura, a high school boy who loves lewd girls more than anything. One day, he witnesses it!! The decisive moment when someone (♀) is masturbating right on top of his own desk…!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://kokomangas.com/.../Pg-de-Cr%C3%A9dito.webp` (image/webp (encoding: lossy), 291616 bytes, 1822x1435) |  |  |  |
