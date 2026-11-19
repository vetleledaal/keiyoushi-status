# Extension Validation Report

- Extension: tachiyomi-th.toonjai-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4083371529884897098
- Source name: Toonjai
- Source language: th
- Selected manga input: popular offset 0: Jinx (Mingwa) - จิงซ์ (`.../jinx`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Jinx (Mingwa) - จิงซ์ (`.../jinx`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Swallow You Whole - สามีบรรณาการ (`.../swallow-you-whole`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Demon Queen Forced Me to Make a Wish - เทพมารต้องการให้ผมขอพร (`.../the-demon-queen-forced-me-to-make-a-wish`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | After Becoming Financially Free, They Offered Their Loyalty - พลิกชีวิตด้วยระบบชีวิตสมบูรณ์สุดเปย์ (`.../after-becoming-financially-free-they-offered-their-loyalty`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | Jinx (Mingwa) - จิงซ์ (`.../jinx`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jinx (Mingwa) - จิงซ์ (`.../jinx`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 109 | 🔒 ตอนที่ 0.1 (`.../0.1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jinx (Mingwa) - จิงซ์, URL=`.../jinx` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=After Becoming Financially Free, They Offered Their Loyalty - พลิกชีวิตด้วยระบบชีวิตสมบูรณ์สุดเปย์, URL=`.../after-becoming-financially-free-they-offered-their-loyalty` at page 1 offset 23 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.toonjai.com/.../original.webp` (image/webp (encoding: lossy), 97054 bytes, 720x960) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../jinx` |  |  |  |
| details thumbnail URL | PASS | `https://storage.toonjai.com/.../original.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ดราม่า, มังงะเกาหลี, มังงะวาย, โรแมนติก |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 4.92 (1858)<br><br>คิมดัน นักกายภาพบำบัดที่ชีวิตพังไม่เป็นท่า ไม่ว่าจะเป็นคุณยายที่ป่วยหนัก หนี้สินเงินกู้ที่ตามมาหลอกหลอน และการโดนเจ้านายเก่าตามกลั่นแกล้งจนหางานใหม่แทบไม่ได้ ดันไม่มีทางเลือกอื่นแล้วจริงๆ ชีวิตมืดมนจนแทบมองไม่เห็นทางออก<br><br>แต่แล้วเหมือนฝันร้ายก็มีแสงสว่าง เมื่อเขาได้รับการว่าจ้างให้ไปเป็นนักกายภาพบำบัดส่วนตัวของจู แจคยอง นักสู้ MMA ระดับแนวหน้า แจคยองโทรหาดันในคืนก่อนการแข่งขัน พร้อมยื่นข้อเสนอ 5 ล้านวอน เพื่อขอรับ 'การบำบัด' พิเศษบางอย่าง เพราะเขาเชื่อว่าตัวเองจะ 'ซวย' หากไม่ได้รับมัน<br><br>การบำบัดที่แจคยองต้องการนั้นไม่ใช่การนวดทั่วไป แต่เป็นเรื่องทางเพศที่ดันไม่เคยคาดคิดและไม่พร้อมที่จะทำ แน่นอนว่าจู แจคยองที่อยู่บนสังเวียนดูดุดันแล้ว แต่ในห้องนอนสำหรับดันแล้ว เขาดูหยาบคายและอันตรายยิ่งกว่า ดันไม่รู้ว่าจะเอาชีวิตรอดจากนักสู้คนนี้ได้ยังไง แต่ข้อตกลงเงินสดคือสิ่งที่ดันต้องการมากที่สุดเพื่อนำไปใช้หนี้ ติดตามเรื่องราวความสัมพันธ์ที่ตึงเครียดและเย้ายวนระหว่างนักสู้ผู้หยิ่งผยองกับนักกายภาพบำบัดผู้สิ้นหวังได้ใน "Jinx"<br><br>/ Alternatives: 징크스 manhwa |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 109 chapters |  |  |  |
| chapter dates | PASS | 109 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
