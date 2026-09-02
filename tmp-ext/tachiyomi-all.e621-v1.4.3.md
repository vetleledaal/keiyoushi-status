# Extension Validation Report

- Extension: tachiyomi-all.e621-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 2
- Warnings: 5
- Skipped: 1
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3580576879040377475
- Source name: e621
- Source language: all
- Selected manga input: latest offset 0: Little lux (`.../58856`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | Cocktober 2025 by Vopach (`.../51343`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | Slept In! [Imprettynormai] (`.../49411`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 58 | Little lux (`.../58856`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 64 | Arcanis Captured [jupiter europe] (`.../58820`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Little lux (`.../58856`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Little lux (`.../58856`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Pool #58856 (4 pages) (`.../58856`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 4 |  |  | 1-10s |

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
| latest listing | PASS | 58 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Little lux, URL=`58856` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Cocktober 2025 by Vopach, URL=`51343` at page 1 offset 0 and page 2 offset 11, title=yuio - eevee and his sisters, URL=`29260` at page 1 offset 2 and page 2 offset 6, title=Hoodieon begins \[Jarlium\], URL=`52738` at page 1 offset 4 and page 2 offset 27, title=Therapy Dog, URL=`52415` at page 1 offset 6 and page 2 offset 35, title=\[Oro97\] Dominant Loona, URL=`55510` at page 1 offset 7 and page 2 offset 17, title=Devil's Advocates \[Twang\], URL=`55429` at page 1 offset 8 and page 2 offset 43, title=NastyCalamari Non-stop Nut November (2025), URL=`52166` at page 1 offset 9 and page 2 offset 4, title=size difference comm \[natdraws\], URL=`56437` at page 1 offset 10 and page 2 offset 32, title=A Dream Job? \[Phluks\], URL=`51048` at page 1 offset 13 and page 2 offset 20, title=Taking a dip! \[Dr.Bubblebum\], URL=`47305` at page 1 offset 15 and page 2 offset 10, title=Robot Cat Waitress - Marugari (Noah), URL=`52702` at page 1 offset 16 and page 2 offset 44, title=Slept In! \[Imprettynormai\], URL=`49411` at page 1 offset 17 and page 2 offset 0, title=Second Reunion by The Secret Cave, URL=`52421` at page 1 offset 18 and page 2 offset 8, title=Hoodieon returns \[Jarlium\], URL=`55283` at page 1 offset 23 and page 2 offset 28, title=The BOYS Keepsake \[FanOfTheFurr\], URL=`58450` at page 1 offset 24 and page 2 offset 14, title=Kinktober 2025 by Oro97, URL=`51398` at page 1 offset 28 and page 2 offset 2, title=Trapped in his Lap, URL=`57336` at page 1 offset 30 and page 2 offset 49, title=Do not feed the Renamon by jingzhou14848, URL=`51702` at page 1 offset 32 and page 2 offset 24, title=Catching Up (M/F) by Zaush, URL=`25961` at page 1 offset 33 and page 2 offset 13, title=How 2 Hide Your Renamon - yourdigimongirl, URL=`35222` at page 1 offset 34 and page 2 offset 19, title=The Tough Girl Discovers Portal Panties by Fluff-Kevlar, URL=`56778` at page 1 offset 39 and page 2 offset 26 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Circe's Curse of Obscurity by Pankallisti, URL=`41723` at page 1 offset 13 and page 2 offset 17, title=Jorlus Space Adventure, URL=`58197` at page 1 offset 15 and page 2 offset 5, title=Da Silva: Showtime \[Pokefound\], URL=`57073` at page 1 offset 17 and page 2 offset 9, title=Incineroar Week 2026 - Voviat, URL=`57904` at page 1 offset 35 and page 2 offset 25, title=Pawl visits Howlard - Fuze, URL=`58817` at page 1 offset 50 and page 2 offset 6, title=Arcanis Captured \[jupiter europe\], URL=`58820` at page 1 offset 54 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 213/213 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 198/213 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://static1.e621.net/.../7a94d946268fc0d734148bfe95987df4.jpg` -> 2 manga URLs (examples: `57605`, `57604`) |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `58856` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Little lux just study about biologi with his dad |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://placehold.co/.../f66151.jpg <redacted query values: text>` at pages 1, 2, 3, 4 |  |  |  |
| page load | PASS | `https://placehold.co/.../f66151.jpg <redacted query values: text>` (image/jpeg, 2434 bytes, 256x256) |  |  |  |
