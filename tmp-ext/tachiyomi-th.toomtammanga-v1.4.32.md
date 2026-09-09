# Extension Validation Report

- Extension: tachiyomi-th.toomtammanga-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 5640783863041818405
- Source name: ToomTam-Manga
- Source language: th
- Selected manga input: popular offset 0: The World After the end | โลกหลังการล่มสลาย (`.../the-world-after-the-fall`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | The World After the end | โลกหลังการล่มสลาย (`.../the-world-after-the-fall`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Kuro no Shoukanshi (`.../kuro-no-shoukanshi`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Reaper of the Drifting Moon | ยมทูตใต้แสงจันทร์ (`.../reaper-of-the-drifting-moon`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Pheromones (`.../pheromones`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The World After the end | โลกหลังการล่มสลาย (`.../the-world-after-the-fall`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The World After the end | โลกหลังการล่มสลาย (`.../the-world-after-the-fall`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 194 | ตอนที่ 0 (`.../the-world-after-the-end-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The World After the end \| โลกหลังการล่มสลาย, URL=`.../the-world-after-the-fall` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.wp.com/.../The-World-After-the-End2.jpg <redacted query values: resize>` (image/jpeg, 21369 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-world-after-the-fall` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i1.wp.com/.../The-World-After-the-End2.jpg` (image/jpeg, 269608 bytes, 480x623) |  |  |  |
| details author | PASS | S-Cynan, sing N song |  |  |  |
| details artist | PASS | Undead Gamja |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Manhwa, Mystery, Shounen, มังฮวา, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | เมื่อต้องเผชิญกับความพ่ายแพ้และความตายที่แน่นอน คุณจะเลือกวิ่ง – หรือต่อสู้เพื่อโลกที่พินาศต่อไป? เมื่อหอคอยลึกลับปรากฏขึ้นทั่วโลก เรียกสัตว์ประหลาดที่ล่ามนุษย์ นี่คือตัวเลือกที่นำเสนอแก่ Tower Walkers – นักผจญภัยที่มีพลังพิเศษในการต่อสู้กับสัตว์ประหลาด ในช่วงใกล้ตาย พวกเขาสามารถเลือกใช้ “หินถดถอย” เพื่อย้อนเวลากลับไปในอดีตเป็นโอกาสที่สอง แม้ว่าการตัดสินใจครั้งนี้จะทำให้พวกเขาอยู่ในไทม์ไลน์ที่แยกจากกันตลอดไป หัวแข็งทาวเวอร์วอล์คเกอร์ แจฮวานปฏิเสธตัวเลือกนี้ เลือกที่จะต่อสู้เพื่อไทม์ไลน์เดิม และเรียนรู้…<br><br>Alternative Names: The Post-Destruction World, The World After Destruction, The World After the End, 멸망 이후의 세계 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 194 chapters |  |  |  |
| chapter dates | PASS | 194 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://bbb.webtoon168.com/.../b56c2d628ee9747ab6f39a8b9b3d0e33.jpg` (image/jpeg, 402890 bytes, 1000x4740) |  |  |  |
