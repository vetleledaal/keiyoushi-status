# Extension Validation Report

- Extension: tachiyomi-th.makimaaaaa-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 6102454165244031412
- Source name: Makimaaaaa
- Source language: th
- Selected manga input: popular offset 0: A Returner’s Magic Should Be Special (`.../a-returners-magic-should-be-special`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | A Returner’s Magic Should Be Special (`.../a-returners-magic-should-be-special`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Archmage Streamer (`.../archmage-streamer`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Mushoku Tensei (`.../mushoku-tensei`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Survival of Blade King (`.../survival-story-of-a-sword-king-in-a-fantasy-world`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Returner’s Magic Should Be Special (`.../a-returners-magic-should-be-special`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 227 | ตอนที่ 1 (`.../7779-2`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://makimaaaaa.com/.../A-Returners-Magic-Should-Be-Special-1-222x300.jpg` (image/jpeg, 20513 bytes, 222x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-returners-magic-should-be-special` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://makimaaaaa.com/.../A-Returners-Magic-Should-Be-Special-1.jpg` (image/jpeg, 142837 bytes, 564x761) |  |  |  |
| details author | PASS | Usonan |  |  |  |
| details artist | PASS | Wookjakga |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Harem, Manhwa มังฮวา, School life, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | อ่านเรื่อง A Returner’s Magic Should Be Special พลังขั้นเทพของจอมเวทจุติใหม่ มังงะ อ่านมังงะ อ่านการ์ตูน การ์ตูน อนิเมะ มังฮวา มังฮัว อ่านมังฮวา มังงะเกาหลี มังงะญี่ปุ่น มังงะจีน เว็บอ่านมังงะ เป็นเวลา 10 ปีที่ Desir อัจฉริยะด้านเวทมนตร์และพรรคพวกของเขาได้ต่อสู้กันภายใน Shadow Labyrinth ลึกลับ—และกับจุดจบของโลก มนุษยชาติส่วนใหญ่เสียชีวิตไปแล้วและในขณะที่ Desir กำลังจะถูกสังหาร เขาได้ย้อนเวลากลับไปเมื่อ 13 ปีก่อน แม้จะรู้อนาคตที่ต้องสาปรออยู่ข้างหน้า Desir ก็พยายามอย่างหนักเมื่อเขาเห็นโอกาสในการฝึกฝนเพื่อนๆ ของเขาและเตรียมพร้อมที่จะเผชิญหน้าอาร์มาเก็ดดอนด้วยกันได้ดียิ่งขึ้นโดยไม่สูญเสียคนที่พวกเขารักไป!<br><br>Alternative Names: <br>- Kikan-sha no mahou wa tokubetsudesu<br>- La magia de un retornado debe ser especial<br>- Magician who Reversing Time<br>- Магія поверненого має бути особливою<br>- พลังขั้นเทพของจอมเวทจุติใหม่<br>- 帰還者の魔法は特別です<br>- 重生者的魔法一定要特別<br>- 귀환자의 마법은 특별해야 합니다<br>- 귀환자의 마법은 특별해야 합니다 (Original) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 227 chapters |  |  |  |
| chapter dates | PASS | 227 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.makimaaaaa.com/.../017b3979e717001e93.jpg` (image/jpeg, 93623 bytes, 720x813) |  |  |  |
