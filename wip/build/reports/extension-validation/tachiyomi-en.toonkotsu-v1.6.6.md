# Extension Validation Report

- Extension: tachiyomi-en.toonkotsu-v1.6.6
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3504033188132514684
- Source name: Toonkotsu
- Source language: en
- Selected manga input: popular offset 0: Chainsaw Man (`.../ldk62`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 42 | Chainsaw Man (`.../ldk62`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 42 | A Silent Voice (`.../yikun`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 17 | The Reincarnated Assassin Is a Swordmaster (`.../w9vsm`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 7 | Descended from Divinity (`.../zmxva`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 9 | Chainsaw Man (`.../ldk62`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Chainsaw Man (`.../ldk62`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 822 | Chapter 1: Dog And Chainsaw (`.../2873068`) |  | <1s |
| pages | `getPageList(chapter)` | success | 57 |  |  | <1s |

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
| popular listing | PASS | 42 entries |  |  |  |
| latest listing | PASS | 17 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chainsaw Man, URL=`.../ldk62` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Descended from Divinity, URL=`.../zmxva` at page 1 offset 13 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 117/117 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 116/117 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://toonkotsu.com/.../720.webp` (image/webp (encoding: lossy), 87584 bytes, 460x722) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ldk62` |  |  |  |
| details thumbnail URL | PASS | `https://toonkotsu.com/.../720.webp` |  |  |  |
| details author | PASS | FUJIMOTO Tatsuki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Shounen, Action, Comedy, Drama, Horror, Mature, Supernatural, Mystery, Psychological, Fantasy, School Life, Demons, Coming of Age, Urban Fantasy, Psychosexual, Male Protagonist, Gore, Body Horror, Henshin, Urban, Monster Boy, Found Family, Survival, Work, Unrequited Love, Anti-Hero, Ensemble Cast, Politics, Human Pet, Monster Girl, Revenge, Femdom, Shapeshifting, Terrorism, Surreal Comedy, Philosophy, Slapstick, Meta, Primarily Teen Cast, Super Power, School, Delinquents, Necromancy, Angels, Amnesia, Yakuza, Mafia, Motorcycles, Denpa, Prophecy |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★★☆ 8.4<br>2018 · 24 volumes · 232 chapters<br><br>Denji’s a poor young man who’ll do anything for money, even hunting down devils with his pet devil Pochita. He’s a simple man with simple dreams, drowning under a mountain of debt. But his sad life gets turned upside down one day when he’s betrayed by someone he trusts. Now with the power of a devil inside him, Denji’s become a whole new man - Chainsaw Man!<br><br>**Magazines:** Shuukan Shounen Jump, Shounen Jump +<br><br>**Links:**<br>- \[AniList\](https://anilist.co/.../105778)<br>- \[MyAnimeList\](https://myanimelist.net/.../116778)<br>- \[MangaDex\](https://mangadex.org/.../a77742b1-befd-49a4-bff5-1ad4e6b0ef7b)<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../ylx5wzn)<br>- \[Kitsu\](https://kitsu.app/.../54139)<br>- \[MangaBaka\](https://mangabaka.org/.../1677)<br>- \[Anime-Planet\](https://www.anime-planet.com/.../chainsaw-man)<br>- \[Shikimori\](https://shikimori.io/.../116778)<br>- \[Anime News Network\](https://www.animenewsnetwork.com/.../manga.php <redacted query values: id>)<br>- \[Anime (TV, 2022)\](https://anilist.co/.../127230)<br><br>**Alternative Names:**<br>- チェンソーマン<br>- CHAINSAW MAN<br>- CSM<br>- Chainsaw Man: Public Safety Saga<br>- Testere Adam<br>- Людина-бензопила<br>- Человек-бензопила<br>- Шынжырлы ара адам<br>- رجل المنشار<br>- مرد اره ای<br>- 체인쏘맨<br>- 체인소 맨<br>- चेन्सो म्यान<br>- มนุษย์เลื่อยยนต์<br>- មនុស្សរណា<br>- チェンソーマン 第二部<br>- 电锯人<br>- 鏈鋸人<br>- 電鋸人 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 822 chapters |  |  |  |
| chapter dates | PASS | 822 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 57 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://toonkotsu.com/.../s_278OBbHUeC2KiEGjSG8fGah-ZT0DZxELM10o8a9FU.bin` (image/png, 2820926 bytes, 1216x1920; server Content-Type: application/octet-stream) |  |  |  |
