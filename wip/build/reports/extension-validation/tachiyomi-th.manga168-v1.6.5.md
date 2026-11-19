# Extension Validation Report

- Extension: tachiyomi-th.manga168-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8294739153755503988
- Source name: Manga168
- Source language: th
- Selected manga input: popular offset 0: God of Blackfield (`.../god-of-blackfield`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | God of Blackfield (`.../god-of-blackfield`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | What a Bountiful Harvest, Demon Lord! (`.../what-a-bountiful-harvest-demon-lord`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Secretly More Powerful than the Hero (`.../secretly-more-powerful-than-the-hero`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | God of Blackfield (`.../god-of-blackfield`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | God of Blackfield (`.../god-of-blackfield`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 224 | God of Blackfield ตอนที่1 (`.../ch-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=God of Blackfield, URL=`.../god-of-blackfield` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 46/46 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 46/46 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.manga168x.com/.../ff5bba89-bf14-4695-9ee5-5f4ade943e9e_z.jpg` (image/jpeg, 20631 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../god-of-blackfield` |  |  |  |
| details thumbnail URL | PASS | `https://cover.manga168x.com/.../ff5bba89-bf14-4695-9ee5-5f4ade943e9e_z.jpg` |  |  |  |
| details author | PASS | Kumo (雲) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action ต่อสู้, Supernatural เหนือธรรมชาติ, Drama ดราม่า, Shounen โชเน็น, School Life ชีวิตประจำวัน, Manhwa มังฮวา |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | อ่านGod of Blackfield เรื่องย่อ "ฉันเป็นใคร?" ตำนานกองทหารต่างด้าวฝรั่งเศส 'กังจัง'! ระหว่างสงครามแอฟริกา เขาถูกเรียกว่า 'เทพเจ้าแห่งแบล็คฟิลด์' เทพเจ้าแห่งดินแดนสีดำ โดยศัตรูของเขาที่หวาดกลัวแต่เกรงกลัวเขา อย่างไรก็ตาม ระหว่างภารกิจสังหาร Masallan สมองที่อยู่เบื้องหลัง SISS กลุ่มผู้สนับสนุนซุนนี คัง ชาน ถูกสังหารโดยกระสุนปืนที่ไม่ทราบสาเหตุจากด้านหลังเขา เมื่อการมองเห็นของเขาพร่ามัว เขาเห็นสมาชิกในทีมสิบสามคนซึ่งมีความเชื่อมั่นในตัวเขา ถูกฆ่าตายทีละคน ในขณะที่คังชานกำลังรอความตายหลังจากถูกคนทรยศยิง เขาได้รับการช่วยเหลือจากพลังลึกลับและตื่นขึ้นมาใน 3 ปีต่อมาในเกาหลีใต้ อย่างไรก็ตาม เขาอยู่ในร่างของ 'คัง ชาน' อีกคน เด็กมัธยมอายุ 19 ปี ที่ถูกรังแกที่โรงเรียน การเดินทางของคังชานเพื่อล้างแค้นผู้ทรยศและค้นหาความจริงเบื้องหลังการเกิดใหม่ของเขาได้เริ่มต้นขึ้นแล้ว! อ่าน God of Blackfield |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 224 chapters |  |  |  |
| chapter dates | PASS | 224 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
