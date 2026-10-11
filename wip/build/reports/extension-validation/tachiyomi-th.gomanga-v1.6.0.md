# Extension Validation Report

- Extension: tachiyomi-th.gomanga-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 748167751985747523
- Source name: Go Manga
- Source language: th
- Selected manga input: latest offset 0: Regression of the Yong Clan Heir การกลับมาของคุณชายแห่งเทียนจง (`.../regression-yong-clan-heir`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Nano Machine นาโนมาชิน (`.../nano-machine`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Magic Academy’s Genius Blinker ฉันกลายเป็นอัจฉริยะการบลิ๊งค์ในสถาบันเวทมนตร์ (`.../magic-academys-blinker`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Regression of the Yong Clan Heir การกลับมาของคุณชายแห่งเทียนจง (`.../regression-yong-clan-heir`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Juvenile Prison เยาวชนคนคุก (`.../juvenile-prison`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Regression of the Yong Clan Heir การกลับมาของคุณชายแห่งเทียนจง (`.../regression-yong-clan-heir`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Regression of the Yong Clan Heir การกลับมาของคุณชายแห่งเทียนจง (`.../regression-yong-clan-heir`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 61 | ตอนที่ 1 (`.../regression-yong-clan-heir-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Regression of the Yong Clan Heir การกลับมาของคุณชายแห่งเทียนจง, URL=`.../regression-yong-clan-heir` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.go-manga.com/.../Regression-of-the-Yong-Clan-Heir.jpg` (image/jpeg, 49297 bytes, 350x475) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../regression-yong-clan-heir` |  |  |  |
| details thumbnail URL | PASS | `https://www.go-manga.com/.../Regression-of-the-Yong-Clan-Heir.jpg` |  |  |  |
| details author | PASS | Kim eun, Monarca |  |  |  |
| details artist | PASS | MUKJI |  |  |  |
| details genres | PASS | Action, Drama, Fantasy, Martial arts, Shounen, ดราม่า, ตลก, พระเอกเกิดใหม่, พระเอกเทพ, มังงะเกาหลี, ศิลปะการต่อสู้-แอคชั่น, แฟนตาซี, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | เรื่องย่อ Regression of the Yong Clan Heir การกลับมาของคุณชายแห่งเทียนจง มังงะเกาหลีแปลไทย Hwalin Yong อดีตทายาทผู้พังทลายของนิกายนักรบที่ล่มสลาย ถูกผลักย้อนเวลากลับไป แต่เขาไม่ได้อยู่เพียงลำพัง ความมืดมิดมหึมายังคงวนเวียนอยู่ในห้วงความคิด คอยกระซิบกระซาบรอการครอบครองเขา ฮวาลินจะต้านทานแรงดึงดูดนั้นได้หรือไม่ หรือเขาจะยอมจำนนต่อเงามืด? เมื่อการต่อสู้ภายในทวีความรุนแรงขึ้น เขาได้ค้นพบพลังที่ซ่อนเร้น ซึ่งอาจเปลี่ยนแปลงโชคชะตาของเขาและนิกายของเขาได้<br><br>Alternative Names: <br>- 天中龍門<br>- 天中龙门<br>- 天中龍門<br>- 천중용문<br>- Regression of the Yong Clan Heir<br>- การกลับมาของคุณชายแห่งเทียนจง |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 61 chapters |  |  |  |
| chapter dates | PASS | 61 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.go-manga.com/.../Regression101.jpg` (image/jpeg, 615135 bytes, 690x7285) |  |  |  |
