# Extension Validation Report

- Extension: tachiyomi-th.onemanga-v1.4.33
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
- Source ID: 2248402620929558947
- Source name: MangaBlackCat
- Source language: th
- Selected manga input: popular offset 0: Wazawai no Avalon ~Game Saijaku no Akuyaku Debu ni Ten’i Shita kedo, Ore dake “Yasereba Tsuyokute New Game” na Sekai datta no de, Saisoku Level Up & Hametsu Flag Kaihi de Kage no Eiyuu wo Mezashimasu~ อวาลอนแห่งหายนะ เกิดใหม่เป็นตัวร้ายสุดอ้วนที่อ่อนแอที่ (`.../wazawai-no-avalon-game-saijaku-no-akuyaku-debu-ni-teni-shita-kedo-ore-dake-yasereba-tsuyokute-new-game-na-sekai-datta-no-de-saisoku-level-up-hametsu-flag-kaihi-de-kage-no-eiyuu-wo-mezashimasu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 60 | Wazawai no Avalon ~Game Saijaku no Akuyaku Debu ni Ten’i Shita kedo, Ore dake “Yasereba Tsuyokute New Game” na Sekai datta no de, Saisoku Level Up & Hametsu Flag Kaihi de Kage no Eiyuu wo Mezashimasu~ อวาลอนแห่งหายนะ เกิดใหม่เป็นตัวร้ายสุดอ้วนที่อ่อนแอที่ (`.../wazawai-no-avalon-game-saijaku-no-akuyaku-debu-ni-teni-shita-kedo-ore-dake-yasereba-tsuyokute-new-game-na-sekai-datta-no-de-saisoku-level-up-hametsu-flag-kaihi-de-kage-no-eiyuu-wo-mezashimasu`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 60 | Anta to Osananajimitte dake demo Iyananoni! ~Zekkou kara Hajimaru S-kyuu Bishoujo to no Gakuen Nariagari Seikatsu~ แค่ต้องเป็นเพื่อนสมัยเด็กกับนายนี่มันก็น่าขยะแขยงอยู่แล้ว จากจุดแตกหักสู่การเริ่มต้นชีวิตใหม่ในรั้วโรงเรียนกับสาวสวยระดับ S (`.../anta-to-osananajimitte-dake-demo-iyananoni-zekkou-kara-hajimaru-s-kyuu-bishoujo-to-no-gakuen-nariagari-seikatsu-s`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 60 | Murim Psychopath ไซโคพาธต้องห้ามแห่งยุทธภพ (`.../murim-psychopath-%E0%B9%84%E0%B8%8B%E0%B9%82%E0%B8%84%E0%B8%9E%E0%B8%B2%E0%B8%98%E0%B8%95%E0%B9%89%E0%B8%AD%E0%B8%87%E0%B8%AB%E0%B9%89%E0%B8%B2%E0%B8%A1%E0%B9%81%E0%B8%AB%E0%B9%88%E0%B8%87%E0%B8%A2%E0%B8%B8%E0%B8%97%E0%B8%98%E0%B8%A0%E0%B8%9E`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 60 | The Regressed Son of a Duke is an Assassin ลูกชายคนเล็กของดยุกคือมือสังหาร (`.../the-regressed-son-of-a-duke-is-an-assassin`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | Wazawai no Avalon ~Game Saijaku no Akuyaku Debu ni Ten’i Shita kedo, Ore dake “Yasereba Tsuyokute New Game” na Sekai datta no de, Saisoku Level Up & Hametsu Flag Kaihi de Kage no Eiyuu wo Mezashimasu~ อวาลอนแห่งหายนะ เกิดใหม่เป็นตัวร้ายสุดอ้วนที่อ่อนแอที่ (`.../wazawai-no-avalon-game-saijaku-no-akuyaku-debu-ni-teni-shita-kedo-ore-dake-yasereba-tsuyokute-new-game-na-sekai-datta-no-de-saisoku-level-up-hametsu-flag-kaihi-de-kage-no-eiyuu-wo-mezashimasu`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Wazawai no Avalon ~Game Saijaku no Akuyaku Debu ni Ten’i Shita kedo, Ore dake “Yasereba Tsuyokute New Game” na Sekai datta no de, Saisoku Level Up & Hametsu Flag Kaihi de Kage no Eiyuu wo Mezashimasu~ อวาลอนแห่งหายนะ เกิดใหม่เป็นตัวร้ายสุดอ้วนที่อ่อนแอที่ (`.../wazawai-no-avalon-game-saijaku-no-akuyaku-debu-ni-teni-shita-kedo-ore-dake-yasereba-tsuyokute-new-game-na-sekai-datta-no-de-saisoku-level-up-hametsu-flag-kaihi-de-kage-no-eiyuu-wo-mezashimasu`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 90 | ตอนที่ 1 (`.../1.0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 61 |  |  | <1s |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Wazawai no Avalon ~Game Saijaku no Akuyaku Debu ni Ten’i Shita kedo, Ore dake “Yasereba Tsuyokute New Game” na Sekai datta no de, Saisoku Level Up & Hametsu Flag Kaihi de Kage no Eiyuu wo Mezashimasu~ อวาลอนแห่งหายนะ เกิดใหม่เป็นตัวร้ายสุดอ้วนที่อ่อนแอที่, URL=`.../wazawai-no-avalon-game-saijaku-no-akuyaku-debu-ni-teni-shita-kedo-ore-dake-yasereba-tsuyokute-new-game-na-sekai-datta-no-de-saisoku-level-up-hametsu-flag-kaihi-de-kage-no-eiyuu-wo-mezashimasu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 260/260 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 260/260 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangablackcat.com/.../01KSHQHWPSMF82FQDFZGEQ8ZFX-large.webp` (image/webp (encoding: lossy), 58130 bytes, 400x570) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../wazawai-no-avalon-game-saijaku-no-akuyaku-debu-ni-teni-shita-kedo-ore-dake-yasereba-tsuyokute-new-game-na-sekai-datta-no-de-saisoku-level-up-hametsu-flag-kaihi-de-kage-no-eiyuu-wo-mezashimasu` |  |  |  |
| details thumbnail URL | PASS | `https://mangablackcat.com/.../01KSHQHWPSMF82FQDFZGEQ8ZFX-large.webp` |  |  |  |
| details author | PASS | NARUSAWA Akito |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | อ่านเรื่องย่อมังงะแฟนตาซีเกิดใหม่สุดเอ็กซ์คลูซีฟ “Wazawai no Avalon” (อวาลอนแห่งหายนะ) เรื่องราวของเกมเมอร์หนุ่มผู้เสพติดเกมออนไลน์แนว RPG ชื่อดังระดับตำนาน แต่จู่ ๆ เขากลับตื่นขึ้นมาในร่างของ &quot;เทนโจ นารุกามิ&quot; (Tenjou Narukami) ตัวละครอ้วนท้วนสมบูรณ์ที่เป็นทั้งตัวตลกและตัวร้ายที่อ่อนแอที่สุดในเกม ซึ่งมีจุดจบดวงกุดต้องเผชิญกับ ธงหายนะ (Destruction Flag) ถูกไล่ออกจากตระกูลขุนนางและต้องจบชีวิตลงอย่างอนาถตามเนื้อเรื่องเดิมแต่ในความโชคร้ายของ มังงะต่างโลก (Isekai Manga) เรื่องนี้ยังมีสูตรโกงซ่อนอยู่! เพราะเขาเป็นคนเดียวในโลกที่รู้ความลับสุดยอดของระบบเกมว่า ตัวละครอ้วนฉุคนนี้หากสามารถ &quot;ลดน้ำหนักได้สำเร็จ&quot; ค่าสถานะและพลังแฝงจะอัปเกรดกลายร่างเป็นโหมด &quot;ตัวละครสุดเทพ (Overpowered)&quot; ทันที! ด้วยความรู้ข้อมูลเกมที่แน่นปึ้กในฐานะผู้เล่นระดับท็อป เขาจึงเริ่มต้นแผนการจำกัดแคลอรีควบคู่ไปกับ การฟาร์มเลเวลอย่างรวดเร็ว (Fastest Level Up) ในดันเจี้ยนสถานศึกษาเพื่อเปลี่ยนไขมันให้กลายเป็นพลังเวทมนตร์อันมหาศาลจากไอ้อ้วนจอมลามกที่คนทั้งโรงเรียนขยาด สู่การปฏิวัติตัวเองครั้งยิ่งใหญ่เพื่อหลีกเลี่ยงจุดจบแห่งความตาย และก้าวขึ้นสู่การเป็น &quot;ฮีโร่ในเงามืด&quot; (Shadow Hero) ที่คอยปกป้องโลกยุคโมเดิร์นแฟนตาซีนี้ไว้! มาร่วมลุ้นไปกับภารกิจลดน้ำหนักกู้โลกและฟาร์มความเท่ฉบับสปีดรันในมังงะแนว เกิดใหม่เป็นตัวร้าย ที่สนุกจนหยุดอ่านไม่ได้เรื่องนี้กันครับ! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 90 chapters |  |  |  |
| chapter dates | LINT | All 90 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=90 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 61 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.mangablackcat.com/.../001.webp` (image/webp (encoding: lossy), 128028 bytes, 800x1142) |  |  |  |
