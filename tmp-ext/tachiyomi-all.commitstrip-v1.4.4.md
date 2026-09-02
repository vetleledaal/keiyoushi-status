# Extension Validation Report

- Extension: tachiyomi-all.commitstrip-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 16
- Lint: 1
- Warnings: 1
- Skipped: 17
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5328240584854276436
- Source name: Commit Strip
- Source language: en
- Selected manga input: popular offset 0: Commit Strip (2026) (`https://www.commitstrip.com/.../2026`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | Commit Strip (2026) (`https://www.commitstrip.com/.../2026`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Commit Strip (2026) (`https://www.commitstrip.com/.../2026`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Commit Strip (2026) (`https://www.commitstrip.com/.../2026`) |  | <1s |
| chapters | `fetchChapterList(manga)` | error | 0 |  | java.lang.Exception: HTTP error 404 | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.lang.Exception: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Commit Strip (2026), URL=`https://www.commitstrip.com/.../2026` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 16/16 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://www.commitstrip.com/.../2026`, popular entry 2: `https://www.commitstrip.com/.../2025`, popular entry 3: `https://www.commitstrip.com/.../2024` |  |  |  |
| thumbnail URLs | PASS | 16/16 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://i.imgur.com/.../HODJlt9.jpg` -> all 15 manga URLs (examples: `https://www.commitstrip.com/.../2026`, `https://www.commitstrip.com/.../2025`, `https://www.commitstrip.com/.../2024`) |  |  |  |
| thumbnail | PASS | `https://i.imgur.com/.../HODJlt9.jpg` (image/jpeg, 85973 bytes, 700x394) |  |  |  |
| details identity | PASS | Details preserved selected URL `https://www.commitstrip.com/.../2026` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../HODJlt9.jpg` |  |  |  |
| details author | PASS | Mark Nightingale |  |  |  |
| details artist | PASS | Etienne Issartial |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The blog relating the daily life of web agency developers. <br><br>Note: This entry includes all the chapters published in 2026 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
