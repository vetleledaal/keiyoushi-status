# Extension Validation Report

- Extension: tachiyomi-ar.dilar-v1.6.14
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7634600808243438399
- Source name: Dilar
- Source language: ar
- Selected manga input: popular offset 0: I Failed to Abandon the Villain (`.../I%20Failed%20to%20Abandon%20the%20Villain`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | I Failed to Abandon the Villain (`.../I%20Failed%20to%20Abandon%20the%20Villain`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | The woman who lost 4 years and 6 months. (`.../The%20woman%20who%20lost%204%20years%20and%206%20months.`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 22 | I GOT MARRIED  (`.../I%20GOT%20MARRIED`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Failed to Abandon the Villain (`.../I%20Failed%20to%20Abandon%20the%20Villain`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Failed to Abandon the Villain (`.../I%20Failed%20to%20Abandon%20the%20Villain`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 119 | 36 (`.../36`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: Unsupported encryption protocol version: 12 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: Unsupported encryption protocol version: 12 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Failed to Abandon the Villain, URL=`3266/I Failed to Abandon the Villain` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 53/53 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 53/53 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dilar.tube/.../large_cover-380153c0e3dd1d30b5b55200aae1275f.webp` (image/webp (encoding: lossy), 351974 bytes, 1200x1712) |  |  |  |
| details identity | PASS | Details preserved selected URL `3266/I Failed to Abandon the Villain` |  |  |  |
| details thumbnail URL | PASS | `https://dilar.tube/.../large_cover-380153c0e3dd1d30b5b55200aae1275f.webp` |  |  |  |
| details author | PASS | Ja Eunhyang |  |  |  |
| details artist | PASS | Todac S |  |  |  |
| details genres | PASS | رومانسي, دراما, مانهوا, فانتازيا, تاريخي, جوسي, سحر, نفسي |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS |  ذات يوم ، أعطاها والدها ولداً. قال إنه أنقذه من ساحة المعركة بسبب مظهره الجميل. "لديه ختم محفور على قلبه. طالما لديك هذه الخرزة ، فلن يكون قادرًا على عصيانك. لذلك يمكنك أن تأمره بفعل أي شيء ". "اجلس." بدا الصبي قاتما إلى حد ما بعد سماع ما أمرت به. "آه ، هل كنت أعامله كثيرًا مثل الكلب؟" وبينما كان والدها يضغط على الخرزة ، جثا الصبي عند قدميها. "سيد" ومضت عيناه الحمراوان ، وأضاءت نظرته المخيفة وهو يبتسم بجنون. كان أحلك أحلك. الساحر الكبير المستقبلي والرئيس الأخير لهذا العالم. "حسنًا ، كل ما تبقى الآن ، يا معلمة." وبعد ذلك ، في سن الثانية والعشرين ، استيقظ بصفته سيد البرج السحري وانتقم بقتل منزلها بالكامل. "هل تريد أن تعيش؟ ثم اجلس يا معلمة. "التفتت إليها العيون الحمراء المخيفة. 'لماذا هو مثل هذا بالنسبة لي ؟! حاولت جهدي أن أعامله بشكل صحيح! "<br><br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 119 chapters |  |  |  |
| chapter dates | PASS | 119 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Unsupported encryption protocol version: 12 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
