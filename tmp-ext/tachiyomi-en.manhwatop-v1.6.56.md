# Extension Validation Report

- Extension: tachiyomi-en.manhwatop-v1.6.56
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
- Source ID: 5177484976652938680
- Source name: Manhwatop
- Source language: en
- Selected manga input: popular offset 0: Martial Peak (`.../4158`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Martial Peak (`.../4158`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Beware of the Villainess! (`.../2690`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | The Ultimate Wantless Godly Rich System (`.../86048`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Warrior Grandpa and Grandmaster daughter (`.../79304`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Martial Peak (`.../4158`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../4158`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3869 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`4158` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 124/124 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 124/124 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwatop.com/.../Martial-Peak-1-175x238.jpg` (image/jpeg, 11688 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `4158` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manhwatop.com/.../Martial-Peak-1-193x278.jpg` (image/jpeg, 14122 bytes, 193x278) |  |  |  |
| details author | PASS | Momo (II), Momo (III) |  |  |  |
| details artist | PASS | Momo (II), Pikapi |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Harem, Historical, Manga, Manhwa, Martial Arts, Romance, Sci-fi, Shounen, Supernatural, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Read top manhua Martial Peak at top manhua com<br><br>Description manhua hot:<br><br>The journey to the martial peak is a lonely, solitary and long one.In the face of adversity,you must survive and remain unyielding.Only then can you break through and and continue on your journey to become the strongest. Sky Tower tests its disciples in the harshest ways to prepare them for this journey.One day the lowly sweeper Yang Kai managed to obtain a black book, setting him on the road to the peak of the martials world.<br><br>Associated manhua top Name: Võ Luyện Đỉnh Phong, Wǔ Liàn Diān Fēng, Wǔ Liàn Diānfēng, 武炼巅峰<br><br>Recommend for you !<br><br>Best manhua of the world for all time you can find out now<br><br>Hot manhua top 10 that We recommend for you<br><br>Alternative Names: Võ Luyện Đỉnh Phong, Wǔ Liàn Diān Fēng, Wǔ Liàn Diānfēng, 武炼巅峰 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3869 chapters |  |  |  |
| chapter dates | LINT | All 3869 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3869 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://c1.manhwatop.com/.../c_0_1.jpg` (image/jpeg, 264935 bytes, 764x1200) |  |  |  |
