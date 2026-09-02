# Extension Validation Report

- Extension: tachiyomi-en.bunmanga-v1.6.54
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
- Source ID: 5944672760629857205
- Source name: Bun Manga
- Source language: en
- Selected manga input: popular offset 0: Seize My Boyfriend (`.../2543`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Seize My Boyfriend (`.../2543`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Special Effects Pheromone (`.../2578`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | My Secretary Wants to Kill Me! (`.../3948`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | The Fragile Sparrow in the Palm (`.../3782`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Seize My Boyfriend (`.../2543`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Seize My Boyfriend (`.../2543`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 558 | Chap 0 (`.../chap-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Seize My Boyfriend, URL=`2543` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bunmanga.com/.../Seize-My-Boyfriend-350x476.jpg` (image/jpeg, 37159 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `2543` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://bunmanga.com/.../Seize-My-Boyfriend-193x278.jpg` (image/jpeg, 15117 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Manga, Manhua, Sci-fi, Supernatural, Webtoon, Seize My Boyfriend, Seize My Boyfriend ; The White Lotus is Online and Teaching, Shounen Ai |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | He is the top-tier White Lotus loved by the transmigration system. He relies on a pure and innocent appearance to play with other people’s hearts as he transmigrates through various worlds. Watch as he stages a fantastic drama presenting the reunion of a couple after separation, the seduction of the Film Emperor and overbearing Emperors becoming infatuated with him in succession. But after that, he realized, the people he had been seducing had all been the same person? In their contest of love, who will win and who will lose?<br><br>Alternative Names: Seize My Boyfriend ; The White Lotus is Online and Teaching ; 【快穿】绝美白莲在线教学 ; 绝美白莲在线教学 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 558 chapters |  |  |  |
| chapter dates | LINT | 54 of 558 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=54 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.bunmanga.com/.../0.jpg` (image/jpeg, 537386 bytes, 800x10561) |  |  |  |
