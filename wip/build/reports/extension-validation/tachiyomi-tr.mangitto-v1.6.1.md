# Extension Validation Report

- Extension: tachiyomi-tr.mangitto-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 26
- Lint: 0
- Warnings: 1
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4535626560473424586
- Source name: Mangitto
- Source language: tr
- Selected manga input: popular offset 0: Bireomeogeul Hwansaeng (`.../bireomeogeul-hwansaeng`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Bireomeogeul Hwansaeng (`.../bireomeogeul-hwansaeng`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | Rurouni Kenshin: Meiji Kenkaku Romantan (`.../rurouni-kenshin-meiji-kenkaku-romantan`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 31 | Hwansaengjwa (`.../hwansaengjwa`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 28 | Naega Jugin Dragon-gwa Gyeolhonhaetda (`.../naega-jugin-dragon-gwa-gyeolhonhaetda`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 9 | Bireomeogeul Hwansaeng (`.../bireomeogeul-hwansaeng`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Bireomeogeul Hwansaeng (`.../bireomeogeul-hwansaeng`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 31 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bireomeogeul Hwansaeng, URL=`bireomeogeul-hwansaeng` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Hwansaengjwa, URL=`hwansaengjwa` at page 1 offset 0 and page 2 offset 24, title=Hwasangwihwan, URL=`hwasangwihwan` at page 1 offset 2 and page 2 offset 8, title=Mo Huang Da Guanjia, URL=`mo-huang-da-guanjia` at page 1 offset 3 and page 2 offset 26, title=Oemo Jisangjuui, URL=`oemo-jisangjuui` at page 1 offset 9 and page 2 offset 7, title=Namjudeulgwa Oettanseome Gatyeobeoryeotda, URL=`namjudeulgwa-oettanseome-gatyeobeoryeotda` at page 1 offset 10 and page 2 offset 17, title=Naega Jugin Dragon-gwa Gyeolhonhaetda, URL=`naega-jugin-dragon-gwa-gyeolhonhaetda` at page 1 offset 11 and page 2 offset 0, title=Haimiya Senpai wa Kowakute Kawaii, URL=`haimiya-senpai-wa-kowakute-kawaii` at page 1 offset 12 and page 2 offset 13, title=Majo to Youhei, URL=`majo-to-youhei` at page 1 offset 13 and page 2 offset 12, title=Jeoldaehoegwi, URL=`jeoldaehoegwi` at page 1 offset 14 and page 2 offset 15, title=Mayonaka Heart Tune, URL=`mayonaka-heart-tune` at page 1 offset 16 and page 2 offset 11, title=Ichyeojin Deulpan, URL=`ichyeojin-deulpan` at page 1 offset 17 and page 2 offset 18, title=Kakunaru Ue wa, URL=`kakunaru-ue-wa` at page 1 offset 18 and page 2 offset 2, title=Jeonseolgeup Yeongungeun Academy Udeungsaeng, URL=`jeonseolgeup-yeongungeun-academy-udeungsaeng` at page 1 offset 22 and page 2 offset 21, title=Man Nyeon Mane Gwihwanhan Player, URL=`man-nyeon-mane-gwihwanhan-player` at page 1 offset 24 and page 2 offset 27, title=Siling Fashi! Wo Ji Shi Tianzai, URL=`siling-fashi-wo-ji-shi-tianzai` at page 1 offset 25 and page 2 offset 16, title=Munjejeong Wangjanim, URL=`munjejeong-wangjanim` at page 1 offset 26 and page 2 offset 14, title=One Punch-Man, URL=`one-punch-man` at page 1 offset 30 and page 2 offset 1 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 168/168 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 168/168 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.anilist.co/.../bx151512-q0Xddr1JNKNq.png` (image/png, 578762 bytes, 460x658) |  |  |  |
| details identity | PASS | Details preserved selected URL `bireomeogeul-hwansaeng` |  |  |  |
| details thumbnail URL | PASS | `https://s4.anilist.co/.../bx151512-q0Xddr1JNKNq.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | When the warrior Hamel sacrifices himself to protect his rival Bermut Lionhart, he makes Bermut vow to vanquish the last of the demon kings. Reincarnated with his memories 300 years later, he is shocked to find that not only are the demon kings still alive, but that he has been reborn as Eugene Lionhart, a member of his former rival’s bloodline! Now, as Eugene comes of age, he must train to prove himself as a Lionhart and eliminate the remaining demon kings once and for all.     (Source: Tapas) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
