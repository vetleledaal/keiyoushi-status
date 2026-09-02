# Extension Validation Report

- Extension: tachiyomi-ar.rocksmanga-v1.4.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3301038340499911137
- Source name: Rocks Manga
- Source language: ar
- Selected manga input: popular offset 0: جثمان (`.../%D8%AC%D8%AB%D9%85%D8%A7%D9%86`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | جثمان (`.../%D8%AC%D8%AB%D9%85%D8%A7%D9%86`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | After Beating a Noob in an FPS, He Wanted to Fight Me in Real Life LOL (`.../after-beating-a-noob-in-an-fps-he-wanted-to-fight-me-in-real-life-lol`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | جثمان (`.../%D8%AC%D8%AB%D9%85%D8%A7%D9%86`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | After Beating a Noob in an FPS, He Wanted to Fight Me in Real Life LOL (`.../after-beating-a-noob-in-an-fps-he-wanted-to-fight-me-in-real-life-lol`) |  | 10s+ |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 12 | Drifting Net Cafe (`.../drifting-net-cafe`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | جثمان (`.../%D8%AC%D8%AB%D9%85%D8%A7%D9%86`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 3 | الفصل 1: كبش فداء (`https://rocksmanga.com/.../1-1`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 132 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 7: title=جثمان, URL=`.../%D8%AC%D8%AB%D9%85%D8%A7%D9%86` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 132/132 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 132/132 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rocksmanga.com/.../1000098578-280x400.jpg` (image/jpeg, 30525 bytes, 280x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%D8%AC%D8%AB%D9%85%D8%A7%D9%86` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | RayanCps |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | أكشن, خارق للطبيعة, دموي, غموض |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | عام 2000، قام يوغوڤاردوس بانقلابٍ دموي على عشيرة فادرون، وسرق عددًا من الجثامين قبل أن يختفي داخل ساحة غامضة تحت الأرض. وبعد خمسة أعوام، يجد ريموند نفسه في قلب صراعٍ يكشف له حقيقةً عن أصله وعن الجثامين التي ارتبطت بالبشر منذ زمن مجهول وعندما تبدأ الحقيقة بالظهور، يصبح الماضي أخطر من الحاضر، ويصبح الموت أرحم...<br><br>Alternative Names: Corpse |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 3 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 132 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://rocksmanga.com/.../001.webp` (image/webp (encoding: lossy), 213626 bytes, 1200x1694) |  |  |  |
