# Extension Validation Report

- Extension: tachiyomi-all.comicskingdom-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 3
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 3350274514125477391
- Source name: Comics Kingdom
- Source language: en
- Selected manga input: popular offset 0: Sunny with a Chance of Heat (`.../7751457 <redacted query values: per_page, _fields, ck_language, and slug>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Sunny with a Chance of Heat (`.../7751457 <redacted query values: per_page, _fields, ck_language, and slug>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Mark Trail Vintage (`.../5819080 <redacted query values: per_page, _fields, ck_language, and slug>`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Sunny with a Chance of Heat (`.../7751457 <redacted query values: per_page, _fields, ck_language, and slug>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Mark Trail Vintage (`.../5819080 <redacted query values: per_page, _fields, ck_language, and slug>`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sunny with a Chance of Heat (`.../7751457 <redacted query values: per_page, _fields, ck_language, and slug>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sunny with a Chance of Heat (`.../7751457 <redacted query values: per_page, _fields, ck_language, and slug>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 1-11 (`.../ck_comic <redacted query values: per_page, _fields, orderBy, order, ck_feature, and page>`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 10 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sunny with a Chance of Heat, URL=`.../7751457 <redacted query values: per_page, _fields, ck_language, and slug>` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 55/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https:\.../Logo3.png` (image/png, 277225 bytes, 1808x917) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../7751457 <redacted query values: per_page, _fields, ck_language, and slug>` |  |  |  |
| details thumbnail URL | PASS | `https:\.../Logo3.png` |  |  |  |
| details author | PASS | Tim Tyler |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Welcome to Sunny Acres Mobile Home Park, where everyday life is anything but ordinary. Home to brothers Teddy and Jim Goth, this quirky community is filled with unforgettable characters, bizarre situations and just enough chaos to keep everyone guessing. Join Teddy, Jim and the colorful residents of Sunny Acres as they tackle life’s greatest mysteries—like how mustard really works, how to survive high school, what their mischievous cat has chewed up this time, and why Earth’s chickens seem to have become the latest obsession of a group of curious aliens. Packed with offbeat humor, lovable oddballs and a healthy dose of the unexpected, Sunny with a Chance of Heat proves that even the smallest town can have the biggest adventures. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://wp.comicskingdom.com/.../sunny-with-a-chance-of-heat` to `https://comicskingdom.com/.../sunny-with-a-chance-of-heat` (1 redirects) |  |  |  |
| page load | PASS | `https://wp.comicskingdom.com/.../SDC20261028-scaled.jpg` (image/jpeg, 572534 bytes, 2560x821) |  |  |  |
