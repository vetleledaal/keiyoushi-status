# Extension Validation Report

- Extension: tachiyomi-ar.mangatime-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 26
- Lint: 0
- Warnings: 0
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 215553151312092548
- Source name: MangaTime
- Source language: ar
- Selected manga input: popular offset 0: Blue Lock (`.../blue-lock`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Blue Lock (`.../blue-lock`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Solo Max-Level Newbie (`.../solo-max-level-newbie`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Lucky Billion Players (`.../lucky-billion-players`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 22 | Blue Lock (`.../blue-lock`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Blue Lock (`.../blue-lock`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 1144: Expected string literal but 'null' literal was found at path: \$\[0\].result.data.json.chapters\[3\].title<br>Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.<br>JSON input: .....er":366,"volume":null,"title":null,"pageCount":17,"language"..... | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 1144: Expected string literal but 'null' literal was found at path: \$\[0\].result.data.json.chapters\[3\].title<br>Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.<br>JSON input: .....er":366,"volume":null,"title":null,"pageCount":17,"language"..... | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Blue Lock, URL=`.../blue-lock` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 118/118 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 118/118 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangatime.org/.../697df7820c5d340ac154519f-9aa1515e21c3e23c.webp` (image/webp (encoding: lossy), 232468 bytes, 1024x1532) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../blue-lock` |  |  |  |
| details thumbnail URL | PASS | `https://mangatime.org/.../697df7820c5d340ac154519f-9aa1515e21c3e23c.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | رياضة, أكشن, إثارة, دراما, نفسي, شونين, manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | تنطلق أحداث مانجا «بلو لوك» (Blue Lock) عقب خروج المنتخب الياباني المأساوي من بطولة كأس العالم، مما يدفع الاتحاد الياباني لكرة القدم إلى التعاقد مع المخطط المثير للجدل «جينباتشي إيغو» لإطلاق مشروع ثوري غير مسبوق يحمل اسم «القفل الأزرق». يجمع هذا المشروع 300 مهاجم شاب من أبرز مواهب المدارس الثانوية في عموم اليابان داخل منشأة تدريبية مغلقة ومعزولة أشبه بالسجن، بهدف واحد لا حياد عنه: صناعة أعظم مهاجم أناني في تاريخ كرة القدم عبر تحطيم أحلام ومستقبل الـ 299 الباقين.<br><br>ينضم المهاجم الشاب «يوئيتشي إيساغي» إلى هذا المعسكر القاسي مثقلاً بندم قرار سابق مرر فيه الكرة لزميله بدلاً من التسديد مباشرة، ليصطدم ببيئة تنافسية شرسة ترفض قيم اللعب الجماعي التقليدي وتكافئ الهداف الذي لا يرى في الملعب سوى الشباك. ولكي ينجو إيساغي ويثبت جدارته أمام نوابغ الهجوم مثل «باشيرا» و«رين إيتوشي» و«بارو»، يضطر لتفكيك أسلوبه الكروي وإعادة بناء وعيه الميداني وسلاحه الفطري في اختبارات إقصائية تحبس الأنفاس.<br><br>تمزج مانجا Blue Lock للكاتب Muneyuki Kaneshiro والرسام Yusuke Nomura بين إثارة مباريات كرة القدم والحروب النفسية لألعاب البقاء بدقة رسم خارقة. تابع جميع فصول مانجا بلو لوك مترجمة للعربية بجودة عالية فور صدورها عبر منصة مانجا تايم. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
