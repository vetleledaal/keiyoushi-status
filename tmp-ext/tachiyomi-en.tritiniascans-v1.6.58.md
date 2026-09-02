# Extension Validation Report

- Extension: tachiyomi-en.tritiniascans-v1.6.58
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
- Source ID: 6032516943051342273
- Source name: TritiniaScans
- Source language: en
- Selected manga input: popular offset 0: Back from the Grave (`.../1970`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Back from the Grave (`.../1970`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Trigger (`.../1890`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Kekkon shiyou. Rikon zentei de. (`.../2648`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Associate Professor Akira Takatsuki’s Inference (`.../2254`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Back from the Grave (`.../1970`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Back from the Grave (`.../1970`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 212 | Ch. 1 (`.../ch-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Back from the Grave, URL=`1970` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tritinia.org/.../IMG_20211120_222755-175x238.jpg` (image/jpeg, 22959 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1970` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tritinia.org/.../IMG_20211120_222755-193x278.jpg` (image/jpeg, 25226 bytes, 193x278) |  |  |  |
| details author | PASS | Jo Seok Ho |  |  |  |
| details artist | PASS | An Jeong Hyeok |  |  |  |
| details genres | PASS | Action, Drama, Manhwa, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “Hey, don’t get confused. I’ve never thought of you as my little brother. You don’t even know your right place.” That was the dagger that hurt the most. Han Myoung Woo. A child of a wealthy family with a quick mind. But god didn’t give him everything. A near incurable genetic heart disease He did his best in order to earn the respect of the people around him. But his father, the chairman, and his family members never took him seriously.<br><br>That was when an accident suddenly struck him. And… He woke up in the body of the severely injured student, Kim Cheol Min.<br><br>Alternative Names: 뒤끝작렬 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 212 chapters |  |  |  |
| chapter dates | LINT | 96 of 212 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=96 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://tritinia.org/.../001.png` (image/png, 356019 bytes, 720x465) |  |  |  |
