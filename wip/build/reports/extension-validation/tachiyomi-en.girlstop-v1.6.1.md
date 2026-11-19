# Extension Validation Report

- Extension: tachiyomi-en.girlstop-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 3
- Warnings: 1
- Skipped: 1
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1368670128695001652
- Source name: GirlsTop
- Source language: en
- Selected manga input: popular offset 0: Liz Ocean (`.../psto.php <redacted query values: id>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Liz Ocean (`.../psto.php <redacted query values: id>`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Sylvia A (`.../psto.php <redacted query values: id>`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Lia A (`.../psto.php <redacted query values: id>`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 429 | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Liz Ocean (`.../models.php <redacted query values: name>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Come Find Me — Liz Ocean (`.../psto.php <redacted query values: id>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../psto.php <redacted query values: id>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 429 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=Liz Ocean, URL=`.../models.php <redacted query values: name>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | HTTP error 429 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://girlstop.top/.../450px_p.jpg` (image/jpeg, 68071 bytes, 450x675) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Liz Ocean to Come Find Me — Liz Ocean |  |  |  |
| details thumbnail URL | PASS | `https://girlstop.top/.../450px_p.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | smiling, cheerful, indoors, fashion |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://girlstop.top/.../p.avif` (image/avif (format: avif), 1430481 bytes, 4000x5996) |  |  |  |
