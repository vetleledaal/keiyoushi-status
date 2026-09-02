# Extension Validation Report

- Extension: tachiyomi-all.allporncomicsco-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6353068724409812158
- Source name: AllPornComics.co
- Source language: all
- Selected manga input: popular offset 0: The Hole is Open [Kimtuk] (`.../20355`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | The Hole is Open [Kimtuk] (`.../20355`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Aunty And Uncle [Silk Route | Ira Raman] (`.../33955`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Pure Perverted Love [SexyBeam] (`.../36239`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | People of The Dark (Uncensored) (Animated) [Farmer] (`.../35977`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Hole is Open [Kimtuk] (`.../20355`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Hole is Open [Kimtuk] (`.../20355`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 160 | Chapter 01 (`.../chapter-01`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 67 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Hole is Open \[Kimtuk\], URL=`20355` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Regressed Warrior’s Female Dominance Diary \[ReNyang\], URL=`22313` at page 1 offset 6 and page 2 offset 10 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://allporncomics.co/.../Kimtuk-The-Hole-is-Open-350x476.jpg` (image/jpeg, 35193 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `20355` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://allporncomics.co/.../Kimtuk-The-Hole-is-Open-193x278.jpg` (image/jpeg, 13230 bytes, 193x278) |  |  |  |
| details author | PASS | DDOT, Kimtuk |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Mature, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Read Free Online The Hole is Open Adult Manhwa In English. All Latest Chapters up-to-date From Kimtuk.<br><br>Kimtuk, DDOT Introduces “The Hole is Open” A Comic Series That Takes Readers On A Romantic Journey With Beautifully Designed Characters. The Series Uses Clear And Easy-to-read English, Making It Enjoyable For All Fans. Blending Genres of Mature, And Romance, Each Issue Showcases Beloved Characters In Engaging Narratives That Captivate Readers. Experience The Allure of “The Hole is Open” And See Why Fans Are Raving About This New Addition To Their Collection.<br><br>JA-KANG Inherited His Grandfather’s Store. In The Secret Room, There Is A Secret “Hole” ?!<br><br>The Hole Is Open Manhwa Also Known As The Hole Is Open / The Shop of Pleasure / Glory Hole Shop / 洞洞雜貨店 / 구멍가게, 구멍 열었습니다. This On-going Webtoon Released In 2022. This Series Written By Kimtuk And Illustrations By DDOT.<br><br>Click On The Link Below To Read \[Kimtuk\] The Hole is Open In The Best HD Quality. We Provide The Latest Updates For Each Chapter. To Start From The First Chapter, Click The “Read First” Button In The Comic Info Section. If You Want To Read The Latest Released Chapter, Click The “Read Last” Button. You Can Also Choose Your Preferred Chapter From The List Below And Read It Directly. Our Online Webpage Offers Easy Navigation And Zooming Options For A Smooth Reading Experience. Enjoy Reading This Comic Without Unwanted Ads On Our Website.<br><br>Click The Link Below To Download This Comic in Chapter-Wise .Zip Files. We Made The Download Process Simple And Hassle-Free. You Don’t Need Any Passwords, or Surveys. Just Click And Download With The Full Speed of Your Internet Connection. We Want You To Enjoy Your Comics Without Delay. If You’re a Fan of This Comic’s Author, You’ll Find All Their Latest Works Available on Our Website. Explore And Download Every Comic Easily. Stay Updated With The Newest Releases And Keep Your Collection Growing With Fast, Direct Download Links.<br><br><br><br><br><br>Alternative Names: The Hole is Open / The Shop of Pleasure / Glory Hole Shop / 洞洞雜貨店 / 구멍가게, 구멍 열었습니다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 160 chapters |  |  |  |
| chapter dates | PASS | 160 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 67 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://allporncomics.co/.../01.jpg` (image/jpeg, 196278 bytes, 720x2500) |  |  |  |
