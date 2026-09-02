# Extension Validation Report

- Extension: tachiyomi-th.singmanga-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 834994810873638550
- Source name: SingManga
- Source language: th
- Selected manga input: latest offset 0: A Modern Man Who Got Transmigrated Into the Murim World (`.../a-modern-man-who-got-transmigrated-into-the-murim-world`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Regressor of the Fallen family (`.../regressor-of-the-fallen-family`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | God-level Assassin, I Am the Shadow (`.../god-level-assassin-i-am-the-shadow`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | A Modern Man Who Got Transmigrated Into the Murim World (`.../a-modern-man-who-got-transmigrated-into-the-murim-world`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Academy’s Genius Swordmaster (`.../academys-genius-swordmaster`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | A Modern Man Who Got Transmigrated Into the Murim World (`.../a-modern-man-who-got-transmigrated-into-the-murim-world`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | A Modern Man Who Got Transmigrated Into the Murim World (`.../a-modern-man-who-got-transmigrated-into-the-murim-world`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 175 | Chapter 175 (`.../a-modern-man-who-got-transmigrated-into-the-murim-world-175`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Modern Man Who Got Transmigrated Into the Murim World, URL=`.../a-modern-man-who-got-transmigrated-into-the-murim-world` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.sing-manga.com/.../f41a10e8c57004b84298426dbb1affe3_1739106747-1.jpg` (image/jpeg, 101584 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-modern-man-who-got-transmigrated-into-the-murim-world` |  |  |  |
| details thumbnail URL | PASS | `https://www.sing-manga.com/.../f41a10e8c57004b84298426dbb1affe3_1739106747-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | มูริม, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ฉันเป็นข้าราชการที่ทำงานนอกเวลาเพื่อความอยู่รอด ฉันถูกรถซิ่งชนขณะส่งของกลางดึก ความทรงจำเกี่ยวกับความตายของการถูกชนแล้วหนีนั้นรุนแรง แต่ ‘… … ฉันคือโชฮวี?’ ในบางจุดเขากลายเป็นลูกชายคนที่สองของห้อง Jo Ga-cheol ที่กำลังจะล่มสลาย ไม่มีอำนาจในการปล่อยนกที่บินลงมาหรืออำนาจที่จะทำตามความประสงค์ มีแต่หนี้ก้อนโตจะวินาศทั้งตระกูล อย่างไรก็ตามมีไม้เด็ดที่ไม่มีใครเคยมีประสบการณ์มาก่อน! “ท่านพ่อ โปรดส่งต่อห้องโจกาชอล” ช่วงเวลาแห่งความสำเร็จของคนยุคใหม่ที่ระดมทุกความรู้และประสบการณ์ของข้าราชการเริ่มต้นขึ้นแล้ว!!<br><br>Alternative Names: 무림에 떨어진 현대인 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 175 chapters |  |  |  |
| chapter dates | LINT | 174 of 175 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=174 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img3.sing-manga.com/.../6a960c3a9000awdXT3.jpg` (image/jpeg, 2360826 bytes, 760x15000) |  |  |  |
