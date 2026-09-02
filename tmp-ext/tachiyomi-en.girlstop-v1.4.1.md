# Extension Validation Report

- Extension: tachiyomi-en.girlstop-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 3
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1368670128695001652
- Source name: GirlsTop
- Source language: en
- Selected manga input: popular offset 0: Csilla A (`.../psto.php <redacted query values: id>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | Csilla A (`.../psto.php <redacted query values: id>`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 40 | Sanita A (`.../psto.php <redacted query values: id>`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 40 | Vana L (`.../psto.php <redacted query values: id>`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | Nancy A (`.../psto.php <redacted query values: id>`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Csilla A (`.../models.php <redacted query values: name>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Resina — Csilla A (`.../psto.php <redacted query values: id>`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Gallery (`.../psto.php <redacted query values: id>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 41 |  |  | <1s |

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
| search listing | LINT | Matched selected manga by title at result offset 0: title=Csilla A, URL=`.../models.php <redacted query values: name>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://girlstop.top/.../450px_p.jpg` (image/jpeg, 65475 bytes, 450x677) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Csilla A to Resina — Csilla A |  |  |  |
| details thumbnail URL | PASS | `https://girlstop.top/.../450px_p.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | relaxation, smiling, cheerful, happiness, cute, indoors, long hair, home interior |  |  |  |
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
| page load | PASS | `https://girlstop.top/.../p.avif` (image/avif (format: avif), 57409 bytes, 524x790) |  |  |  |
