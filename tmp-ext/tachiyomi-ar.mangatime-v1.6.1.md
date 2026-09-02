# Extension Validation Report

- Extension: tachiyomi-ar.mangatime-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 215553151312092548
- Source name: MangaTime
- Source language: ar
- Selected manga input: popular offset 0: بلو لوك (`.../blue-lock`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | بلو لوك (`.../blue-lock`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | سولو ليفلينج: راغناروك (`.../solo-leveling-ragnarok`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | تخطّي الحدّ الأقصى (`.../limit-breaker`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | إمبراطور السحر (`.../magic-emperor`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | بلو لوك (`.../blue-lock`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | بلو لوك (`.../blue-lock`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 363 | Chapter - 1 (`.../1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 42 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=بلو لوك, URL=`.../blue-lock` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangatime.org/.../cover.jpg` (image/jpeg, 96765 bytes, 968x1447) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../blue-lock` |  |  |  |
| details thumbnail URL | PASS | `https://mangatime.org/.../cover.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | رياضة, إثارة, دراما, نفسي, شونين, manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | بعد إخفاق المنتخب الياباني في كأس العالم 2018، يطلق اتحاد كرة القدم مشروعًا غير مسبوق لصناعة المهاجم القادر على قيادة اليابان إلى القمة. داخل منشأة «بلو لوك» المغلقة، يجتمع 300 من أفضل المهاجمين الشباب في اختبارات إقصائية لا تعترف إلا بالأهداف والأنانية الكروية والرغبة المطلقة في الفوز.<br><br>يوئيتشي إيساغي، مهاجم ثانوي ما زال يطارده قرار واحد حرمه من التأهل إلى البطولة الوطنية، يجد نفسه وسط منافسين يمتلك كل منهم سلاحًا خاصًا وطموحًا لا يقل خطورة. ومع كل مباراة واختبار، عليه أن يفهم موهبته الحقيقية، ويتجاوز تردده، ويعيد بناء طريقته في اللعب كي يصبح المهاجم الأول.<br><br>تقدم مانجا «بلو لوك» مزيجًا مكثفًا من كرة القدم والتشويق والصراع النفسي، حيث تتحول المنافسة الرياضية إلى معركة إرادات تتصادم فيها الموهبة والعمل الجماعي مع غرور المهاجمين وحلم الفوز بكأس العالم. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 26 name, chapter 27 name, chapter 29 name, chapter 36 name, chapter 41 name, chapter 45 name, chapter 46 name, chapter 61 name, chapter 62 name, chapter 63 name |  |  |  |
| chapters | PASS | 363 chapters |  |  |  |
| chapter dates | PASS | 363 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mangatime.org/.../001.webp` (image/webp (encoding: lossy), 43076 bytes, 579x819) |  |  |  |
