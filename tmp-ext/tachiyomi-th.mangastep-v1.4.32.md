# Extension Validation Report

- Extension: tachiyomi-th.mangastep-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 4667424178290106010
- Source name: Mangastep
- Source language: th
- Selected manga input: latest offset 0: Childhood Friend Complex (`.../childhood-friend-complex`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Solo Leveling (`.../solo-leveling`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Absolute Hypnosis in Another World (`.../absolute-hypnosis-in-another-world`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Childhood Friend Complex (`.../childhood-friend-complex`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Glory Hole (`.../glory-hole`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Childhood Friend Complex (`.../childhood-friend-complex`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Childhood Friend Complex (`.../childhood-friend-complex`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 80 | ตอนที่ 1 (`.../childhood-friend-complex-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 241 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Childhood Friend Complex, URL=`.../childhood-friend-complex` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangastep.com/.../Childhood-Friend-Complex-207x300.jpeg` (image/jpeg, 43342 bytes, 207x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../childhood-friend-complex` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangastep.com/.../Childhood-Friend-Complex.jpeg` (image/jpeg, 92100 bytes, 600x869) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy ตลก, Josei โจเซย์, Mature ผู้ใหญ่, Romance โรแมนซ์, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | อ่าน Childhood Friend Complex เพื่อนกันมันส์เกิน แปลไทย เรื่องย่อของ Childhood Friend Complex เพื่อนกันมันส์เกิน – อีฮานึล และ คิมมินชอล เป็นเพื่อนกันมาตั้งแต่เด็กและอยู่ด้วยกันมาตลอด 20 ปี สองคนนี้ไม่เคยมองอีกฝ่ายว่าเป็นเพศตรงข้ามเลย แต่ด้วยสถานการณ์ต่าง ๆ ที่ชวนให้เข้าใจผิด พวกเขาจึงค่อย ๆ เริ่มรับรู้ซึ่งกันและกัน เตรียมพบกับเรื่องราวความรักเบาสมองระหว่างชายและหญิงที่ต้องฝ่าฝันอุปสรรคอะไรหลาย ๆ อย่างไปด้วยกัน เพราะพวกเขารู้จักกันดีเกินไป!<br><br>Alternative Names: Friends Complex, Sokkupchingu Complex, เพื่อนกันมันส์เกิน, 소꿉친구 컴플렉스 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 80 chapters |  |  |  |
| chapter dates | PASS | 80 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 241 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://bbb.webtoon168.com/.../11826eb3243fe6a0fa6dc11a929742c0.jpg` (image/jpeg, 72136 bytes, 900x1000) |  |  |  |
