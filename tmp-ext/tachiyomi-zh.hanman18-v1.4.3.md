# Extension Validation Report

- Extension: tachiyomi-zh.hanman18-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 31
- Lint: 3
- Warnings: 1
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: manga18
- Source ID: 5092568988625041973
- Source name: HANMAN18
- Source language: zh
- Selected manga input: popular offset 0: 秘密教學 (`.../mimijiaohua`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | 秘密教學 (`.../mimijiaohua`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | 借妻條約 (`.../1096`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | 這一世我要開後宮 (`.../1192`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | 女同事太犯規 (`.../1144`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 秘密教學 (`.../mimijiaohua`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 秘密教學 (`.../mimijiaohua`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 319 | 第1話-門縫傳出呻吟聲 (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 55 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=秘密教學, URL=`.../mimijiaohua` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Invalid manga: latest entry 5: title=<blank>, URL=`.../869` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://azminv2.hanman18.com/.../cover_thumb_2.webp` (image/jpeg, 7691 bytes, 150x200; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mimijiaohua` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://azminv2.hanman18.com/.../cover_250x350.jpg` (image/jpeg, 17151 bytes, 250x350) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 13歲那年成為孤兒的子豪，被爸爸的朋友收養。然而成年後的子豪卻對男女交往一無所知，阿姨與姊姊們決定給純潔的子豪，來場教學&hellip<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 319 chapters |  |  |  |
| chapter dates | LINT | All 319 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=319 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../219` at offsets 100, 104, `.../218` at offsets 101, 105, `.../217` at offsets 102, 106 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://azminv2.hanman18.com/.../01.jpg` (image/jpeg, 174993 bytes, 720x4200) |  |  |  |
