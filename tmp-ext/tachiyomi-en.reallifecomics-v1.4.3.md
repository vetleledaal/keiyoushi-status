# Extension Validation Report

- Extension: tachiyomi-en.reallifecomics-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 16
- Lint: 0
- Warnings: 1
- Skipped: 17
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4890735226828164084
- Source name: Real Life Comics
- Source language: en
- Selected manga input: popular offset 0: Real Life Comics (2026) (`.../archivepage.php <redacted query values: year>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 26 | Real Life Comics (2026) (`.../archivepage.php <redacted query values: year>`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Real Life Comics (2026) (`.../archivepage.php <redacted query values: year>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Real Life Comics (2026) (`.../archivepage.php <redacted query values: year>`) |  | <1s |
| chapters | `fetchChapterList(manga)` | error | 0 |  | java.io.EOFException: SSL peer shut down incorrectly | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.io.EOFException: SSL peer shut down incorrectly | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 26 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Real Life Comics (2026), URL=`.../archivepage.php <redacted query values: year>` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 27/27 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 27/27 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://reallifecomics.com/.../logo.png` -> all 26 manga URLs (examples: `.../archivepage.php <redacted query values: year>`, `.../archivepage.php <redacted query values: year>`, `.../archivepage.php <redacted query values: year>`) |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://reallifecomics.com/.../logo.png` could not be downloaded: java.io.EOFException: SSL peer shut down incorrectly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../archivepage.php <redacted query values: year>` |  |  |  |
| details thumbnail URL | PASS | `https://reallifecomics.com/.../logo.png` |  |  |  |
| details author | PASS | Maelyn Dean |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The normal daily lives of some abnormal people. This entry includes all the chapters published in 2026 |  |  |  |
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
