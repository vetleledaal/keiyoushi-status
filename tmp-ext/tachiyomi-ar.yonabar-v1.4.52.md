# Extension Validation Report

- Extension: tachiyomi-ar.yonabar-v1.4.52
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
- Lint: 0
- Warnings: 2
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 8019959770180418614
- Source name: Yona Bar
- Source language: ar
- Selected manga input: popular offset 0: Jinx (`.../jinx`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Jinx (`.../jinx`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 10 | أنت عالمي (`.../%D8%A3%D9%86%D8%AA-%D8%B9%D8%A7%D9%84%D9%85%D9%8A`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Jinx (`.../jinx`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 113 | ch-1 (`https://yonaber.com/.../ch-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 148 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 20/20 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 19/20 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `.../jinx` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | +18, Adult, BL, WEBTOONS, YAOI, بالغ, بذيء, دراما, رومنسي, شريحة من الحياة, ويبتون, ياوي |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | كان المعالج الفيزيائي كيم دان أقل حظاً لأطول فترة ممكنة. بين جدته المريضة، و اصحاب الديون المهددين، ورئيس قديم يجعل من المستحيل عليه العثور على عمل، تنفذ جميع الخيارات من دان. بطبيعة الحال، يبدو الأمر وكأنه حلم تحقق عندما تم تعيينه أخيرًا لعلاج مقاتل MMA الأعلى أجراً جوو جايكيونغ، خاصةً عندما يتصل به الرجل لتلقي العلاج في الليلة السابقة لمباراة بعرض محير للغاية يبلغ خمسة آلاف دولار. يدعي أن لديه «نحس» يحتاج إلى نوع معين من «العلاج»، لكنه أمر ليس دان مستعدًا تمامًا لتقديمه… كما ترى، قد يكون جايكيونغ وحشًا في الحلبة، لكنه أكثر قسوة في غرفة النوم، ودان غير متأكد من أنه يستطيع النجاة من جايكيونغ في هذه الحاله. ومع ذلك، فإن الوعد بالمال الذي تشتد الحاجة إليه جعل دان يوافق على هذه الصفقة المشؤومة… هل يمكن أن تكون ليلة معًا هي الشيء الذي يساعد جايكيونغ على كسر هذا النحس مرة واحدة وإلى الأبد ؟ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 113 chapters |  |  |  |
| chapter dates | PASS | 113 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 113 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 148 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://medium2x.aramang.nom.za/.../b.jpg` (image/jpeg, 49848 bytes, 1152x648) |  |  |  |
