# Extension Validation Report

- Extension: tachiyomi-th.speedmanga-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3338047643419578004
- Source name: Speed Manga
- Source language: th
- Selected manga input: popular offset 0: The Eternal Supreme (`.../the-eternal-supreme`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Eternal Supreme (`.../the-eternal-supreme`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Solo Max-Level Newbie (`.../solo-max-level-newbie`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | ท่านพ่อของข้าคือยอดคนอันดับหนึ่งแห่งใต้หล้า My Father Is the Number One Under Heaven (`.../my-father-is-the-number-one-under-heaven`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Set It! (`.../set-it`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Eternal Supreme (`.../the-eternal-supreme`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Eternal Supreme (`.../the-eternal-supreme`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 529 | ตอนที่ 1 (`.../the-eternal-supreme-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Eternal Supreme, URL=`.../the-eternal-supreme` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://speed-manga.com/.../The-Eternal-Supreme-150x270.webp` (image/webp (container: extended), 14354 bytes, 150x270) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-eternal-supreme` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://speed-manga.com/.../The-Eternal-Supreme.webp` (image/webp (container: extended), 94756 bytes, 640x1000) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | A4Comics Jack Norway \[Add, \] |  |  |  |
| details genres | PASS | มังงะผจญภัย, มังงะศิลปะการต่อสู้, มังงะแฟนตาซี, มังงะแอ็กชัน, มังงะโชเน็น, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ครั้งแรกในบรรดาสิบจักรพรรดิการต่อสู้ จักรพรรดิผู้ไร้เทียมทาน Gu Feiyang ได้พบกับการตายของเขาในภูเขา Tiandang เขากลับชาติมาเกิดอีกสิบห้าปีต่อมาในฐานะ Li Yun Xiao จาก Tianshui Nation และเริ่มการต่อสู้ที่ท้าทายสวรรค์ด้วยพรสวรรค์นับไม่ถ้วนของคนรุ่นปัจจุบัน ศิลปะการป้องกันตัวของสวรรค์ทั้งเก้าและอาณาจักรศักดิ์สิทธิ์ทั้งสิบ นับแต่นั้นมา โลกทั้งใบก็ลุกเป็นไฟ<br><br>Alternative Names: <br>- Ancient One<br>- Eternal Supreme<br>- Everlasting Supreme<br>- The Ancient One<br>- The Ancient Sovereign of Eternity<br>- Rebirth of the Ultimate Master<br>- The Ultimate of All Ages<br>- Vạn Cổ Chí Tôn<br>- 万古至尊<br>- 二度目の人生俺は至尊になる<br>- 만고지존 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 529 chapters |  |  |  |
| chapter dates | PASS | 529 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://imgez.org/.../0.jpg` (image/jpeg, 1248740 bytes, 1000x13636) |  |  |  |
