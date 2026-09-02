# Extension Validation Report

- Extension: tachiyomi-en.likemangain-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 828698548689586603
- Source name: MangaYY
- Source language: en
- Selected manga input: popular offset 0: Catastrophic Necromancer (`.../6622`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Catastrophic Necromancer (`.../6622`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | A Fortune-Telling Princess (`.../18374`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | The Ultimate Wantless Godly Rich System (`.../533`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | The Former Mercenary’s Life as a Prosecutor (`.../69534`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Catastrophic Necromancer (`.../6622`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Catastrophic Necromancer (`.../6622`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 302 | Chapter 1 (`.../chapter-1`) |  | <1s |
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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Catastrophic Necromancer, URL=`6622` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangayy.org/.../1691586425-64d38f795e18d-catastrophicnecromancer193x278-6622.png` (image/png, 320922 bytes, 250x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `6622` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangayy.org/.../1691586425-64d38f795e18d-catastrophicnecromancer193x278-6622-193x278.png` (image/png, 85015 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | The game has emerged into reality, the rules of the world have been turned upside down and humanity has entered the era of becoming players with the world set as a game stage. The only way to become a player is by leveling up to become stronger! The only way to rise to the top of the world! On the day of world fusion Lin Moyue chose to take on the sole hidden class, Necromancer. From then on, Lin Moyue would not die until his summoned creatures died out. “I sit on the throne of bones as the God of the dead and walk between life and death.” “I am a walking catastrophe!”<br><br>Alternative Names: Necromancer, the Ultimate Scourge! Catastrophic Necromancer Disastrous Necromancer Necromancer! I am a Natural Disaster Necromancer: King of the Scourge Necromancer: Rei dos Mortos Scourge Necromancer Si Ling Fashi! Wo Ji Shi Tianzai Thảm Họa Tử Linh Sư ¡Nigromante, La Llegada del Desastre! Некромант - я катастрофа 全民转职：死灵法师！我即是天灾 唯一無二のネクロマンサー 死灵法师！我即是天灾 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 302 chapters |  |  |  |
| chapter dates | LINT | 29 of 302 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=29 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://like.mgread.io/.../1.jpg` (image/jpeg, 2628700 bytes, 900x9440) |  |  |  |
