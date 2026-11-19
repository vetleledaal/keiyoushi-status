# Extension Validation Report

- Extension: tachiyomi-en.milftoon-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 4002667303103881826
- Source name: Milftoon
- Source language: en
- Selected manga input: popular offset 0: Gangbang with mom (`.../gangbang-with-mom`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Gangbang with mom (`.../gangbang-with-mom`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | Sandra Cockington (`.../sandra-cockington`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | Who Did It (`.../who-did-it`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | Party time (`.../party-time`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Gangbang with mom (`.../gangbang-with-mom`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Gangbang with mom (`.../gangbang-with-mom`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../gangbang-with-mom`) |  | <1s |
| pages | `getPageList(chapter)` | success | 50 |  |  | <1s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Gangbang with mom, URL=`.../gangbang-with-mom` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network>` (image/jpeg, 292138 bytes, 905x1280) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../gangbang-with-mom` |  |  |  |
| details thumbnail URL | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network>` |  |  |  |
| details author | PASS | Milftoon |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Incest, Incest Comics, Milfs, Milftoon, Porn Comics |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Party time |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `<redacted URL #2: resource; absolute; valid web scheme; workstation or local network>` (image/jpeg, 292138 bytes, 905x1280) |  |  |  |
