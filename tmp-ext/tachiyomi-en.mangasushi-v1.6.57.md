# Extension Validation Report

- Extension: tachiyomi-en.mangasushi-v1.6.57
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
- Source ID: 3606721916149050760
- Source name: Mangasushi
- Source language: en
- Selected manga input: popular offset 0: Lonely Attack on the Different World (`.../1909`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Lonely Attack on the Different World (`.../1909`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 21 | Tensei Akuma no Saikyou Yuusha Ikusei Keikaku (`.../2142`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Kanzen Kaihi Healer no Kiseki (`.../1903`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 21 | Shokei Sareta Saikyou no Gunnyou Majutsushi, Haisenkoku no Elf Hime to Kokka Saikensu ~ Sokoku yo Jama Suru no wa Kattedaga, Sono Majutsu Tsukutta no Ore na Node Kikanai ga? ~ (`.../2201`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lonely Attack on the Different World (`.../1909`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lonely Attack on the Different World (`.../1909`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 331 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lonely Attack on the Different World, URL=`1909` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 93/93 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 93/93 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangasushi.org/.../LONELY-175x238.jpg` (image/jpeg, 18307 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1909` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangasushi.org/.../LONELY-193x278.jpg` (image/jpeg, 23095 bytes, 193x278) |  |  |  |
| details author | PASS | Goji Shoji |  |  |  |
| details artist | PASS | Bibi |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Isekai, Romance, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The strongest doesn’t need any cheats!<br><br>Haruka, who spends his high school life a loner, was suddenly summoned to another world one day along with all his classmates.<br><br>When ol’ God enters the picture, Haruka believes he can just choose whatever cheat skill he wants to help him survive in the new world… But, contrary to his expectations, that list of cheat skills works on a first come, first serve basis. And so, his classmates pick out all the cheat skills.<br><br>His choices now limited to leftovers, Haruka finds himself incapable of assembling a party due to his own “loner” skill. Even though it’s a different world, it seems his adventuring days will be, as per usual, a solitary affair…<br><br>After becoming aware of a crisis looming over his classmates, Haruka makes a silent vow to save them. No relying on cheats! He will walk a heretical path of strength that transcends the need for them.<br><br>The curtain rises on the strongest loner’s otherworld strategy guide!<br><br>Alternative Names: Hitoribocchi no Isekai Kouryaku, ひとりぼっちの異世界攻略 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 331 chapters |  |  |  |
| chapter dates | LINT | 51 of 331 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=51 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mangasushi.org/.../c001---001.png` (image/png, 2332355 bytes, 2230x1600) |  |  |  |
