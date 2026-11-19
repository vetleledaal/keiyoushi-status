# Extension Validation Report

- Extension: tachiyomi-tr.tarotscans-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 8054539304013575208
- Source name: Tarot Scans
- Source language: tr
- Selected manga input: popular offset 0: I’m Actually a Cultivation Bigshot (`.../37619`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | I’m Actually a Cultivation Bigshot (`.../37619`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Elqueeness (`.../37405`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Dame Skill [Auto Mode] ga Kakuseishimashita ~Are, Guild no Scout-san, Ore wo “Iranai”-tte Itte Masendeshita?~ (`.../38511`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Isekai Kokka Alchimaira: Saijaku no Ou to Musou no Gunzei (`.../38461`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I’m Actually a Cultivation Bigshot (`.../37619`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I’m Actually a Cultivation Bigshot (`.../37619`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 515 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 3 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I’m Actually a Cultivation Bigshot, URL=`37619` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn1.cdnformanga.xyz/.../cover.webp` (image/webp (encoding: lossy), 90128 bytes, 630x840) |  |  |  |
| details identity | PASS | Details preserved selected URL `37619` |  |  |  |
| details thumbnail URL | PASS | `https://cdn1.cdnformanga.xyz/.../cover.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | I’m Actually a Cultivation Bigshot , I am a Cultivation BigshotSo I Am the Godfather of Immortal Cultivation, Turns Out I’m a Great Cultivator, Yuán Lái Wǒ Shì Xiū Xiān Dà Lǎo, 原来我是修仙大佬 , Yuan Lai Wo Shi Xiu Xian Da Lao The Immortal Dao is ethereal, and Immortals are hard to find. Li Nianfan had descended into the cultivation world as a mortal. After learning that he has no hope in cultivation, he only wants to live a peaceful life. However… The dog he adopts becomes a demon king of a generation when it sees his poems and paintings. It manages to suppress an entire world. The tree he plants behind his house becomes a World Tree after listening to his zither music, forming a bridge between heaven and earth. He meets a passerby who is enlightened by him and becomes an immortal sage who leads an entire generation. When he looks back— It turns out that the scholar who had been pestering him for his calligraphy and paintings despite having crappy chess skills, is a chess saint from the Immortal Realm. The beautiful woman who comes to listen to his music every night is the number one saintess of the Immortal Realm…<br><br>Alternative Names: I’m Actually a Cultivation Bigshot |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 515 chapters |  |  |  |
| chapter dates | PASS | 515 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `chapter-454` at offsets 40, 41, `chapter-453` at offsets 42, 43, `chapter-452` at offsets 44, 45, `chapter-451` at offsets 46, 47, `chapter-450` at offsets 48, 49, `chapter-449` at offsets 50, 51, `chapter-448` at offsets 52, 53, `chapter-447` at offsets 54, 55, `chapter-446` at offsets 56, 57, `chapter-445` at offsets 58, 59, `chapter-444` at offsets 60, 61, `chapter-443` at offsets 62, 63, `chapter-442` at offsets 64, 65, `chapter-441` at offsets 66, 67, `chapter-440` at offsets 68, 69, `chapter-439` at offsets 70, 71, `chapter-438` at offsets 72, 73, `chapter-437` at offsets 74, 75, `chapter-436` at offsets 76, 77, `chapter-435` at offsets 78, 79 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn1.cdnformanga.xyz/.../d2391c52ce4c4fa1b99cdceb3c604358_1.webp` (image/webp (encoding: lossy), 522256 bytes, 720x6914) |  |  |  |
