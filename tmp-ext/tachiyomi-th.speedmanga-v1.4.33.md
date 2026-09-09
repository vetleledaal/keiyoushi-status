# Extension Validation Report

- Extension: tachiyomi-th.speedmanga-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3338047643419578004
- Source name: Speed Manga
- Source language: th
- Selected manga input: latest offset 0: Call of the spear (`.../call-of-the-spear`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | The Eternal Supreme (`.../the-eternal-supreme`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Solo Max-Level Newbie (`.../solo-max-level-newbie`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Call of the spear (`.../call-of-the-spear`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Ranker’s Return (Remake) (`.../rankers-return-remake`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Call of the spear (`.../call-of-the-spear`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Call of the spear (`.../call-of-the-spear`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 80 | ตอนที่ 1 (`.../call-of-the-spear-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 56 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Call of the spear, URL=`.../call-of-the-spear` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://speed-manga.net/.../Call-of-the-spear.webp` (image/webp (container: extended), 43916 bytes, 350x490) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../call-of-the-spear` |  |  |  |
| details thumbnail URL | PASS | `https://speed-manga.net/.../Call-of-the-spear.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | KIM Sun-tae |  |  |  |
| details genres | PASS | Action, Fantasy, Harem, Historical, Romance, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ซานกุน เจ้าของภูเขา เกิดใหม่เป็นเสือและกลายเป็นสิ่งมีชีวิตทางจิตวิญญาณ เด็กสาวคนหนึ่งมาเยี่ยมซานกุนซึ่งอาศัยอยู่อย่างสงบสุขและบอกว่าจะรับใช้เขา ซานกุนพยายามขับไล่เธอออกไป แต่เธอไม่มีที่ที่จะกลับไป ในที่สุดซานกุนก็ตัดสินใจเอาตัวหญิงสาวกลับคืนมา และมีภัยคุกคามมากมายสำหรับเขา…<br><br>Alternative Names: Tale of the Floating Sages, Cystic Story, Die Chroniken des Berggottes, Fantastic Story of Nangseon, L'Épopée du Dieu de la Montagne, La historia de la reencarnación del tigre, Lang Xian Fantasy Talk, Lãng Tiên Kỳ Đàm, Nangseon Story, Story of Thorny Spear, The Story Of The Reincarnation Of The Tiger, The Story of Thorny Spear, История перерождения в тигра, Причудливая история о горном небожителе, ตำนานผู้บำเพ็ญเพียรพเนจร, 浪仙奇幻談, 浪仙奇幻谈, 낭선기환담 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 80 chapters |  |  |  |
| chapter dates | PASS | 80 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://imgez.org/.../03206f779d5906211.jpeg` (image/jpeg, 24573 bytes, 309x435) |  |  |  |
