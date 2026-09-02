# Extension Validation Report

- Extension: tachiyomi-ar.arabhentai-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6899943547168982381
- Source name: هنتاي العرب - نت
- Source language: ar
- Selected manga input: popular offset 0: في الصيف (`.../fy-alsyf`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | في الصيف (`.../fy-alsyf`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | مذكرة اللباس (`.../mthkr-allbas`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | في الصيف (`.../fy-alsyf`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | مذكرة اللباس (`.../mthkr-allbas`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | في الصيف (`.../fy-alsyf`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | في الصيف (`.../fy-alsyf`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 86 | الفصل 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=في الصيف, URL=`.../fy-alsyf` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaonl.com/.../fy-alsyf.webp` (image/webp (encoding: lossless), 735054 bytes, 720x1083) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../fy-alsyf` |  |  |  |
| details thumbnail URL | PASS | `https://mangaonl.com/.../fy-alsyf.webp` |  |  |  |
| details author | PASS | Updating |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | أثداء كبيرة, جنس بالثدي, جنس فموي, خيانة, رومانسي, طالب \| طالبة, مانجا - مانهوا, مانهوا, ميلف |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | في الصيف أونلاين، قراءة في الصيف مجانًا، في الصيف مانجا هنتاي، في الصيف هنتاي مترجم |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 86 chapters |  |  |  |
| chapter dates | PASS | 86 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mangaonl.com/.../page_0.jpg` (image/jpeg, 457682 bytes, 720x8000) |  |  |  |
