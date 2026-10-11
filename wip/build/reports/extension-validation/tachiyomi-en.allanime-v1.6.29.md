# Extension Validation Report

- Extension: tachiyomi-en.allanime-v1.6.29
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4709139914729853090
- Source name: AllManga
- Source language: en
- Selected manga input: popular offset 0: Solo Leveling (`.../SFrub9DDGMrmdZWyh`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Solo Leveling (`.../SFrub9DDGMrmdZWyh`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The Archmage Returns After 4000 Years (`.../6nr5S4MaqhfMtsgqT`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Isshou Hatarakitakunai Ore ga, Classmate no Daininki Idol ni Natsukaretara (`.../ZmLZhee8u4n4P2EAn`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | The Guy She Was Interested in Wasn't a Guy at All (`.../wfu4XGFzLmLBsmAYd`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 7 | The Privilege of the Second Life is Power Leveling (`.../YJjAtF4dzJJCakcvi`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Solo Leveling (`.../SFrub9DDGMrmdZWyh`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 219 | Chapter 0: Prologue (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | keiyoushi.b.D: Timed out waiting for WebView after 20s | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | keiyoushi.b.D: Timed out waiting for WebView after 20s | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Solo Leveling, URL=`SFrub9DDGMrmdZWyh` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 87/87 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 86/87 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wp.youtube-anime.com/.../006.1.webp <redacted query values: w>` (image/webp (encoding: lossy), 13548 bytes, 250x346) |  |  |  |
| details identity | PASS | Details preserved selected URL `SFrub9DDGMrmdZWyh` |  |  |  |
| details thumbnail URL | PASS | `https://wp.youtube-anime.com/.../006.1.webp <redacted query values: w>` |  |  |  |
| details author | PASS | REDICE Studio (레드아이스 스튜디오) |  |  |  |
| details artist | PASS | REDICE Studio (레드아이스 스튜디오) |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Manhwa, Shounen, Webtoons, Magic, Reincarnation, Super Power, Tragedy, Isekai, Demons, Drama, Supernatural, theme:war, theme:dungeon, theme:male_protagonist, format:full_color, theme:urban_fantasy, theme:necromancy, theme:gods, theme:primarily_adult_cast, theme:politics, theme:age_regression, theme:post_apocalyptic, theme:tragedy, theme:video_games, theme:memory_manipulation, theme:heterosexual, theme:anti_hero, theme:time_manipulation, Adult Cast, Shounen(B), Dungeons, theme:monsters, Tower Climbing, theme:creature_taming, Urban Fantasy, format:long_strip |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Ten years ago, "the Gate" appeared and connected the real world with the realm of magic and monsters. To combat these vile beasts, ordinary people received superhuman powers and became known as "Hunters." Twenty-year-old Sung Jin-Woo is one such Hunter, but he is known as the "World's Weakest," owing to his pathetic power compared to even a measly E-Rank. Still, he hunts monsters tirelessly in low-rank Gates to pay for his mother's medical bills. <br><br><br><br>However, this miserable lifestyle changes when Jin-Woo—believing himself to be the only one left to die in a mission gone terribly wrong—awakens in a hospital three days later to find a mysterious screen floating in front of him. This "Quest Log" demands that Jin-Woo completes an unrealistic and intense training program, or face an appropriate penalty. Initially reluctant to comply because of the quest's rigor, Jin-Woo soon finds that it may just transform him into one of the world's most fearsome Hunters. <br><br><br><br>\[Written by MAL Rewrite\]<br><br>\[MyAnimeList\](https://myanimelist.net/.../121496)<br>\[AniList\](https://anilist.co/.../105398)<br><br><br>Alternative Titles:<br>- I am the only the one who levels up<br>- Тільки я візьму новий рівень<br>- Поднятие уровня в одиночку<br>- الإرتقاء بالمستوى منفردًا<br>- Ore Dake Level Up na Ken<br>- Singur îmi ridic nivelul<br>- Tek başına seviye atlama<br>- केवल मैं स्तर बढ़ाता हूं<br>- Tôi Thăng Cấp Một Mình<br>- Na Honjaman Lebel-eob<br>- Na Honjaman Level-Up<br>- Ben yanlız gelişirim<br>- Na Honjaman Level Up<br>- Yalnız seviye atlama<br>- I level up alone<br>- I Alone Level-Up<br>- Grinding Sendiri<br>- 俺だけレベルアップな件 ～外伝～<br>- Only I Level up<br>- 俺だけレベルアップな件〜外伝〜<br>- Solo Levelling<br>- Upando sozinho<br>- სოლო ლეველინგი<br>- Solo Leveling<br>- Solo adtritio<br>- Jogador solo<br>- سولو ليفيلنغ<br>- 俺だけレベルアップな件<br>- سولو لولینگ<br>- सोलो लेभलिङ<br>- 나 혼자만 레벨업<br>- 我独自升级<br>- 我獨自升級<br>- تکرو<br>- 나혼렙<br>- Вебтун. Поднятие уровня в одиночку. Solo Leveling |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 219 chapters |  |  |  |
| chapter dates | PASS | 219 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Timed out waiting for WebView after 20s |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
