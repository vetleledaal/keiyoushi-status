# Extension Validation Report

- Extension: tachiyomi-th.bullymanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 26
- Lint: 1
- Warnings: 1
- Skipped: 7
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 916548575565854572
- Source name: Bully Manga
- Source language: th
- Selected manga input: popular offset 0: Solo Leveling: Ragnarok โซโล่เลเวลลิ่ง แร็คนาร็อค (`.../solo-leveling-ragnarok`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Solo Leveling: Ragnarok โซโล่เลเวลลิ่ง แร็คนาร็อค (`.../solo-leveling-ragnarok`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | The Heavenly Demon Can’t Live a Normal Life (`.../heavenly-demon-normal`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Solo Leveling: Ragnarok โซโล่เลเวลลิ่ง แร็คนาร็อค (`.../solo-leveling-ragnarok`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 74 | ตอนที่ 0 (`.../solo-leveling-ragnarok-ep0000`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 40/40 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 40/40 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bully-manga.com/.../solo-leveling-ragnarok-cover.jpg` (image/jpeg, 49086 bytes, 350x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../solo-leveling-ragnarok` |  |  |  |
| details thumbnail URL | PASS | `https://bully-manga.com/.../solo-leveling-ragnarok-cover.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ต่อสู้, ผจญภัย, ดราม่า, จิตวิทยา, โชเน็น, จอมยุทธ์, ย้อนยุค, ลึกลับ, เกิดใหม่, มังงะเกาหลี |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | **Solo Leveling: Ragnarok โซโล่เลเวลลิ่ง แร็คนาร็อค** คือมังงะที่มอบประสบการณ์ที่น่าตื่นเต้นและเต็มไปด้วยการผจญภัย ไม่เพียงแค่เรื่องราวที่น่าติดตาม แต่ยังแสดงให้เห็นถึงความกล้าหาญและพลังของตัวละครหลัก ซองซูโฮ ในขณะที่เขาต้องเผชิญกับภัยคุกคามจากมอนสเตอร์ที่หลั่งไหลเข้ามาสู่โลกนี้ เมื่อพี่ชายของเขาล่วงลับไป เหล่า Absolute Ones ต่างพยายามเติมเต็มช่องว่างนี้ ด้วยการต่อสู้ที่เข้มข้นและการค้นหามรดกที่มีค่าของบิดา ทำให้คุณไม่สามารถละสายตาได้เลย<br><br>หากคุณเป็นแฟนมังงะจีน หรือกำลังมองหามังงะใหม่ ๆ ที่จะอ่าน Solo Leveling: Ragnarok คือทางเลือกที่ไม่ควรพลาด ด้วยภาพสวยงามและเนื้อเรื่องที่ซับซ้อน รับรองว่าจะทำให้คุณติดใจและอยากติดตามต่อตลอดเวลา อ่านมังงะนี้ได้ที่ thebullyproject.com แล้วมาร่วมกันสนุกสนานไปกับการผจญภัยที่ไม่มีวันสิ้นสุด! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 74 chapters |  |  |  |
| chapter dates | LINT | All 74 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=74 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://bully-manga.com/.../1` to `https://bully-manga.com/.../all` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
