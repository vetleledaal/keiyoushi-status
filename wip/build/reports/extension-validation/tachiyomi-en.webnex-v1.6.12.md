# Extension Validation Report

- Extension: tachiyomi-en.webnex-v1.6.12
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
- Source ID: 319678837350572744
- Source name: Webnex
- Source language: en
- Selected manga input: popular offset 0: Sandmancer of the Scorched Desert (`.../sandmancer-of-the-scorched-desert-dplvimchnw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Sandmancer of the Scorched Desert (`.../sandmancer-of-the-scorched-desert-dplvimchnw`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | My Possession Became a Ghost Story (`.../my-possession-became-a-ghost-story-9xd5mkpr5e`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 15 | Bone Collection (`.../bone-collection-1iijd5kzvf`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Villain To Kill (`.../villain-to-kill-7p37fu9xs5`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sandmancer of the Scorched Desert (`.../sandmancer-of-the-scorched-desert-dplvimchnw`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sandmancer of the Scorched Desert (`.../sandmancer-of-the-scorched-desert-dplvimchnw`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 403 | Chapter 1: The Desert Grave (`.../dplvimchnw-7p8vshg8`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sandmancer of the Scorched Desert, URL=`sandmancer-of-the-scorched-desert-dplvimchnw` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Secretly More Powerful than the Hero, URL=`secretly-more-powerful-than-the-hero-3obblmugro` at page 1 offset 35 and page 2 offset 1 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 103/103 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 103/103 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.webnex.cc/.../23b63dc32a544f24e293d1f11627a15118546af74f2329da0832728d508f04e3.webp` (image/webp (encoding: lossy), 258142 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `sandmancer-of-the-scorched-desert-dplvimchnw` |  |  |  |
| details thumbnail URL | PASS | `https://images.webnex.cc/.../23b63dc32a544f24e293d1f11627a15118546af74f2329da0832728d508f04e3.webp` |  |  |  |
| details author | PASS | Daily Books, Woo-Gak, Hamel, Woogack, Ugak |  |  |  |
| details artist | PASS | STUDIO SOZO, MikaShiki, Daily Books |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Apocalypse, Drama, Fantasy, Genius, Mage, Magic, Martial Arts, Mystery, Shounen, Survival, Tragedy, War, Webtoon, superpower, Based on a Web Novel, Desert, Elemental Powers, Full Color, Longstrip, Male Lead, Male Protagonist, Post-Apocalyptic, Web Comic, fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★✬ 9<br>2026 · Korean<br><br>\\[By the Author that brought you \<Legend of the Northern Blade and Reaper of the Drifting Moon>!"My name is Zeon, and my weapon is the entire desert."Earth was forcefully terraformed. The oceans evaporated, and the land turned to sand.Zeon is the sole Sandmancer of the Scorched Desert that Earth has become.The world calls him the "Sand Wraith."<br><br>**Alternative Names:**<br>- 불탄 사막의 모래술사<br>- Mago De Areia No Deserto<br>- Ta Chính Là Pháp Sư Bóng Ma Trên Sa Mạc<br>- The Sand Mage of the Scorched Desert<br>- The Scorched Desert's Sand Mage<br>- 燃烧沙漠的术士<br>- The Scorched Desert’s Sand Mage<br>- 불탄 사막의 모래술사 불탄 사막의 모래술사 불탄 사막의 모래술사<br>- 終末の砂世界で、俺だけが砂を支配する<br>- Sand Mage of the Burnt Desert<br>- Desert Sand Sorcerer<br>- Scorched Earth Sand Mage<br>- 불타는 사막의 모래 마법사<br>- 사막의 모래 마법사<br>- 灼热沙漠的砂法师<br>- 沙漠砂之法师<br>- 焼け焦げた砂漠の砂魔法使い<br>- 砂漠の砂魔術師<br>- The Sand Sorcerer of the Burnt Desert<br>- Bultan Samag-ui Moraesulsa<br>- 焦土砂漠の砂魔導士<br>- 焦土沙漠的砂魔法师<br>- Sand Wizard of the Burnt Desert<br>- The Last Sandmancer<br>- El Espectro del Desierto Calcinado<br>- Mag<br>- Desert Sandmancer<br>- Yeolsa-ui Moresulsa<br>- Pháp Sư Cát Của Sa Mạc Thiêu Đốt<br>- Le Sandmancien du Désert Brûlant<br>- El Mago de la Arena del Desierto Abrasador<br>- O Mago da Areia do Deserto Escaldante<br>- Pengendali Pasir di Padang Pasir Hangus<br>- 열사의 모래술사<br>- 灼熱の砂術師<br><br>**Links:**<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../2ucrf2e)<br>- \[AniList\](https://anilist.co/.../211365)<br>- \[MyAnimeList\](https://myanimelist.net/.../195016)<br>- \[MangaBaka\](https://mangabaka.org/.../586177)<br>- \[Comick\](https://comick.dev/.../GIrNKRzt)<br>- \[NovelUpdates\](https://www.novelupdates.com/.../sand-mage-of-the-burnt-desert) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 403 chapters |  |  |  |
| chapter dates | PASS | 403 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.webnex.cc/.../55d76a4377b096680787cb04cfd2ba1e1c939ad3ae587f024498394f46d55743.webp` (image/webp (encoding: lossy), 683870 bytes, 709x10000) |  |  |  |
