# Extension Validation Report

- Extension: tachiyomi-all.e621-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 31
- Lint: 2
- Warnings: 3
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3580576879040377475
- Source name: e621
- Source language: all
- Selected manga input: latest offset 0: Fabulous Beasts Pack (`.../59045`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 41 | Cocktober 2025 by Vopach (`.../51343`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | The Tough Girl Discovers Portal Panties by Fluff-Kevlar (`.../56778`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 43 | Fabulous Beasts Pack (`.../59045`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 67 | Rain Burn (`.../42042`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Fabulous Beasts Pack (`.../59045`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Pool #59045 (17 pages) (`.../59045`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 41 entries |  |  |  |
| latest listing | PASS | 43 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Cocktober 2025 by Vopach, URL=`51343` at page 1 offset 0 and page 2 offset 11, title=yuio - eevee and his sisters, URL=`29260` at page 1 offset 2 and page 2 offset 7, title=Hoodieon begins \[Jarlium\], URL=`52738` at page 1 offset 4 and page 2 offset 27, title=Therapy Dog, URL=`52415` at page 1 offset 6 and page 2 offset 35, title=\[Oro97\] Dominant Loona, URL=`55510` at page 1 offset 7 and page 2 offset 17, title=Devil's Advocates \[Twang\], URL=`55429` at page 1 offset 8 and page 2 offset 43, title=NastyCalamari Non-stop Nut November (2025), URL=`52166` at page 1 offset 9 and page 2 offset 5, title=size difference comm \[natdraws\], URL=`56437` at page 1 offset 10 and page 2 offset 33, title=A Dream Job? \[Phluks\], URL=`51048` at page 1 offset 13 and page 2 offset 19, title=Taking a dip! \[Dr.Bubblebum\], URL=`47305` at page 1 offset 15 and page 2 offset 10, title=Slept In! \[Imprettynormai\], URL=`49411` at page 1 offset 16 and page 2 offset 1, title=Robot Cat Waitress - Marugari (Noah), URL=`52702` at page 1 offset 18 and page 2 offset 46, title=Second Reunion by The Secret Cave, URL=`52421` at page 1 offset 19 and page 2 offset 8, title=The BOYS Keepsake \[FanOfTheFurr\], URL=`58450` at page 1 offset 22 and page 2 offset 13, title=Hoodieon returns \[Jarlium\], URL=`55283` at page 1 offset 23 and page 2 offset 26, title=Kinktober 2025 by Oro97, URL=`51398` at page 1 offset 27 and page 2 offset 2, title=Trapped in his Lap, URL=`57336` at page 1 offset 28 and page 2 offset 48, title=Do not feed the Renamon by jingzhou14848, URL=`51702` at page 1 offset 31 and page 2 offset 28, title=Catching Up (M/F) by Zaush, URL=`25961` at page 1 offset 32 and page 2 offset 14, title=How 2 Hide Your Renamon - yourdigimongirl, URL=`35222` at page 1 offset 33 and page 2 offset 20, title=Selene in a jacuzzi \[Keshabear\], URL=`59047` at page 1 offset 36 and page 2 offset 24, title=Braixen's Well Earned Reward by Jinsidraws, URL=`58453` at page 1 offset 40 and page 2 offset 32 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Serving Tail by ThePurp, URL=`49708` at page 1 offset 1 and page 2 offset 36, title=Crash by Spoogiehowl, URL=`45059` at page 1 offset 11 and page 2 offset 8, title=Social Norms - Dibujito, URL=`59043` at page 1 offset 14 and page 2 offset 5, title=Da Silva: Showtime \[Pokefound\], URL=`57073` at page 1 offset 19 and page 2 offset 25, title=RATATATATATA - by Dragonweirdo, URL=`57032` at page 1 offset 39 and page 2 offset 59, title=Robot Romance: I'll Collie You Later by Shane Frost, URL=`59021` at page 1 offset 41 and page 2 offset 6 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 189/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static1.e621.net/.../736cfd80650d0257f825ef98311e1bc9.jpg` (image/jpeg, 32980 bytes, 256x344) |  |  |  |
| details identity | PASS | Details preserved selected URL `59045` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A free art pack for Fabulous Beasts hosted and organized by FlowerBud and SoftestPuffss<br>72 volunteer artists have contributed to make 128 images, 7 animations, and  2 stories, including alternate versions of some submissions, for a total of 137 submissions. Full credits with links on the Itchio page.<br><br>h3. Download<br>https://softestpuffss.itch.io/.../fab-beasts-pack<br><br>h3. Contributing Creators<br>\[quote\]1guy ... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static1.e621.net/.../736cfd80650d0257f825ef98311e1bc9.png` (image/png, 1722158 bytes, 2148x2888) |  |  |  |
