# Extension Validation Report

- Extension: tachiyomi-en.ksgroupscans-v1.6.54
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
- Source ID: 4307007494151154546
- Source name: KSGroupScans
- Source language: en
- Selected manga input: popular offset 0: Hell Mode: Yarikomi Suki no Gamer wa Hai Settei no Isekai de Musou Suru (`.../1870`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Hell Mode: Yarikomi Suki no Gamer wa Hai Settei no Isekai de Musou Suru (`.../1870`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Yuusha to Yobareta Nochi ni – Soshite Musou Otoko wa Kazoku wo Tsukuru (`.../1968`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Hell Mode: Yarikomi Suki no Gamer wa Hai Settei no Isekai de Musou Suru (`.../1870`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Dantoudai no Hanayome – Sekai wo Horobosu Futsutsuka na Tatsuki desu ga. (`.../1946`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Hell Mode: Yarikomi Suki no Gamer wa Hai Settei no Isekai de Musou Suru (`.../1870`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Hell Mode: Yarikomi Suki no Gamer wa Hai Settei no Isekai de Musou Suru (`.../1870`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 126 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hell Mode: Yarikomi Suki no Gamer wa Hai Settei no Isekai de Musou Suru, URL=`1870` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ksgroupscans.com/.../hellmode-175x238.jpg` (image/jpeg, 18851 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1870` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ksgroupscans.com/.../hellmode-193x278.jpg` (image/jpeg, 23672 bytes, 193x278) |  |  |  |
| details author | PASS | Hamuo |  |  |  |
| details artist | PASS | Tetta Enji |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “Will you be summoned to the world of a never-ending game?” One day, I was looking for a new game, when I suddenly saw that ad. After choosing the most difficult mode of the game, “hell mode,” I was suddenly reincarnated into a new world as a farmhand. As a boy named Allen, I started my journey in another world with the highest difficulty, overcoming all challenges to achieve the greatest title of the game “Summoner.” —– The 1st rank promising novel in the magazine “Let’s become a writer,” an extremely anticipated story.<br><br>Alternative Names: Hellmode ~Gamer Who Likes to Speedrun Becomes Peerless in a Parallel World with Obsolete Setting~, ヘルモード　～やり込み好きのゲーマーは廃設定の異世界で無双する～ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 126 chapters |  |  |  |
| chapter dates | LINT | 17 of 126 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=17 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ksgroupscans.com/.../00.jpg` (image/jpeg, 159973 bytes, 600x600) |  |  |  |
