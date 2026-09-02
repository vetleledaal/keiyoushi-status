# Extension Validation Report

- Extension: tachiyomi-en.petrotechsociety-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 20045885295638720
- Source name: Petrotechsociety
- Source language: en
- Selected manga input: popular offset 0: Daehyun Laundry ~I Will Wash Anything~ (`.../154`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Daehyun Laundry ~I Will Wash Anything~ (`.../154`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Make Me Sweat (`.../121`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Wolf in White (`.../5000`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Private Call (`.../4873`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Daehyun Laundry ~I Will Wash Anything~ (`.../154`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Daehyun Laundry ~I Will Wash Anything~ (`.../154`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 11 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Daehyun Laundry ~I Will Wash Anything~, URL=`154` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.petrotechsociety.org/.../Daehyun-Laundry-I-Will-Wash-Anything-Yaoi-Uncensored-Sex-scaled-e1633887828916-175x238.jpg` (image/jpeg, 11868 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `154` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.petrotechsociety.org/.../Daehyun-Laundry-I-Will-Wash-Anything-Yaoi-Uncensored-Sex-scaled-e1633887828916-193x278.jpg` (image/jpeg, 14666 bytes, 193x278) |  |  |  |
| details author | PASS | Jea |  |  |  |
| details artist | PASS | Jea |  |  |  |
| details genres | PASS | Comedy, Manhwa, Romance, Smut, Uncensored, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Police officer Ma Youngtae’s first post is in the rural countryside where he gets a rude awakening when he realizes he won’t be able to continue his promiscuous life. No matter where he looks, it’s all grandmas and grandpas. The only person in his age group that he meets is the cleaner’s son, Suh Daehyun. But, his looks are so bland that he’s not attracted to him at all… Huh? What’s with this guy… He does these perverted things with the clothes people have dropped off?<br><br>Alternative Names: Daehyun Laundry ~We Wash Everything~ / Daehyun's Laundry - I Wash Everything / Daehyun's Laundry ~I Wash Everything~ / 대현 세탁~무엇이든 빨아드려요~ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://space.petrotechsociety.org/.../Daehyun-Laundry-~I-Will-Wash-Anything~-Yaoi-BL-Uncensored--(1).png` (image/jpeg, 73580 bytes, 800x500; server Content-Type: image/png) |  |  |  |
