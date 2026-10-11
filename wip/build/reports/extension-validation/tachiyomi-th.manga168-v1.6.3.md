# Extension Validation Report

- Extension: tachiyomi-th.manga168-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8294739153755503988
- Source name: Manga168
- Source language: th
- Selected manga input: popular offset 0: Overgeared (Remake) (`.../overgeared-remake`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | Overgeared (Remake) (`.../overgeared-remake`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | The Shepherd Wizard (`.../the-shepherd-wizard`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Set Up (`.../set-up`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Overgeared (Remake) (`.../overgeared-remake`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Overgeared (Remake) (`.../overgeared-remake`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 342 | Overgeared (Remake) ตอนที่0 (`.../ch-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 6 |  |  | 1-10s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Overgeared (Remake), URL=`.../overgeared-remake` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 46/46 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 46/46 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.manga168x.com/.../cover-over.webp` (image/webp (container: extended), 2359020 bytes, 488x675) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../overgeared-remake` |  |  |  |
| details thumbnail URL | PASS | `https://cover.manga168x.com/.../cover-over.webp` |  |  |  |
| details author | PASS | Unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action ต่อสู้, Adventure ผจญภัย, Shounen โชเน็น, Fantasy แฟนตาซี, Manhwa มังฮวา |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ชินยองอู เป็นผู้แพ้อย่างแท้จริงในชีวิตและเป็นหนี้บุญคุณบริษัทประกันภัยอย่างหนัก เขาอาศัยอยู่กับพ่อแม่ที่ผิดหวังและน้องสาวที่เก่งกาจซึ่งเป็นนักเรียนชั้นนำคนหนึ่งของโรงเรียนของเธอ แม้แต่ในเกมอย่างเกม VRMMORPG ยอดนิยมในซาทิสทาย เขาก็เป็นผู้แพ้ทั้งหมด แต่อยู่มาวันหนึ่ง ระหว่างทำภารกิจ เขาได้พบกับหนังสือในตำนานอย่างปาฏิหาริย์ที่สามารถมอบประสบการณ์ระดับตำนานที่ไม่เคยเห็นที่ไหนมาก่อนให้กับทุกคนที่อ่านมัน! เขาวางแผนที่จะขายมันด้วยเงินจำนวนมาก แต่โชคมักเป็นลักษณะที่แย่ที่สุดของเขาเสมอ ผ่านการเปลี่ยนแปลงที่โชคร้ายของสถานการณ์ ความฝันของเขาอยู่ได้ไม่นานในขณะที่เขาถูกบังคับให้ใช้ไอเท็มสำหรับตัวเอง ชีวิตของเขาเปลี่ยนไปตลอดกาลตั้งแต่วันนั้นที่เวรกรรม... อ่านนิยาย Overgeared ต่อได้ที่นี่ คลิ๊กเลย |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 342 chapters |  |  |  |
| chapter dates | PASS | 342 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://bbb.webtoon168.com/.../Oremanga2c04650c09d0811f5.jpg` (image/jpeg, 192030 bytes, 720x972) |  |  |  |
