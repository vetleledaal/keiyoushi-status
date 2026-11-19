# Extension Validation Report

- Extension: tachiyomi-all.allporncomicsco-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 24
- Lint: 0
- Warnings: 2
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6353068724409812158
- Source name: AllPornComics.co
- Source language: all
- Selected manga input: latest offset 0: A Very Inappropriate Lease Agreement [inshihyeon] (`.../35999`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | The Hole is Open [Kimtuk] (`.../20355`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Lost Family [PigKing] (`.../153`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | A Very Inappropriate Lease Agreement [inshihyeon] (`.../35999`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Sinfully Sweet [KIKI] (`.../36135`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Very Inappropriate Lease Agreement [inshihyeon] (`.../35999`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Very Inappropriate Lease Agreement [inshihyeon] (`.../35999`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 429 | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 429 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Very Inappropriate Lease Agreement \[inshihyeon\], URL=`35999` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://allporncomics.co/.../inshihyeon-A-Very-Inappropriate-Lease-Agreement-350x476.jpg` (image/jpeg, 35112 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `35999` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://allporncomics.co/.../inshihyeon-A-Very-Inappropriate-Lease-Agreement-193x278.jpg` (image/jpeg, 14266 bytes, 193x278) |  |  |  |
| details author | PASS | Gyu, inshihyeon |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Drama, Explicit Sex, Full Color, Harem, Manhwa, Nudity, Romance, Sexual Content, Slice of Life, Webtoons, Manhwa , Webtoons |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Read Free Online A Very Inappropriate Lease Agreement Adult Manhwa , Webtoon In English. All Latest Chapters up-to-date From inshihyeon, Gyu.<br><br>inshihyeon, Gyu Introduces “A Very Inappropriate Lease Agreement” A Comic Series That Takes Readers On A Romantic Journey With Beautifully Designed Characters. The Series Uses Clear And Easy-to-read English, Making It Enjoyable For All Fans. Blending Genres of Manhwa, Webtoons, Comedy, Drama, Explicit Sex, Full Color, Harem, Nudity, Romance, Sexual Content, Slice of Life Each Issue Showcases Beloved Characters In Engaging Narratives That Captivate Readers. Experience The Allure of “A Very Inappropriate Lease Agreement” And See Why Gyu Fans Are Raving About This New Addition To Their Collection.<br><br>When Gavin Becomes Caretaker of His Family’s Apartment Building, His Parents Joke That He Should Marry Any Tenant He Falls For. On Day One, He Meets Five Stunning Women, Including His Childhood Crush. Living Together Has Never Been This Tempting.<br><br>Click On The Link Below To Read \[inshihyeon\] a Very Inappropriate Lease Agreement in The Best HD Quality. We Provide The Latest Updates for Each Chapter. To Start from The First Chapter, Click The “Read First” Button in The Comic Info Section. If You Want To Read The Latest Released Chapter, Click The “Read Last” Button. You Can Also Choose Your Preferred Chapter From The List Below And Read It Directly. Our Online Webpage Offers Easy Navigation And Zooming Options For A Smooth Reading Experience. Enjoy Reading This Comic Without Unwanted Ads On Our Website.<br><br>Click The Link Below To Download This Comic in Chapter-Wise .Zip Files. We Made The Download Process Simple And Hassle-Free. You Don’t Need Any Passwords, or Surveys. Just Click And Download With The Full Speed of Your Internet Connection. We Want You To Enjoy Your Comics Without Delay. If You’re a Fan of This Comic’s Author, You’ll Find All Their Latest Works Available on Our Website. Explore And Download Every Comic Easily. Stay Updated With The Newest Releases And Keep Your Collection Growing With Fast, Direct Download Links.<br><br><br><br><br><br>Alternative Names: 월세방 신부들 ; Wolsebang Sinbudeul ; Rental Room Brides |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://allporncomics.co <redacted query values: p>` to `https://allporncomics.co/.../a-very-inappropriate-lease-agreement-inshihyeon` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
