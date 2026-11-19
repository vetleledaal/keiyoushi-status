# Extension Validation Report

- Extension: tachiyomi-ar.comicsgate-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8305275160230214656
- Source name: ComicsGate
- Source language: ar
- Selected manga input: popular offset 0: داني: العدد الثالث! (`.../dani3`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | داني: العدد الثالث! (`.../dani3`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | دليل المغامر: العدد الأول! (`.../adventurerguide1`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | داني: العدد الثالث! (`.../dani3`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | داني: العدد الثالث! (`.../dani3`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../dani03`) |  | <1s |
| pages | `getPageList(chapter)` | success | 26 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=داني: العدد الثالث!, URL=`<redacted home path> |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 31/31 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.comicsgate.net/.../1.jpg` (image/jpeg, 29336 bytes, 302x465) |  |  |  |
| details identity | PASS | Details preserved selected URL `<redacted home path> |  |  |  |
| details thumbnail URL | PASS | `https://www.comicsgate.net/.../1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **يشرفنا أن نقدم لكم اليوم أبطال الكوميكس الحقيقيون العدد الجديد الشيق من إصدارات كوميكس جيت الأصلية المنتظر و هي إصدارت كوميكس عربية تصدر حصرياً على كوميكس جيت ويمكنكم طلبها ورقياً من صفحاتنا الرسمية. شارك في هذا العدد فنان الكوميكس الأسطوري كريم أحمد والغني عن التعريف بالطبع وهو بداية لواحدة من أقوى وأعظم سلاسل الكوميكس والروايات المصورة العربية بالمقاييس العالمية، فتابعوا معنا!**<br><br>**اقرأ العدد مباشرة من هنا بدون اي برامج خاصة او تحميل!**<br><br>**شارك في هذا العدد:**<br>كتابة ورسوم…كريم أحمد<br>تلوين الغلاف…أحمد عبده<br><br>**رئيس التحرير: أحمد عبده**<br><br>**اقرأ في هذا العدد:**<br><br>الفصل الثالث: قبلات تعني الكثير!<br>الأحبة تلتقي والأمور تتكشف! سليم يقابل حب حياته بعد رحلة طويلة لهدف غامض كبير!<br>وداني أيضاً يقابل حب حياته لأول مرة في صدفة عجيبة وغير متوقعة! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.comicsgate.net/.../1.jpg` (image/jpeg, 448950 bytes, 1524x2351) |  |  |  |
