# Extension Validation Report

- Extension: tachiyomi-en.athreascans-v1.6.1
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
- Source ID: 427734044452073936
- Source name: Athrea Scans
- Source language: en
- Selected manga input: popular offset 0: Falling (`.../falling`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 35 | Falling (`.../falling`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 35 | Times of Love (`.../times-of-love`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 35 | Diary of a Deceased Girl (`.../diary-of-a-deceased-girl`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 35 | Can I Call You Unnie? (`.../can-i-call-you-unnie`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 7 | Cage That Robin (`.../cage-that-robin`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Falling (`.../falling`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 79 | Chapter 1 (`.../falling-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 35 entries |  |  |  |
| latest listing | PASS | 35 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 4: title=Falling, URL=`.../falling` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 147/147 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 147/147 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://athreascans.com/.../xxlarge-1-221x300.png` (image/png, 125516 bytes, 221x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../falling` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://athreascans.com/.../xxlarge-1.png` (image/png, 1671366 bytes, 960x1304) |  |  |  |
| details author | PASS | Eunsu, Gyechasooyeol |  |  |  |
| details artist | PASS | Dog |  |  |  |
| details genres | PASS | Action, Adaptation, Adult, Crime, Drama, Free, Romance, Smut, Violence, Yuri, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | When lifelong criminal Seungji finds herself betrayed by her old boss, she joins an upstart smuggling business to lay low. Her goal is to find the opening to take advantage of the business to score cash and flee the city, but a wrench by the name of Yeongwon is thrown into her plans. Inexperienced and naive, Yeongwon is working in her aunt’s stead as Seungji’s superior. Falling in love is a luxury for people in their line of work, but Seungji’s desire for financial gain might be changing into a desire for something that she can’t afford…<br><br>Alternative Names: <br>- Difference Love<br>- Moments Apart<br>- Fall<br>- 落差<br>- 낙차 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 79 chapters |  |  |  |
| chapter dates | PASS | 79 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://athreascans.com/.../01.jpg` (image/jpeg, 1373346 bytes, 800x13230) |  |  |  |
