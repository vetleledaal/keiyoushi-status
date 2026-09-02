# Extension Validation Report

- Extension: tachiyomi-th.oremanga-v1.4.1
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
- Source ID: 2081564483403474647
- Source name: OreManga
- Source language: th
- Selected manga input: popular offset 0: Kaiju No.8 (`.../kaiju-no-8`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | Kaiju No.8 (`.../kaiju-no-8`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 16 | 365 Days to the Wedding (`.../365-days-to-the-wedding`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 16 | The Tutorial is Too Hard (`.../the-tutorial-is-too-hard`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | High Society (`.../High-Society`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Kaiju No.8 (`.../kaiju-no-8`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Kaiju No.8 (`.../kaiju-no-8`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 132 | ตอนที่ 1 (`.../kaiju-no-8-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 53 |  |  | <1s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kaiju No.8, URL=`.../kaiju-no-8` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.oremanga.net/.../KaijyuNo8.jpg` (image/jpeg, 108870 bytes, 500x701) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kaiju-no-8` |  |  |  |
| details thumbnail URL | PASS | `https://www.oremanga.net/.../KaijyuNo8.jpg` |  |  |  |
| details author | PASS | Matsumoto Naoya |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Horror, Manga, Sci-fi, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | สัตว์ประหลาดหน้าตาคล้ายก็อตซิลล่าที่เรียกว่า “ไคจู” ปรากฏตัวทั่วญี่ปุ่นมาหลายปี เพื่อต่อสู้กับสัตว์ร้ายเหล่านี้หน่วยทหารชั้นแนวหน้าที่รู้จักกันในชื่อ กองกำลังป้องกันต้องเสี่ยงชีวิตทุกวันเพื่อปกป้องพลเรือน เมื่อฆ่าสิ่งมีชีวิตแล้วก็ทิ้งไว้ให้ “สวีปเปอร์” ซึ่งทำงานภายใต้ชื่อบริษัทเก็บกวาดซากไคจู จัดการเก็บกวาดซากของมัน ฮิบิโนะ คาฟก้า ชายหนุ่มวัย 32 ปีไม่ชอบงานสวีปเปอร์ของตัวเอง ในวัยเด็กเขาฝันจะเข้าร่วมกองกำลังป้องกันและฆ่าไคจู แต่หลังจากพลาดไปหลายครั้งจึงล้มเลิกความฝันและถอดใจหันไปหางานธรรมดาที่จ่ายค่าแรงเหมาะสม ทว่าเมื่อมีเด็กหนุ่มวัย 18 ปีผู้มีความทะเยอทะยานนาม อิจิคาวะ เรโน่ เข้ามาร่วมทีมของเขาก็กระตุ้นความใฝ่ฝันของคาฟก้าที่จะเข้าร่วมกองทัพกลับมาอีกครั้ง ทว่าหลังผ่านเหตุการโชคร้าย ขณะที่กำลังพูดคุยกับสวีปเปอร์รุ่นน้อง คาฟก้าเผชิญหน้ากับปรสิตประเภทไคจูที่พุ่งเข้าไปในปากของเขา ทำให้เขากลายเป็นไคจู ด้วยพลังที่เพิ่งค้นพบ คาฟก้าจึงตั้งเป้าในความพยายามครั้งสุดท้ายเขาว่าจะปกป้องโลกนี้ให้ได้ด้วยพลังที่มีของเขา แต่โลกใบนี้จะต้องการไคจูแบบเขาอย่างนั้นหรอ? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 132 chapters |  |  |  |
| chapter dates | PASS | 132 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.oremanga.net/.../Upload-Kaiju-No.8-1-DH9JE.jpg` (image/jpeg, 189014 bytes, 822x1200) |  |  |  |
