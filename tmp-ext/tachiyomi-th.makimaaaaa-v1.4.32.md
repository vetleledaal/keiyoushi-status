# Extension Validation Report

- Extension: tachiyomi-th.makimaaaaa-v1.4.32
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
- Source ID: 6102454165244031412
- Source name: Makimaaaaa
- Source language: th
- Selected manga input: latest offset 0: Omniscient Reader (`.../omniscient-reader-%E0%B8%AD%E0%B9%88%E0%B8%B2%E0%B8%99%E0%B8%8A%E0%B8%B0%E0%B8%95%E0%B8%B2%E0%B8%A7%E0%B8%B1%E0%B8%99%E0%B8%AA%E0%B8%B4%E0%B9%89%E0%B8%99%E0%B9%82%E0%B8%A5%E0%B8%81`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | A Returner’s Magic Should Be Special (`.../a-returners-magic-should-be-special`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | I’m an Evil God (`.../im-an-evil-god`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Omniscient Reader (`.../omniscient-reader-%E0%B8%AD%E0%B9%88%E0%B8%B2%E0%B8%99%E0%B8%8A%E0%B8%B0%E0%B8%95%E0%B8%B2%E0%B8%A7%E0%B8%B1%E0%B8%99%E0%B8%AA%E0%B8%B4%E0%B9%89%E0%B8%99%E0%B9%82%E0%B8%A5%E0%B8%81`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | The Return of the Disaster-Class Hero (`.../the-return-of-the-disaster-class-hero`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Omniscient Reader (`.../omniscient-reader-%E0%B8%AD%E0%B9%88%E0%B8%B2%E0%B8%99%E0%B8%8A%E0%B8%B0%E0%B8%95%E0%B8%B2%E0%B8%A7%E0%B8%B1%E0%B8%99%E0%B8%AA%E0%B8%B4%E0%B9%89%E0%B8%99%E0%B9%82%E0%B8%A5%E0%B8%81`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Omniscient Reader (`.../omniscient-reader-%E0%B8%AD%E0%B9%88%E0%B8%B2%E0%B8%99%E0%B8%8A%E0%B8%B0%E0%B8%95%E0%B8%B2%E0%B8%A7%E0%B8%B1%E0%B8%99%E0%B8%AA%E0%B8%B4%E0%B9%89%E0%B8%99%E0%B9%82%E0%B8%A5%E0%B8%81`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 255 | ตอนที่ 0 (`.../omniscient-reader-%E0%B8%AD%E0%B9%88%E0%B8%B2%E0%B8%99%E0%B8%8A%E0%B8%B0%E0%B8%95%E0%B8%B2%E0%B8%A7%E0%B8%B1%E0%B8%99%E0%B8%AA%E0%B8%B4%E0%B9%89%E0%B8%99%E0%B9%82%E0%B8%A5%E0%B8%81%E0%B8%95%E0%B8%AD`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 64 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Omniscient Reader, URL=`.../omniscient-reader-%E0%B8%AD%E0%B9%88%E0%B8%B2%E0%B8%99%E0%B8%8A%E0%B8%B0%E0%B8%95%E0%B8%B2%E0%B8%A7%E0%B8%B1%E0%B8%99%E0%B8%AA%E0%B8%B4%E0%B9%89%E0%B8%99%E0%B9%82%E0%B8%A5%E0%B8%81` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 122/122 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 122/122 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://makimaaaaa.com/.../Omniscient-Reader-2-226x300.jpg` (image/jpeg, 13234 bytes, 226x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../omniscient-reader-%E0%B8%AD%E0%B9%88%E0%B8%B2%E0%B8%99%E0%B8%8A%E0%B8%B0%E0%B8%95%E0%B8%B2%E0%B8%A7%E0%B8%B1%E0%B8%99%E0%B8%AA%E0%B8%B4%E0%B9%89%E0%B8%99%E0%B9%82%E0%B8%A5%E0%B8%81` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://makimaaaaa.com/.../Omniscient-Reader-2.jpg` (image/jpeg, 197548 bytes, 564x749) |  |  |  |
| details author | PASS | sing N song, UMI (i) |  |  |  |
| details artist | PASS | Redice Studio, Sleepy-C |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Manhwa มังฮวา, Psychological, Shounen, Supernatural, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | อ่านเรื่อง Omniscient Reader อ่านชะตาวันสิ้นโลก มังงะ อ่านมังงะ อ่านการ์ตูน การ์ตูน อนิเมะ มังฮวา มังฮัว อ่านมังฮวา มังงะเกาหลี มังงะญี่ปุ่น มังงะจีน เว็บอ่านมังงะ ดกจาเป็นพนักงานออฟฟิศทั่วไปที่มีความสนใจเพียงเรื่องเดียวในการอ่านนวนิยายบนเว็บเรื่องโปรดของเขา ‘Three Ways to Survive the Apocalypse’ แต่เมื่อนวนิยายกลายเป็นความจริง เขาเป็นคนเดียวที่รู้ว่าโลกจะจบลงอย่างไร ด้วยความเข้าใจนี้ ทกจาจึงใช้ความเข้าใจของเขาในการเปลี่ยนเส้นทางของเรื่องราวและโลกตามที่เขารู้<br><br>Alternative Names: Omniscient Reader, Der allwissende Leser, Lecteur omniscient, Lector omnisciente, Omniscient Reader's Point of View, Omniscient Reader's Viewpoint, Ponto De Vista De um Leitor Onisciente, Punto De Vista De Lector Omnisciente, Toàn trí độc giả, อ่านชะตาวันสิ้นโลก, 全知的な読者の視点から, 全知的讀者時點, 全知讀者視角, 全知读者, 全知读者视角, 全讀時, 전독시, 전지적 독자 시점, 전지적독자시점 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 255 chapters |  |  |  |
| chapter dates | PASS | 255 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 64 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://bbb.webtoon168.com/.../omniscient-reader-13-8-65-00001.webp` (image/jpeg, 26560 bytes, 800x1000; server Content-Type: image/webp) |  |  |  |
