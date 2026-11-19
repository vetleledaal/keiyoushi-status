# Extension Validation Report

- Extension: tachiyomi-ar.alkhariqun-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7404661068058856786
- Source name: Alkhariqun
- Source language: ar
- Selected manga input: popular offset 0: The Crow (`.../the-crow`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Crow (`.../the-crow`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The supreme leader returns again (`.../the-supreme-leader-returns-again`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Crow (`.../the-crow`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Crow (`.../the-crow`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | The Crow 1 (`.../the-crow-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 51 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Crow, URL=`.../the-crow` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://skrolls.alkhariqun.com/.../3688` (image/jpeg, 261548 bytes, 667x667) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-crow` |  |  |  |
| details thumbnail URL | PASS | `https://skrolls.alkhariqun.com/.../3688` |  |  |  |
| details author | PASS | Bilal Abduddin |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Fantasy |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | In the Saadi Sultanate of Morocco, during the 16th century, demonic possession spread across the land, caused by a sorcerer known as Al-Ghayhab. The sorcerer eventually disappeared, but the curse remained, afflicting adults while leaving children and pregnant women untouched. Those who fell victim to the demonic possession were doomed to perish. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://skrolls.alkhariqun.com/.../3690` (image/jpeg, 299065 bytes, 900x1262) |  |  |  |
