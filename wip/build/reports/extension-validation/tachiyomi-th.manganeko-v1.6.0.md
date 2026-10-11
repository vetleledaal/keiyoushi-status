# Extension Validation Report

- Extension: tachiyomi-th.manganeko-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 5623426415743614214
- Source name: Manga-Neko
- Source language: th
- Selected manga input: popular offset 0: Kingdom  สงครามผงาดบัลลังก์จิ๋นซี (`.../kingdom`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Kingdom  สงครามผงาดบัลลังก์จิ๋นซี (`.../kingdom`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Ingoshima (`.../ingoshima`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | A Rank Party wo Ridatsu Shita Ore wa, Moto Oshiego Tachi to Meikyuu Shinbu wo Mezasu (`.../a-rank-party-wo-ridatsu-shita-ore-wa-moto-oshiego-tachi-to-meikyuu-shinbu-wo-mezasu`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Regressing With the King’s Power (`.../regressing-with-the-kings-power`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kingdom  สงครามผงาดบัลลังก์จิ๋นซี (`.../kingdom`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kingdom สงครามผงาดบัลลังก์จิ๋นซี (`.../kingdom`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 822 | ตอนที่ 1 (`.../kingdom-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 55 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kingdom  สงครามผงาดบัลลังก์จิ๋นซี, URL=`.../kingdom` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga-neko.com/.../Kingdom-214x300.jpg` (image/jpeg, 592877 bytes, 214x300) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Kingdom  สงครามผงาดบัลลังก์จิ๋นซี to Kingdom สงครามผงาดบัลลังก์จิ๋นซี |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manga-neko.com/.../Kingdom.jpg` (image/jpeg, 701646 bytes, 340x477) |  |  |  |
| details author | PASS | HARA Yasuhisa |  |  |  |
| details artist | PASS | HARA Yasuhisa |  |  |  |
| details genres | PASS | Action, Drama, Historical, Mature, Seinen, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | อ่านมังงะแปลไทย สงครามผงาดบัลลังก์จิ๋นซี เรื่องย่อ การผจญภัยของซิน (Xin) เริ่มต้นขึ้นเมื่อเพื่อนของเขา เพียว (Piao) เด็กกำพร้าสงครามเช่นเดียวกัน ผู้มีความฝันอยากเป็นแม่ทัพผู้ยิ่งใหญ่ ถูกขุนนางลึกลับพาตัวไปยังเมืองหลวง ทิ้งให้ซินต้องทำงานและฝึกฝนเพียงลำพัง แต่ในคืนชะตากรรม เพียวกลับมาหาเขาในสภาพโชกเลือด ใกล้สิ้นลม คำพูดสุดท้ายของเพียวคือการฝากฝันให้ซินสานต่อ และไปพบใครบางคนที่หมู่บ้านใกล้เคียง ซินจึงรีบรุดไปทำตามคำขอครั้งสุดท้ายของเพื่อน—และได้พบกับเด็กหนุ่มผู้มีใบหน้าเหมือนเพียวทุกประการทว่าเด็กคนนั้นไม่ใช่ใครอื่น แต่คือ อิ๋งเจิ้ง (Ying Zheng) กษัตริย์แห่งแคว้นฉิน! และเหล่านักฆ่าก็กำลังตามล่าเขาอย่างกระชั้นชิด!<br><br>Alternative Names: <br>- Karalystė<br>- المملكة<br>- پادشاهی<br>- کینگدام<br>- キングダ�<br>- 王者天下<br>- 킹덤 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 822 chapters |  |  |  |
| chapter dates | PASS | 822 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://server1.manga-neko.com/.../435e534702_01.jpg` (image/jpeg, 188564 bytes, 918x1299) |  |  |  |
