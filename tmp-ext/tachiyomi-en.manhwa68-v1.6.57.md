# Extension Validation Report

- Extension: tachiyomi-en.manhwa68-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2676315620251021475
- Source name: Manhwa68
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../974`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Secret Class (`.../974`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Banging My Aunt (`.../1310`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Simple Yet Sexy (`.../2218`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Room of Guilty Pleasure (`.../10282`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 25 | Secret Class HOT (`.../8723`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class HOT (`.../974`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 295 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Secret Class, URL=`974` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 125/125 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 125/125 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwa68.com/.../post_974_image-175x238.jpg` (image/jpeg, 9012 bytes, 175x238) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Secret Class to Secret Class HOT |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manhwa68.com/.../post_8723_image-193x278.jpg` (image/jpeg, 13169 bytes, 193x278) |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Mina-chan |  |  |  |
| details genres | PASS | Drama, Mature, Romance, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dae Ho, who became an orphan at the age of 13, was adopted by his father’s friend. However, Dae Ho in adulthood knew nothing about the relationship between men and women. Aunt and sisters decided to give pure Dae Ho a secret class…<br><br>Manhwa68 is a website with rich content and a large Pornhwa Comic community worldwide. Great comics depicting the lives of different people as well as the good and bad of life will bring you lots of emotions. You can read free manhwa 18+ don’t need to buy it, you can read it online without spending a penny.<br><br>All adult manga, adult webtoon manhwa or manhua on manhwa68 are and will always be free however we will show ads, I mean we have to pay for server services right? So, Help us by sharing this site with your friends! We made the site in such a way that it is easy to use. Some sites similar to Toon Love, Webtoon Love... you can find genres bl manhwa, girl love, boylove...<br><br>Alternative Names: 비밀수업 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 295 chapters |  |  |  |
| chapter dates | LINT | 281 of 295 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=281 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.manhwa68.com/.../ch_0_1.jpg` (image/jpeg, 555348 bytes, 720x12500) |  |  |  |
