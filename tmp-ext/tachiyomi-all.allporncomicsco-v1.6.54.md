# Extension Validation Report

- Extension: tachiyomi-all.allporncomicsco-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 0
- Warnings: 3
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6353068724409812158
- Source name: AllPornComics.co
- Source language: all
- Selected manga input: latest offset 0: Ogh Reboot [Human Fodder] (`.../36259`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | The Hole is Open [Kimtuk] (`.../20355`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Rooftop Sex King [Sangijun] (`.../28629`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Ogh Reboot [Human Fodder] (`.../36259`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | I’m the Only Man on the Military Base [TwoJ] (`.../33158`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ogh Reboot [Human Fodder] (`.../36259`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ogh Reboot [Human Fodder] (`.../36259`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 28 | Chapter 01 (`.../chapter-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 48 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ogh Reboot \[Human Fodder\], URL=`36259` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=I Will Teach You Self Defense \[Gurodi\], URL=`34348` at page 1 offset 3 and page 2 offset 19 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://allporncomics.co/.../Human-Fodder-Ogh-Reboot-350x476.jpg` (image/jpeg, 36721 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `36259` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://allporncomics.co/.../Human-Fodder-Ogh-Reboot-193x278.jpg` (image/jpeg, 15010 bytes, 193x278) |  |  |  |
| details author | PASS | Human Fodder |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Read Free Online Ogh Reboot Adult Manhwa In English. All Latest Chapters up-to-date From Human Fodder.<br><br>Human Fodder Introduces “Ogh Reboot” A Comic Series That Takes Readers On A Romantic Journey With Beautifully Designed Characters. The Series Uses Clear And Easy-to-read English, Making It Enjoyable For All Fans. Blending Genres of Drama, Manhwa Each Issue Showcases Beloved Characters In Engaging Narratives That Captivate Readers. Experience The Allure of “Ogh Reboot” And See Why Fans Are Raving About This New Addition To Their Collection.<br><br>What’s Important in Living Life Is Dopamine! With No Social Skills, Shut-In Loser Shin Jangseok Wishes for The World To Be Rebooted… “ah ~ Isn’t There a World Where Everything Works With Just One Dick…”<br><br>Ogh Reboot Manhwa Also Known as 오곡 리부트. This on-Going Webtoon Released in 2026. This Series Written by Human Fodder.<br><br>Click On The Link Below To Read \[Human Fodder\] Ogh Reboot In The Best HD Quality. We Provide The Latest Updates For Each Chapter. To Start From The First Chapter, Click The “Read First” Button In The Comic Info Section. If You Want To Read The Latest Released Chapter, Click The “Read Last” Button. You Can Also Choose Your Preferred Chapter From The List Below And Read It Directly. Our Online Webpage Offers Easy Navigation And Zooming Options For A Smooth Reading Experience. Enjoy Reading This Comic Without Unwanted Ads On Our Website.<br><br>Click The Link Below To Download This Comic in Chapter-Wise .Zip Files. We Made The Download Process Simple And Hassle-Free. You Don’t Need Any Passwords, or Surveys. Just Click And Download With The Full Speed of Your Internet Connection. We Want You To Enjoy Your Comics Without Delay. If You’re a Fan of This Comic’s Author, You’ll Find All Their Latest Works Available on Our Website. Explore And Download Every Comic Easily. Stay Updated With The Newest Releases And Keep Your Collection Growing With Fast, Direct Download Links.<br><br><br><br><br><br>Alternative Names: 오곡 리부트 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 28 chapters |  |  |  |
| chapter dates | PASS | 28 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://allporncomics.co <redacted query values: p>` to `https://allporncomics.co/.../ogh-reboot-human-fodder` (1 redirects) |  |  |  |
| page load | PASS | `https://allporncomics.co/.../001_1.jpg` (image/jpeg, 252725 bytes, 720x6660) |  |  |  |
