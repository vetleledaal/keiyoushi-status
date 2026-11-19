# Extension Validation Report

- Extension: tachiyomi-ar.peachbl-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1091157818486681267
- Source name: Peach BL
- Source language: ar
- Selected manga input: popular offset 0: النحس (`.../%D8%A7%D9%84%D9%86%D8%AD%D8%B3`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | النحس (`.../%D8%A7%D9%84%D9%86%D8%AD%D8%B3`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | لا تخلط بين الحب والمتعة! (`.../%D9%84%D8%A7-%D8%AA%D8%AE%D9%84%D8%B7-%D8%A8%D9%8A%D9%86-%D8%A7%D9%84%D8%AD%D8%A8-%D9%88%D8%A7%D9%84%D9%85%D8%AA%D8%B9%D8%A9`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | الخصي (`.../%D8%A7%D9%84%D8%AE%D8%B5%D9%8A`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | منافسة فتى المزرعة (`.../%D9%85%D9%86%D8%A7%D9%81%D8%B3%D8%A9-%D9%81%D8%AA%D9%89-%D8%A7%D9%84%D9%85%D8%B2%D8%B1%D8%B9%D8%A9`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | النحس (`.../%D8%A7%D9%84%D9%86%D8%AD%D8%B3`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | النحس (`.../%D8%A7%D9%84%D9%86%D8%AD%D8%B3`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 108 | الفصل 1 (`.../%D8%A7%D9%84%D9%86%D8%AD%D8%B3-%D8%A7%D9%84%D9%81%D8%B5%D9%84-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 35 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=النحس, URL=`.../%D8%A7%D9%84%D9%86%D8%AD%D8%B3` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 96/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://peach-bl.com/.../tall-4-193x278.webp <redacted query values: _t>` (image/webp (encoding: lossy), 14874 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%D8%A7%D9%84%D9%86%D8%AD%D8%B3` |  |  |  |
| details thumbnail URL | PASS | `https://peach-bl.com/.../tall-4-193x278.webp <redacted query values: _t>` |  |  |  |
| details author | PASS | Mingwa |  |  |  |
| details artist | PASS | Mingwa |  |  |  |
| details genres | PASS | بالغ, دراما, رومانسي, رياضي, ياوي |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | لقد كان المعالج الفيزيائي كيم دان في حالة سيئة منذ فترة طويلة. بين جدته المريضة، وقروض القروض الخطيرة، ورئيسه القديم الذي يجعل من المستحيل عليه العثور على عمل، فإن دان ينفد حقًا من الخيارات. بطبيعة الحال، يبدو الأمر وكأنه حلم أصبح حقيقة عندما تم تعيينه أخيرًا لعلاج مقاتل الفنون القتالية المختلطة الأعلى أجراً جو جاكيونغ، خاصة عندما يستدعيه الرجل للعلاج في الليلة السابقة للمباراة مع عرض مثير للغاية بقيمة خمسة آلاف دولار. دولار. إنه يدعي أن لديه “نحس” يحتاج إلى نوع معين من “العلاج”، لكن دان ليس مستعدًا تمامًا لتقديمه… كما ترى، قد يكون Jaekyung وحشًا في الحلبة، لكنه أكثر خشونة في الحلبة. غرفة النوم، ودان غير متأكد من قدرته على النجاة من Jaekyung في أبسط حالاته، ومع ذلك، فإن الوعد بالمال الذي يحتاجه بشدة قد وافق على هذه الصفقة المشؤومة… هل يمكن أن تكون الليلة معًا هي الشيء الذي يساعد Jaekyung على كسر هذا النحس مرة واحدة. وللجميع؟<br><br>**أسماء أخرى:** JINX：ジンクス Vận xui Джинкс 징크스, جينكس |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 108 chapters |  |  |  |
| chapter dates | PASS | 108 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://peach-bl.comhttps/.../IMG_20240705_171613_265.webp` could not be downloaded: java.net.UnknownHostException: peach-bl.comhttps: Name or service not known | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
