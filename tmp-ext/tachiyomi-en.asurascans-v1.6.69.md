# Extension Validation Report

- Extension: tachiyomi-en.asurascans-v1.6.69
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Selected manga input: popular offset 0: Surviving The Game as a Barbarian (`.../surviving-the-game-as-a-barbarian`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Surviving The Game as a Barbarian (`.../surviving-the-game-as-a-barbarian`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The Return of the Crazy Demon (`.../the-return-of-the-crazy-demon`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Surviving as a Genius on Borrowed Time (`.../surviving-as-a-genius-on-borrowed-time`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | The Tale of Cultivation and Demon Extermination (`.../the-tale-of-cultivation-and-demon-extermination`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Surviving The Game as a Barbarian (`.../surviving-the-game-as-a-barbarian`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Surviving The Game as a Barbarian (`.../surviving-the-game-as-a-barbarian`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 159 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Surviving The Game as a Barbarian, URL=`.../surviving-the-game-as-a-barbarian` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.asurascans.com/.../surviving-the-game-as-a-barbarian.86af24.webp` (image/webp (encoding: lossy), 350488 bytes, 1446x2048) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../surviving-the-game-as-a-barbarian` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.asurascans.com/.../surviving-the-game-as-a-barbarian.86af24.webp` |  |  |  |
| details author | PASS | Jung Yun-kang |  |  |  |
| details artist | PASS | MIDNIGHT Studio |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Comedy, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Rank: #1 • Rating: 9.73 • Bookmarks: 87.0K<br><br>The protagonist, Lee Hansoo, finally reached the boss stage after nine years of playing the game "Dungeon and Stone", which no one had been able to clear until now. However, just as he entered the boss room, he saw a notification alerting him that he had cleared the tutorial and that he had possessed the body of the barbarian, Bjorn Jandel, who was a playable character in the game. In the world of "Dungeon and Stone", only one city remained standing after the destruction of the world. A labyrinth would open every month, offering explorers a chance to clear it for rewards. In this world where barbarians are seen as useless in everything but battle, a barbarian who does not fight will not be able to survive. If one cannot pay the outrageous taxes demanded by the city, the only fate that awaits is a downgrade in status to a 'lower-class citizen'. If it is revealed that you are possessing the character you are playing, you will be named an "evil spirit" and killed. The only way for Lee Hansoo to survive is to enter the labyrinth and fight while risking his life. With the skills he has accumulated over nine years of gameplay and a stupidly strong barbarian physique, he strives to survive in this game...<br><br>Alternative Titles:<br>- 變成蠻族！遊戲生存戰<br>- 게임 속 바바리안으로 살아남기<br>- 化身野蛮人在异界生存<br>- 転生したらバーバリアンになった<br>- เอาชีวิตรอดในเกมฉบับคนเถื่อน<br>- Sobreviviendo en el Juego como un bárbaro<br>- Surviving as a Barbarian in the Game<br>- Geim Sok Babarianeuro Saranamgi<br>- Barbarian Quest in Game<br>- Geim Sok Babarian-euro Saranapgi<br>- STGAAB<br>- Sinh Tồn Trong Game Với Vai Trò Dã Nhân<br>- Survivre dans le Jeu en tant que Barbare<br>- Sobrevivendo no Jogo como um Bárbaro<br>- Bertahan Hidup di Game sebagai Barbarian<br>- ゲーム内のバーバリアンとして生き残る<br>- 在游戏中作为野蛮人生存<br>- Выживание в игре за варвара<br>- البقاء على قيد الحياة في اللعبة كبربري<br>- เอาชีวิตรอดในเกมด้วยบทบาร์บาเรียน |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 26 name, chapter 43 name, chapter 88 name |  |  |  |
| chapters | PASS | 159 chapters |  |  |  |
| chapter dates | PASS | 159 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.asurascans.com/.../001.webp <redacted query values: v>` (image/webp (encoding: lossy), 205266 bytes, 1200x800) |  |  |  |
