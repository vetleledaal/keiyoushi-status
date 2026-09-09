# Extension Validation Report

- Extension: tachiyomi-en.zinmanga-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 5990114708086767078
- Source name: Zinmanga
- Source language: en
- Selected manga input: popular offset 0: CEO Above, Me Below (`.../1925`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | CEO Above, Me Below (`.../1925`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Sweetheart V5: The Boss Is Too Kind! (`.../6054`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | I Found A Family That Wasn’t In My Adoption Plan (`.../58462`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Selena (`.../27415`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | CEO Above, Me Below (`.../1925`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | CEO Above, Me Below (`.../1925`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 661 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=CEO Above, Me Below, URL=`1925` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangazin.org/.../bia-2-21-193x278-175x238.jpg` (image/jpeg, 11860 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1925` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangazin.org/.../bia-2-21-193x278.jpg` (image/jpeg, 16201 bytes, 193x278) |  |  |  |
| details author | PASS | iCiyuan, ICiyuan dongman, Iciyuan动漫&艾鲁猫, Jiang Xiao Ya (姜小牙), Unknown |  |  |  |
| details artist | PASS | iCiyuan, ICiyuan dongman, Iciyuan动漫&艾鲁猫, Unknown |  |  |  |
| details genres | PASS | Drama, Josei, Manhua, Psychological, Romance, Shoujo, Smut, Tragedy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | <br><br>An imaginary child ties together a British born Eurasian with a beautiful cartoonist.. She had no right to rebel…<br><br>Do you want to steal my genes then leave?? He grabbed her and tried to force her to hand over the child that was born three years ago.<br><br>She never had a baby? Then conceive one!<br><br>The delusional CEO’s desperate love. Her inability to resist as she fell deeper..<br><br><br><br><br><br><br><br>Alternative Names: Zongcai zai shang, Bossy president, CEO Above, Me Below |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 661 chapters |  |  |  |
| chapter dates | LINT | All 661 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=661 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://cdn-1.mangazin.org/.../ch_0_1.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
