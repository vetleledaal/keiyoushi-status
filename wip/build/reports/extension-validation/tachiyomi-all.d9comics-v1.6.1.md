# Extension Validation Report

- Extension: tachiyomi-all.d9comics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 8402307151004919938
- Source name: D9 Comics
- Source language: en
- Selected manga input: latest offset 0: The Unknown Doctor (`.../theunknowndoctor.html <redacted query values: lang>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 11 | Black Sheep (`.../ovejanegra.html <redacted query values: lang>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 11 | The Unknown Doctor (`.../theunknowndoctor.html <redacted query values: lang>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Unknown Doctor (`.../theunknowndoctor.html <redacted query values: lang>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Unknown Doctor (`.../theunknowndoctor.html <redacted query values: lang>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | The Unknown Doctor #1 (`.../the-unknown-doctor-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 28 |  |  | <1s |

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
| popular listing | PASS | 11 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Unknown Doctor, URL=`.../theunknowndoctor.html <redacted query values: lang>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 23/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://d9comics.com/.../image <redacted query values: key>` (image/jpeg, 332349 bytes, 1339x2031) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../theunknowndoctor.html <redacted query values: lang>` |  |  |  |
| details thumbnail URL | PASS | `https://d9comics.com/.../image <redacted query values: key>` |  |  |  |
| details author | PASS | Mariano Laclaustra, Brooks, Fernando Centurión, Sebastián Adano, Julio Chacón |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | fantasía, ciencia ficción |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | An unknown new incarnation of the Doctor visits an old friend in Renaissance Florence... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mir-s3-cdn-cf.behance.net/.../143a47185598021.6566a6f964401.jpg` (image/jpeg, 332349 bytes, 1339x2031) |  |  |  |
