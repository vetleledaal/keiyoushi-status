# Extension Validation Report

- Extension: tachiyomi-all.mangaball-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.P
- Source ID: 1448906013733277368
- Source name: Manga Ball
- Source language: en
- Selected manga input: latest offset 0: I Can Read Your Fate (`.../i-can-read-your-fate-6889fd9acf0638618d19ebe6`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Tears on a Withered Flower (`.../tears-on-a-withered-flower-685155e6702284f834178607`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Be a Bad Guy! (`.../be-a-bad-guy-698174836f2a7060594e3af2`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | I Can Read Your Fate (`.../i-can-read-your-fate-6889fd9acf0638618d19ebe6`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | KIMI TO HANABI TO YAKUSOKU TO (`.../kimi-to-hanabi-to-yakusoku-to-69c8a5503a4b0608af27b104`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | I Can Read Your Fate (Your Script Is Really Interesting/ Dao You Ni Juben Zhen Haokan/ Dào Yǒu Nǐ Jùběn Zhēn Hǎokàn/ Fellow Daoist, Your Script Is Really Good/ Fellow Daoist, Your Script Is So Beautiful/ Đạo Hữu, Kịch Bản Của Ngươi Thật Dễ Nhìn!/ Đạo Hữu, Kịch Bản Của Ngươi Thật Là Hay/ Товарищ даос, ваш сценарий так прекрасен/ สหายเต๋า บาทบาทชีวิตของเจ้าช่างงดงามยิ่งนัก/ 道友你剧本真好看/ Đạo Hữu/ Kịch Bản Của Ngươi Thật Là Hay/ I Can Read Your Fate) (`.../i-can-read-your-fate-6889fd9acf0638618d19ebe6`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | I Can Read Your Fate (`.../i-can-read-your-fate-6889fd9acf0638618d19ebe6`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 115 | Chapter 0 (`.../68da17751ec6dc083a2a5cdb`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 31 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Can Read Your Fate (Your Script Is Really Interesting/ Dao You Ni Juben Zhen Haokan/ Dào Yǒu Nǐ Jùběn Zhēn Hǎokàn/ Fellow Daoist, Your Script Is Really Good/ Fellow Daoist, Your Script Is So Beautiful/ Đạo Hữu, Kịch Bản Của Ngươi Thật Dễ Nhìn!/ Đạo Hữu, Kịch Bản Của Ngươi Thật Là Hay/ Товарищ даос, ваш сценарий так прекрасен/ สหายเต๋า บาทบาทชีวิตของเจ้าช่างงดงามยิ่งนัก/ 道友你剧本真好看/ Đạo Hữu/ Kịch Bản Của Ngươi Thật Là Hay/ I Can Read Your Fate), URL=`i-can-read-your-fate-6889fd9acf0638618d19ebe6` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bulbasaur.poke-black-and-white.net/.../cover_1754358734163.jpg` (image/jpeg, 341262 bytes, 600x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `i-can-read-your-fate-6889fd9acf0638618d19ebe6` |  |  |  |
| details thumbnail URL | PASS | `https://bulbasaur.poke-black-and-white.net/.../cover_1754358734163.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhua, Action, Drama, Fantasy, Long Strip, Martial Arts |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | I thought being able to see other people's life scripts would be a thrilling opening, but little did I know the system tries to kill me! Innocent junior sister, alluring demon girl, chaste saintess... They all want me dead!  <br>  <br>Original Manhua  <br>  <br>**Official Translations:**  <br>English<br><br>Published: 2023<br><br>Alternative Names: <br>- Your Script Is Really Interesting<br>- Dao You Ni Juben Zhen Haokan<br>- Dào Yǒu Nǐ Jùběn Zhēn Hǎokàn<br>- Fellow Daoist, Your Script Is Really Good<br>- Fellow Daoist, Your Script Is So Beautiful<br>- Đạo Hữu, Kịch Bản Của Ngươi Thật Dễ Nhìn!<br>- Đạo Hữu, Kịch Bản Của Ngươi Thật Là Hay<br>- Товарищ даос, ваш сценарий так прекрасен<br>- สหายเต๋า บาทบาทชีวิตของเจ้าช่างงดงามยิ่งนัก<br>- 道友你剧本真好看<br>- Đạo Hữu<br>- Kịch Bản Của Ngươi Thật Là Hay<br>- I Can Read Your Fate |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 115 chapters |  |  |  |
| chapter dates | PASS | 115 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://jigglypuff.poke-black-and-white.net/.../68da17751ec6dc083a2a5cdb-001.webp` (image/webp (encoding: lossy), 71968 bytes, 999x1500) |  |  |  |
