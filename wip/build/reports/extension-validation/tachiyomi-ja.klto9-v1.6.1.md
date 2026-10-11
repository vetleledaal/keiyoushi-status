# Extension Validation Report

- Extension: tachiyomi-ja.klto9-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3136857802804349121
- Source name: Klto9
- Source language: ja
- Selected manga input: popular offset 0: Kimetsu No Yaiba - Raw (`.../teap-kimetsu-no-yaiba-raw.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Kimetsu No Yaiba - Raw (`.../teap-kimetsu-no-yaiba-raw.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Yakusoku No Neverland - Raw (`.../teap-yakusoku-no-neverland-raw.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Agent Of The Succubus (`.../teap-agent-of-the-succubus.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Ananie Idol (`.../teap-ananie-idol.html`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kimetsu No Yaiba - Raw (`.../teap-kimetsu-no-yaiba-raw.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kimetsu No Yaiba - Raw (`.../teap-kimetsu-no-yaiba-raw.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 148 | Chapter 12 (`.../115306`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kimetsu No Yaiba - Raw, URL=`.../teap-kimetsu-no-yaiba-raw.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://j4.jfimv2.xyz/.../6131f75a99389_6131f75af070c.jpg` (image/jpeg, 84484 bytes, 150x236) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../teap-kimetsu-no-yaiba-raw.html` |  |  |  |
| details thumbnail URL | PASS | `https://j4.jfimv2.xyz/.../6131f75a99389_6131f75af070c.jpg` |  |  |  |
| details author | PASS | GOTOUGE Koyoharu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adventure, Fantasy, Historical, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Other Names: 鬼滅の刃<br><br>Tanjiro is the oldest son in his family who has lost his father. One day, Tanjiro ventures off to another town to sell charcoal. Instead of going home, he ends up staying the night at someone else?s house due to rumors of a demon nearby in the mountains. When he gets home the following day, a terrible tragedy awaits him. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 148 chapters |  |  |  |
| chapter dates | PASS | 148 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://j4.jfimv2.xyz/.../5fccccf230c6f_5fccccf46c08d.jpg` (image/jpeg, 249969 bytes, 764x1200) |  |  |  |
