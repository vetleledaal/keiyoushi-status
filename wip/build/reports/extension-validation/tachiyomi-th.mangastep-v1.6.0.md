# Extension Validation Report

- Extension: tachiyomi-th.mangastep-v1.6.0
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
- Source ID: 4667424178290106010
- Source name: Mangastep
- Source language: th
- Selected manga input: popular offset 0: Solo Leveling (`.../solo-leveling`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Solo Leveling (`.../solo-leveling`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Absolute Hypnosis in Another World (`.../absolute-hypnosis-in-another-world`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Killer Peter (`.../killer-peter`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Moby Dick (`.../moby-dick`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Solo Leveling (`.../solo-leveling`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Solo Leveling (`.../solo-leveling`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 201 | ตอนที่ 0 (`.../solo-leveling-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 43 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Solo Leveling, URL=`.../solo-leveling` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 122/122 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 122/122 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangastep.com/.../sololeveling-200x300.jpg` (image/jpeg, 18500 bytes, 200x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../solo-leveling` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangastep.com/.../sololeveling.jpg` (image/jpeg, 162389 bytes, 960x1440) |  |  |  |
| details author | PASS | Chugong, H-goon, KI Soryeong |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action ต่อสู้, Adventure ผจญภัย, Drama ดราม่า, Fantasy แฟนตาซี, Shounen โชเน็น, Supernatural เหนือธรรมชาติ, จบแล้ว, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | อ่าน Solo Leveling โซโล่เลเวลลิ่ง แปลไทย เรื่องย่อของ Solo Leveling โซโล่เลเวลลิ่ง – 10 ปีก่อน ‘เกต’ ที่พาทะลุสู่อีกมิติหนึ่งได้เปิดขึ้น ภายในเกตมีมอนสเตอร์ตัวร้ายที่เหล่าผู้คนที่ถูกปลุกพลังจะต้องกำราบ คนเหล่านั้นได้รับการขนานนามว่า ‘ฮันเตอร์’ แต่ทว่า ไม่ใช่ฮันเตอร์ทุกคนที่จะแข็งแกร่ง ซองจินอู ผู้ได้รับฉายาว่าเป็นอาวุธที่กากที่สุดในมวลมนุษยชาติ คือฮันเตอร์แรงค์ E ที่แม้กระทั่งในดันเจี้ยนแรงค์ต่ำๆ ชีวิตเขาก็ยังแขวนบนเส้นด้าย แต่หลังจากที่ได้เข้าไปในดับเบิลดันเจี้ยนและรอดชีวิตกลับมา เขาก็เปลี่ยนไป จากฮันเตอร์ที่กากที่สุด เขาจะกลายเป็นผู้ที่แกร่งที่สุด! อ่านมังงะ อ่านการ์ตูน แปลไทยตอนล่าสุดได้ที่ Mangastep.com และติดตามมังงะอัปเดตใหม่ๆได้ที่ Facebook เพจ : Mangastep อ่าน Solo Leveling: Ragnarok ภาคต่อ ต่อได้ที่นี่ คลิ๊กเลย<br><br>Alternative Names: <br>- Jogador Solo<br>- Na Honjaman Level-Up<br>- Only I Level Up<br>- Ore Dake Level Up na Ken<br>- Upando Sozinho<br>- Поднятие уровня в одиночку<br>- Тільки я візьму новий рівень<br>- تکرو<br>- 俺だけレベルアップな件<br>- 俺だけレベルアップな件〜外伝〜<br>- 我独自升级<br>- 나 혼자만 레벨업<br>- 나혼렙 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 201 chapters |  |  |  |
| chapter dates | PASS | 201 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 43 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://bbb.webtoon168.com/.../f3d378c9c220e25e9d6bf8793a93be11.jpg` (image/jpeg, 49356 bytes, 720x956) |  |  |  |
