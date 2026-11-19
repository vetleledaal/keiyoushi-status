# Extension Validation Report

- Extension: tachiyomi-all.kusowanka-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2174847726253593532
- Source name: Kusowanka
- Source language: all
- Selected manga input: popular offset 0: Post 13598377 (`.../13598377`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 53 | Post 13598377 (`.../13598377`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 56 | Post 13598318 (`.../13598318`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Post 13598377 (`.../13598377`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Post (`.../13598377`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 53 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 109/109 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 109/109 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://m2.kusowanka.com/.../218267f7fe3e9c47bc1fbc3563b4c1c0.jpg` (image/jpeg, 125199 bytes, 900x569) |  |  |  |
| details identity | PASS | Details preserved selected URL `13598377` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://m2.kusowanka.com/.../218267f7fe3e9c47bc1fbc3563b4c1c0.jpg` was not downloaded |  |  |  |
| details author | PASS | lemonmelon00 |  |  |  |
| details artist | PASS | lemonmelon00 |  |  |  |
| details genres | PASS | 2boys, armband, black hair, black necktie, closed eyes, closed mouth, collared shirt, grey jacket, hand on another's back, hand up, holding hands, jacket, long sleeves, male focus, multiple boys, necktie, open clothes, open jacket, shirt, short hair, simple background, tie clip, upper body, white background, white shirt |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Parodies:** detroit: become human · **Characters:** connor (detroit) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://m2.kusowanka.com/.../218267f7fe3e9c47bc1fbc3563b4c1c0.jpg` (image/jpeg, 125199 bytes, 900x569) |  |  |  |
