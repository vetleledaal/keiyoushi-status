# Extension Validation Report

- Extension: tachiyomi-en.topmanhua-v1.6.62
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 368848319592333339
- Source name: Top Manhua
- Source language: en
- Selected manga input: latest offset 0: Copy Skill With Affection (`.../98461`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Martial Peak (`.../70217`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | I Am Carrying Gold From The Post-Apocalyptic World (`.../74723`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Copy Skill With Affection (`.../98461`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Global Martial Arts (`.../72245`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Copy Skill With Affection (`.../98461`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Copy Skill With Affection (`.../98461`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 9 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Copy Skill With Affection, URL=`98461` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangatop.org/.../manga_98461_image-175x238.jpg` (image/jpeg, 17055 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `98461` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangatop.org/.../manga_98461_image-193x278.jpg` (image/jpeg, 20555 bytes, 193x278) |  |  |  |
| details author | PASS | Bori (III), Jidae Gongmabeob Sonyeon, Little Big, Sadadeum |  |  |  |
| details artist | PASS | Pyuli |  |  |  |
| details genres | PASS | Action, Fantasy, Harem, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Aiden had been scraping by as a con artist in the back alleys, until one day, he was suddenly kidnapped by the greatest female knight in the empire.<br><br>“Let’s get married. Would you pretend to be my husband for a year?”<br><br>“W-Well… I suppose I could…?”<br><br>Alternative Names: Copas Skill Pakai Afinitas! / Copy Skills via Favorability! / Copying Skills With Affinity! / Dùng Độ Hảo Cảm Để Sao Chép Kỹ Năng / ก๊อปปี้สกิลด้วยค่าความชอบ! / 호감도로 스킬 복사 / 호감도로 스킬 복사! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | LINT | 8 of 9 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=8 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manhuatop.org/.../about_manhuatop_3.webp` (image/webp (encoding: lossy), 143450 bytes, 800x533) |  |  |  |
