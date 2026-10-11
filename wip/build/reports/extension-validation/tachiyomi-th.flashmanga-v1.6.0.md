# Extension Validation Report

- Extension: tachiyomi-th.flashmanga-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3953857548169222543
- Source name: Flash-Manga
- Source language: th
- Selected manga input: popular offset 0: Genius Archer’s Streaming (`.../genius-archers-streaming`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Genius Archer’s Streaming (`.../genius-archers-streaming`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Genius Grandson of the Loan Shark King (`.../genius-grandson-of-the-loan-shark-king`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Regression of the Yong Clan Heir (`.../regression-of-the-yong-clan-heir`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Absolute Person in Every Corner (`.../absolute-person-in-every-corner`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Genius Archer’s Streaming (`.../genius-archers-streaming`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Genius Archer’s Streaming (`.../genius-archers-streaming`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 109 | ตอนที่ 1 (`.../genius-archers-streaming-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 26 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Genius Archer’s Streaming, URL=`.../genius-archers-streaming` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.flash-manga.net/.../ia_100000028.jpg` (image/jpeg, 211116 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../genius-archers-streaming` |  |  |  |
| details thumbnail URL | PASS | `https://www.flash-manga.net/.../ia_100000028.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ยู ซังฮยอน ครั้งนึงเขาเคยเป็นนักแข่งยิงธนูเหรียญทองในการแข่งขันยิงธนูระดับประเทศและเป็นผู้มีพรสวรรค์ฟ้าประทาน และความฝันก็ได้ดับสลายลงเพราะอุบัติเหตุที่ทำให้เขาไม่สามารถจับธนูได้อีกเป็นครั้งที่สอง ตอนนี้นักยิงธนูอัจฉริยะตกอับก็ต้องเผชิญหน้ากับมลสุมชีวิตจากการบีบออกจากงาน และเพื่อใช้ชีวิตต่อไป เขาจึงสร้างตัวตนขึ้นมาชื่อว่าอัลมอนด์และมุ่งหน้าสู่เส้นทางสตรีมเมอร์ \[คุณได้เลือกธนูแล้ว\] ฟึ่บ! ฟิ้ว! \[เฮดช็อต!\] บอสสามารถพ่ายแพ่ด้วยเพียงนัดเดียวได้ยังไงกัน? ความสามารถอันสุดยอดของเขาได้กลับมาเฉิดฉายอีกครั้ง! กลับมาอีกครั้งในตัวตนสตรีมเมอร์อัจฉริยะ และเขาก็ได้เริ่มต้นการผจญภัยครั้งใหม่ของเขา! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 109 chapters |  |  |  |
| chapter dates | PASS | 109 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://img3.flash-manga.com/.../69579efc3c321SrKNm.jpg` to `https://img3.flash-manga.net/.../69579efc3c321SrKNm.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://img3.flash-manga.com/.../69579efc3c321SrKNm.jpg` (image/jpeg, 765281 bytes, 800x6090) |  |  |  |
