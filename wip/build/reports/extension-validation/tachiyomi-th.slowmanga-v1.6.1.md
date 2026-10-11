# Extension Validation Report

- Extension: tachiyomi-th.slowmanga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3894617311216312574
- Source name: Slow Manga
- Source language: th
- Selected manga input: popular offset 0: I Took over The Academy With a Single Sashimi Knife (`.../i-took-over-the-academy-with-a-single-sashimi-knife`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | I Took over The Academy With a Single Sashimi Knife (`.../i-took-over-the-academy-with-a-single-sashimi-knife`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Regressing with the King’s Power (`.../regressing-with-the-kings-power`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | I’ll Heal With An Academy Convenience Store (`.../ill-heal-with-an-academy-convenience-store`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Tsuihou Sareta Tenshou Juu Kishi wa game Chishiki de Musou Suru (`.../tsuihou-sareta-tenshou-juu-kishi-wa-game-chishiki-de-musou-suru`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Took over The Academy With a Single Sashimi Knife (`.../i-took-over-the-academy-with-a-single-sashimi-knife`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Took over The Academy With a Single Sashimi Knife (`.../i-took-over-the-academy-with-a-single-sashimi-knife`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 94 | ตอนที่ 0 (`.../i-took-over-the-academy-with-a-single-sashimi-knife-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Took over The Academy With a Single Sashimi Knife, URL=`.../i-took-over-the-academy-with-a-single-sashimi-knife` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.slow-manga.net/.../1-231x300.png` (image/png, 144447 bytes, 231x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../i-took-over-the-academy-with-a-single-sashimi-knife` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.slow-manga.net/.../1.png` (image/png, 1232680 bytes, 720x934) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | เชฟคิม ปรมาจารย์ซาซิมิในตำนานของเกาหลี ถูกส่งตัวเข้าไปยังโลกของเกมพรแห่งปาฏิหาร์ย์ M เกมมือถือที่เขาเคยเล่น แต่แทนที่จะได้เป็นตัวเอก เขากลับกลายเป็นคังกอมมา ที่เป็นเพียงตัวประกอบ เมื่อต้องเริ่มต้นชีวิตใหม่คังกอมมา ก็ได้ค้นพบพลังใหม่ นั่นคือ พรแห่งเทพดาบ ตอนนี้ เขาต้องฝ่าฟันอุปสรรคและศัตรูเพื่อเอาชีวิตรอดในโลกที่คล้ายกับเกมนี้ ทักษะการทำอาหารที่ไม่มีใครเทียบได้ของเขาจะเพียงพอที่จะกำหนดชะตากรรมใหม่ได้หรือไม่ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 94 chapters |  |  |  |
| chapter dates | PASS | 94 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://img3.slow-manga.com/.../66d0d8022f0eaC9quP.jpg` to `https://img3.slow-manga.net/.../66d0d8022f0eaC9quP.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://img3.slow-manga.com/.../66d0d8022f0eaC9quP.jpg` (image/jpeg, 1261691 bytes, 690x11730) |  |  |  |
