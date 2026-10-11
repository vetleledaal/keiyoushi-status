# Extension Validation Report

- Extension: tachiyomi-th.goddoujin-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3638625079908519060
- Source name: God-Doujin
- Source language: th
- Selected manga input: popular offset 0: MILF Hunting In Another World (`.../milf-hunting-in-another-world`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | MILF Hunting In Another World (`.../milf-hunting-in-another-world`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | I Have To Sleep With A Stranger? (`.../i-have-to-sleep-with-a-stranger`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | The Mother and Daughter Live In (`.../the-mother-and-daughter-live-in`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Curious Girl (`.../curious-girl`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | MILF Hunting In Another World (`.../milf-hunting-in-another-world`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | MILF Hunting In Another World (`.../milf-hunting-in-another-world`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 138 | ตอนที่ 1 (`.../milf-hunting-in-another-world-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=MILF Hunting In Another World, URL=`.../milf-hunting-in-another-world` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://god-doujin.com/.../Milf-01.5-Cover-211x300.jpg` (image/jpeg, 20708 bytes, 211x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../milf-hunting-in-another-world` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://god-doujin.com/.../Milf-01.5-Cover.jpg` (image/jpeg, 220470 bytes, 422x600) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Exclusive, Ntr, ต่างโลก, นมใหญ่, ภาพสี, มังฮวา 18+, ฮาเร็ม, แฟนตาซี, แม่, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ﻿ มังฮวา \| MILF Hunting In Another World อ่านมังฮวา \| MILF Hunting In Another World Manhwa แปลไทย \| MILF Hunting In Another World หลังจากถูกจับได้ตอนกำลังนอนกับเมียชาวบ้าน ตัวเอกก็ได้หลบหนีไปยังอีกโลกหนึ่ง จากนั้นเขาก็ร่วมเตียงกับสาวรุ่นแม่หุ่นสวยสุดเป๊ะ! พระเอกจะสามารถสร้างฮาเร็มสาวรุ่นแม่ในโลกนี้ได้หรือไม่…? อ่านโดจิน Milf Hunting in Another World ติดตามตอนใหม่ ได้ที่เว็บ oredoujin.com |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 138 chapters |  |  |  |
| chapter dates | PASS | 138 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://bbb.webtoon168.com/.../aef057236398536cd639fc6fb51f83f3.jpg` (image/jpeg, 5074357 bytes, 720x13398) |  |  |  |
