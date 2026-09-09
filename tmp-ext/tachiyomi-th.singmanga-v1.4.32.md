# Extension Validation Report

- Extension: tachiyomi-th.singmanga-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 834994810873638550
- Source name: SingManga
- Source language: th
- Selected manga input: latest offset 0: The Tutorial is Too Hard (`.../the-tutorial-is-too-hard`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Regressor of the Fallen family (`.../regressor-of-the-fallen-family`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | God-level Assassin, I Am the Shadow (`.../god-level-assassin-i-am-the-shadow`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | The Tutorial is Too Hard (`.../the-tutorial-is-too-hard`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | I’m Going To Destroy This Country (`.../im-going-to-destroy-this-country`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Tutorial is Too Hard (`.../the-tutorial-is-too-hard`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Tutorial is Too Hard (`.../the-tutorial-is-too-hard`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 284 | Chapter 286 (`.../the-tutorial-is-too-hard-286`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 10 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Tutorial is Too Hard, URL=`.../the-tutorial-is-too-hard` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.sing-manga.com/.../70e4a1bd7ca03f40f0a5b3de1b486cff_1739107170-1.jpg` (image/jpeg, 157283 bytes, 1000x1350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-tutorial-is-too-hard` |  |  |  |
| details thumbnail URL | PASS | `https://www.sing-manga.com/.../70e4a1bd7ca03f40f0a5b3de1b486cff_1739107170-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Manhwa, Psychological, Supernatural, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ลีโฮแจได้สละชีวิตการเป็นโปรเกมเมอร์ จนกระทั่งวันหนึ่งเขาได้รับข้อความลึกลับ ยินดีด้วย คุณได้รับเชิญเข้าสู่โลกแห่งการฝึกสอน เขาเข้าสู่เกมด้วยความทึ่งและเลือกความยากระดับ นรก อย่างมั่นใจ แต่ไม่นานก็รู้ว่าตัวเองติดอยู่ที่นั่น ด้วยอัตราการรอดชีวิตเพียง 0.01% โฮแจจึงต้องเอาชนะความท้าทายที่ทรมานของเกมเพื่อค้นหาสาเหตุที่แท้จริงที่เขาได้รับเชิญ บทช่วยสอนนี้อาจยาก แต่ความลับของมันคือสิ่งที่น่ากลัวอย่างแท้จริง…!!!<br><br>Alternative Names: 튜토리얼이 너무 어렵다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 284 chapters |  |  |  |
| chapter dates | LINT | 283 of 284 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=283 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img3.sing-manga.com/.../6a985a9b42c816hLad.jpg` (image/jpeg, 2354316 bytes, 1000x19158) |  |  |  |
