# Extension Validation Report

- Extension: tachiyomi-ko.rawdex-v1.6.56
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
- Source ID: 7981220701421282731
- Source name: RawDEX
- Source language: ko
- Selected manga input: popular offset 0: Lustful Games (`.../lustful-games-b60d532c`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Lustful Games (`.../lustful-games-b60d532c`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Someone Stop Her! (`.../someone-stop-her-raw`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Set Up (Kim Mundo) (`.../set-up-kim-mundo`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | I Didn’t Sign Up For This (`.../i-didnt-sign-up-for-this`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lustful Games (`.../lustful-games-b60d532c`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lustful Games (`.../lustful-games-b60d532c`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 158 | Chapter 01 (`.../01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 66 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lustful Games, URL=`.../lustful-games-b60d532c` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../Lustful-Games-1.jpg <redacted query values: fit and ssl>` (image/jpeg, 18581 bytes, 214x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lustful-games-b60d532c` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../Lustful-Games-1.jpg <redacted query values: fit and ssl>` (image/jpeg, 207971 bytes, 720x1008) |  |  |  |
| details author | PASS | Kampis |  |  |  |
| details artist | PASS | Jilun |  |  |  |
| details genres | PASS | Action, Adult, Drama, Fantasy, Mature, Mystery, School Life, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “A walk down memory lane of school memories filled with studying and bullying. After graduation, each student who was a senior of Class 5 receives a message to participate in an alumni reunion. No one knows who sent the message. A reward of \$10,000 and the location is an abandoned island. Although there were some suspicious parts to the message, everyone participates, thinking that it’s a joke. In this event, everyone relives and faces their past self which they had buried for so long.”<br><br>Alternative Names:<br>- 3학년 5반<br>- 3年5班~穷途末路！淫乱的无人岛求生~<br>- 3rd Grade - 5th Class<br>- 3rd Year - Class 5<br>- Grade 3 Class 5<br>- Seniors of Class 5 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 158 chapters |  |  |  |
| chapter dates | PASS | 158 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 66 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.rawdex.net/.../1.webp` (image/webp (encoding: lossy), 138118 bytes, 720x2869) |  |  |  |
