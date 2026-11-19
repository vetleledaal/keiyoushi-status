# Extension Validation Report

- Extension: tachiyomi-zh.mangaxiaosi-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1939536259784675646
- Source name: Manga Xiao Si
- Source language: zh
- Selected manga input: popular offset 0: 秘密教學 (`.../418`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | 秘密教學 (`.../418`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 22 | 深淵頭等艙 (`.../1264`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 22 | 理想型演算法 (`.../1219`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | 秘密教學 (`.../418`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 秘密教學 (`.../418`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 327 | 第1話-門縫傳出呻吟聲 (`.../16124`) |  | <1s |
| pages | `getPageList(chapter)` | success | 55 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=秘密教學, URL=`.../418` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 74/74 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 74/74 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.jjmhw12.top/.../cover.jpg` (image/jpeg, 87961 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../418` |  |  |  |
| details thumbnail URL | PASS | `https://www.jjmhw12.top/.../cover.jpg` |  |  |  |
| details author | PASS | 美娜讚, 鋼鐵王 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 韩国, 都市 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 13歲那年成為孤兒的子豪，被爸爸的朋友收養。然而成年後的子豪卻對男女交往一無所知，阿姨與姊姊們決定給純潔的子豪，來場教學…<br><br>**别名:**<br>- 秘密教学 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 327 chapters |  |  |  |
| chapter dates | LINT | 326 of 327 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=326 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.jjmhw12.top/.../407243.jpg` (image/jpeg, 174993 bytes, 720x4200) |  |  |  |
