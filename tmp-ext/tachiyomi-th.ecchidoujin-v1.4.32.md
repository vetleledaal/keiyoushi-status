# Extension Validation Report

- Extension: tachiyomi-th.ecchidoujin-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7257262636858275074
- Source name: Ecchi-Doujin
- Source language: th
- Selected manga input: latest offset 0: Taste Folder คิงก์โฟลเดอร์.ZIP (`.../taste-folder`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | เย็ดแม่ [FRLEXZ] Mama (`.../%E0%B9%80%E0%B8%A2%E0%B9%87%E0%B8%94%E0%B9%81%E0%B8%A1%E0%B9%88-frlexz-mama`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | นายหญิงใจเริง [Poyeop] Tolerance (`.../%E0%B8%99%E0%B8%B2%E0%B8%A2%E0%B8%AB%E0%B8%8D%E0%B8%B4%E0%B8%87%E0%B9%83%E0%B8%88%E0%B9%80%E0%B8%A3%E0%B8%B4%E0%B8%87-poyeop-tolerance`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Taste Folder คิงก์โฟลเดอร์.ZIP (`.../taste-folder`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | คุณอายาโกะข้างห้อง (Ojo) (`.../%E0%B8%84%E0%B8%B8%E0%B8%93%E0%B8%AD%E0%B8%B2%E0%B8%A2%E0%B8%B2%E0%B9%82%E0%B8%81%E0%B8%B0%E0%B8%82%E0%B9%89%E0%B8%B2%E0%B8%87%E0%B8%AB%E0%B9%89%E0%B8%AD%E0%B8%87-ojo`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Taste Folder คิงก์โฟลเดอร์.ZIP (`.../taste-folder`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Taste Folder คิงก์โฟลเดอร์.ZIP (`.../taste-folder`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 26 | ตอนที่ 1 (`.../taste-folder-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Taste Folder คิงก์โฟลเดอร์.ZIP, URL=`.../taste-folder` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ecchi-doujin.com/.../Taste-Folder-193x278-g1xYiVpI.webp` (image/webp (encoding: lossy), 15438 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../taste-folder` |  |  |  |
| details thumbnail URL | PASS | `https://ecchi-doujin.com/.../Taste-Folder-193x278-g1xYiVpI.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Doujin89, Doujinfast, Ecchi-doujin, โดจิน, โดจินภาพสี full color, โดจินเกาหลี, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | เรื่องย่อ Taste Folder: มังฮวาโรแมนติกสุดป่วน เมื่อ ‘รสนิยมลับ’ ถูกเปิดเผย! ร่วมลุ้นไปกับเรื่องราวความรักสุดวุ่นใน Taste Folder (หรือ 취향폴เดอร์) มังฮวาเกาหลีแนวโรแมนติกคอมเมดี้ที่เล่าถึงชีวิตในรั้วมหาวิทยาลัย เมื่อความซวยมาเยือนตัวเอกที่ดันเผลอทำ “รสนิยมส่วนตัว” ที่เก็บไว้ในโฟลเดอร์ลับหลุดไปให้คนที่ไม่ควรเห็นที่สุดดู! พบกับความสัมพันธ์ที่เริ่มต้นจากความอับอายสู่ความรักที่ชวนให้ใจฟู ลายเส้นสวยงามทันสมัยและพล็อตเรื่องที่โดนใจวัยรุ่น หากคุณกำลังมองหา มังฮวาอ่านสนุก ที่นำเสนอเรื่องความลับและรสนิยมในมุมมองใหม่ๆ Taste Folder คือเรื่องที่คุณไม่ควรพลาดในลิสต์ มังฮวาแนะนำ ปีนี้!<br><br>Alternative Names: Bogo Gallaeyo, Taste Folder, TasteFolder.ZIP, Tệp Tin Sắc Thái.zip, Want A Taste, 취향폴더, 취향폴더.ZIP |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 26 chapters |  |  |  |
| chapter dates | PASS | 26 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.ecchi-doujin.com/.../1.jpg` (image/jpeg, 366530 bytes, 1000x5138) |  |  |  |
