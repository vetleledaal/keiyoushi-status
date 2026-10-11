# Extension Validation Report

- Extension: tachiyomi-en.asurascans-v1.6.69
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6247824327199706550
- Source name: Asura Scans
- Source language: en
- Selected manga input: popular offset 0: Myst, Might, Mayhem (`.../myst-might-mayhem`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Myst, Might, Mayhem (`.../myst-might-mayhem`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Solo Swordmaster (`.../solo-swordmaster`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Pick Up a Grimoire, Become a Mage (`.../pick-up-a-grimoire-become-a-mage`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | The Seventh Prince Wants to Bail (`.../the-seventh-prince-wants-to-bail`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Myst, Might, Mayhem (`.../myst-might-mayhem`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Myst, Might, Mayhem (`.../myst-might-mayhem`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 119 | Chapter 1 - Prologue (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Myst, Might, Mayhem, URL=`.../myst-might-mayhem` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.asurascans.com/.../myst-might-mayhem.78970c.webp` (image/webp (encoding: lossy), 246990 bytes, 1042x1510) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../myst-might-mayhem` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.asurascans.com/.../myst-might-mayhem.78970c.webp` |  |  |  |
| details author | PASS | Hanjung Wolya |  |  |  |
| details artist | PASS | REDICE Studio |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Crazy MC, Fantasy, Murim |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Rank: #1 • Rating: 9.78 • Bookmarks: 97.0K<br><br>Jeong, the Slaughtering Scythe Demon, feels joy in killing others. He happens to look just like Mok Gyeongwoon, the third young master of the Mok Sword Manor... "If you pretend to be me and live my life. I will let you out of this prison." "Will you really give me that chance?" Slash Kill the third young master and live his life pretending to be him. Will the fake Mok Gyeongwoon survive this life? The serial killer begins his new life as the third young master of the great Mok Sword Manor.<br><br>Alternative Titles:<br>- 怪力亂神<br>- Deus do Caos Todo-Poderoso<br>- ลับลางลวง<br>- Monarca del Caos<br>- Goeryeok Nansin<br>- 怪力乱神 (僩㳞月夜)<br>- 괴력 난신<br>- El Dios caótico de la fuerza extraordinaria<br>- 怪力乱神～血に染まった本性～<br>- The Chaotic God of Extraordinary Strength<br>- An Awesome Power<br>- 怪力 亂神<br>- Miseuteu, Maiteu, Meihem<br>- Sương Mù, Sức Mạnh, Hỗn Loạn<br>- Brume, Puissance et Chaos<br>- Niebla, Poder y Caos<br>- Névoa, Poder e Caos<br>- Kabut, Kekuatan, Kekacauan<br>- Sis, Güç, Kaos<br>- 미스트, 마이트, 메이헴<br>- 마신강림<br>- ミスト、マイト、メイヘム<br>- 迷雾、力量、混乱<br>- Туман, сила, хаос<br>- ضباب، قوة، وفوضى<br>- หมอก พลัง ความโกลาหล |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 11 name |  |  |  |
| chapters | PASS | 119 chapters |  |  |  |
| chapter dates | PASS | 119 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.asurascans.com/.../001.webp <redacted query values: v>` (image/webp (encoding: lossy), 220650 bytes, 1200x800) |  |  |  |
