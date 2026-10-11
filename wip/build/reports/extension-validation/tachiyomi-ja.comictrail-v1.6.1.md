# Extension Validation Report

- Extension: tachiyomi-ja.comictrail-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Selected manga input: popular offset 0: サレ妻の托卵 (`.../12207421984090205365`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 120 | サレ妻の托卵 (`.../12207421984090205365`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 120 | サレ妻の托卵 (`.../12207421984090205365`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | サレ妻の托卵 (`.../12207421984090205365`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | サレ妻の托卵 (`.../12207421984090205365`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | 第1話  (`.../12207421984148465318`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| popular listing | PASS | 120 entries |  |  |  |
| latest listing | PASS | 120 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=サレ妻の托卵, URL=`12207421984090205365` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 241/241 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 241/241 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comic-trail.com/.../12207421984090205365-68adf5377937c5c2e8915519eaf7243b <redacted query values: 1787644904>` (image/jpeg, 373426 bytes, 600x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421984090205365` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.comic-trail.com/.../12207421984090205365-68adf5377937c5c2e8915519eaf7243b <redacted query values: 1787644904>` |  |  |  |
| details author | PASS | 蒼葵 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 妊活中の恵菜は不倫している夫・柊磨からDVやモラハラを受けていた。不妊治療の担当医になった元カレの春斗から托卵を提案されて…。 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.comic-trail.com/.../12207421984148565489-11aee2a599b5659efddbbf32e4a1ad12` (image/jpeg, 651124 bytes, 1350x1920) |  |  |  |
