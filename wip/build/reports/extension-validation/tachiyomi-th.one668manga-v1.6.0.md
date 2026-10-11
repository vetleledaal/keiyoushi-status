# Extension Validation Report

- Extension: tachiyomi-th.one668manga-v1.6.0
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
- Source theme: mangathemesia
- Source ID: 3511888750873871322
- Source name: 1668Manga
- Source language: th
- Selected manga input: popular offset 0: I Was Immediately Mistaken for a Monster Genius Actor (`.../i-was-immediately-mistaken-for-a-monster-genius-actor`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | I Was Immediately Mistaken for a Monster Genius Actor (`.../i-was-immediately-mistaken-for-a-monster-genius-actor`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Regressing as the Reincarnated Bastard of the Sword Clan (`.../regressing-as-the-reincarnated-bastard-of-the-sword-clan`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Ranker Who Lives A Second Time (`.../ranker-who-lives-a-second-time`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Bad Born Blood (`.../bad-born-blood`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Was Immediately Mistaken for a Monster Genius Actor (`.../i-was-immediately-mistaken-for-a-monster-genius-actor`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Was Immediately Mistaken for a Monster Genius Actor (`.../i-was-immediately-mistaken-for-a-monster-genius-actor`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 121 | ตอนที่ 0 (`.../i-was-immediately-mistaken-for-a-monster-genius-actor-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-0`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Was Immediately Mistaken for a Monster Genius Actor, URL=`.../i-was-immediately-mistaken-for-a-monster-genius-actor` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.1668manga.com/.../I-Was-Immediately-Mistaken-for-a-Monster-Genius-Actor.avif` (image/avif (format: avif), 61658 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../i-was-immediately-mistaken-for-a-monster-genius-actor` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.1668manga.com/.../I-Was-Immediately-Mistaken-for-a-Monster-Genius-Actor.avif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Haega |  |  |  |
| details genres | PASS | Comedy, Drama, Fantasy, Seinen, Supernatural, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ฉันกำลังจะตกงาน แต่เพื่อนดันพาฉันพาออดิชั่น ขณะที่กำลังอ่านบทฉันก็ได้เข้าไปในมิติว่าง ทำให้ฉันกลางเป็นตัวละครของบทละครนั้นอย่างสมบูรณ์แบบ และ ฉันก็กลางเป็นนักแสดงอัจฉริยะโดยไม่ทันตั้งตัวเฉยเลย<br><br>Alternative Names: <br>- I Was Mistaken as a Monstrous Genius Actor<br>- Tôi Bị Hiểu Lầm Là Diễn Viên Thiên Tài Quái Vật<br>- 대뜸 착각당했다 괴물 천재배우로 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 121 chapters |  |  |  |
| chapter dates | PASS | 121 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.168toon.com/.../1.jpg` (image/jpeg, 333389 bytes, 1920x1080) |  |  |  |
