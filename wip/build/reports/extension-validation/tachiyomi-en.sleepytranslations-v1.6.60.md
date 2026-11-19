# Extension Validation Report

- Extension: tachiyomi-en.sleepytranslations-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 5756634909776784131
- Source name: Sleepy Translations
- Source language: en
- Selected manga input: popular offset 0: His Highness’s Allure (`.../16176`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | His Highness’s Allure (`.../16176`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 6 | Shanhai High School (`.../13997`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | His Highness’s Allure (`.../16176`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 63 | Chapter 0 - Promo - Scanlation version (`.../chapter-0-promo`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 2 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 6 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 12/12 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 12/12 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../a0c1f692517eb851914329fbc3d3003f93e90dda.jpg%40310w.jpg <redacted query values: resize and ssl>` (image/jpeg, 11835 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `16176` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../a0c1f692517eb851914329fbc3d3003f93e90dda.jpg%40310w.jpg <redacted query values: resize and ssl>` (image/jpeg, 14636 bytes, 193x278) |  |  |  |
| details author | PASS | 大魔王漫画 |  |  |  |
| details artist | PASS | 风荷举哦 |  |  |  |
| details genres | PASS | Angst, Drama, Historical, Palace, Politics, Yaoi, Adapted to Manga, ancient china, Chinese Manhua, Manipulative Characters, Possessive Characters, Prince, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The BiliBili Comic’s platform has shut down. We will be continuing His Highness’s Allure and releasing as annotated PDF TL releases as we are understaffed. The team also feels that it is pointless to release high quality scanlated chapters for allure as only a small group of readers read from us, while the rest are aggregator readers. If readers are interested in future updates you can join our discord the link below.<br><br>You can read the PDFs here: https://drive.google.com/.../1g0NDktMvZ94LSDtHzFQyR9okpHHqfJgn <redacted query values: usp><br><br>Discord: https://discord.gg/.../mwhjvfmyQB<br><br>Notice: The manhua adaptation has taken some creative liberties and may not reflect the original novel 100% The ninth prince, Qi Changyi, inherited his mother’s beauty but he is a little slow. Pei Zheng, the current prime minister, is positioned above everyone else, second to only the emperor himself. He handles matters swiftly and is well-known for his ruthlessness. However, his cold heart was gradually melted by Changyi. He thought that the little fool could be kept in the palm of his hand forever. However, it never crossed his mind that the little fool would leave him after getting his heart broken. With reddened eyes, he searched everywhere like a mad demon, to no avail. “Without you, I can never be happy in this lifetime. Your highness, where must I go to find you?”<br><br>(*Angst with a happy ending)<br><br>Alternative Names: 殿下倾城, The Allure of His Royal Highness, Dianxia Qingcheng, His Royal Highness's Allure, Dian Xia Qing Cheng |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 63 chapters |  |  |  |
| chapter dates | PASS | 63 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i0.wp.com/.../kjji.png <redacted query values: ssl>` (image/png, 5246143 bytes, 1280x7914) |  |  |  |
