# Extension Validation Report

- Extension: tachiyomi-th.gomanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Selected manga input: popular offset 0: Nano Machine นาโนมาชิน (`.../nano-machine`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Nano Machine นาโนมาชิน (`.../nano-machine`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Solo Max-Level Newbie ผู้เล่นหน้าใหม่เลเวลแมกซ์ (`.../solo-max-level-newbie`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Pick Me Up, Infinite Gacha (`.../pick-me-up`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | The Divine Demon’s Grand Ascension เส้นทางชำระแค้นสู่เทวมารผู้พิชิตสวรรค์ (`.../divine-demon-ascension`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Nano Machine นาโนมาชิน (`.../nano-machine`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Nano Machine นาโนมาชิน (`.../nano-machine`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 336 | ตอนที่ 1 (`.../nano-machine-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nano Machine นาโนมาชิน, URL=`.../nano-machine` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.go-manga.com/.../Nano-Machine-1.jpg` (image/jpeg, 52421 bytes, 350x507) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../nano-machine` |  |  |  |
| details thumbnail URL | PASS | `https://www.go-manga.com/.../Nano-Machine-1.jpg` |  |  |  |
| details author | PASS | Great H, HANJUNG WOLYA |  |  |  |
| details artist | PASS | GGBG |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Harem, Historical, Martial arts, Mature, Romance, Sci-fi, Shounen, Supernatural, พระเอกเทพ, มังงะเกาหลี, ย้อนยุค, ระบบ, ศิลปะการต่อสู้-แอคชั่น, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | เรื่องย่อ Nano Machine นาโนมาชิน มังงะเกาหลีแปลไทย นาโนเทคโนโลยีพบกับศิลปะการต่อสู้ที่สถาบันมาชิน แม่ของยออุนอาจไม่ใช่หนึ่งในภรรยาที่เป็นทางการทั้งหกของมหาปุโรหิต แต่สายเลือดของบิดาของเขายังคงมีคุณสมบัติเหมาะสมสำหรับโอกาสที่เขาจะรับตำแหน่งนักบวชรอง การฉีดนาโนแมชชีนลึกลับจากผู้สืบเชื้อสายในอนาคตจะช่วยยออึนในการแข่งขันที่ดุเดือดกับพี่น้องที่มีอำนาจของเขาหรือไม่?<br><br>Alternative Names: <br>- El despiadado Demonio Celestial<br>- Nano Mashin<br>- Nano máquinas<br>- Nanotecnologia Marcial<br>- Ngã lão ma thần<br>- نانو ماشین<br>- นาโนมาชิน<br>- ナノ魔神<br>- 喇勞 魔神<br>- 喇勞魔神<br>- 奈米魔神<br>- 某天成为魔神<br>- 나노마� |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 336 chapters |  |  |  |
| chapter dates | PASS | 336 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.go-manga.com/.../127.jpg` (image/jpeg, 188796 bytes, 800x5020) |  |  |  |
