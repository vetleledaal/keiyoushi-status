# Extension Validation Report

- Extension: tachiyomi-en.lagoonscans-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 7925933833035450162
- Source name: Lagoon Scans
- Source language: en
- Selected manga input: popular offset 0: The Regressed Mercenary’s Machinations (`.../the-regressed-mercenarys-machinations`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Regressed Mercenary’s Machinations (`.../the-regressed-mercenarys-machinations`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The Hero Cannot Rest (`.../the-hero-cannot-rest`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | The Return of the Crazy Demon (`.../the-return-of-the-crazy-demon`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | A Painter Who Draws Dungeons (`.../a-painter-who-draws-dungeons`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Regressed Mercenary’s Machinations (`.../the-regressed-mercenarys-machinations`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 43 | Chapter 67 (`.../the-regressed-mercenarys-machinations-chapter-67`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.wp.com/.../17-%D8%A3%D8%BA%D8%B3%D8%B7%D8%B3-2026%D8%8C-05_18_40-%D8%B5.webp <redacted query values: resize>` (image/jpeg, 47071 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-regressed-mercenarys-machinations` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i1.wp.com/.../17-%D8%A3%D8%BA%D8%B3%D8%B7%D8%B3-2026%D8%8C-05_18_40-%D8%B5.webp` (image/jpeg, 395735 bytes, 1042x1509) |  |  |  |
| details author | PASS | Gold Haeng |  |  |  |
| details artist | PASS | Park JinSeok |  |  |  |
| details genres | PASS | Action, Drama, Fantasy, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Cecil Perdium, the Mercenary King, was killed in battle before he could avenge his family. As he faces death, he learns that Duke Delphine, the man who caused the downfall of his family, didn’t work alone. Suddenly waking up as his teenage self, Cecil must work to both overcome his poor reputation and build up his strength to save his family. With their soldiers and knights defecting due to the harsh conditions they must endure, he has his work cut out for him. Can Cecil become the mighty warrior he once was and avert his family’s fate?<br><br>Alternative Names: <br>- As Maquinações do Mercenário Regredido<br>- El mercenario que regresó tiene un plan<br>- Every Returned Mercenary Has a Plan<br>- Las conspiraciones del mercenario regresado<br>- The Regressed Mercenary's Machinations<br>- แผนเปลี่ยนชะตาของทหารรับจ้าง<br>- 逆行傭兵は全て計画済み<br>- 重生佣兵王的复仇<br>- 重生傭兵的完美計畫<br>- 회귀한 용병은 다 계획이 있다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 43 chapters |  |  |  |
| chapter dates | PASS | 43 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lagoonscans.com/.../01-67.webp` (image/webp (encoding: lossy), 1717798 bytes, 800x12360) |  |  |  |
