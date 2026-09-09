# Extension Validation Report

- Extension: tachiyomi-vi.tranh18-v1.6.6
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 27
- Lint: 3
- Warnings: 0
- Skipped: 4
- Failed: 3
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1067821280191897902
- Source name: Tranh18
- Source language: vi
- Selected manga input: latest offset 0: Tôi đã trở thành quản lý của CLB bơi lội harem ngực bự! (`.../toi-da-tro-thanh-quan-ly-cua-clb-boi-loi-harem-nguc-bu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | error | 0 |  | java.lang.NullPointerException | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 35 | Tôi đã trở thành quản lý của CLB bơi lội harem ngực bự! (`.../toi-da-tro-thanh-quan-ly-cua-clb-boi-loi-harem-nguc-bu`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 35 | Cháu yêu dì rất nhiều! (`.../chau-yeu-di-rat-nhieu`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 50 | Tôi đã trở thành quản lý của CLB bơi lội harem ngực bự! (`.../toi-da-tro-thanh-quan-ly-cua-clb-boi-loi-harem-nguc-bu`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tôi đã trở thành quản lý của CLB bơi lội harem ngực bự! (`.../toi-da-tro-thanh-quan-ly-cua-clb-boi-loi-harem-nguc-bu`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Chapter 1 (`.../1020736`) |  | <1s |
| pages | `getPageList(chapter)` | success | 38 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | SKIP | popular operation did not complete successfully |  |  |  |
| latest listing | PASS | 35 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tôi đã trở thành quản lý của CLB bơi lội harem ngực bự!, URL=`.../toi-da-tro-thanh-quan-ly-cua-clb-boi-loi-harem-nguc-bu` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | popular operation did not complete successfully |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tranh18.cc/.../71425.webp` (image/webp (encoding: lossy), 49984 bytes, 400x530) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../toi-da-tro-thanh-quan-ly-cua-clb-boi-loi-harem-nguc-bu` |  |  |  |
| details thumbnail URL | PASS | `https://tranh18.cc/.../71425.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Chưa có mô tả cho truyện này. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | LINT | All 2 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | FAIL | 38 of 38 pages have invalid URLs: page 1: no nonblank URL (imageUrl=<empty>, url=<empty>), page 2: no nonblank URL (imageUrl=<empty>, url=<empty>), page 3: no nonblank URL (imageUrl=<empty>, url=<empty>), page 4: no nonblank URL (imageUrl=<empty>, url=<empty>), page 5: no nonblank URL (imageUrl=<empty>, url=<empty>), and 33 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL is invalid: no nonblank URL (imageUrl=<empty>, url=<empty>); image request: java.lang.IllegalArgumentException: Expected URL scheme 'http' or 'https' but no scheme was found for  | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
