# Extension Validation Report

- Extension: tachiyomi-ja.comictrail-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 1668208127536452428
- Source name: Comic Trail
- Source language: ja
- Selected manga input: popular offset 0: 早川家の相続案件 (`.../12207421984467042086`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 127 | 早川家の相続案件 (`.../12207421984467042086`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 127 | 早川家の相続案件 (`.../12207421984467042086`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 早川家の相続案件 (`.../12207421984467042086`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 早川家の相続案件 (`.../12207421984467042086`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 第1話  (`.../12207421984481973129`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 28 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 127 entries |  |  |  |
| latest listing | PASS | 127 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=早川家の相続案件, URL=`12207421984467042086` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 255/255 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 255/255 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comic-trail.com/.../12207421984467042086-d20422b89e96ce5f4061eda2836010f7 <redacted query values: 1793870318>` (image/jpeg, 298305 bytes, 600x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421984467042086` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.comic-trail.com/.../12207421984467042086-d20422b89e96ce5f4061eda2836010f7 <redacted query values: 1793870318>` |  |  |  |
| details author | PASS | 柳原望 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 仕事を辞め、祖父の介護にあたっていた早川倫生（みちお）。祖父の死をきっかけに、兄から「手を出すな」と言われていた相続に着手するが…!? |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.comic-trail.com/.../12207421984503272072-6c2e488aba9890c70af5f9cd468f9f1a` (image/jpeg, 574372 bytes, 1350x1920) |  |  |  |
