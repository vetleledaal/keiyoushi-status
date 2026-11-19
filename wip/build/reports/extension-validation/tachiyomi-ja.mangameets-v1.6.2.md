# Extension Validation Report

- Extension: tachiyomi-ja.mangameets-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2561264003659474410
- Source name: MangaMeets
- Source language: ja
- Selected manga input: popular offset 0: 牛柄ビキニを着せたかったBL (`.../9ec90fa0-d254-4a3c-b1f4-2a65c5462d32`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 9 | 牛柄ビキニを着せたかったBL (`.../9ec90fa0-d254-4a3c-b1f4-2a65c5462d32`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | 星降るキミと僕 (`.../4f5ce83e-eaf2-4758-ba8e-d813a330a31a`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | 兄貴と彼氏 (`.../3409fb3d-9e06-4de6-b7bf-7335edf22be7`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | 牛柄ビキニを着せたかったBL (`.../9ec90fa0-d254-4a3c-b1f4-2a65c5462d32`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 牛柄ビキニを着せたかったBL (`.../9ec90fa0-d254-4a3c-b1f4-2a65c5462d32`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Chapter １ (`.../686cf60a-07c1-4ac1-8817-7db4f138680f`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 4 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=牛柄ビキニを着せたかったBL, URL=`9ec90fa0-d254-4a3c-b1f4-2a65c5462d32` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 69/69 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 69/69 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://res.cloudinary.com/.../bkujfb9uiayzqnw1lrka.png` (image/png, 55516 bytes, 1120x1559) |  |  |  |
| details identity | PASS | Details preserved selected URL `9ec90fa0-d254-4a3c-b1f4-2a65c5462d32` |  |  |  |
| details thumbnail URL | PASS | `https://res.cloudinary.com/.../bkujfb9uiayzqnw1lrka.png` |  |  |  |
| details author | PASS | 多多野たくみ |  |  |  |
| details artist | PASS | 多多野たくみ |  |  |  |
| details genres | PASS | BL |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 乳牛ちゃんと闘牛くんのゆるゆるBLです |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://res.cloudinary.com/.../tz1oaz7voih76oc4odet.png` (image/webp (encoding: lossless), 37492 bytes, 1120x1559) |  |  |  |
