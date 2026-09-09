# Extension Validation Report

- Extension: tachiyomi-en.questionablecontent-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 26
- Lint: 1
- Warnings: 0
- Skipped: 8
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5564060716297760161
- Source name: Questionable Content
- Source language: en
- Selected manga input: popular offset 0: Questionable Content (`.../archive.php`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 1 | Questionable Content (`.../archive.php`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Questionable Content (`.../archive.php`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 5946 | See #1: "Employment Sucks" with newspost (`.../view.php <redacted query values: comic>`) |  | 1-10s |
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
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 1/1 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1/1 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.ibb.co/.../qc-teh.png` (image/png, 16845 bytes, 550x780) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../archive.php` |  |  |  |
| details thumbnail URL | PASS | `https://i.ibb.co/.../qc-teh.png` |  |  |  |
| details author | PASS | Jeph Jacques |  |  |  |
| details artist | PASS | Jeph Jacques |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | An internet comic strip about romance and robots |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5946 chapters |  |  |  |
| chapter dates | LINT | 5945 of 5946 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=5945 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../view.php <redacted query values: comic>` at offsets 819, 821, `.../view.php <redacted query values: comic>` at offsets 843, 844, `.../view.php <redacted query values: comic>` at offsets 1101, 1102, `.../view.php <redacted query values: comic>` at offsets 1225, 1226, `.../view.php <redacted query values: comic>` at offsets 1309, 1310, `.../view.php <redacted query values: comic>` at offsets 1366, 1367, `.../view.php <redacted query values: comic>` at offsets 1369, 1370, `.../view.php <redacted query values: comic>` at offsets 1423, 1424, `.../view.php <redacted query values: comic>` at offsets 1485, 1486, `.../view.php <redacted query values: comic>` at offsets 1647, 1648, `.../view.php <redacted query values: comic>` at offsets 1687, 1688, `.../view.php <redacted query values: comic>` at offsets 2019, 2024, `.../view.php <redacted query values: comic>` at offsets 2033, 2034, `.../view.php <redacted query values: comic>` at offsets 2083, 2084, `.../view.php <redacted query values: comic>` at offsets 2180, 2181, `.../view.php <redacted query values: comic>` at offsets 2468, 2469, `.../view.php <redacted query values: comic>` at offsets 2470, 2471, `.../view.php <redacted query values: comic>` at offsets 2472, 2473, `.../view.php <redacted query values: comic>` at offsets 2498, 2499, `.../view.php <redacted query values: comic>` at offsets 2502, 2503, `.../view.php <redacted query values: comic>` at offsets 2673, 2674, `.../view.php <redacted query values: comic>` at offsets 2787, 2788, `.../view.php <redacted query values: comic>` at offsets 2921, 2922, `.../view.php <redacted query values: comic>` at offsets 2957, 2958, `.../view.php <redacted query values: comic>` at offsets 2983, 2984, `.../view.php <redacted query values: comic>` at offsets 3051, 3053, `.../view.php <redacted query values: comic>` at offsets 3075, 3076, `.../view.php <redacted query values: comic>` at offsets 3096, 3097, `.../view.php <redacted query values: comic>` at offsets 3105, 3106, `.../view.php <redacted query values: comic>` at offsets 3131, 3132, `.../view.php <redacted query values: comic>` at offsets 3172, 3173, `.../view.php <redacted query values: comic>` at offsets 3201, 3202, `.../view.php <redacted query values: comic>` at offsets 3210, 3211, `.../view.php <redacted query values: comic>` at offsets 3222, 3223, `.../view.php <redacted query values: comic>` at offsets 3236, 3237 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.questionablecontent.net/.../1.png` (image/png, 209502 bytes, 510x1300) |  |  |  |
