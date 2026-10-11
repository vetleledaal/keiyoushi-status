# Extension Validation Report

- Extension: tachiyomi-all.mangadraft-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 31
- Lint: 3
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6866320578550428692
- Source name: MangaDraft
- Source language: all
- Selected manga input: popular offset 0: Dragon Ball Kakumei (`.../dragon-ball-kakumei`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Dragon Ball Kakumei (`.../dragon-ball-kakumei`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | A Place Like Home (`.../a-place-like-home`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Ire (`.../ire`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | WTG - Tome 1 (`.../wtg-tome-1`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | Le Fléau du Capillophagocyte (`.../le-fleau-du-capillophagocyte`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Dragon Ball Kakumei (`.../dragon-ball-kakumei`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 31 | 0.0. Le dernier entraînement de Son Gokū !!  (`https://mangadraft.com/.../c.36293`) |  | <1s |
| pages | `getPageList(chapter)` | success | 33 |  |  | 1-10s |

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
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 20 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.mangadraft.com/.../647dd85ec0b37.jpg` (image/jpeg, 28789 bytes, 300x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../dragon-ball-kakumei` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | DBKAKUMEI |  |  |  |
| details genres | PASS | Action, Aventure |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Quand le voeu de N°17, lors du Tournoi du Pouvoir, amène le monde vers une Guerre Multiverselle, les alliés de tous les univers doivent s'endurcir pour affronter des divinités malveillantes, et cette fois-ci, ils doivent se débrouiller sans Gokû. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 30 name, chapter 31 name |  |  |  |
| chapters | PASS | 31 chapters |  |  |  |
| chapter dates | PASS | 31 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 31 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mangadraft.com/.../projects <redacted query values: order, type, page, and number>` to `https://www.mangadraft.com/.../projects <redacted query values: order, type, page, and number>` (1 redirects); popular: `https://mangadraft.com/.../projects <redacted query values: order, type, page, and number>` to `https://www.mangadraft.com/.../projects <redacted query values: order, type, page, and number>` (1 redirects); popular: `https://mangadraft.com/.../projects <redacted query values: order, type, page, and number>` to `https://www.mangadraft.com/.../projects <redacted query values: order, type, page, and number>` (1 redirects); popular: `https://mangadraft.com/.../dragon-ball-kakumei` to `https://www.mangadraft.com/.../dragon-ball-kakumei` (1 redirects); popular: `https://mangadraft.com/.../projects <redacted query values: type, order, section, genre, format, language, status, order_all, page, and number>` to `https://www.mangadraft.com/.../projects <redacted query values: type, order, section, genre, format, language, status, order_all, page, and number>` (1 redirects); popular: `https://mangadraft.com/.../c.36293` to `https://www.mangadraft.com/.../458892` (2 redirects); popular: `https://mangadraft.com/.../projects <redacted query values: order, type, page, and number>` to `https://www.mangadraft.com/.../projects <redacted query values: order, type, page, and number>` (1 redirects); popular: `https://mangadraft.com/.../listPages <redacted query values: first_page and grouped_by_category>` to `https://www.mangadraft.com/.../listPages <redacted query values: first_page and grouped_by_category>` (1 redirects) |  |  |  |
| page load | PASS | `https://www.mangadraft.com/.../5a6895210b141 <redacted query values: size>` (image/jpeg, 295875 bytes, 1200x1111) |  |  |  |
