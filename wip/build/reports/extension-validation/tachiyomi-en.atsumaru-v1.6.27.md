# Extension Validation Report

- Extension: tachiyomi-en.atsumaru-v1.6.27
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2327480808438768017
- Source name: Atsumaru
- Source language: en
- Selected manga input: popular offset 0: Return of the Blossoming Blade (`.../1lXE8`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Return of the Blossoming Blade (`.../1lXE8`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | The Greatest Estate Developer (`.../fX0YJ`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | Please Be My First Boyfriend! (`.../mL7-`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Shibou End wo Kaihi shita Galge no Heroine-tachi ga Ore no "Nikkichou" wo Yonde Himitsu wo Shitta Rashii (`.../sbTe`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Return of the Blossoming Blade (`.../1lXE8`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Return of the Blossoming Blade (`.../1lXE8`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1345 | Episode 1 (`.../Tl_4Qg`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 181 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Return of the Blossoming Blade, URL=`1lXE8` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.atsu.moe/.../Rxvn8VCM9vw8M0Bl-large.avif` (image/avif (format: avif), 42258 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `1lXE8` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.atsu.moe/.../Rxvn8VCM9vw8M0Bl-large.avif` |  |  |  |
| details author | PASS | LICO, Biga |  |  |  |
| details artist | PASS | LICO |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Comedy, Drama, Fantasy, Historical, Martial Arts, Cultivation, Sects, Murim, Reincarnated in the Future, Reincarnation, Martial Artist, Swordplay, Male Lead, Wuxia, Based on a Novel, Alcohol, Comedic Facial Expressions, Debts, Politics, Religion, Revenge, Chinese Ambience, Character Development, Character Growth, Protagonist Strong from the Start, Demons, Training, Anti-Hero, Age Progression, Long-Haired Male Lead, Rude Character, Strong Character, Arrogant Male Lead, Primarily Male Cast, Shounen, Economics, Gore, Greed, Organizations, Orphans, Slapstick, Taoism, Violence, Dead Friend, Zombies, Apprentice, Disciple, Competitions, Treasure Hunt, China, Alliance, Facial Expressions, Tanned Skin, Athletic Protagonist, Bold Male Lead, Fearless Male Lead, Greedy Male Lead, Hard-Working Protagonist, Overpowered Male Lead, Overpowered Protagonist, Pragmatic Male Lead, Rude Male Lead, Sarcastic Male Lead, Sharp-Tongued Protagonist, Smart Male Lead, Smart Protagonist, Snarky Male Lead, Straightforward Male Lead, Strong Protagonist, Violent Male Lead, Violent Protagonist, Introspection, Past Plays a Big Role, Master-Disciple Relationship, Ojou-sama, Long-Haired Male Character, Famous Male Lead, Genius, Reincarnated Protagonist, Swords, Elaborate, Web Comic With OST, Rich Family, Kill or Be Killed Situation, Time Skip, Merchants, Swordsman, Swordswoman, Teachers, Mountain Climbing, Mountain, Sadists, Long-Haired Female Lead, Muscles, Muscular Male Lead, Rich Characters, Athletic Male Lead, Bold Female Lead, Charismatic Male Lead, Cunning Male Lead, Female Fighters, Hard-Working Female Lead, Hard-Working Male Lead, Quirky Character, Vindictive Male Lead, Ancient China, Censorship, Full Color, Longstrip, Based on a Web Novel |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★✬ 8.52<br>**Year:** 2021 · **Views:** 5.6M<br><br>---<br><br>When Cheong-Myeong of the Mount Hua Sect awakens a hundred years in the future, his last memories are of a bloody battle against the Leader of the Demonic Cult, the evil Cheon-Ma. The battle almost saw the end of the Ten Great Sects of ancient China, when Cheong-Myeong ended the hard-fought struggle by striking down Cheon-Ma. Soon after, he succumbed to his wounds, filled with regret at their pyrrhic victory. All is not lost, however, as he awakens to his second chance at life. Shocked to find his beloved Mount Hua Sect reduced to a mere shadow of itself in the present day, Cheong-Myeong embarks on a journey to restore Mount Hua to its former glory.<br><br>(Source: WEBTOON, edited)<br><br>**Links:**<br>- \[AniList\](https://anilist.co/.../132144)<br>- \[MyAnimeList\](https://myanimelist.net/.../146878)<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../cmx86o6)<br>- \[MangaBaka\](https://mangabaka.org/.../1746)<br>- \[Kitsu\](https://kitsu.app/.../59455)<br>- \[AnimePlanet\](https://www.anime-planet.com/.../return-of-the-blossoming-blade)<br>- \[Kenmei\](https://www.kenmei.co/.../return-of-the-blossoming-blade)<br><br>**Alternative Names:**<br>- Hwasan Gwihwan<br>- Return of Sword Master<br>- Return of the Flowery Mountain Sect<br>- Return of the Huashan Sect<br>- Return of the Mount Hua Sect<br>- Volcanic Return<br>- Hwasangwihwan<br>- 화산귀환<br>- Die Rückkehr der Huashan-Sekte<br>- El regreso de la secta del monte hua<br>- El retorno de la hoja del Ciruelo<br>- El retorno del Monte Hua<br>- Hoa Sơn Quy Hoàn<br>- Le retour du clan Hwasan<br>- O retorno da seita do Monte Hua<br>- Retorno da seita do monte hua<br>- Secta de la montaña<br>- Возрождение Хуашань<br>- หวนคืนสู่ฮวาซาน<br>- 剑尊归来<br>- 劍尊歸來<br>- 劍尊歸來 第二季<br>- 花山歸還<br>- 華山帰還 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1345 chapters |  |  |  |
| chapter dates | PASS | 1345 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 181 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.atsu.moe/.../1ec9f2bcd9505e1e.avif` (image/avif (format: avif), 27041 bytes, 690x1280) |  |  |  |
