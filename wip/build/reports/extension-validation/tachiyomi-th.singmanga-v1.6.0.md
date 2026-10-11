# Extension Validation Report

- Extension: tachiyomi-th.singmanga-v1.6.0
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
- Source ID: 834994810873638550
- Source name: SingManga
- Source language: th
- Selected manga input: popular offset 0: Regressor of the Fallen family (`.../regressor-of-the-fallen-family`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Regressor of the Fallen family (`.../regressor-of-the-fallen-family`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | God-level Assassin, I Am the Shadow (`.../god-level-assassin-i-am-the-shadow`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Regressor of the Fallen family (`.../regressor-of-the-fallen-family`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | The S-Classes That I Raised (`.../the-s-classes-that-i-raised`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Regressor of the Fallen family (`.../regressor-of-the-fallen-family`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Regressor of the Fallen family (`.../regressor-of-the-fallen-family`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 154 | Chapter 154 (`.../regressor-of-the-fallen-family-154`) |  | <1s |
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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Regressor of the Fallen family, URL=`.../regressor-of-the-fallen-family` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.sing-manga.com/.../%E0%B8%9D%E0%B8%A3%E0%B8%98%E0%B8%8E%E0%B8%A1%E0%B9%8E_%E0%B8%A6%E0%B9%97%E0%B8%9D%E0%B8%9A%E0%B8%A5%E0%B8%AD_%E0%B8%9D%E0%B9%86%E0%B8%93%E0%B8%B7%E0%B8%A0%E0%B8%AF_690x1000-3.jpg` (image/jpeg, 366897 bytes, 690x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../regressor-of-the-fallen-family` |  |  |  |
| details thumbnail URL | PASS | `https://www.sing-manga.com/.../%E0%B8%9D%E0%B8%A3%E0%B8%98%E0%B8%8E%E0%B8%A1%E0%B9%8E_%E0%B8%A6%E0%B9%97%E0%B8%9D%E0%B8%9A%E0%B8%A5%E0%B8%AD_%E0%B8%9D%E0%B9%86%E0%B8%93%E0%B8%B7%E0%B8%A0%E0%B8%AF_690x1000-3.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ชีวิตที่เต็มไปด้วยความเสียใจ เมื่อเขาตระหนักถึงความผิดพลาดของตัวเองและตัดสินใจที่จะมีชีวิตใหม่ มันก็สายเกินไป ครอบครัวของเขาจากไปแล้ว เขาทนทุกข์ทรมานในแต่ละวันด้วยความโกรธอันบริสุทธิ์ ในที่สุดเมื่อสิ้นความทุกข์ยาก ความปรารถนาของเขาก็ไปถึงสวรรค์ซึ่งเป็นสิ่งที่ไม่ได้รับการอภัย เขาต่อสู้กับโชคชะตาเพื่อยกดาบขึ้นมา<br><br>Alternative Names: <br>- 멸망한 가문의 회귀자 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 154 chapters |  |  |  |
| chapter dates | PASS | 154 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img3.sing-manga.com/.../6ac4c4f84e17eZSmLt.jpg` (image/jpeg, 2036555 bytes, 900x13785) |  |  |  |
