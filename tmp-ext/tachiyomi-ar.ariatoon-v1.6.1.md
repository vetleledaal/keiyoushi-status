# Extension Validation Report

- Extension: tachiyomi-ar.ariatoon-v1.6.1
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
- Source ID: 8156789703798131884
- Source name: AriaToon
- Source language: ar
- Selected manga input: popular offset 0: زنوبيا (`.../bc6024d1-e099-4e95-a7dc-d0399a54009f`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | زنوبيا (`.../bc6024d1-e099-4e95-a7dc-d0399a54009f`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | عصر الجواهر (`.../b4933e5e-b6bc-46e2-bc89-69e607db0b1a`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | الفتاة التي بِلا رداء أحمر (`.../f5fed092-3c42-49a1-b029-c4f7c670ccab`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | مقهى الدماء  (`.../5977c5bf-0f5a-433b-b0b2-3c6b4731d62c`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | زنوبيا (`.../bc6024d1-e099-4e95-a7dc-d0399a54009f`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | زنوبيا (`.../bc6024d1-e099-4e95-a7dc-d0399a54009f`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | الفصل 1 - الفصل الاول  (`.../32552af5-c0e5-45ed-9f8a-b80952a97fef`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=زنوبيا, URL=`bc6024d1-e099-4e95-a7dc-d0399a54009f` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.ariatoon.com/.../ff923b91-39fa-4a77-b53b-5f9936fcb219.jpg` (image/jpeg, 3466982 bytes, 2362x3543) |  |  |  |
| details identity | PASS | Details preserved selected URL `bc6024d1-e099-4e95-a7dc-d0399a54009f` |  |  |  |
| details thumbnail URL | PASS | `https://api.ariatoon.com/.../ff923b91-39fa-4a77-b53b-5f9936fcb219.jpg` |  |  |  |
| details author | PASS | tala jk |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | في قلب الصحراء، حيث تعانق الرمال الذهبية سماء المجد، تنشأ زنوبيا، المحاربة الفذة والملكة الفطنة، التي تحمل في قلبها روح تدمر وكرامتها. بشخصيتها وثقتها، تخوض مغامرات التي تبدأ كحكايات شيقة، لكنها سرعان ما تتخذ منحى خطيرًا، حين يصبح تحرير تدمر من قبضة الإمبراطورية الرومانية هدفها الأكبر.<br><br>إلى جانبها، يقف زوجها أذينة، الحاكم القوي، وابنها وهب اللات، الوريث الصغير، بينما يطاردها ظل العدو الروماني أوريليانوس، الذي لا يرى زنوبيا في بادئ الأمر مجرد خصم سياسي، بل امرأة مثيرة للاهتمام، فيعرض عليها الزواج طمعًا في كسبها إلى صفه، لكنها ترفض مرارا، فكيف لملكة لا تخضع لروما أن تخضع لرجل مثله؟<br><br>إعلان:<br>قريبأ |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 8 name |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://api.ariatoon.com/.../2f7dae00-f9d5-45f7-8b8f-1290461f9e77.jpg` (image/jpeg, 180248 bytes, 1272x1800) |  |  |  |
