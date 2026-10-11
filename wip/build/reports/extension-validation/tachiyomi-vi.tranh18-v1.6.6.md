# Extension Validation Report

- Extension: tachiyomi-vi.tranh18-v1.6.6
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 25
- Lint: 3
- Warnings: 0
- Skipped: 5
- Failed: 4
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1067821280191897902
- Source name: Tranh18
- Source language: vi
- Selected manga input: latest offset 0: Miếng bánh từ trên trời rơi xuống (`.../mieng-banh-tu-tren-troi-roi-xuong`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | error | 0 |  | java.lang.NullPointerException | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 35 | Miếng bánh từ trên trời rơi xuống (`.../mieng-banh-tu-tren-troi-roi-xuong`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 35 | Sự sa ngã của Yuuka: Từ thôi miên đến phục tùng (`.../su-sa-nga-cua-yuuka-tu-thoi-mien-den-phuc-tung`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.NullPointerException | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Miếng bánh từ trên trời rơi xuống (`.../mieng-banh-tu-tren-troi-roi-xuong`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 23 | Chapter 1 (`.../1023417`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | SKIP | popular operation did not complete successfully |  |  |  |
| latest listing | PASS | 35 entries |  |  |  |
| search listing | SKIP | search operation did not complete successfully |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | popular operation did not complete successfully |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 70/70 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 70/70 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tranh18.cc/.../71735.webp` (image/webp (encoding: lossy), 34384 bytes, 400x874) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mieng-banh-tu-tren-troi-roi-xuong` |  |  |  |
| details thumbnail URL | PASS | `https://tranh18.cc/.../71735.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Chưa có mô tả cho truyện này. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 23 chapters |  |  |  |
| chapter dates | LINT | All 23 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=23 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | FAIL | 32 of 32 pages have invalid URLs: page 1: no nonblank URL (imageUrl=<empty>, url=<empty>), page 2: no nonblank URL (imageUrl=<empty>, url=<empty>), page 3: no nonblank URL (imageUrl=<empty>, url=<empty>), page 4: no nonblank URL (imageUrl=<empty>, url=<empty>), page 5: no nonblank URL (imageUrl=<empty>, url=<empty>), and 27 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL is invalid: no nonblank URL (imageUrl=<empty>, url=<empty>); image request: java.lang.IllegalArgumentException: Expected URL scheme 'http' or 'https' but no scheme was found for  | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
