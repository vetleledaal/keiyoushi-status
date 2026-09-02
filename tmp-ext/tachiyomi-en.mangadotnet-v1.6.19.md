# Extension Validation Report

- Extension: tachiyomi-en.mangadotnet-v1.6.19
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
- Source implementation: keiyoushi.source.b
- Source ID: 5900936305360403385
- Source name: Mangadotnet
- Source language: en
- Selected manga input: popular offset 0: Omniscient Reader (`.../175`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 28 | Omniscient Reader (`.../175`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 28 | Swordmaster’s Youngest Son (`.../77`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | Shou Shi Fujun Zhengchong Cheng Yin (`.../29491`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 28 | Bulgeun Yacha (`.../30612`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 56 | Omniscient Reader (`.../175`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Omniscient Reader (`.../175`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1236 | Chapter 0: Prologue (`.../%7B%22id%22:%2262029%22,%22source%22:%22user%22,%22isVolume%22:false%7D`) |  | <1s |
| pages | `getPageList(chapter)` | success | 167 |  |  | <1s |

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
| popular listing | PASS | 28 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Omniscient Reader, URL=`175` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 168/168 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 168/168 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://fakeimg.ryd.tools/.../400x600 <redacted query values: text>` -> 2 manga URLs (examples: `44043`, `43759`) |  |  |  |
| thumbnail | PASS | `https://mangadot.net/.../cover_49c22f36da871100.webp` (image/webp (encoding: lossy), 141076 bytes, 1448x2048) |  |  |  |
| details identity | PASS | Details preserved selected URL `175` |  |  |  |
| details thumbnail URL | PASS | `https://mangadot.net/.../cover_49c22f36da871100.webp` |  |  |  |
| details author | PASS | ​Singsyong, UMI |  |  |  |
| details artist | PASS | ​​Sleepy-C |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Drama, Fantasy, Mystery, Psychological, Supernatural, Adapted to Anime, Adult Male Lead, Adult Protagonist, Age Regression, Alternate Universe, Apocalypse, Based on a Novel, Based on a Web Novel, Battle Royale, Body Horror, Competent Male Lead, Complicated Family, Cosmic Horror, Crossover, Death Game, Deceptive Male Lead, Demons, Depression, Dragons, Ensemble Cast, Family Drama, Family Life, Female Lead, Found Family, Friendship, Full Color, Game Elements, Game of Death, Game World, High Stakes Games, Important Non-Romantic Relationship, Impregnation, Isekai, Kill or Be Killed Situation, Longstrip, Male Lead, Male Pregnancy, Murder, Parody, Perceptive Male Lead, Philosophy, Play or Die Situation, Post-Apocalyptic, Primarily Adult Cast, Religion, Smart Male Lead, Strong-Willed Character, Strong-Willed Male Lead, Strong-Willed Protagonist, Subtle Romance, Survival, Survival Game, Swordplay, Terrorism, Time Loop, Unrealistic Fighting, Urban, Urban Fantasy, Web Comic |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | ★★★★★ 9.0<br><br>**Year:** 2020 · **Chapters:** 312 · **Tracked:** 1649 · **Content Rating:** Safe · 174 ratings<br><br>---<br><br>Back then, Dok-Ja had no idea. He had no idea his favorite web novel 'Three Ways to Survive the Apocalypse' was going to come to life, and that he would become the only person to know how the world was going to end. He also had no idea he would end up becoming the protagonist of this novel-turned-reality. Now, Dok-Ja will go on a journey to change the course of the story and save humankind once and for all. <br><br>(Source: WEBTOON, edited)<br><br><br>**Links:**<br>- \[AniList\](https://anilist.co/.../119257)<br>- \[MangaUpdates\](https://mangaupdates.com/.../n50wl4o)<br>- \[MangaBaka\](https://mangabaka.org/.../2060)<br>- \[MyAnimeList\](https://myanimelist.net/.../132214)<br>- \[Kitsu\](https://kitsu.app/.../56452)<br>- \[Source\](https://atsu.moe/.../RxJM9)<br><br>**Alternative Names:**<br>- 전독시<br>- 전지적 독자 시점<br>- Der allwissende Leser<br>- Góc nhìn của Độc giả Toàn tri<br>- Jeonjijeok Dokja Sijeom<br>- Lecteur omniscient<br>- Lector omnisciente<br>- Omniscient Reader's Point of View<br>- Omniscient Reader's Viewpoint<br>- Omniscient Reader’s Viewpoint<br>- ORV<br>- Ponto de vista de um leitor onisciente<br>- Punkt Widzenia Wszechwiedzącego Czytelnika<br>- Punto de vista de lector omnisciente<br>- Toàn Trí Độc Giả<br>- Zenchiteki na Dokusha no Shiten kara<br>- Всеведущий читатель<br>- Всезнаючий читач<br>- خواننده همه فن حریف<br>- دیدگاه خواننده‌ی همه‌چی‌دون<br>- وجهة نظر القارئ العراف<br>- อ่านชะตาวันสิ้นโลก<br>- 全知的な読者の視点から<br>- 全知讀者視角<br>- 全知读者<br>- 全知读者视角<br>- 전지적 독자 시점<br>- 전독시<br>- Jeonjijeog Dogja Sijeom<br>- Zenchi-teki na Dokusha no Shiten Kara |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 3 name, chapter 16 name, chapter 20 name, chapter 24 name, chapter 28 name, chapter 45 name, chapter 49 name, chapter 53 name, chapter 57 name, chapter 61 name, chapter 65 name, chapter 73 name, chapter 93 name, chapter 137 name, chapter 141 name, chapter 157 name, chapter 305 name, chapter 313 name, chapter 405 name, chapter 409 name, chapter 413 name, chapter 417 name, chapter 421 name |  |  |  |
| chapters | PASS | 1236 chapters |  |  |  |
| chapter dates | PASS | 1236 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 167 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mangadot.net/.../001.jpg` (image/jpeg, 31778 bytes, 800x1000) |  |  |  |
