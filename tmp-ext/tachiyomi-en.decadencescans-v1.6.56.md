# Extension Validation Report

- Extension: tachiyomi-en.decadencescans-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7432245132662185058
- Source name: Decadence Scans
- Source language: en
- Selected manga input: popular offset 0: Koi to Yobu ni wa Kimochi Warui (`.../1734`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Koi to Yobu ni wa Kimochi Warui (`.../1734`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Love Scatters (`.../1827`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Housekibako (`.../2390`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Red River Extras (`.../2274`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | Koi to Yobu ni wa Kimochi Warui (`.../1734`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Koi to Yobu ni wa Kimochi Warui (`.../1734`) |  | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 64 | Chapter 1 - Encounter on a Rainy Day (`.../chapter-1_2`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 25 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Koi to Yobu ni wa Kimochi Warui, URL=`1734` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 105/105 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 105/105 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://reader.decadencescans.com/.../koiyobu-175x238.jpg` (image/jpeg, 12391 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1734` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://reader.decadencescans.com/.../koiyobu-193x278.jpg` (image/jpeg, 15616 bytes, 193x278) |  |  |  |
| details author | PASS | Mogusu |  |  |  |
| details artist | PASS | Mogusu |  |  |  |
| details genres | PASS | Comedy, Josei, Romance |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Once you fall for someone, you can’t stop the love. A strange encounter spurs the meeting of Amakusa Ryou, a high spec businessman who’s loose with women, and his high school sister’s best friend, Arima Ichika. From there, he falls madly in love. On the one hand, he approaches her with almost too straight-forward methods, while she responds simply disgusted, insulting him without hesitation…and he takes it as her way of showing love. This is a romantic comedy about a twisted elite employee and a normal otaku high school girl.<br><br>The volume 4 Drama CD has been translated! Click here to watch it!<br><br>Alternative Names: It’s Too Sick To Call It Love, 사랑이라 하기엔 기분 나빠, 这如果叫作爱情 感觉会很恶心, 恋と呼ぶには気持ち悪い |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 64 chapters |  |  |  |
| chapter dates | LINT | 14 of 64 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=14 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://reader.decadencescans.com/.../Koi_to_Yobu_Niwa_Kimochiwarui_v01_ch01_p001%5BDecadence%5D.png` (image/png, 506582 bytes, 730x1034) |  |  |  |
