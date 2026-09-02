# Extension Validation Report

- Extension: tachiyomi-th.gomanga-v1.4.32
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
- Source ID: 748167751985747523
- Source name: Go Manga
- Source language: th
- Selected manga input: popular offset 0: Nano Machine นาโนมาชิน (`.../nano-machine`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Nano Machine นาโนมาชิน (`.../nano-machine`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | God-level Assassin, I Am the Shadow นักฆ่าระดับเทพ ข้าคือเงามืด (`.../god-level-assassin`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | I Became The Rogue First Prince เทพดาบอย่างข้าดันกลายเป็นองค์ชายสวะซะงั้น (`.../became-rogue-first-prince`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Reincarnator’s Stream การไลฟ์สดของผู้หวนคืน (`.../reincarnators-stream`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Nano Machine นาโนมาชิน (`.../nano-machine`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Nano Machine นาโนมาชิน (`.../nano-machine`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 326 | ตอนที่ 1 (`.../nano-machine-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Harem, Historical, Martial arts, Mature, Romance, Sci-fi, Shounen, Supernatural, พระเอกเทพ, มังงะเกาหลี, ย้อนยุค, ระบบ, ศิลปะการต่อสู้-แอคชั่น, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | เรื่องย่อ Nano Machine นาโนมาชิน มังงะเกาหลีแปลไทย นาโนเทคโนโลยีพบกับศิลปะการต่อสู้ที่สถาบันมาชิน แม่ของยออุนอาจไม่ใช่หนึ่งในภรรยาที่เป็นทางการทั้งหกของมหาปุโรหิต แต่สายเลือดของบิดาของเขายังคงมีคุณสมบัติเหมาะสมสำหรับโอกาสที่เขาจะรับตำแหน่งนักบวชรอง การฉีดนาโนแมชชีนลึกลับจากผู้สืบเชื้อสายในอนาคตจะช่วยยออึนในการแข่งขันที่ดุเดือดกับพี่น้องที่มีอำนาจของเขาหรือไม่?<br><br>Alternative Names: El despiadado Demonio Celestial, Nano Mashin, Nano máquinas, Nanotecnologia Marcial, Ngã lão ma thần, نانو ماشین, นาโนมาชิน, ナノ魔神, 喇勞 魔神, 喇勞魔神, 奈米魔神, 某天成为魔神, 나노마� |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 326 chapters |  |  |  |
| chapter dates | LINT | All 326 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=326 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.go-manga.com/.../127.jpg` (image/jpeg, 188796 bytes, 800x5020) |  |  |  |
