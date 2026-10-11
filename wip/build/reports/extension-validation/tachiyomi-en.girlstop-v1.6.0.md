# Extension Validation Report

- Extension: tachiyomi-en.girlstop-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 3
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1368670128695001652
- Source name: GirlsTop
- Source language: en
- Selected manga input: popular offset 0: Clover A (`.../psto.php <redacted query values: id>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Clover A (`.../psto.php <redacted query values: id>`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Wenny A (`.../psto.php <redacted query values: id>`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Jade E (`.../psto.php <redacted query values: id>`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Eva Foreva (`.../psto.php <redacted query values: id>`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Clover A (`.../models.php <redacted query values: name>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Effortless — Clover A (`.../psto.php <redacted query values: id>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../psto.php <redacted query values: id>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=Clover A, URL=`.../models.php <redacted query values: name>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 162/162 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 162/162 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://girlstop.top/.../450px_p.jpg` (image/jpeg, 46838 bytes, 450x622) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Clover A to Effortless — Clover A |  |  |  |
| details thumbnail URL | PASS | `https://girlstop.top/.../450px_p.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | outdoors, relaxation, smiling, cute, indoors, fashion, blond hair |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://girlstop.top/.../p.avif` (image/avif (format: avif), 253633 bytes, 3616x5000) |  |  |  |
