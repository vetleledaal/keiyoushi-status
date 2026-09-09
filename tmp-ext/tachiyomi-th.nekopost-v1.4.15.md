# Extension Validation Report

- Extension: tachiyomi-th.nekopost-v1.4.15
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 1
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4353470354941192417
- Source name: Nekopost
- Source language: th
- Selected manga input: popular offset 0: ไหงการทะลุมิติของผมหลังเวลตันดันเป็นนักบวชหญิงล่ะ (`.../14278`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 5 | ไหงการทะลุมิติของผมหลังเวลตันดันเป็นนักบวชหญิงล่ะ (`.../14278`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 15 | รุ่นพี่ไฮมิยะน่ากลัวแต่น่ารัก (`.../15247`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | [18+] ยูริกโกะ Urikko (`.../16969`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ไหงการทะลุมิติของผมหลังเวลตันดันเป็นนักบวชหญิงล่ะ (`.../14278`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | ไหงการทะลุมิติของผมหลังเวลตันดันเป็นนักบวชหญิงล่ะ (`.../14278`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 107 | ตอนที่ 1 - นายท่านอยากขี่ข้าหรือคะ? (`.../14278_157015.json`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 33 |  |  | <1s |

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
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ไหงการทะลุมิติของผมหลังเวลตันดันเป็นนักบวชหญิงล่ะ, URL=`14278` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Love Comedy Manga ni Haitte​ shimatta node, Oshi no Make Heroine wo Zenryoku de Shiawase ni Suru - ในเมื่อผมหลุดเข้ามาในมังงะเลิฟคอม, ผมจะพยายาม​สุดกําลังเพื่อให้นางรองที่ไม่สมหวังมีความสุข, URL=`11959` at page 1 offset 4 and page 2 offset 13, title=รุ่นพี่ที่ทำงานเป็นคนแปลก ๆ, URL=`17953` at page 1 offset 5 and page 2 offset 14 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 36/36 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 36/36 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.osemocphoto.com/.../14278_cover.jpg <redacted query values: ver>` (image/jpeg, 13522 bytes, 211x299) |  |  |  |
| details identity | PASS | Details preserved selected URL `14278` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.osemocphoto.com/.../14278_cover.jpg` (image/jpeg, 13522 bytes, 211x299) |  |  |  |
| details author | PASS | 清酒浅辄 |  |  |  |
| details artist | PASS | 二三玖陆工作室 |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Gender Bender, Mystery, Yuri |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ผู้เล่นยอดฝีมือบังเอิญทะลุมิติกลายเป็นตัวละครในเกมที่ตัวเองเล่นในฐานะนักบวชหญิงขั้นเทพ พร้อมกับสาวเมดมังกรสู่การผจญภัยในโลกแฟนตาซี! ว่าแต่ว่า...ทำไมสายตาของเหล่าผู้หญิงที่มองมาทางเธอถึงดูแปลกขึ้นทุกทีเนี่ย! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 107 chapters |  |  |  |
| chapter dates | PASS | 107 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.osemocphoto.com/.../157015_20240827081626_1.jpg` (image/jpeg, 37910 bytes, 800x914) |  |  |  |
