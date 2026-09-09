# Extension Validation Report

- Extension: tachiyomi-ar.arabhentai-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 36
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
- Selected manga input: latest offset 0: Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | My Eyes Now See Desire (`.../my-eyes-now-see-desire`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | My Eyes Now See Desire (`.../my-eyes-now-see-desire`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 96 | الفصل 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Regressed Warrior’s Female Dominance, URL=`.../regressed-warriors-female-dominance` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaonl.com/.../regressed-warriors-female-dominance.webp` (image/webp (encoding: lossless), 875084 bytes, 800x1120) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../regressed-warriors-female-dominance` |  |  |  |
| details thumbnail URL | PASS | `https://mangaonl.com/.../regressed-warriors-female-dominance.webp` |  |  |  |
| details author | PASS | جارٍ التحديث |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | اكشن, حريم, خيال, دراما, مانجا - مانهوا, وحوش |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Regressed Warrior’s Female Dominance أونلاين، قراءة Regressed Warrior’s Female Dominance مجانًا، Regressed Warrior’s Female Dominance مانجا هنتاي، Regressed Warrior’s Female Dominance هنتاي مترجم |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 96 chapters |  |  |  |
| chapter dates | PASS | 96 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangaonl.com/.../page_0.jpg` (image/jpeg, 567797 bytes, 720x9335) |  |  |  |
