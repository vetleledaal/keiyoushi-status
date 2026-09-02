# Extension Validation Report

- Extension: tachiyomi-en.explosm-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 26
- Lint: 1
- Warnings: 1
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 491094567635736188
- Source name: Cyanide & Happiness
- Source language: en
- Selected manga input: popular offset 0: C&H 2026 (`.../2026`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 22 | C&H 2026 (`.../2026`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | C&H 2026 (`.../2026`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 138 | new-years-2026 (`.../new-years-2026`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 22/22 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 22/22 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://vhx.imgix.net/.../S2E4_Still1.jpg` -> all 22 manga URLs (examples: `2026`, `2025`, `2024`) |  |  |  |
| thumbnail | PASS | `https://vhx.imgix.net/.../S2E4_Still1.jpg` (image/jpeg, 170439 bytes, 1920x1080) |  |  |  |
| details identity | PASS | Details preserved selected URL `2026` |  |  |  |
| details thumbnail URL | PASS | `https://vhx.imgix.net/.../S2E4_Still1.jpg` |  |  |  |
| details author | PASS | Explosm.net |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 138 chapters |  |  |  |
| chapter dates | PASS | 138 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://static.explosm.net/.../newyears2026.png` (image/png, 372977 bytes, 1040x1560) |  |  |  |
