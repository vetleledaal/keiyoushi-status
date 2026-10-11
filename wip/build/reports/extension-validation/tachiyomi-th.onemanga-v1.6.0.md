# Extension Validation Report

- Extension: tachiyomi-th.onemanga-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 2248402620929558947
- Source name: MangaBlackCat
- Source language: th
- Selected manga input: popular offset 0: Myst Might Mayhem ลับลางลวง (`.../myst-might-mayhem`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | Myst Might Mayhem ลับลางลวง (`.../myst-might-mayhem`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 60 | The Return of the Scorned Genius การหวนคืนของอัจฉริยะผู้ถูกเหยียดหยาม (`.../the-return-of-the-scorned-genius`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 60 | Killer Peter ปีเตอร์โคตรนักฆ่า (`.../killer-peter`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 60 | Copying Skills with Affinity! ก๊อปปี้สกิลด้วยค่าความชอบ! (`.../copying-skills-with-affinity`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Myst Might Mayhem ลับลางลวง (`.../myst-might-mayhem`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Myst Might Mayhem ลับลางลวง (`.../myst-might-mayhem`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 119 | ตอนที่ 1 (`.../1.0`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 99 |  |  | <1s |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Myst Might Mayhem ลับลางลวง, URL=`.../myst-might-mayhem` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 241/241 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 241/241 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangablackcat.com/.../01M3FAHNKEXP3HVBZ7VDERYXNN-large.webp` (image/webp (encoding: lossy), 62968 bytes, 400x570) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../myst-might-mayhem` |  |  |  |
| details thumbnail URL | PASS | `https://mangablackcat.com/.../01M3FAHNKEXP3HVBZ7VDERYXNN-large.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | จองต้องการเพียงโอกาสครั้งที่สอง -- เพื่อแก้แค้น! ความตายอันน่าสยดสยองของปู่ได้เปลี่ยนเขาให้กลายเป็นปีศาจเคียวผู้กระหายเลือดและโหดเหี้ยม เขาจะไม่หยุดยั้งจนกว่าจะได้สังหารผู้ก่อเหตุ แต่ความโกรธและความมุ่งมั่นเพียงอย่างเดียวนั้นไม่เพียงพอ เขาต้องฝึกฝนศิลปะการต่อสู้หากต้องการมีโอกาสต่อสู้กับศัตรูที่น่าเกรงขามเช่นนี้ เขาจะแก้แค้นฆาตกรของปู่ของเขาสำเร็จหรือไม่ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 119 chapters |  |  |  |
| chapter dates | PASS | 119 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 99 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.mangablackcat.com/.../001.jpg` (image/jpeg, 739448 bytes, 800x2782) |  |  |  |
