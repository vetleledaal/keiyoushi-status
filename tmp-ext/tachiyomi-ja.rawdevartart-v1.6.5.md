# Extension Validation Report

- Extension: tachiyomi-ja.rawdevartart-v1.6.5
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source ID: 3401714773439070137
- Source name: Rawdevart.art
- Source language: ja
- Selected manga input: popular offset 0: Number 1 striker (`.../579`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Number 1 striker (`.../579`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Dare demo Dakeru Kimi ga Suki  (`.../779293`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Isekai Teni Shita Ore wa, H no Tabi ni Gacha wo Hiku! - Motte Kure, Ore no Seiryoku! (`.../857649`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Mobile Suit Gundam Twilight Axis (`.../869840`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Number 1 striker (`.../579`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Number 1 striker (`.../579`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 362 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 81 |  |  | <1s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Number 1 striker, URL=`579` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rawdevart.art/.../579-250x374.webp` (image/webp (encoding: lossy), 36308 bytes, 250x374) |  |  |  |
| details identity | PASS | Details preserved selected URL `579` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://rawdevart.art/.../579-351x525.jpeg` (image/jpeg, 36377 bytes, 351x525; server Content-Type: application/octet-stream) |  |  |  |
| details author | PASS | KANESHIRO Muneyuki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | drama, shounen, sports, action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | **Published:** 7/13/22<br><br>**Views:** 510053<br><br>**Summary:**<br>The story begins with Japan’s elimination from the 2018 FIFA World Cup, which prompts the Japanese Football Union to start a programme scouting high school players who will begin training in preparation for the 2022 Cup. Isagi Youichi, a forward, receives an invitation to this programme soon after his team loses the chance to go to Nationals because he passed to his less-skilled teammate – who missed – without trying to make the game-changing goal by himself.<br><br>**Alternative Titles:**<br>BLUE LOCK ขังดวลแข้ง, Bluelock, Buruu Rokku, Синяя Тюрьма: Блю Лок, ブルーロック, 藍色監獄 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 362 chapters |  |  |  |
| chapter dates | PASS | 362 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 81 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s1.rawuwu.net/.../000-1131x1618.jpeg` (image/jpeg, 332220 bytes, 1131x1618) |  |  |  |
