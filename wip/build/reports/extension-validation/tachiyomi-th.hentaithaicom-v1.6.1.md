# Extension Validation Report

- Extension: tachiyomi-th.hentaithaicom-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 25
- Lint: 2
- Warnings: 1
- Skipped: 7
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2702202332509828044
- Source name: HentaiThai
- Source language: th
- Selected manga input: popular offset 0: สาวแม่วัวขายน้ำนม 2 [MadBull] The Breast Milk Selling Girl 2 (`.../t52529`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | [MadBull] The Breast Milk Selling Girl 2 (`.../t52529`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | [Pimichan] Rainbow Summer Squash! - 5 (`.../t52623`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | [MUYOKU] Beloved Daddy (`.../t52599`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.UnsupportedOperationException: Search is not available | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | สาวแม่วัวขายน้ำนม 2 [MadBull] The Breast Milk Selling Girl 2 (`.../t52529`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oneshot (`.../t52529`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | SKIP | Search is not available |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | SKIP | Search is not available |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=\[MUYOKU\] Beloved Daddy, URL=`t52599` at page 1 offset 12 and page 2 offset 0, title=\[MUYOKU\] The Unpopular Middle-Aged Man's Thrilling First Experience, URL=`t52597` at page 1 offset 13 and page 2 offset 1, title=\[MYTHICAL WORLD (Lioreo)\] CRAZY SWIMMER Second Stage Another, URL=`t52595` at page 1 offset 14 and page 2 offset 2, title=\[Ruutyan\] "Tanetsuke-sama" no Hokora o Kowashita Onna no Matsuro, URL=`t52593` at page 1 offset 15 and page 2 offset 3, title=\[Okujou no Hosomichi (Kojikoji)\] Honto no watashi o mite kudasai, URL=`t52591` at page 1 offset 16 and page 2 offset 4, title=\[Murabito Toufuten\] skeb, URL=`t52589` at page 1 offset 17 and page 2 offset 5, title=\[Imokko\] Ki ga Tsuitara Kikai ni xx Sareteita 2, URL=`t52587` at page 1 offset 18 and page 2 offset 6, title=\[Seika Kairaku Shoten (Chocomint)\] Instant Sex ~Otaku ni Yasashii Gyaru Aji~, URL=`t52585` at page 1 offset 19 and page 2 offset 7, title=\[Rorerore-ya (Roreru)\] Hachigatsu Kanojo no Shumatsu, URL=`t52583` at page 1 offset 20 and page 2 offset 8, title=\[Mori Guruta\]Kusuguri Banii Kurabu, URL=`t52581` at page 1 offset 21 and page 2 offset 9, title=\[MOMO NOUEN (momo)\] RANSEI (Chainsaw Man), URL=`t52579` at page 1 offset 22 and page 2 offset 10, title=\[Naitou Kirara\] Haramase Ryugu Harem Jima, URL=`t52577` at page 1 offset 23 and page 2 offset 11 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://s1.hentaithai.net/.../madbull-the-breast-milk-selling-girl-2-055761-001.jpg` was not downloaded | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `t52529` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
