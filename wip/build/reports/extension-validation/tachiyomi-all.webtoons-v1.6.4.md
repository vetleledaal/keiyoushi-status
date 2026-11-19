# Extension Validation Report

- Extension: tachiyomi-all.webtoons-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 2
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
- Selected manga input: popular offset 0: Suitor Armor (`.../list <redacted query values: title_no>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Suitor Armor (`.../list <redacted query values: title_no>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Superfish (`.../list <redacted query values: title_no>`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 143 | Vibe Check! (`.../list <redacted query values: title_no>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 6 | Suitor Armor (`.../list <redacted query values: title_no>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Suitor Armor (`.../list <redacted query values: title_no>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 173 | Episode 1 (ch. 1) (`.../viewer <redacted query values: title_no and episode_no>`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 121 |  |  | 1-10s |

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
| latest listing | PASS | 143 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Suitor Armor, URL=`.../list <redacted query values: title_no>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Suitor Armor, URL=`.../list <redacted query values: title_no>` at page 1 offset 0 and page 2 offset 9, title=The Lazy Lord Masters the Sword, URL=`.../list <redacted query values: title_no>` at page 1 offset 10 and page 2 offset 17, title=The Witch's Mirror, URL=`.../list <redacted query values: title_no>` at page 1 offset 24 and page 2 offset 19, title=I Only Need Our Child, Your Grace, URL=`.../list <redacted query values: title_no>` at page 1 offset 25 and page 2 offset 28, title=Eleceed, URL=`.../list <redacted query values: title_no>` at page 1 offset 27 and page 2 offset 11 |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 209/209 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 209/209 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://webtoon-phinf.pstatic.net/.../5Thumb_Poster_2159.jpg <redacted query values: type>` (image/jpeg, 69229 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../list <redacted query values: title_no>` |  |  |  |
| details thumbnail URL | PASS | `https://webtoon-phinf.pstatic.net/.../5Thumb_Poster_2159.jpg <redacted query values: type>` |  |  |  |
| details author | PASS | Purpah |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lady-in-waiting, Lucia believes getting through the royal wedding will be the toughest part of her new life. That is until she finds herself falling head over heels with Modeus, an up-and-coming knight to the king's guard. With her newfound interest, she is quickly awakened to the mysteries of the kingdom when she learns Modeus is in fact an enchanted suit of armor without a soul. Could there be more to him than just shining armor? |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 92 name, chapter 116 name, chapter 117 name, chapter 118 name, chapter 119 name, chapter 120 name, chapter 121 name |  |  |  |
| chapters | PASS | 173 chapters |  |  |  |
| chapter dates | PASS | 173 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 121 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://webtoon-phinf.pstatic.net/.../1596580333851215915.jpg <redacted query values: type>` (image/jpeg, 154342 bytes, 800x980) |  |  |  |
