# Extension Validation Report

- Extension: tachiyomi-ar.mangatime-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
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
| popular | `getPopularManga(1)` | success | 24 | بلو لوك (`.../blue-lock`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | بلاك كلوفر (`.../black-clover`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Count's Secret Maid (مترجم) (`.../the-counts-secret-maid`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | بعد أن أصبحت طفلة صغيرة، عائلة الأشرار تريد قتلي! (`.../after-becoming-a-dumpling-the-villain-family-all-wants-to-kill-me`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 6 | بلو لوك (`.../blue-lock`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | بلو لوك (`.../blue-lock`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 373 | Chapter - 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 42 |  |  | <1s |

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
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangatime.org/.../pnbiwpx3.jpg` (image/jpeg, 204153 bytes, 512x766) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../blue-lock` |  |  |  |
| details thumbnail URL | PASS | `https://mangatime.org/.../pnbiwpx3.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | رياضة, إثارة, دراما, نفسي, شونين, manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | بعد إخفاق المنتخب الياباني في كأس العالم 2018، يطلق اتحاد كرة القدم مشروعًا غير مسبوق لصناعة المهاجم القادر على قيادة اليابان إلى القمة. داخل منشأة «بلو لوك» المغلقة، يجتمع 300 من أفضل المهاجمين الشباب في اختبارات إقصائية لا تعترف إلا بالأهداف والأنانية الكروية والرغبة المطلقة في الفوز.<br><br>يوئيتشي إيساغي، مهاجم ثانوي ما زال يطارده قرار واحد حرمه من التأهل إلى البطولة الوطنية، يجد نفسه وسط منافسين يمتلك كل منهم سلاحًا خاصًا وطموحًا لا يقل خطورة. ومع كل مباراة واختبار، عليه أن يفهم موهبته الحقيقية، ويتجاوز تردده، ويعيد بناء طريقته في اللعب كي يصبح المهاجم الأول.<br><br>تقدم مانجا «بلو لوك» مزيجًا مكثفًا من كرة القدم والتشويق والصراع النفسي، حيث تتحول المنافسة الرياضية إلى معركة إرادات تتصادم فيها الموهبة والعمل الجماعي مع غرور المهاجمين وحلم الفوز بكأس العالم. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 36 name, chapter 37 name, chapter 39 name, chapter 46 name, chapter 51 name, chapter 55 name, chapter 56 name, chapter 71 name, chapter 72 name, chapter 73 name |  |  |  |
| chapters | PASS | 373 chapters |  |  |  |
| chapter dates | PASS | 373 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangatime.org/.../001.webp` (image/webp (encoding: lossy), 43076 bytes, 579x819) |  |  |  |
