# Extension Validation Report

- Extension: tachiyomi-th.bullymanga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 916548575565854572
- Source name: Bully Manga
- Source language: th
- Selected manga input: popular offset 0: Chainsaw Man (`.../chainsaw-man`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Chainsaw Man (`.../chainsaw-man`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Shangri-La Frontier เมื่อนักล่าเกมขยะท้าสู้ในเกมเทพ (`.../shangri-la-frontier`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | The Beginning After the End (`.../beginning-after-the-end`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Chainsaw Man (`.../chainsaw-man`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Chainsaw Man (`.../chainsaw-man`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 239 | ตอนที่ 1 (`.../chainsaw-man-ep0001`) |  | <1s |
| pages | `getPageList(chapter)` | success | 56 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chainsaw Man, URL=`.../chainsaw-man` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bully-manga.com/.../chainsaw-man-cover.jpg` (image/jpeg, 230803 bytes, 720x1034) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../chainsaw-man` |  |  |  |
| details thumbnail URL | PASS | `https://bully-manga.com/.../chainsaw-man-cover.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ต่อสู้, ดราม่า, แฟนตาซี, จิตวิทยา, โชเน็น, เหนือธรรมชาติ, ดาร์กแฟนตาซี, ตลก, ลึกลับ, โศกนาฏกรรม, มังงะ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | หากคุณกำลังมองหามังงะที่เต็มไปด้วยความตื่นเต้นและอารมณ์ที่หลากหลาย มิได้มีอะไรดีไปกว่า Chainsaw Man เด็นจิ เด็กหนุ่มที่ต้องต่อสู้กับปิศาจในโลกที่โหดร้าย ด้วยการเป็นพันธมิตรกับโปจิตะ ปิศาจเลื่อยยนต์ การผจญภัยของเขาจะเปลี่ยนชีวิตจากตกต่ำสู่การเป็นนักล่าปิศาจของทางการ  <br><br>Chainsaw Man นำเสนอเรื่องราวที่เข้มข้นและน่าติดตาม ด้วยกราฟิกที่สวยงามและการพัฒนาตัวละครที่น่าสนใจ คุณจะได้สัมผัสถึงความต่อเนื่องของการต่อสู้ ความสูญเสีย และมิตรภาพที่ยั่งยืน ซึ่งทำให้ผู้อ่านได้รู้สึกถึงอารมณ์ที่ลึกซึ้ง  <br><br>หากคุณต้องการสัมผัสประสบการณ์อ่านมังงะที่ไม่เหมือนใคร เข้าสู่โลกของ Chainsaw Man วันนี้ สนุกสนานและดำดิ่งสู่การผจญภัยสุดระทึกได้ที่ thebullyproject.com รับรองว่าจะไม่ทำให้ผิดหวัง! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 239 chapters |  |  |  |
| chapter dates | LINT | All 239 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=239 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../chainsaw-man-ep0132` at offsets 100, 101, `.../chainsaw-man-ep0075` at offsets 159, 160, `.../chainsaw-man-ep0074` at offsets 161, 162, `.../chainsaw-man-ep0073` at offsets 163, 164, `.../chainsaw-man-ep0072` at offsets 165, 166, `.../chainsaw-man-ep0071` at offsets 167, 168 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://bully-manga.com/.../1` to `https://bully-manga.com/.../all` (1 redirects) |  |  |  |
| page load | PASS | `https://bully-manga.com/.../chainsaw-man-ep0001_1.jpg` (image/jpeg, 50909 bytes, 720x1053) |  |  |  |
