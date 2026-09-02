# Extension Validation Report

- Extension: tachiyomi-th.mangastep-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4667424178290106010
- Source name: Mangastep
- Source language: th
- Selected manga input: popular offset 0: Solo Leveling (`.../solo-leveling`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Solo Leveling (`.../solo-leveling`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | My Gift LVL 9999 Unlimited Gacha (`.../my-gift-lvl-9999-unlimited-gacha`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Childhood Friend Complex (`.../childhood-friend-complex`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Glory Hole (`.../glory-hole`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Solo Leveling (`.../solo-leveling`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Solo Leveling (`.../solo-leveling`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 201 | ตอนที่ 0 (`.../solo-leveling-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 43 |  |  | 1-10s |

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
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action ต่อสู้, Adventure ผจญภัย, Drama ดราม่า, Fantasy แฟนตาซี, Shounen โชเน็น, Supernatural เหนือธรรมชาติ, จบแล้ว, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | อ่าน Solo Leveling โซโล่เลเวลลิ่ง แปลไทย เรื่องย่อของ Solo Leveling โซโล่เลเวลลิ่ง – 10 ปีก่อน ‘เกต’ ที่พาทะลุสู่อีกมิติหนึ่งได้เปิดขึ้น ภายในเกตมีมอนสเตอร์ตัวร้ายที่เหล่าผู้คนที่ถูกปลุกพลังจะต้องกำราบ คนเหล่านั้นได้รับการขนานนามว่า ‘ฮันเตอร์’ แต่ทว่า ไม่ใช่ฮันเตอร์ทุกคนที่จะแข็งแกร่ง ซองจินอู ผู้ได้รับฉายาว่าเป็นอาวุธที่กากที่สุดในมวลมนุษยชาติ คือฮันเตอร์แรงค์ E ที่แม้กระทั่งในดันเจี้ยนแรงค์ต่ำๆ ชีวิตเขาก็ยังแขวนบนเส้นด้าย แต่หลังจากที่ได้เข้าไปในดับเบิลดันเจี้ยนและรอดชีวิตกลับมา เขาก็เปลี่ยนไป จากฮันเตอร์ที่กากที่สุด เขาจะกลายเป็นผู้ที่แกร่งที่สุด! อ่านมังงะ อ่านการ์ตูน แปลไทยตอนล่าสุดได้ที่ Mangastep.com และติดตามมังงะอัปเดตใหม่ๆได้ที่ Facebook เพจ : Mangastep อ่าน Solo Leveling: Ragnarok ภาคต่อ ต่อได้ที่นี่ คลิ๊กเลย<br><br>Alternative Names: Jogador Solo, Na Honjaman Level-Up, Only I Level Up, Ore Dake Level Up na Ken, Upando Sozinho, Поднятие уровня в одиночку, Тільки я візьму новий рівень, تکرو, 俺だけレベルアップな件, 俺だけレベルアップな件〜外伝〜, 我独自升级, 나 혼자만 레벨업, 나혼렙 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 201 chapters |  |  |  |
| chapter dates | PASS | 201 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 43 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://bbb.webtoon168.com/.../f3d378c9c220e25e9d6bf8793a93be11.jpg` (image/jpeg, 49356 bytes, 720x956) |  |  |  |
