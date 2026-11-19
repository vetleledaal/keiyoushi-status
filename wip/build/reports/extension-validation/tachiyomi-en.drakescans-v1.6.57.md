# Extension Validation Report

- Extension: tachiyomi-en.drakescans-v1.6.57
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
- Source theme: vinetheme
- Source ID: 7298341958704597260
- Source name: Drake Scans
- Source language: en
- Selected manga input: popular offset 0: Disastrous Necromancer (`.../drake-s-disastrous-necromancer`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Disastrous Necromancer (`.../drake-s-disastrous-necromancer`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Rebirth of the Thief Who Roamed The World (`.../drake-s-rebirth-of-the-thief-who-roamed-the-world`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | After Rebirth, I Used Mirror Reversal For Vengeance (`.../cmsgpt94l000x5cqkx43plmfp`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Starting with ×10: You Really Exploited the Bug! (`.../cmtd44ayv0014sas88uv1tjco`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Disastrous Necromancer (`.../drake-s-disastrous-necromancer`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Disastrous Necromancer (`.../drake-s-disastrous-necromancer`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 323 | Chapter 1 (`.../drake-c-1208`) |  | 1-10s |
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
| details description | PASS | In a world where magic and monsters exist, Lin Moyu has hit the age of acquiring his very own profession. While most would be lucky just to obtain a high-level combat class, Moyu becomes the ultrarare necromancer! Being the first and only one of his kind, he has no idea of the potential he possesses on his journey to level up and face great challenges. What new heights will Moyu achieve with his unique army of undead?<br><br>Rating: 9.6<br>Type: MANHUA<br>Origin: CHINESE<br><br>**Alternative titles:**<br>- Catastrophic Necromancer<br>- Necromancer! I am a Natural Disaster<br>- Necromancer: King of the Scourge<br>- Necromancer: Rei dos Mortos<br>- Necromancer: Wujud Petaka<br>- Necromante: O Rei da Calamidade<br>- O Necromante: A Praga Encarnada<br>- Scourge Necromancer<br>- Si Ling Fashi! Wo Ji Shi Tianzai<br>- The Necromancer: Scourge Incarnate<br>- Thảm Họa Tử Linh Sư<br>- ¡Nigromante, La Llegada del Desastre!<br>- Некромант - я катастрофа<br>- เนโครแมนเซอร์ เทพผู้คุมความตาย<br>- 全民转职：死灵法师！我即是天灾<br>- 唯一無二のネクロマンサー<br>- 死灵法师！我即是天灾<br>- 유일무이의 네크로맨서 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 323 chapters |  |  |  |
| chapter dates | PASS | 323 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://drakecomic.net/.../disastrous-necromancer <redacted query values: sort>` to `https://drakecomic.net/.../disastrous-necromancer <redacted query values: sort and _rsc>` (1 redirects); popular: `https://drakecomic.net/.../disastrous-necromancer <redacted query values: sort>` to `https://drakecomic.net/.../disastrous-necromancer <redacted query values: sort and _rsc>` (1 redirects); popular: `https://drakecomic.net/.../disastrous-necromancer <redacted query values: sort and page>` to `https://drakecomic.net/.../disastrous-necromancer <redacted query values: sort, page, and _rsc>` (1 redirects); popular: `https://drakecomic.net/.../disastrous-necromancer <redacted query values: sort and page>` to `https://drakecomic.net/.../disastrous-necromancer <redacted query values: sort, page, and _rsc>` (1 redirects); popular: `https://drakecomic.net/.../disastrous-necromancer <redacted query values: sort and page>` to `https://drakecomic.net/.../disastrous-necromancer <redacted query values: sort, page, and _rsc>` (1 redirects); popular: `https://drakecomic.net/.../1` to `https://drakecomic.net/.../1 <redacted query values: _rsc>` (1 redirects) |  |  |  |
| page load | PASS | `https://drakecomic.net/.../p0001.webp` (image/webp (encoding: lossy), 201052 bytes, 700x2280) |  |  |  |
