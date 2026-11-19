# Extension Validation Report

- Extension: tachiyomi-th.toonhunter-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source theme: mangathemesia
- Source ID: 5501367022610888708
- Source name: ToonHunter
- Source language: th
- Selected manga input: popular offset 0: My Landlady Noona (`.../my-landlady-noona`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | My Landlady Noona (`.../my-landlady-noona`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | My New Family Treats me Well (`.../my-new-family-treats-me-well`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Believe Me! I Offer You My First (`.../believe-me-i-offer-you-my-first`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Scumbag (`.../scumbag`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | My Landlady Noona (`.../my-landlady-noona`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Landlady Noona (`.../my-landlady-noona`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 151 | ตอนที่ 1 (`.../my-landlady-noona-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Landlady Noona, URL=`.../my-landlady-noona` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://toonhunter.com/.../a602a144-dd9e-4496-897d-5f95ea778c23.webp` (image/webp (encoding: lossy), 20050 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-landlady-noona` |  |  |  |
| details thumbnail URL | PASS | `https://toonhunter.com/.../a602a144-dd9e-4496-897d-5f95ea778c23.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Comedy, Doujin โดจิน, Drama, Harem, Manhwa มังฮวา, Romance, Seinen, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ฮาริ ที่ดูแลมินอูอยู่เสมอ พี่สาวเจ้าของตึกที่ใจดีมาก ซึ่งเป็นอพาร์ตเมนต์ที่เขาอาศัยอยู่ ที่จริงแล้วมินอูเรียกฮาริว่า “อาจุมมะ” แทนที่จะเป็นนูน่า แต่เธอกลับละเลยเขา… แต่เมื่อเธอพูดคือเธอ ไม่เห็นมินอูเป็นผู้ชายที่ศักดิ์ศรีของเขาถูกทำร้าย …<br><br>Alternative Names: <br>- Bà Chị Chủ Nh�<br>- Chị Chủ Nhà Của Tôi<br>- My Landlady Noona<br>- Noona of the Building Owner<br>- The Owner Of A Building<br>- 富家女姐姐<br>- 건물주 누나 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 151 chapters |  |  |  |
| chapter dates | PASS | 151 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://bbb.webtoon168.com/.../1e7ce83d602108957.jpg` (image/jpeg, 2766870 bytes, 1000x47956) |  |  |  |
