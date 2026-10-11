# Extension Validation Report

- Extension: tachiyomi-all.e621-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 30
- Lint: 3
- Warnings: 3
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3580576879040377475
- Source name: e621
- Source language: all
- Selected manga input: popular offset 0: Cocktober 2025 by Vopach (`.../51343`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 39 | Cocktober 2025 by Vopach (`.../51343`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 51 | A Vesna Commission by bimbini (`.../57560`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 63 | droW's Sketchtober 2026 (drow462) (`.../59659`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 65 | The 3rd Billie Jean Comic by Horemheb (`.../57330`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Cocktober 2025 by Vopach (`.../51343`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Pool #51343 (28 pages) (`.../51343`) |  | <1s |
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
| popular listing | PASS | 39 entries |  |  |  |
| latest listing | PASS | 63 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Cocktober 2025 by Vopach, URL=`51343` at page 1 offset 0 and page 2 offset 13, title=yuio - eevee and his sisters, URL=`29260` at page 1 offset 1 and page 2 offset 7, title=Hoodieon begins \[Jarlium\], URL=`52738` at page 1 offset 3 and page 2 offset 29, title=Devil's Advocates \[Twang\], URL=`55429` at page 1 offset 4 and page 2 offset 39, title=Ribbons & Devotion by Jinsidraws, URL=`59581` at page 1 offset 6 and page 2 offset 9, title=Therapy Dog, URL=`52415` at page 1 offset 7 and page 2 offset 35, title=\[Oro97\] Dominant Loona, URL=`55510` at page 1 offset 9 and page 2 offset 20, title=NastyCalamari Non-stop Nut November (2025), URL=`52166` at page 1 offset 10 and page 2 offset 2, title=size difference comm \[natdraws\], URL=`56437` at page 1 offset 11 and page 2 offset 31, title=Taking a dip! \[Dr.Bubblebum\], URL=`47305` at page 1 offset 14 and page 2 offset 10, title=Slept In! \[Imprettynormai\], URL=`49411` at page 1 offset 15 and page 2 offset 3, title=Second Reunion by The Secret Cave, URL=`52421` at page 1 offset 16 and page 2 offset 11, title=Robot Cat Waitress - Marugari (Noah), URL=`52702` at page 1 offset 17 and page 2 offset 4, title=Hoodieon returns \[Jarlium\], URL=`55283` at page 1 offset 22 and page 2 offset 25, title=Trapped in his Lap, URL=`57336` at page 1 offset 25 and page 2 offset 36, title=Misbehavior (imprettynormai), URL=`59015` at page 1 offset 27 and page 2 offset 28, title=A Dream Job? \[Phluks\], URL=`51048` at page 1 offset 29 and page 2 offset 18, title=Braixen's Well Earned Reward by Jinsidraws, URL=`58453` at page 1 offset 30 and page 2 offset 49, title=Eevee evolves by SmugBlueFaun, URL=`58928` at page 1 offset 31 and page 2 offset 6, title=Do not feed the Renamon by jingzhou14848, URL=`51702` at page 1 offset 32 and page 2 offset 33, title=How 2 Hide Your Renamon - yourdigimongirl, URL=`35222` at page 1 offset 34 and page 2 offset 23, title=Selene in a jacuzzi \[Keshabear\], URL=`59047` at page 1 offset 35 and page 2 offset 21, title=Wolf and mice \[Schmutzo\], URL=`28667` at page 1 offset 37 and page 2 offset 5 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=droW's Sketchtober 2026 (drow462), URL=`59659` at page 1 offset 0 and page 2 offset 47, title=Kinktober 2026 \[idrysse3\], URL=`59829` at page 1 offset 1 and page 2 offset 49, title=Lonetember 2026, URL=`59623` at page 1 offset 2 and page 2 offset 8, title=Locktober 2026 - canphem, URL=`59574` at page 1 offset 4 and page 2 offset 54, title=Kinktober 2026 \[BarnDog\], URL=`59700` at page 1 offset 5 and page 2 offset 53, title=October Dailies, URL=`59585` at page 1 offset 17 and page 2 offset 25, title=Unknown by GoonDoc, URL=`59504` at page 1 offset 19 and page 2 offset 23, title=Nick's Past by SoulCentinel, URL=`58451` at page 1 offset 22 and page 2 offset 45, title=Galacticmichi - Boobtober 2026, URL=`59763` at page 1 offset 30 and page 2 offset 36, title=Love is a Many Splendored Thing \[Nexus\], URL=`59341` at page 1 offset 36 and page 2 offset 64, title=Hot Buns 2026: Buns Illustrated, URL=`57150` at page 1 offset 52 and page 2 offset 51, title=Kinktober 2026 \[Teeveeomegas\], URL=`59566` at page 1 offset 56 and page 2 offset 52 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 218/218 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 201/218 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static1.e621.net/.../5b1f0ef31c0393774d913682e2cb8a9f.jpg` (image/jpeg, 16176 bytes, 256x256) |  |  |  |
| details identity | PASS | Details preserved selected URL `51343` |  |  |  |
| details thumbnail URL | PASS | `https://static1.e621.net/.../5b1f0ef31c0393774d913682e2cb8a9f.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static1.e621.net/.../5b1f0ef31c0393774d913682e2cb8a9f.png` (image/png, 3949609 bytes, 3000x3000) |  |  |  |
