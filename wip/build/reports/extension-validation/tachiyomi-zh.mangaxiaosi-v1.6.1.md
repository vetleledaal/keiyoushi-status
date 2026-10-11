# Extension Validation Report

- Extension: tachiyomi-zh.mangaxiaosi-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
| popular | `getPopularManga(1)` | success | 10 | 秘密教學 (`.../418`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 22 | 下班後的例行戀愛.../%E4%B8%8B%E7%8F%AD%E5%BE%8C%E7%9A%84%E7%A7%98%E5%AF%86%E9%97%9C%E4%BF%82 (`.../878`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 22 | 幸福來得太突然.../%E7%AA%81%E7%84%B6%E6%88%90%E7%82%BA%E5%85%AC%E5%AF%93%E7%AE%A1%E7%90%86%E5%93%A1 (`.../1020`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | 秘密教學 (`.../418`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 秘密教學 (`.../418`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 323 | 第1話-門縫傳出呻吟聲 (`.../16124`) |  | <1s |
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
| thumbnail | PASS | `https://www.jjmhw9.top/.../cover.jpg` (image/jpeg, 87961 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../418` |  |  |  |
| details thumbnail URL | PASS | `https://www.jjmhw9.top/.../cover.jpg` |  |  |  |
| details author | PASS | 美娜讚 & 鋼鐵王 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 都市 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 13歲那年成為孤兒的子豪，被爸爸的朋友收養。然而成年後的子豪卻對男女交往一無所知，阿姨與姊姊們決定給純潔的子豪，來場教學… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 323 chapters |  |  |  |
| chapter dates | LINT | 322 of 323 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=322 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.jjmhw9.top/.../407243.jpg` (image/jpeg, 174993 bytes, 720x4200) |  |  |  |
