# Extension Validation Report

- Extension: tachiyomi-en.mgreadio-v1.6.11
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source theme: initmanga
- Source ID: 15083818169656208
- Source name: Mgread.io
- Source language: en
- Selected manga input: popular offset 0: Global Freeze: I Created An Apocalypse Shelter (`.../global-freeze-i-created-an-apocalypse-shelter`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Global Freeze: I Created An Apocalypse Shelter (`.../global-freeze-i-created-an-apocalypse-shelter`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | After Becoming Financially Free, They Offered Their Loyalty (`.../after-becoming-financially-free-they-offered-their-loyalty`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | I Regressed, So I’m Entering a Fake Engagement with My Favorite Grand Duke (`.../i-regressed-so-im-entering-a-fake-engagement-with-my-favorite-grand-duke`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | My Husband Never Wanted a Child (`.../my-husband-never-wanted-a-child`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 9 | Global Freeze: I Created An Apocalypse Shelter (`.../global-freeze-i-created-an-apocalypse-shelter`) |  | <1s |
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
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mgread.io/.../64c8ad8e6ae6d-300x400.webp` (image/webp (encoding: lossy), 32064 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../global-freeze-i-created-an-apocalypse-shelter` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://mgread.io/.../64c8ad8e6ae6d.webp` was not downloaded |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Drama |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The world is plunged into an icy age, and 95% of humanity is wiped out! In his previous life, Zhang Yi was tragically killed by the very people he helped, thanks to his kind heart.<br><br>But fear not, for Zhang Yi has been reborn and now possesses the awesome power – space manipulation! He's gone completely bonkers hoarding supplies for the icy apocalypse and is ready to rule the frozen wasteland! He vows to unleash a hundred times the pain on those who harmed him in the past!<br><br>Alternative title: Quan Qiu Bing Feng: Wo Dazaole Mori Anquan Wu / Freezing the World: I Built a Doomsday Safehouse Global Freeze: I Built a Doomsday Shelter Global Freeze: I Created an Apocalypse Shelter Periodo Glaciar: Construí un Refugio Apocalíptico Quán Qiú Bīng Fēng: Wǒ Dǎzàole Mòrì Ānquán Wū The World Is Frozen: I Built a Doomsday Safe House TOÀN CẦU BĂNG PHONG: TA CHẾ TẠO PHÒNG AN TOÀN TẠI TẬN THẾ Я создал бункер в замороженном мире 全球冰封: 我打造了末日安全屋 冰封为王 冰封末日 地球速冻 寒武纪大地主 |  |  |  |
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
