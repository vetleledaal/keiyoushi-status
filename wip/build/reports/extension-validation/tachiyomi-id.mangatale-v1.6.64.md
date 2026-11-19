# Extension Validation Report

- Extension: tachiyomi-id.mangatale-v1.6.64
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
- Source ID: 2471382203854600486
- Source name: Ikiru
- Source language: id
- Selected manga input: popular offset 0: The Greatest Estate Developer (`.../the-greatest-estate-developer`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 21 | The Greatest Estate Developer (`.../the-greatest-estate-developer`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 21 | Bertani Bersama Slime! (`.../bertani-bersama-slime`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 21 | The Obsessive Maniac Is Trying to Confine Me (`.../the-obsessive-maniac-is-trying-to-confine-me`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 21 | A Veteran Player Is Needed In The Apocalypse (`.../a-veteran-player-is-needed-in-the-apocalypse`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Greatest Estate Developer (`.../the-greatest-estate-developer`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Greatest Estate Developer (`.../the-greatest-estate-developer`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 243 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Greatest Estate Developer, URL=`the-greatest-estate-developer` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 85/85 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 85/85 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.ikiru.id/.../1000337140.jpg <redacted query values: md5 and expires>` (image/jpeg, 965584 bytes, 800x1159) |  |  |  |
| details identity | PASS | Details preserved selected URL `the-greatest-estate-developer` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.ikiru.id/.../1000337140.jpg <redacted query values: md5 and expires>` |  |  |  |
| details author | PASS | Mun Baeg Kyeong |  |  |  |
| details artist | PASS | Kim Hyeon Su |  |  |  |
| details genres | PASS | Drama, Adventure, Comedy, Fantasy, Action, Shounen |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Ketika Kim Suho, seorang mahasiswa teknik sipil, tertidur saat membaca sebuah novel fantasi, ia terbangun sebagai salah satu karakter di dalam buku tersebut!<br><br>Kini, Suho berada dalam tubuh Lloyd Frontera, seorang bangsawan pemalas yang hobi mabuk-mabukan dan memiliki keluarga yang terlilit gunung hutang. Memanfaatkan pengetahuan teknik sipilnya, Suho merancang berbagai rekayasa dan penemuan demi menghindari masa depan mengerikan yang menantinya.<br><br>Berbekal bantuan seekor hamster raksasa, seorang ksatria, dan keajaiban sihir di dunia tersebut, mampukah Suho mengeluarkan keluarga barunya dari jeratan hutang sekaligus membangun masa depan yang lebih baik?<br><br>Alternative Names:<br>- Bậc Thầy Thiết Kế Điền Trang<br>- El mejor desarrollador inmobiliario<br>- El Mejor Ingeniero del Mundo<br>- Loco Frontera<br>- Niezrównany inżynier - The greatest estate developer (Polish)<br>- O Melhor Engenheiro Do Mundo<br>- The Greatest Estate Designer<br>- The World's Best Engineer<br>- Yeogdaegeub Yeongji Seolgyesa<br>- Лучший инженер в мире<br>- ยอดสถาปนิกผู้พิทักษ์อาณาจักร<br>- 史上最高の領地設計士<br>- 史诗级领地设计师<br>- 역대급 영지 설계사 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 243 chapters |  |  |  |
| chapter dates | PASS | 243 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://10.ikiru.wtf/.../search <redacted query values: sortBy, sort, and page>` to `https://11.ikiru.wtf/.../search <redacted query values: sortBy, sort, and page>` (1 redirects); popular: `https://10.ikiru.wtf/.../search <redacted query values: sortBy, sort, and page>` to `https://11.ikiru.wtf/.../search <redacted query values: sortBy, sort, and page>` (1 redirects); popular: `https://10.ikiru.wtf/.../search <redacted query values: sortBy, sort, and page>` to `https://11.ikiru.wtf/.../search <redacted query values: sortBy, sort, and page>` (1 redirects); popular: `https://10.ikiru.wtf/.../the-greatest-estate-developer` to `https://11.ikiru.wtf/.../the-greatest-estate-developer` (1 redirects); popular: `https://10.ikiru.wtf/.../search <redacted query values: page, query, sortBy, and sort>` to `https://11.ikiru.wtf/.../search <redacted query values: page, query, sortBy, and sort>` (1 redirects); popular: `https://10.ikiru.wtf/.../chapter-1` to `https://11.ikiru.wtf/.../chapter-1` (1 redirects); popular: `https://10.ikiru.wtf/.../search <redacted query values: sortBy, sort, and page>` to `https://11.ikiru.wtf/.../search <redacted query values: sortBy, sort, and page>` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.ikiru.id/.../0-55643200-16282701061-1-000.jpg <redacted query values: md5 and expires>` (image/jpeg, 82675 bytes, 800x1133) |  |  |  |
