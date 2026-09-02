# Extension Validation Report

- Extension: tachiyomi-en.drakescans-v1.6.50
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
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
- Source ID: 7298341958704597260
- Source name: Drake Scans
- Source language: en
- Selected manga input: popular offset 0: Disastrous Necromancer (`.../drake-s-disastrous-necromancer`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Disastrous Necromancer (`.../drake-s-disastrous-necromancer`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Global Job Change: Starting With the Hidden Class Necromancer Lord (`.../drake-s-global-job-change-starting-with-the-hidden-class-necromancer-lord`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Versatile Sword Cultivator (`.../drake-s-versatile-sword-cultivator`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Skills Without Cooldown? I Avatar into an Undead Calamity! (`.../drake-s-skills-without-cooldown-i-avatar-into-an-undead-calamity`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Disastrous Necromancer (`.../drake-s-disastrous-necromancer`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Disastrous Necromancer (`.../drake-s-disastrous-necromancer`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 302 | Chapter 1 (`.../drake-c-1208`) |  | <1s |
| pages | `getPageList(chapter)` | success | 35 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Disastrous Necromancer, URL=`drake-s-disastrous-necromancer` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://drakecomic.net/.../cover.webp` (image/webp (encoding: lossless), 915582 bytes, 810x1074) |  |  |  |
| details identity | PASS | Details preserved selected URL `drake-s-disastrous-necromancer` |  |  |  |
| details thumbnail URL | PASS | `https://drakecomic.net/.../cover.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | MANHUA, CHINESE, Action, Adventure, Magic, Martial Arts, Monsters, School Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | In a world where magic and monsters exist, Lin Moyu has hit the age of acquiring his very own profession. While most would be lucky just to obtain a high-level combat class, Moyu becomes the ultrarare necromancer! Being the first and only one of his kind, he has no idea of the potential he possesses on his journey to level up and face great challenges. What new heights will Moyu achieve with his unique army of undead?<br><br>Rating: 10.0<br>Type: MANHUA<br>Origin: CHINESE<br><br>Alternative titles: <br>- Catastrophic Necromancer<br>- Necromancer! I am a Natural Disaster<br>- Necromancer: King of the Scourge<br>- Necromancer: Rei dos Mortos<br>- Necromancer: Wujud Petaka<br>- Necromante: O Rei da Calamidade<br>- O Necromante: A Praga Encarnada<br>- Scourge Necromancer<br>- Si Ling Fashi! Wo Ji Shi Tianzai<br>- The Necromancer: Scourge Incarnate<br>- Thảm Họa Tử Linh Sư<br>- ¡Nigromante, La Llegada del Desastre!<br>- Некромант - я катастрофа<br>- เนโครแมนเซอร์ เทพผู้คุมความตาย<br>- 全民转职：死灵法师！我即是天灾<br>- 唯一無二のネクロマンサー<br>- 死灵法师！我即是天灾<br>- 유일무이의 네크로맨서 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 302 chapters |  |  |  |
| chapter dates | PASS | 302 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://drakecomic.net/.../p0001.webp` (image/webp (encoding: lossy), 201052 bytes, 700x2280) |  |  |  |
