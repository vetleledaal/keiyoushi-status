# Extension Validation Report

- Extension: tachiyomi-all.danbooru-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7602260701584916302
- Source name: Danbooru
- Source language: all
- Selected manga input: popular offset 0: Blue Archive - Student Tachi-e (`.../29796`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Blue Archive - Student Tachi-e (`.../29796`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Touhou - Sekibanki Headcanon (sleepymoon) (`.../32805`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 19 | original - kontrip (ukon60) (`.../32809`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Original - Memories of Summer (jorori) (`.../32789`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Blue Archive - Student Tachi-e (`.../29796`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Blue Archive - Student Tachi-e (`.../29796`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oneshot (`.../29796`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 3291 |  |  | 1-10s |

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
| latest listing | PASS | 19 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Blue Archive - Student Tachi-e, URL=`.../29796` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.donmai.us/.../b147360bca50b748d794ef4e0e97888f.jpg` (image/jpeg, 12715 bytes, 195x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../29796` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.donmai.us/.../b147360bca50b748d794ef4e0e97888f.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | <br>      Tachi-e images for the student characters from Blue Archive.To view all of the art for a specific character, search for pool:29796 character_name <br>Example: pool:29796 hoshino_(blue_archive)<br>     |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | FAIL | 3290 of 3291 pages have invalid URLs: page 2: url=`.../11310152` (relative URL), page 3: url=`.../11310154` (relative URL), page 4: url=`.../11310155` (relative URL), page 5: url=`.../11310156` (relative URL), page 6: url=`.../11310157` (relative URL), and 3285 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.donmai.us/.../b147360bca50b748d794ef4e0e97888f.png` (image/png, 1038829 bytes, 1039x1920) |  |  |  |
