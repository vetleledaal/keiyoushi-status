# Extension Validation Report

- Extension: tachiyomi-en.magusmanga-v1.6.73
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1589747287364201069
- Source name: Magus Manga
- Source language: en
- Selected manga input: popular offset 0: Honey, Why Can't We Get A Divorce? (`.../honey-why-can-t-we-get-a-divorce`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Honey, Why Can't We Get A Divorce? (`.../honey-why-can-t-we-get-a-divorce`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 17 | My First Love From The Future (`.../my-first-love-from-the-future`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | The Top 1 Student Hides Her Regression (`.../the-top-1-student-hides-her-regression`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | High Class Society (`.../high-class-society`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Honey, Why Can't We Get A Divorce? (`.../honey-why-can-t-we-get-a-divorce`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Honey, Why Can't We Get A Divorce? (`.../honey-why-can-t-we-get-a-divorce`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 97 | Chapter 1 - Chapter 01 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Honey, Why Can't We Get A Divorce?, URL=`honey-why-can-t-we-get-a-divorce#273` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.magustoon.org/.../a14b1c86-9998-4216-a251-3f8f1de9508a.webp` (image/webp (encoding: lossy), 418366 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `honey-why-can-t-we-get-a-divorce#273` |  |  |  |
| details thumbnail URL | PASS | `https://storage.magustoon.org/.../a14b1c86-9998-4216-a251-3f8f1de9508a.webp` |  |  |  |
| details author | PASS | Cha So-hee, hamju |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "I've been reincarnated as 'Ophelia Rezen', the villainess from a trashy romance novel filled with intense love triangles.Before I meet the same tragic end as in the original story, manipulated by the main characters,I desperately want to divorce Ophelia's husband, 'Sylvester Rezen ', and find happiness.But the condition he's set is ridiculous.‘Ophelia, you want a divorce? Then try to make the crown prince yours.’How am I supposed to seduce the male lead when the original female lead is already there?And in the original story, Ophelia dies because of him!But I have to do it. For my successful divorce!How can I seduce the crown prince who hates me more than a fly?"<br><br>Alternative Names: 여보, 왜 이혼은 안 되나요? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 97 chapters |  |  |  |
| chapter dates | PASS | 97 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://storage.magustoon.org/.../001.jpg` (image/jpeg, 938314 bytes, 800x8888) |  |  |  |
