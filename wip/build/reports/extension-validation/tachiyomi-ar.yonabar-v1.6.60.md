# Extension Validation Report

- Extension: tachiyomi-ar.yonabar-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 8019959770180418614
- Source name: Yona Bar
- Source language: ar
- Selected manga input: popular offset 0: Jinx (`.../3861`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Jinx (`.../3861`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | (Payback (Pay off (`.../7747`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Sun Behind the ShadowS (`.../23398`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | shutline (`.../3886`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Jinx (`.../3861`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jinx (`.../3861`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 114 | ch-1 (`.../ch-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 98 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jinx, URL=`3861` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 101/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yonaber.com/.../tall-4-193x278-3-175x238.webp` (image/webp (encoding: lossy), 6680 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `3861` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ybstatic.aramang.nom.za/.../tall-4-193x278-3.webp` (image/webp (encoding: lossy), 14874 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | +18, Adult, BL, WEBTOONS, YAOI, بالغ, بذيء, دراما, رومنسي, شريحة من الحياة, ويبتون, ياوي |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | كان المعالج الفيزيائي كيم دان أقل حظاً لأطول فترة ممكنة. بين جدته المريضة، و اصحاب الديون المهددين، ورئيس قديم يجعل من المستحيل عليه العثور على عمل، تنفذ جميع الخيارات من دان. بطبيعة الحال، يبدو الأمر وكأنه حلم تحقق عندما تم تعيينه أخيرًا لعلاج مقاتل MMA الأعلى أجراً جوو جايكيونغ، خاصةً عندما يتصل به الرجل لتلقي العلاج في الليلة السابقة لمباراة بعرض محير للغاية يبلغ خمسة آلاف دولار. يدعي أن لديه «نحس» يحتاج إلى نوع معين من «العلاج»، لكنه أمر ليس دان مستعدًا تمامًا لتقديمه… كما ترى، قد يكون جايكيونغ وحشًا في الحلبة، لكنه أكثر قسوة في غرفة النوم، ودان غير متأكد من أنه يستطيع النجاة من جايكيونغ في هذه الحاله. ومع ذلك، فإن الوعد بالمال الذي تشتد الحاجة إليه جعل دان يوافق على هذه الصفقة المشؤومة… هل يمكن أن تكون ليلة معًا هي الشيء الذي يساعد جايكيونغ على كسر هذا النحس مرة واحدة وإلى الأبد ؟ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 114 chapters |  |  |  |
| chapter dates | PASS | 114 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 98 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://medium1xr.aramang.nom.za/.../1.webp` (image/webp (encoding: lossy), 75568 bytes, 1672x941) |  |  |  |
