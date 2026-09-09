# Extension Validation Report

- Extension: tachiyomi-all.twicomi-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4589056979500242728
- Source name: Twicomi
- Source language: all
- Selected manga input: latest offset 0: 🚬  (`.../2077871557624598905`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | 🍜  (`.../2077704742067904960`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | ミレニアム問題あるガクエン  (`.../2077290483773301198`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | 🚬  (`.../2077871557624598905`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | ※擬人化捏造誇張 (`.../2077797477957394794`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 🚬  (`.../2077871557624598905`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Tweet (`.../2077871557624598905`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Invalid manga: popular entry 2: title=<blank>, URL=`.../2077680887098192056`, popular entry 4: title=<blank>, URL=`.../2077528639420199286`, popular entry 9: title=<blank>, URL=`.../2077751539947782353`, popular_next entry 12: title=<blank>, URL=`.../2077393131801288868`, popular_next entry 13: title=<blank>, URL=`.../2077332840967209347`, popular_next entry 21: title=<blank>, URL=`.../2077694198116175893` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pbs.twimg.com/.../HNYVKgtbcAA0VXp.jpg` (image/jpeg, 67942 bytes, 410x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2077871557624598905` |  |  |  |
| details thumbnail URL | PASS | `https://pbs.twimg.com/.../HNYVKgtbcAA0VXp.jpg` |  |  |  |
| details author | PASS | まぺり (@mapery0) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 🚬  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: title, description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://pbs.twimg.com/.../HNYVKgtbcAA0VXp.jpg` (image/jpeg, 67942 bytes, 410x1200) |  |  |  |
