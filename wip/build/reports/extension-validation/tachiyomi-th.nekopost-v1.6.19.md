# Extension Validation Report

- Extension: tachiyomi-th.nekopost-v1.6.19
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4353470354941192417
- Source name: Nekopost
- Source language: th
- Selected manga input: popular offset 0: [มังงะ] แด่ฉากจบสุขนิยมที่ผมไขว่คว้า กับเหล่าปาร์ตี้ที่จิตใจพังทลาย【Zenmetsu End o Shi ni Monogurui de Kaihi shita. Party ga Yanda.】 (`.../16216`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 5 | [มังงะ] แด่ฉากจบสุขนิยมที่ผมไขว่คว้า กับเหล่าปาร์ตี้ที่จิตใจพังทลาย【Zenmetsu End o Shi ni Monogurui de Kaihi shita. Party ga Yanda.】 (`.../16216`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | พ่อบ้านแดน10 (`.../17697`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | เรื่องราวการถูกพี่สาวสายเฉื่อยกรอกคำโกหกไร้สาระใส่หัวทุกวัน (`.../18341`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [มังงะ] แด่ฉากจบสุขนิยมที่ผมไขว่คว้า กับเหล่าปาร์ตี้ที่จิตใจพังทลาย【Zenmetsu End o Shi ni Monogurui de Kaihi shita. Party ga Yanda.】 (`.../16216`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [มังงะ] แด่ฉากจบสุขนิยมที่ผมไขว่คว้า กับเหล่าปาร์ตี้ที่จิตใจพังทลาย【Zenmetsu End o Shi ni Monogurui de Kaihi shita. Party ga Yanda.】 (`.../16216`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 11 | ตอนที่ 1: หนทางในการใช้ชีวิต (`.../16216_198761.json`) |  | <1s |
| pages | `getPageList(chapter)` | success | 33 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[มังงะ\] แด่ฉากจบสุขนิยมที่ผมไขว่คว้า กับเหล่าปาร์ตี้ที่จิตใจพังทลาย【Zenmetsu End o Shi ni Monogurui de Kaihi shita. Party ga Yanda.】, URL=`16216` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=เธอคนนั้นคงเล็งพี่ชายผมอยู่เเน่ๆ, URL=`18102` at page 1 offset 2 and page 2 offset 10, title=ทำไมผมที่ชอบคนที่โตกว่าถึงไปชอบเธอที่ตัวเล็กได้นะ?, URL=`18396` at page 1 offset 7 and page 2 offset 14 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 36/36 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 36/36 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.osemocphoto.com/.../16216_cover.jpg <redacted query values: ver>` (image/jpeg, 285890 bytes, 704x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `16216` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.osemocphoto.com/.../16216_cover.jpg` (image/jpeg, 285890 bytes, 704x1000) |  |  |  |
| details author | PASS | Ameito Suzume |  |  |  |
| details artist | PASS | Shima |  |  |  |
| details genres | PASS | Action, Comedy, Drama, Fantasy, Harem, Isekai, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “——ม่ายยยยยย!? โวลก้า หะ ห้ามตายนะะะะะ!!”<br>โวลก้า นักผจญภัยผู้กลับชาติมาเกิดจากญี่ปุ่น<br>ระหว่างที่กำลังสำรวจดันเจี้ยน จู่ๆ เขาก็ถูกมอนสเตอร์สุดแกร่งเข้าเล่นงาน และได้รับบาดเจ็บสาหัสเจียนตายจากการเอาตัวเข้าปกป้องพวกพ้อง<br>วินาทีนั้นเองที่เขาเพิ่งตระหนักได้ว่า—ที่นี่คือโลกในมังงะดาร์กแฟนตาซีที่เคยอ่านในชาติก่อน และเขาก็คือตัวประกอบที่มีบทบาทต้อง ‘ตายยกปาร์ตี้’ ไปพร้อมกับเพื่อนๆ<br>ด้วยความที่เกลียดชังฉากจบแบบแบดเอ็นด์เข้าไส้โวลก้าจึงสู้แบบถวายหัวเพื่อเพื่อนพ้องจนสร้างปาฏิหาริย์กำราบมอนสเตอร์ลงได้<br>แม้จะต้องแลกมาด้วยการเสียดวงตาและขาไปอย่างละข้าง แต่เขาก็โล่งใจที่สามารถพลิกชะตากรรมจากการตายหมู่ได้สำเร็จ<br>ทว่า ท่าทีของเหล่าเด็กสาวในปาร์ตี้กลับดูแปลกไปชอบกล——<br>“คราวนี้แหละจะปกป้องให้ได้เลย!! เพราะงั้นขอร้องล่ะ อย่าทิ้งหนูไปนะ……!!”<br>“ฉันจะอยู่ข้างๆ ตลอดไปเลยค่ะ ——ดีใช่มั้ยคะ รุ่นพี่?”<br>“เพื่อเธอแล้ว... ฉันตัดสินใจว่าจะยอมตายค่ะ” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.osemocphoto.com/.../42f957b03e6b221be3336033854ca1aebfbbd0b94c1a80246213e5b68b4e54e6.jpg <redacted query values: verify>` (image/jpeg, 241232 bytes, 704x1000) |  |  |  |
