# Extension Validation Report

- Extension: tachiyomi-all.webtoons-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 2522335540328470744
- Source name: Webtoons.com
- Source language: en
- Selected manga input: popular offset 0: I Thought My Time Was Up! (`.../list <redacted query values: title_no>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | I Thought My Time Was Up! (`.../list <redacted query values: title_no>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Osora (`.../list <redacted query values: title_no>`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 154 | The Shadow Prophet (`.../list <redacted query values: title_no>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 19 | I Thought My Time Was Up! (`.../list <redacted query values: title_no>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Thought My Time Was Up! (`.../list <redacted query values: title_no>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 7 | Episode 1 (ch. 1) (`.../viewer <redacted query values: title_no and episode_no>`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 79 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 154 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Thought My Time Was Up!, URL=`.../list <redacted query values: title_no>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=SubZero, URL=`.../list <redacted query values: title_no>` at page 1 offset 19 and page 2 offset 19, title=Goth Boy and the Jock, URL=`.../list <redacted query values: title_no>` at page 1 offset 26 and page 2 offset 29, title=Boyfriends., URL=`.../list <redacted query values: title_no>` at page 1 offset 29 and page 2 offset 21 |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 233/233 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 233/233 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://webtoon-phinf.pstatic.net/.../5171.jpg <redacted query values: type>` (image/jpeg, 102113 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../list <redacted query values: title_no>` |  |  |  |
| details thumbnail URL | PASS | `https://webtoon-phinf.pstatic.net/.../5171.jpg <redacted query values: type>` |  |  |  |
| details author | PASS | Essie , Hyeyong , Ari Choi ... |  |  |  |
| details artist | PASS | Essie , Hyeyong , Ari Choi ... |  |  |  |
| details genres | PASS | Romance |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Feeling a little under the weather, Lariette Blanche visits Doctor Zakascoff only to find out that she has an extremely rare congenital disease, and only three months left to live. Though devastated at first, Lariette decides to write up a bucket list of everything she wants to do before she dies. However, little did she know that the diagnosis was actually wrong! With so many changes implemented in her life already, what will Lariette do moving forward? Will she return to her previous life, or continue living the new one, full of adventures she had never imagined before? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 79 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://webtoon-phinf.pstatic.net/.../16817596297324369_I_Thought_My_Time_Was_Up__Episode_1__Final__0001.jpg <redacted query values: type>` (image/jpeg, 82246 bytes, 690x1280) |  |  |  |
