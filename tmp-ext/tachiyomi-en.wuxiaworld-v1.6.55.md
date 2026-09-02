# Extension Validation Report

- Extension: tachiyomi-en.wuxiaworld-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6540843430852844328
- Source name: WuxiaWorld
- Source language: en
- Selected manga input: popular offset 0: The Boss’s Shotgun Wedding (`.../580795`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 4 | The Boss’s Shotgun Wedding (`.../580795`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 4 | The Boss’s Shotgun Wedding (`.../580795`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Boss’s Shotgun Wedding (`.../580795`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 20 | 000 Prologue (`.../000-prologue`) |  | <1s |
| pages | `getPageList(chapter)` | success | 42 |  |  | 1-10s |

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
| popular listing | PASS | 4 entries |  |  |  |
| latest listing | PASS | 4 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 8/8 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 8/8 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://wuxiaworld.site/.../the-bosss-shotgun-wedding-175x238.jpg` (image/jpeg, 26363 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `580795` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://wuxiaworld.site/.../the-bosss-shotgun-wedding-193x278.jpg` (image/jpeg, 29391 bytes, 193x278) |  |  |  |
| details author | PASS | ShiBuManHua |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Webcomics, Web Comics |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “You are mine, no matter how hard you escape.” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | PASS | 20 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `http://wuxiaworld.site/.../001.jpg` (image/jpeg, 64614 bytes, 900x1200) |  |  |  |
