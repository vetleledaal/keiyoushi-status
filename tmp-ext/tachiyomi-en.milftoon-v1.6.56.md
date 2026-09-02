# Extension Validation Report

- Extension: tachiyomi-en.milftoon-v1.6.56
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

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4002667303103881826
- Source name: Milftoon
- Source language: en
- Selected manga input: popular offset 0: Domino Effect (`.../784`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Domino Effect (`.../784`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Milky Incest with mom (`.../224`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Thankstaking (`.../786`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | FOP DBZ Porn Colored (`.../665`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Domino Effect (`.../784`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Domino Effect (`.../784`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Issue 1 (`.../issue-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Domino Effect, URL=`784` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://milftoon.xxx/.../cover-8.jpg` (image/jpeg, 425687 bytes, 1188x1680) |  |  |  |
| details identity | PASS | Details preserved selected URL `784` |  |  |  |
| details thumbnail URL | PASS | `https://milftoon.xxx/.../cover-8.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Incest, Incest Comics, Milfs, Milftoon, Milftoon Drama, Porn Comics |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Alternative Names: Domino Effect |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://himg.nl/.../1.jpg` (image/jpeg, 425687 bytes, 1188x1680) |  |  |  |
