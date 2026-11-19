# Extension Validation Report

- Extension: tachiyomi-th.mangathnet-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4625906154234655279
- Source name: Manga-TH.Net
- Source language: th
- Selected manga input: popular offset 0: เกิดใหม่เป็นก็อบลิน มีอะไรจะถามไหม? (`.../tensei-goblin-da-kedo-shitsumon-aru`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 678 | เกิดใหม่เป็นก็อบลิน มีอะไรจะถามไหม? (`.../tensei-goblin-da-kedo-shitsumon-aru`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 678 | อยากเล่นโหด ขอโหมดนรก (`.../hellmode-yarikomi-suki-no-gamer-wa-haisettei-no-isekai-de-musou-suru`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | เกิดใหม่เป็นก็อบลิน มีอะไรจะถามไหม? (`.../tensei-goblin-da-kedo-shitsumon-aru`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | เกิดใหม่เป็นก็อบลิน มีอะไรจะถามไหม? (`.../tensei-goblin-da-kedo-shitsumon-aru`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 160 | Chapter 1 (`.../63dfa911-3425-4ccb-8984-5a57300b0c1b`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | 1-10s |

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
| popular listing | PASS | 678 entries |  |  |  |
| latest listing | PASS | 678 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=เกิดใหม่เป็นก็อบลิน มีอะไรจะถามไหม?, URL=`.../tensei-goblin-da-kedo-shitsumon-aru` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 1357/1357 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1357/1357 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.manga-th.net/.../1787598406952-24da01233290497e85079062fb6f1d53-cover.jpg` (image/jpeg, 31544 bytes, 281x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tensei-goblin-da-kedo-shitsumon-aru` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.manga-th.net/.../1787598406952-24da01233290497e85079062fb6f1d53-cover.jpg` |  |  |  |
| details author | PASS | Nazuna Miki |  |  |  |
| details artist | PASS | Tsukasa Araki |  |  |  |
| details genres | PASS | Manga, Action, Comedy, Drama, Fantasy, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | กลับชาติมาเกิดเป็น "ก็อบลิน" มอนสเตอร์ที่อ่อนแอและถูกดูถูกที่สุดในทุกเรื่องแฟนตาซี! แต่ด้วยความรู้จากโลกเดิมและการวางแผนที่เหนือชั้น เจ้าก็อบลินตัวนี้กลับค่อยๆ ไต่ระดับขึ้นไปทีละขั้น พร้อมพาเผ่าพันธุ์ที่ใครก็มองข้ามก้าวขึ้นมาเป็นกำลังที่ไม่มีใครกล้าประมาท<br><br>**Alternative Names:**<br>- Tensei Goblin da kedo Shitsumon aru?<br>- 転生ゴブリンだけど質問ある？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 160 chapters |  |  |  |
| chapter dates | PASS | 160 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.manga-th.net/.../1788835450804-bab88d17234f40a68fdca2d81ab8d115-001.webp` (image/webp (container: extended), 340982 bytes, 800x1142) |  |  |  |
