# Extension Validation Report

- Extension: tachiyomi-ar.mangatales-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 21
- Lint: 3
- Warnings: 2
- Skipped: 10
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5218550345649535189
- Source name: Manga Tales
- Source language: ar
- Selected manga input: popular offset 0: أكاديمية u.m.k (`.../250`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | أكاديمية u.m.k (`.../250`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | مملكة الجليد (`.../1055`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 28 | الشيطان الأخضر (`.../2067`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 26 | RishanXFouladh (`.../1284`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | أكاديمية u.m.k (`.../250`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | أكاديمية u.m.k (`.../250`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=أكاديمية u.m.k, URL=`.../250` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=RishanXFouladh, URL=`.../1284` at page 1 offset 1 and page 2 offset 0, title=أرواح ضائعة, URL=`.../146` at page 1 offset 4 and page 2 offset 22, title=VEZIAX , URL=`.../2465` at page 1 offset 6 and page 2 offset 10, title=حجابي مرآة سعادتي , URL=`.../2548` at page 1 offset 7 and page 2 offset 4, title=Black Death, URL=`.../1256` at page 1 offset 10 and page 2 offset 7, title=Extraordinary Spy Boys, URL=`.../1856` at page 1 offset 12 and page 2 offset 12, title=ربيع شالا, URL=`.../831` at page 1 offset 14 and page 2 offset 23, title=Dragon Ball Rebirth, URL=`.../2142` at page 1 offset 18 and page 2 offset 2, title=Zero mirror , URL=`.../2537` at page 1 offset 21 and page 2 offset 6 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 155/155 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 152/155 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `.../250` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | المانجا, عربي, سحر, مصاصي الدماء, الحياة المدرسية, قوى خارقة, أكشن, تحقيق, كوميدي, وحوش |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | لم يتم اضافة قصة بعد<br><br>حالة الترجمة:<br>• مستمرة<br><br>مسميّات أخرى:<br>• U.M.K  academy |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
