# Extension Validation Report

- Extension: tachiyomi-th.nekopost-v1.4.15
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
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
- Selected manga input: latest offset 0: Love Comedy Manga ni Haitte​ shimatta node, Oshi no Make Heroine wo Zenryoku de Shiawase ni Suru - ในเมื่อผมหลุดเข้ามาในมังงะเลิฟคอม, ผมจะพยายาม​สุดกําลังเพื่อให้นางรองที่ไม่สมหวังมีความสุข (`.../11959`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 5 | ไหงการทะลุมิติของผมหลังเวลตันดันเป็นนักบวชหญิงล่ะ (`.../14278`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 15 | Love Comedy Manga ni Haitte​ shimatta node, Oshi no Make Heroine wo Zenryoku de Shiawase ni Suru - ในเมื่อผมหลุดเข้ามาในมังงะเลิฟคอม, ผมจะพยายาม​สุดกําลังเพื่อให้นางรองที่ไม่สมหวังมีความสุข (`.../11959`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | โมมิจิ & โควโยะ (`.../17824`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Love Comedy Manga ni Haitte​ shimatta node, Oshi no Make Heroine wo Zenryoku de Shiawase ni Suru - ในเมื่อผมหลุดเข้ามาในมังงะเลิฟคอม, ผมจะพยายาม​สุดกําลังเพื่อให้นางรองที่ไม่สมหวังมีความสุข (`.../11959`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Love Comedy Manga ni Haitte​ shimatta node, Oshi no Make Heroine wo Zenryoku de Shiawase ni Suru - ในเมื่อผมหลุดเข้ามาในมังงะเลิฟคอม, ผมจะพยายาม​สุดกําลังเพื่อให้นางรองที่ไม่สมหวังมีความสุข (`.../11959`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 10 | ตอนที่ 1 (`.../11959_125896.json`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 31 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Love Comedy Manga ni Haitte​ shimatta node, Oshi no Make Heroine wo Zenryoku de Shiawase ni Suru - ในเมื่อผมหลุดเข้ามาในมังงะเลิฟคอม, ผมจะพยายาม​สุดกําลังเพื่อให้นางรองที่ไม่สมหวังมีความสุข, URL=`11959` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Love Comedy Manga ni Haitte​ shimatta node, Oshi no Make Heroine wo Zenryoku de Shiawase ni Suru - ในเมื่อผมหลุดเข้ามาในมังงะเลิฟคอม, ผมจะพยายาม​สุดกําลังเพื่อให้นางรองที่ไม่สมหวังมีความสุข, URL=`11959` at page 1 offset 0 and page 2 offset 6, title=SCP ฉบับเข้าใจง่ายๆ, URL=`5728` at page 1 offset 5 and page 2 offset 8 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 36/36 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 36/36 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.osemocphoto.com/.../11959_cover.jpg <redacted query values: ver>` (image/jpeg, 16255 bytes, 260x299) |  |  |  |
| details identity | PASS | Details preserved selected URL `11959` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.osemocphoto.com/.../11959_cover.jpg` (image/jpeg, 16255 bytes, 260x299) |  |  |  |
| details author | PASS | Shiryu |  |  |  |
| details artist | PASS | Shiharu |  |  |  |
| details genres | PASS | Comedy, Romance, School Life, Shounen, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "เธอคนนี้คือนางรองที่ไม่สมหวังเหรอ? งั้นฉันจะทําให้เธอมีความสุขยิ่งกว่าใครเอง!!" อยู่มาวันนึงผมถูกรถบรรทุกชน​ พอรู้สึกตัวอีกทีผมก็กลายเป็น​ ฮิซามูระ​ สึคาสะ​ เพื่อนสนิทของตัวเอกมังงะเลิฟคอมเมดี้​ที่ผมเคยอ่านไปเเล้ว อา​ นี่คงจะเป็นฝันสินะ​ เเละคนที่อยู่ต่อหน้าผมก็คือ​ ชิมาดะ​ เซย์​ ตัวละครที่ผมชอบเเละยังเป็นนางรองที่จะไม่มีวันสมหวังอีก.. "ชอบนะ" หลังจากพอใจที่ได้บอกรักกับตัวละครที่ชอบ​ ผมกลับตื่นจากฝันนี่ไม่ได้..!? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.osemocphoto.com/.../125896_20220927070706_1.jpg` (image/jpeg, 121728 bytes, 652x936) |  |  |  |
