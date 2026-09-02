# Extension Validation Report

- Extension: tachiyomi-th.speedmanga-v1.4.33
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
- Source ID: 3338047643419578004
- Source name: Speed Manga
- Source language: th
- Selected manga input: popular offset 0: The Eternal Supreme (`.../the-eternal-supreme`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | The Eternal Supreme (`.../the-eternal-supreme`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Solo Max-Level Newbie (`.../solo-max-level-newbie`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | สองผู้เล่นกับภารกิจพิชิตตอนจบ Ending Maker (`.../ending-maker`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Holy Money-หมอผีตลาดหุ้น (`.../holy-money`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Eternal Supreme (`.../the-eternal-supreme`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Eternal Supreme (`.../the-eternal-supreme`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 510 | ตอนที่ 1 (`.../the-eternal-supreme-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| thumbnail | PASS | `https://speed-manga.net/.../The-Eternal-Supreme.webp` (image/webp (container: extended), 94756 bytes, 640x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-eternal-supreme` |  |  |  |
| details thumbnail URL | PASS | `https://speed-manga.net/.../The-Eternal-Supreme.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | A4Comics Jack Norway \[Add, \] |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Martial arts, Shounen, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ครั้งแรกในบรรดาสิบจักรพรรดิการต่อสู้ จักรพรรดิผู้ไร้เทียมทาน Gu Feiyang ได้พบกับการตายของเขาในภูเขา Tiandang เขากลับชาติมาเกิดอีกสิบห้าปีต่อมาในฐานะ Li Yun Xiao จาก Tianshui Nation และเริ่มการต่อสู้ที่ท้าทายสวรรค์ด้วยพรสวรรค์นับไม่ถ้วนของคนรุ่นปัจจุบัน ศิลปะการป้องกันตัวของสวรรค์ทั้งเก้าและอาณาจักรศักดิ์สิทธิ์ทั้งสิบ นับแต่นั้นมา โลกทั้งใบก็ลุกเป็นไฟ<br><br>Alternative Names: Ancient One, Eternal Supreme, Everlasting Supreme, The Ancient One, The Ancient Sovereign of Eternity, Rebirth of the Ultimate Master, The Ultimate of All Ages, Vạn Cổ Chí Tôn, 万古至尊, 二度目の人生俺は至尊になる, 만고지존 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 510 chapters |  |  |  |
| chapter dates | PASS | 510 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://imgez.org/.../0.jpg` (image/jpeg, 1248740 bytes, 1000x13636) |  |  |  |
