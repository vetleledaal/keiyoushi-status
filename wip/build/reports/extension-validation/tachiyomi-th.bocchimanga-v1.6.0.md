# Extension Validation Report

- Extension: tachiyomi-th.bocchimanga-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1188327600687907060
- Source name: BocchiManga
- Source language: th
- Selected manga input: popular offset 0: Martial Streamer (`.../martial-streamer.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Martial Streamer (`.../martial-streamer.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Martial Streamer (`.../martial-streamer.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Streamer (`.../martial-streamer.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 29 | ตอนที่ 1 (`.../1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 102 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Streamer, URL=`.../martial-streamer.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 19/19 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 19/19 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../b599194c-ad55-425f-b49e-5cf47eeddd80.jpg` (image/jpeg, 439492 bytes, 1127x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../martial-streamer.html` |  |  |  |
| details thumbnail URL | PASS | `https://blogger.googleusercontent.com/.../b599194c-ad55-425f-b49e-5cf47eeddd80.jpg` |  |  |  |
| details author | PASS | Buksam, Go Ha Som |  |  |  |
| details artist | PASS | Working Brain Please |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Martial Arts, Reincarnation |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★★☆ 7.81<br><br>แทมินเป็นนักเรียนที่ใช้เวลาว่างหนึ่งปีในการพยายามเป็นยูทูบเบอร์ เขาถูกไฟช็อตจนเสียชีวิต อย่างไรก็ตาม เขากลับชาติมาเกิดใหม่เป็นจ่าวกาฮุยในโลกแห่งศิลปะการต่อสู้ พร้อมความสามารถในการถ่ายทอดสด! ด้วยความสามารถพิเศษที่สามารถเข้าถึงยูทูบได้เมื่อเขาหลับตา เขาจึงเริ่มถ่ายทอดสดชีวิตประจำวันของเขาในจีนโบราณ โดยมีเป้าหมายที่จะเป็นพ่อค้าและนักศิลปะการต่อสู้ที่เก่งกาจที่สุด!<br><br>**Alternative Names:**<br>- Murim is On-Air!<br>- 잘 보이는 무림티비<br>- Jal Boineun Murim TV |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 29 chapters |  |  |  |
| chapter dates | PASS | 29 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 102 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../%E0%B9%84%E0%B8%A1%E0%B9%88%E0%B8%A1%E0%B8%B5%E0%B8%8A%E0%B8%B7%E0%B9%88%E0%B8%AD%2031_20241124001822.jpg` (image/webp (container: extended), 485178 bytes, 2270x3264) |  |  |  |
