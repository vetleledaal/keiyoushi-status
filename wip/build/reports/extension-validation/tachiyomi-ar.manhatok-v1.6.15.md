# Extension Validation Report

- Extension: tachiyomi-ar.manhatok-v1.6.15
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 25
- Lint: 3
- Warnings: 1
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 743599002989616408
- Source name: Manhatok
- Source language: ar
- Selected manga input: popular offset 0: One Piece مترجم (`.../one-piece_29.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 9 | One Piece مترجم (`.../one-piece_29.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 11 | Blue Lock (`.../blue-lock.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | One Piece مترجم (`.../one-piece_29.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece مترجم (`.../one-piece_29.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 28 | الفصل 1082.5 (`.../1083.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece مترجم, URL=`.../one-piece_29.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../001%20%286%29.webp` (image/jpeg, 21977 bytes, 124x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-piece_29.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../001%20%286%29.webp` (image/jpeg, 150441 bytes, 450x726) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Drama, Romance |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | الكبير” (غراند لاين). القبض على “روجر” وإعدامه من قبل الحكومة العالمية أحدث تغييرات في جميع أنحاء العالم. فقط كشفت كلماته الأخيرة قبل موته عن وجود أعظم كنز، “ون بيس” (القطعة الواحدة). ليقوم هذا ببدأ عصر القراصنة الهائل، وهم الأشخاص الذين يحلمون بالعثور على الـ“ون بيس”، وهو قدر غير محدود من الثروات والشهرة، وقمة المجد، وأيضا لقب “ملك القراصنة”. “مونكي دي لوفي”، فتى يبلغ من العمر 17 عامًا، قد أصبح قرصانا. لكن مع تعديلات على هذا المفهوم. فبدلاً من الشخصية الشعبية للقرصان، الشريرة الصلبة والتي تقوم بنهب القرى من أجل المتعة، فقد أصبح “لوفي” قرصانًا لسبب غريب، حلمه بالمغامرة المثيرة، وفي النهاية، الكنز الموعود ولقب “ملك القراصنة”. يسير “لوفي” على خطى بطل طفولته، ويبدأ بجمع طاقم خاص به ليسافرو عبر “الخط الكبير” معا، ويعيشون مغامرات مجنونة، ويكشفون عن أسرار مظلمة، ويحاربون أعداء أقوياء، كل ذلك من أجل الوصول إلى الـ“ون بيس”.<br><br>أسماء أخرى: ون بيس |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 22 name |  |  |  |
| chapters | PASS | 28 chapters |  |  |  |
| chapter dates | PASS | 28 positive upload dates |  |  |  |
| chapter titles | LINT | One or more chapters have no title |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
