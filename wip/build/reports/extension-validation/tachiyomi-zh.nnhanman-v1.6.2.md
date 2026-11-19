# Extension Validation Report

- Extension: tachiyomi-zh.nnhanman-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6412117657297236190
- Source name: 鸟鸟韩漫
- Source language: zh
- Selected manga input: popular offset 0: 秘密教學 (`.../mi-mi-jiao-xue.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | 秘密教學 (`.../mi-mi-jiao-xue.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | 課後諮詢時間的秘密 (`.../ke-hou-zi-xun-shi-jian-de-mi-mi.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 秘密教學 (`.../mi-mi-jiao-xue.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 秘密教學 (`.../mi-mi-jiao-xue.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 337 | 第327話-誰的聖誕戰袍最性感? (`.../chapter-86950.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 139 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=秘密教學, URL=`.../mi-mi-jiao-xue.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumb.niaopic.com/.../20220930012101936.jpg` (image/jpeg, 82091 bytes, 302x403) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mi-mi-jiao-xue.html` |  |  |  |
| details thumbnail URL | PASS | `https://thumb.niaopic.com/.../20220930012101936.jpg` |  |  |  |
| details author | PASS | 美娜讚 & 鋼鐵王 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 正妹, 有夫之婦, 後宮, 不倫 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 13歲那年成為孤兒的子豪，被爸爸的朋友收養。然而成年後的子豪卻對男女交往一無所知，阿姨與姊姊們決定給純潔的子豪，來場教學... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 337 chapters |  |  |  |
| chapter dates | LINT | All 337 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=337 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 139 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.nnpic.xyz/.../20261114113304878.webp` (image/webp (encoding: lossy), 84932 bytes, 720x800) |  |  |  |
