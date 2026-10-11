# Extension Validation Report

- Extension: tachiyomi-th.oremanga-v1.6.6
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zmanga
- Source ID: 2081564483403474647
- Source name: OreManga
- Source language: th
- Selected manga input: popular offset 0: One Piece (`.../op`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | One Piece (`.../op`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 16 | My Beautiful Time with You (`.../my-beautiful-time-with-you`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 16 | Colori Colore Creare (`.../colori-colore-creare`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 16 | I’m a Contract Stepmother, but the Tyrant Is Way Too Overprotective (`.../im-a-contract-stepmother-but-the-tyrant-is-way-too-overprotective`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Honey Piece (`.../honey-piece`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../op`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 361 | ตอนที่ 839 (`.../one-piece-839`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=One Piece, URL=`.../op` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 67/67 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 67/67 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.oremanga.net/.../no-image.jpg` -> 2 manga URLs (examples: `.../honey-piece`, `.../onepiece_party_sd`) |  |  |  |
| thumbnail | PASS | `https://www.oremanga.net/.../One-Piece-3.jpg` (image/jpeg, 100737 bytes, 500x783) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../op` |  |  |  |
| details thumbnail URL | PASS | `https://www.oremanga.net/.../One-Piece-3.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Manga, Shounen, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | วันพีซ เป็นเรื่องราวในยุคทองของโจรสลัด ทุกคนต่างเป้าหมายเดียวกันคือเพื่อค้นหา สมบัติที่เรียกว่า “วันพีซ” ซึ่งผู้ใดสามารถค้นหาและครอบครองวันพีซอยู่ ผู้นั้นก็คือเจ้าแห่งโจรสลัด(ราชาโจรสลัด) โดยผู้ที่เคยครอบครองวันพีซนั้นมีอยู่คนเดียวตามที่เปิดเผยคือ เจ้าแห่งโจรสลัด โกลด์ ดี โรเจอร์ ซึ่งหลังจากที่ ได้ครอบครองวันพีซแล้ว โกลด์ ดี โรเจอร์ก็ได้มอบตัว และยอมรับโทษการประหารชีวิตที่เกาะโร๊คบ้านเกิดของตนนั่นเอง และก่อนตายโกลด์ ดี โรเจอร์ ได้ทิ้งคำพูดก่อนตายที่เปลี่ยนยุคสมัยของโจรสลัดว่า “สมบัติของฉันหรอ อยากได้ก็เอาไปซิ ไปหาเอาเลย ฉันเอาทุกอย่างบนโลกไปไว้ที่นั่นหมดแล้ว” แล้วเหล่า โจรสลัดทั้งหลายจึงมุ่งหน้าสู้แกรนด์ไลน์เพื่อตามหา One Piece |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 361 chapters |  |  |  |
| chapter dates | PASS | 361 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.oremanga.net/.../CKDUEZIR96-1587040385.jpg` (image/png, 158600 bytes, 782x1150; server Content-Type: image/jpeg) |  |  |  |
