# Extension Validation Report

- Extension: tachiyomi-zh.hanman18-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 3
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5092568988625041973
- Source name: HANMAN18
- Source language: zh
- Selected manga input: latest offset 0: 老師的親密指導 (`.../912`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | 秘密教學 (`.../mimijiaohua`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | 借妻條約 (`.../1096`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | 老師的親密指導 (`.../912`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | 戀愛作弊百科 (`.../1227`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 老師的親密指導 (`.../912`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 老師的親密指導 (`.../912`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 112 | 第1話-小綿羊踏進豪門當家教! (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 110 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=老師的親密指導, URL=`.../912` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://azminv2.hanman18.com/.../cover_thumb_2.webp` (image/jpeg, 9671 bytes, 150x200; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../912` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://azminv2.hanman18.com/.../cover_250x350.jpg` (image/jpeg, 22633 bytes, 250x350) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 漫画简介：為了把會長家的學渣兒子送進名門大學，換取10億獎金，家教老師們無所不用其極。「範辰…想知道老師內褲裡面…長什麼樣子嗎?♥」想擺爛?能敵過我的美人計再說! 收藏 暂无章节<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 112 chapters |  |  |  |
| chapter dates | LINT | All 112 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=112 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 110 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://azminv2.hanman18.com/.../01.jpg` (image/jpeg, 24124 bytes, 720x800) |  |  |  |
