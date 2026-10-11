# Extension Validation Report

- Extension: tachiyomi-th.doujinxh-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3749607867432167357
- Source name: Doujinx-H
- Source language: th
- Selected manga input: popular offset 0: Secret Class (`.../2568`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Secret Class (`.../2568`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Let’s Hang Out from Today (`.../4326`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Mother’s Friends (`.../8648`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Believe Me! I Offer You My First (`.../7873`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Secret Class (`.../2568`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../2568`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 319 | ตอนที่ 1 (`.../%e0%b8%95%e0%b8%ad%e0%b8%99%e0%b8%97%e0%b8%b5%e0%b9%88-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 106 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`2568` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 103/103 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 103/103 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://doujinx-h.com/.../Secret-Class3-175x238.png` (image/png, 55458 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `2568` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://doujinx-h.com/.../Secret-Class3-193x278.png` (image/png, 67642 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | H-Manhwa, Manhwa, บทเรียนลับ, ฮาเร็มในบ้าน, Manhwa, โดจินเกาหลี |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | เรื่องย่อ Secret Class โดจินแปลไทย แดโฮ ซึ่งกลายเป็นเด็กกำพร้าเมื่ออายุ 13 ปี ถูกเพื่อนของพ่อรับไปเลี้ยง อย่างไรก็ตาม แดโฮในวัยผู้ใหญ่ไม่รู้อะไรเกี่ยวกับความสัมพันธ์ระหว่างชายและหญิง ป้าและพี่สาวตัดสินใจให้ชั้นเรียนลับแดโฮบริสุทธิ์…<br><br>Alternative Names: Secret Class แปลไทย |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 319 chapters |  |  |  |
| chapter dates | LINT | All 319 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=319 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 106 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://doujinx-h.com/.../-1013.jpg` (image/jpeg, 71137 bytes, 1000x1500) |  |  |  |
