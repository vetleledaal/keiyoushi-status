# Extension Validation Report

- Extension: tachiyomi-en.mgreadio-v1.6.3
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
- Source ID: 15083818169656208
- Source name: Mgread.io
- Source language: en
- Selected manga input: popular offset 0: Global Freeze: I Created An Apocalypse Shelter (`.../global-freeze-i-created-an-apocalypse-shelter`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Global Freeze: I Created An Apocalypse Shelter (`.../global-freeze-i-created-an-apocalypse-shelter`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Alone as a Slime (`.../alone-as-a-slime`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | I Became the Master of the Devil (`.../i-became-the-master-of-the-devil`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 22 | The Youngest Daughter of the Snake Family (`.../the-youngest-daughter-of-the-snake-family`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | Global Freeze: I Created An Apocalypse Shelter (`.../global-freeze-i-created-an-apocalypse-shelter`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Global Freeze: I Created An Apocalypse Shelter (`.../global-freeze-i-created-an-apocalypse-shelter`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 633 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 6 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Global Freeze: I Created An Apocalypse Shelter, URL=`.../global-freeze-i-created-an-apocalypse-shelter` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 104/104 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 104/104 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mgread.io/.../64c8ad8e6ae6d-300x400.webp` (image/webp (encoding: lossy), 30688 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../global-freeze-i-created-an-apocalypse-shelter` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mgread.io/.../64c8ad8e6ae6d.webp` (image/webp (encoding: lossy), 32064 bytes, 300x420) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Drama |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The world is plunged into an icy age, and 95% of humanity is wiped out! In his previous life, Zhang Yi was tragically killed by the very people he helped, thanks to his kind heart.But fear not, for Zhang Yi has been reborn and now possesses the awesome power – space manipulation! He's gone completely bonkers hoarding supplies for the icy apocalypse and is ready to rule the frozen wasteland! He vows to unleash a hundred times the pain on those who harmed him in the past!<br><br>Chapters: 633<br>Alternative title: Quan Qiu Bing Feng: Wo Dazaole Mori Anquan Wu / Freezing the World: I Built a Doomsday Safehouse Global Freeze: I Built a Doomsday Shelter Global Freeze: I Created an Apocalypse Shelter Periodo Glaciar: Construí un Refugio Apocalíptico Quán Qiú Bīng Fēng: Wǒ Dǎzàole Mòrì Ānquán Wū The World Is Frozen: I Built a Doomsday Safe House TOÀN CẦU BĂNG PHONG: TA CHẾ TẠO PHÒNG AN TOÀN TẠI TẬN THẾ Я создал бункер в замороженном мире 全球冰封: 我打造了末日安全屋 冰封为王 冰封末日 地球速冻 寒武纪大地主<br>Rating: 4.3/5 (15)<br>Views: 1.1 M<br>Last updated: 15:24 19/04/2026 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 633 chapters |  |  |  |
| chapter dates | PASS | 633 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mg.mgread.io/.../1.jpg` (image/jpeg, 136997 bytes, 1200x1000) |  |  |  |
