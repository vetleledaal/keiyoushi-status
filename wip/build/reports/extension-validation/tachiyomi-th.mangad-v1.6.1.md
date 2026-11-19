# Extension Validation Report

- Extension: tachiyomi-th.mangad-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6245266023917302493
- Source name: MANGA-D
- Source language: th
- Selected manga input: popular offset 0: 2.5 มิติ ริริสะ (`.../2-5-%E0%B8%A1%E0%B8%B4%E0%B8%95%E0%B8%B4-%E0%B8%A3%E0%B8%B4%E0%B8%A3%E0%B8%B4%E0%B8%AA%E0%B8%B0`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 70 | 2.5 มิติ ริริสะ (`.../2-5-%E0%B8%A1%E0%B8%B4%E0%B8%95%E0%B8%B4-%E0%B8%A3%E0%B8%B4%E0%B8%A3%E0%B8%B4%E0%B8%AA%E0%B8%B0`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 22 | Blue Lock ขังดวลแข้ง (`.../blue-lock`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 2.5 มิติ ริริสะ (`.../2-5-%E0%B8%A1%E0%B8%B4%E0%B8%95%E0%B8%B4-%E0%B8%A3%E0%B8%B4%E0%B8%A3%E0%B8%B4%E0%B8%AA%E0%B8%B0`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 2.5 มิติ ริริสะ (`.../2-5-%E0%B8%A1%E0%B8%B4%E0%B8%95%E0%B8%B4-%E0%B8%A3%E0%B8%B4%E0%B8%A3%E0%B8%B4%E0%B8%AA%E0%B8%B0`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 64 | 2.5 มิติ ริริสะ ตอนที่ 1 : นักเรียนใหม่จากต่างมิติ (`.../2-5-%e0%b8%a1%e0%b8%b4%e0%b8%95%e0%b8%b4-%e0%b8%a3%e0%b8%b4%e0%b8%a3%e0%b8%b4%e0%b8%aa%e0%b8%b0-chapter`) |  | <1s |
| pages | `getPageList(chapter)` | success | 51 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 70 entries |  |  |  |
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=2.5 มิติ ริริสะ, URL=`.../2-5-%E0%B8%A1%E0%B8%B4%E0%B8%95%E0%B8%B4-%E0%B8%A3%E0%B8%B4%E0%B8%A3%E0%B8%B4%E0%B8%AA%E0%B8%B0` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 93/93 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 93/93 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://manga-d.com/.../Kijin-Gentoushou-cover.webp` -> 2 manga URLs (examples: `.../hunter-x-hunter`, `.../sword-of-the-demon-hunter-kijin-gentoushou`) |  |  |  |
| thumbnail | PASS | `https://manga-d.com/.../2.5-%E0%B8%A1%E0%B8%B4%E0%B8%95%E0%B8%B4-%E0%B8%A3%E0%B8%B4%E0%B8%A3%E0%B8%B4%E0%B8%AA%E0%B8%B0.webp` (image/webp (encoding: lossy), 63990 bytes, 1200x630) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2-5-%E0%B8%A1%E0%B8%B4%E0%B8%95%E0%B8%B4-%E0%B8%A3%E0%B8%B4%E0%B8%A3%E0%B8%B4%E0%B8%AA%E0%B8%B0` |  |  |  |
| details thumbnail URL | PASS | `https://manga-d.com/.../2.5-%E0%B8%A1%E0%B8%B4%E0%B8%95%E0%B8%B4-%E0%B8%A3%E0%B8%B4%E0%B8%A3%E0%B8%B4%E0%B8%AA%E0%B8%B0.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | มังงะเรื่อง "2.5 มิติ ริริสะ" เล่าเรื่องราวของริริสะ สาวนักศึกษาที่หลงใหลในโลกมังงะและละครเวที 2.5 มิติ วันหนึ่งเธอได้พบกับชายลึกลับที่สามารถพาเธอข้ามมิติไปยังโลกละครเวทีได้จริง ริริสะต้องปรับตัวและเรียนรู้การเป็นนักแสดงในโลกที่ผสมผสานระหว่างความจริงและจินตนาการ เรื่องนี้ผสมผสานแนวดราม่าและแฟนตาซี พร้อมด้วยฉากแอ็กชันและการเติบโตของตัวละคร จุดเด่นอยู่ที่การสำรวจเส้นแบ่งระหว่างโลกจริงกับโลกในจินตนาการ และการตามหาความฝันในเส้นทางที่ไม่เหมือนใคร "2.5 มิติ ริริสะ" จึงเป็นมังงะที่เต็มไปด้วยความคิดสร้างสรรค์และแรงบันดาลใจสำหรับคนรักโลกศิลปะและการแสดง. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 64 chapters |  |  |  |
| chapter dates | PASS | 64 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manga-d.com/.../2.5-%E0%B8%A1%E0%B8%B4%E0%B8%95%E0%B8%B4-%E0%B8%A3%E0%B8%B4%E0%B8%A3%E0%B8%B4%E0%B8%AA%E0%B8%B0-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-1-1.webp` (image/webp (container: extended), 26520 bytes, 533x760) |  |  |  |
