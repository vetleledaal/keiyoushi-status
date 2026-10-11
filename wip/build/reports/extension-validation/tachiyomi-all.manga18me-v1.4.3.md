# Extension Validation Report

- Extension: tachiyomi-all.manga18me-v1.4.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 33
- Lint: 4
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 6244055465910932489
- Source name: Manga18.me
- Source language: en
- Selected manga input: latest offset 0: Mother’s Friends (`.../mothers-friends`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 21 | Secret Class (`.../secret-class`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 21 | My Brother’s Slipped Inside Me in The Bathtub (`.../my-brothers-slipped-inside-me-in-the-bathtub`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 16 | Mother’s Friends (`.../mothers-friends`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 22 | Friendzone Face-Off (`.../friendzone-face-off`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mother’s Friends (`.../mothers-friends`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mother’s Friends (`.../mothers-friends`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 6 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 25 |  |  | <1s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mother’s Friends, URL=`.../mothers-friends` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga18.me/.../mothers-friends-thumbnail.jpg` (image/jpeg, 21329 bytes, 214x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mothers-friends` |  |  |  |
| details thumbnail URL | PASS | `https://manga18.me/.../mothers-friends-thumbnail.jpg` |  |  |  |
| details author | PASS | SaiSai |  |  |  |
| details artist | PASS | SaiSai |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | <br>                    “Auntie will teach you everything, one thing at a time~♥︎” After being treated like a mama’s boy, he finally gets away from his mother, only for his mom’s friends to start obsessing over him.<br>                <br>Alternative Names:<br>- Las Amigas De Mi Mamá<br>- Mother’s Friends<br>- 엄마 친구<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | LINT | 1 of 6 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img-r1.manga18.me/.../1-6d5ca.jpg` (image/jpeg, 883345 bytes, 720x8337) |  |  |  |
