# Extension Validation Report

- Extension: tachiyomi-en.manhuaplus-v1.6.61
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
- Source ID: 9030178752551947945
- Source name: Manhua Plus
- Source language: en
- Selected manga input: popular offset 0: Martial Peak (`.../1855`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Martial Peak (`.../1855`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | School Flower Master (`.../4279`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | I Am the Fated Villain (`.../28594`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | The Legendary Mechanic (`.../28053`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Martial Peak (`.../1855`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../1855`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3364 | CHapter 3860 (`.../chapter-3860`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`1855` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhuaplus.com/.../thumbbbbb-175x238.jpg` (image/jpeg, 13390 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1855` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manhuaplus.com/.../thumbbbbb-193x278.jpg` (image/jpeg, 16517 bytes, 193x278) |  |  |  |
| details author | PASS | Momo (Ii) |  |  |  |
| details artist | PASS | Pikapi |  |  |  |
| details genres | PASS | Action, Adventure, Harem, Manhua, Martial Arts, Mystery, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The journey to the martial peak is a lonely, solitary and long one.In the face of adversity,you must survive and remain unyielding.Only then can you break through and and continue on your journey to become the strongest. Sky Tower tests its disciples in the harshest ways to prepare them for this journey.One day the lowly sweeper Yang Kai managed to obtain a black book, setting him on the road to the peak of the martials world.<br><br>Alternative Names: MP, 武炼巅峰 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3364 chapters |  |  |  |
| chapter dates | LINT | 977 of 3364 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=977 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.manhuaplus.com/.../RF9ss1.jpg` (image/jpeg, 1568925 bytes, 1200x11641) |  |  |  |
