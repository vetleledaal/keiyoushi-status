# Extension Validation Report

- Extension: tachiyomi-all.webtoons-v1.4.57
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 2522335540328470744
- Source name: Webtoons.com
- Source language: en
- Selected manga input: latest offset 0: Who’s That Long-Haired Senior? (`.../list <redacted query values: title_no>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Childhood Friend Complex (`.../list <redacted query values: title_no>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Osora (`.../list <redacted query values: title_no>`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 153 | Who’s That Long-Haired Senior? (`.../list <redacted query values: title_no>`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 13 | Who’s That Long-Haired Senior? (`.../list <redacted query values: title_no>`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Who’s That Long-Haired Senior? (`.../list <redacted query values: title_no>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 101 | Ep. 1 - That Long-Haired Senior (ch. 1) (`.../viewer <redacted query values: title_no and episode_no>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 137 |  |  | 1-10s |

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
| latest listing | PASS | 153 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Who’s That Long-Haired Senior?, URL=`.../list <redacted query values: title_no>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Childhood Friend Complex, URL=`.../list <redacted query values: title_no>` at page 1 offset 0 and page 2 offset 14, title=The Lazy Lord Masters the Sword, URL=`.../list <redacted query values: title_no>` at page 1 offset 1 and page 2 offset 25, title=I Dare You, URL=`.../list <redacted query values: title_no>` at page 1 offset 2 and page 2 offset 23, title=A Spell for a Smith, URL=`.../list <redacted query values: title_no>` at page 1 offset 17 and page 2 offset 7, title=The Egg Project, URL=`.../list <redacted query values: title_no>` at page 1 offset 28 and page 2 offset 10 |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 226/226 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 226/226 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://webtoon-phinf.pstatic.net/.../7Thumb_Poster_6992.jpg <redacted query values: type>` (image/jpeg, 95003 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../list <redacted query values: title_no>` |  |  |  |
| details thumbnail URL | PASS | `https://webtoon-phinf.pstatic.net/.../7Thumb_Poster_6992.jpg <redacted query values: type>` |  |  |  |
| details author | PASS | bullgwanhu |  |  |  |
| details artist | PASS | bullgwanhu |  |  |  |
| details genres | PASS | Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Sol Song has a uniquely quirky taste in men: they absolutely must have long hair. Otherwise, she sees them as literal "stone heads," devoid of facial features. So, when her first love—and the only long-haired guy on campus—shows up with a buzz cut, she's devastated. But as they start to reconnect and emotions deepen, Sol must discover whether she likes Okseok for who he truly is or just for his hair. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 61 name, chapter 65 name, chapter 68 name, chapter 89 name, chapter 96 name, chapter 99 name |  |  |  |
| chapters | PASS | 101 chapters |  |  |  |
| chapter dates | PASS | 101 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 137 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://webtoon-phinf.pstatic.net/.../17310936045865886_Who_s_That_Long-Haired_Senior__Ep__1_-_That_Long-Haired_Senior.jpg <redacted query values: type>` (image/jpeg, 40064 bytes, 800x1280) |  |  |  |
