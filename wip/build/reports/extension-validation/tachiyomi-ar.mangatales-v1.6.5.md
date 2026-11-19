# Extension Validation Report

- Extension: tachiyomi-ar.mangatales-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 1
- Warnings: 3
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5218550345649535189
- Source name: Manga Tales
- Source language: ar
- Selected manga input: popular offset 0: Black Death (`.../1256`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Black Death (`.../1256`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | خوي (`.../2546`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 29 | الساراي  (`.../2674`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 22 | RishanXFouladh (`.../1284`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Black Death (`.../1256`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Black Death (`.../1256`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 30 | 1 - " المركبة G7 " (`.../1784`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | <1s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 29 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Black Death, URL=`.../1256` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Yoro the ninja of shadow , URL=`.../2385` at page 1 offset 3 and page 2 offset 4, title=RishanXFouladh, URL=`.../1284` at page 1 offset 8 and page 2 offset 0, title=مقهى المشاعر, URL=`.../1917` at page 1 offset 10 and page 2 offset 1, title=VEZIAX , URL=`.../2465` at page 1 offset 11 and page 2 offset 2, title=مغامرات التوأم : يوميات كاتبة ولاعب, URL=`.../2570` at page 1 offset 15 and page 2 offset 11, title=أرواح ضائعة, URL=`.../146` at page 1 offset 17 and page 2 offset 6, title=حجابي مرآة سعادتي , URL=`.../2548` at page 1 offset 18 and page 2 offset 18, title=Black Death, URL=`.../1256` at page 1 offset 21 and page 2 offset 20, title=Everything was a lie , URL=`.../1273` at page 1 offset 26 and page 2 offset 12, title=جنبيت مان, URL=`.../2602` at page 1 offset 27 and page 2 offset 3, title=Dragon Ball Rebirth, URL=`.../2142` at page 1 offset 28 and page 2 offset 16 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 152/152 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 150/152 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.mangatales.com/.../large_Black_Death_Cover_6.png` (image/png, 140066 bytes, 260x364) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1256` |  |  |  |
| details thumbnail URL | PASS | `https://media.mangatales.com/.../large_Black_Death_Cover_6.png` |  |  |  |
| details author | PASS | Aouati Rahim |  |  |  |
| details artist | PASS | Aouati Rahim |  |  |  |
| details genres | PASS | المانجا, عربي, أكشن, قوى خارقة, خيال علمي, إثارة, عنف, شونين, فنون قتال, غموض |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | تدور القصة حول فتى يمتلك قدرة نادرة، عثرت عليه فرقة التدخل السريع التابعة لمنظمة التحقيقات الفضائية S.I.O على سطح القمر في ظروف غامضة. ومع تطور الأحداث، يصل إلى كوكب الأرض الذي يجهل كل شيء عنه، لتنطلق سلسلة من المغامرات والتحديات في عالم يعجّ بالقدرات الخارقة.<br><br>حالة الترجمة:<br>• مستمرة<br><br>مسميّات أخرى:<br>• الموت الأسود<br>• Black Death |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 6 name |  |  |  |
| chapters | PASS | 30 chapters |  |  |  |
| chapter dates | PASS | 30 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.mangatales.com/.../1784` to `https://www.mangatales.com/.../black%20death` (1 redirects) |  |  |  |
| page load | PASS | `https://media.mangatales.com/.../page%200.jpg <redacted query values: ak>` (image/jpeg, 1147347 bytes, 2448x3264) |  |  |  |
