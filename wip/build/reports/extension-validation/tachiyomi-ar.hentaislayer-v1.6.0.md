# Extension Validation Report

- Extension: tachiyomi-ar.hentaislayer-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: fuzzydoodle
- Source ID: 1383489648660567366
- Source name: هنتاي سلاير
- Source language: ar
- Selected manga input: popular offset 0: أمي جاهلة (`.../%D8%A7%D9%85%D9%8A-%D8%AC%D8%A7%D9%87%D9%84%D8%A9`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | أمي جاهلة (`.../%D8%A7%D9%85%D9%8A-%D8%AC%D8%A7%D9%87%D9%84%D8%A9`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | New Town Massage (`.../New-Town-Massage`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | أمي جاهلة (`.../%D8%A7%D9%85%D9%8A-%D8%AC%D8%A7%D9%87%D9%84%D8%A9`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | أوماكي (`.../%D8%A3%D9%88%D9%85%D8%A7%D9%83%D9%8A`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | أمي جاهلة (`.../%D8%A7%D9%85%D9%8A-%D8%AC%D8%A7%D9%87%D9%84%D8%A9`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | أمي جاهلة (`.../%D8%A7%D9%85%D9%8A-%D8%AC%D8%A7%D9%87%D9%84%D8%A9`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=أمي جاهلة, URL=`.../%D8%A7%D9%85%D9%8A-%D8%AC%D8%A7%D9%87%D9%84%D8%A9` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaislayer.net/.../6ac948a6233fa.webp` (image/webp (encoding: lossy), 43408 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%D8%A7%D9%85%D9%8A-%D8%AC%D8%A7%D9%87%D9%84%D8%A9` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaislayer.net/.../6ac948a6233fa.webp` (image/webp (encoding: lossy), 125784 bytes, 500x750) |  |  |  |
| details author | PASS | yokkora |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | مانجا, دراما, ميلف, خيانة |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | تحاول آساهي، بطلة الكرة الطائرة السابقة، مساعدة ابنها يوهي بعدما يفشل في الوصول إلى الفريق الأساسي. لكنها تخلط بين التدريب وممارسات جنسية لقّنها إياها زوجها، فتتجاوز حدود الأمومة معه، وينتهي العمل بانضمامه إلى الفريق وتفكيره في تكرار ما حدث.<br><br>Alternative Title: Mom Is a Dummy |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hentaislayer.net/.../6ac96147efdd0_xr6R.webp` (image/webp (encoding: lossy), 722622 bytes, 1280x1935) |  |  |  |
