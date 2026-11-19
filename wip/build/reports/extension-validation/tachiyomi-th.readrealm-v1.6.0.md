# Extension Validation Report

- Extension: tachiyomi-th.readrealm-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 702761992332293393
- Source name: ReadRealm
- Source language: th
- Selected manga input: popular offset 0: Shut Up, Evil Dragon! I don't want to raise a child with you anymore (`.../L1E4dv9AV5AqVogakpmQ`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Shut Up, Evil Dragon! I don't want to raise a child with you anymore (`.../L1E4dv9AV5AqVogakpmQ`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | กลายเป็นมหาเศรษฐีสายเปย์ หลังจากโดนเทเพราะยากจน (`.../RbKaMELO7pQaVglzP41q`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | เจ้าแห่งกงล้อโชคชะตา (`.../5qDAm32WxX9XOogPnaGe`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | ลักษณ์สวรรค์ (`.../3a7qNk8mOKrPxXyvogDn`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Shut Up, Evil Dragon! I don't want to raise a child with you anymore (`.../L1E4dv9AV5AqVogakpmQ`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Shut Up, Evil Dragon! I don't want to raise a child with you anymore (`.../L1E4dv9AV5AqVogakpmQ`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 116 | อารัมภบท: เชลยเผ่ามังกร (`.../QWXJL2yMdERDpvlEobgN`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shut Up, Evil Dragon! I don't want to raise a child with you anymore, URL=`L1E4dv9AV5AqVogakpmQ` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image.readrealm.co/.../3d8e1ce8-03ac-4d5b-8cda-bb307980a6e0.webp` (image/webp (encoding: lossy), 36724 bytes, 368x460) |  |  |  |
| details identity | PASS | Details preserved selected URL `L1E4dv9AV5AqVogakpmQ` |  |  |  |
| details thumbnail URL | PASS | `https://image.readrealm.co/.../3d8e1ce8-03ac-4d5b-8cda-bb307980a6e0.webp` |  |  |  |
| details author | PASS | Excalibur |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | แฟนตาซี, รักโรแมนติก |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ทั่วไป (PG)<br><br>หลังจากพ่ายแพ้และถูกจับเป็นเชลย นักล่ามังกรลีออนก็ตกเป็นทาสของราชินีมังกรเงิน ด้วยความตระหนักถึงความตาย เขาจึงใช้เวทมนตร์ต้องห้ามสาปราชินี แต่ไม่คาดคิด ราชินีกลับสูญเสียการควบคุม<br><br>เขาคิดว่าสิ่งนี้จะทำให้ราชินีต้องอยู่อย่างอัปยศไปตลอดชีวิต และมันก็คุ้มค่ากับภารกิจของนักล่ามังกร<br><br>แต่สองปีต่อมา เมื่อลีออนลืมตาขึ้น ข้างๆ เขาคือเด็กหญิงมังกรตัวน้อยที่มีหาง… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 116 chapters |  |  |  |
| chapter dates | PASS | 116 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 403 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
