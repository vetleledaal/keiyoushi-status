# Extension Validation Report

- Extension: tachiyomi-en.questionablecontent-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 25
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
| chapters | `fetchChapterList(manga)` | success | 5939 | See #1: "Employment Sucks" with newspost (`.../view.php <redacted query values: comic>`) |  | <1s |
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
| chapters | PASS | 5939 chapters |  |  |  |
| chapter dates | LINT | 5938 of 5939 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=5938 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../view.php <redacted query values: comic>` at offsets 812, 814, `.../view.php <redacted query values: comic>` at offsets 836, 837, `.../view.php <redacted query values: comic>` at offsets 1094, 1095, `.../view.php <redacted query values: comic>` at offsets 1218, 1219, `.../view.php <redacted query values: comic>` at offsets 1302, 1303, `.../view.php <redacted query values: comic>` at offsets 1359, 1360, `.../view.php <redacted query values: comic>` at offsets 1362, 1363, `.../view.php <redacted query values: comic>` at offsets 1416, 1417, `.../view.php <redacted query values: comic>` at offsets 1478, 1479, `.../view.php <redacted query values: comic>` at offsets 1640, 1641, `.../view.php <redacted query values: comic>` at offsets 1680, 1681, `.../view.php <redacted query values: comic>` at offsets 2012, 2017, `.../view.php <redacted query values: comic>` at offsets 2026, 2027, `.../view.php <redacted query values: comic>` at offsets 2076, 2077, `.../view.php <redacted query values: comic>` at offsets 2173, 2174, `.../view.php <redacted query values: comic>` at offsets 2461, 2462, `.../view.php <redacted query values: comic>` at offsets 2463, 2464, `.../view.php <redacted query values: comic>` at offsets 2465, 2466, `.../view.php <redacted query values: comic>` at offsets 2491, 2492, `.../view.php <redacted query values: comic>` at offsets 2495, 2496, `.../view.php <redacted query values: comic>` at offsets 2666, 2667, `.../view.php <redacted query values: comic>` at offsets 2780, 2781, `.../view.php <redacted query values: comic>` at offsets 2914, 2915, `.../view.php <redacted query values: comic>` at offsets 2950, 2951, `.../view.php <redacted query values: comic>` at offsets 2976, 2977, `.../view.php <redacted query values: comic>` at offsets 3044, 3046, `.../view.php <redacted query values: comic>` at offsets 3068, 3069, `.../view.php <redacted query values: comic>` at offsets 3089, 3090, `.../view.php <redacted query values: comic>` at offsets 3098, 3099, `.../view.php <redacted query values: comic>` at offsets 3124, 3125, `.../view.php <redacted query values: comic>` at offsets 3165, 3166, `.../view.php <redacted query values: comic>` at offsets 3194, 3195, `.../view.php <redacted query values: comic>` at offsets 3203, 3204, `.../view.php <redacted query values: comic>` at offsets 3215, 3216, `.../view.php <redacted query values: comic>` at offsets 3229, 3230 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.questionablecontent.net/.../1.png` (image/png, 209502 bytes, 510x1300) |  |  |  |
