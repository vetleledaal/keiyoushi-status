# Extension Validation Report

- Extension: tachiyomi-zh.dumanwu-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mmlook
- Source ID: 7167507050606280098
- Source name: 读漫屋
- Source language: zh
- Selected manga input: latest offset 0: 我被困在同一天一千年 (`.../trvTwKl`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 99 | 一骗丹心 (`.../OMNzsGS`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 51 | 我被困在同一天一千年 (`.../trvTwKl`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | 我被困在同一天一千年 (`.../trvTwKl`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 我被困在同一天一千年 (`.../trvTwKl`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 296 | 第1话 时停千年 (`.../tbGTTtl`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 230 |  |  | 1-10s |

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
| popular listing | PASS | 99 entries |  |  |  |
| latest listing | PASS | 51 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=我被困在同一天一千年, URL=`trvTwKl` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 152/152 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 152/152 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://p6.ecombdimg.com/.../7e45479769de4fb8870ed8ff8425872c~tplv-scl3phc04j-image.jpeg` (image/jpeg, 27400 bytes, 500x313) |  |  |  |
| details identity | PASS | Details preserved selected URL `trvTwKl` |  |  |  |
| details thumbnail URL | PASS | `https://p6.ecombdimg.com/.../7e45479769de4fb8870ed8ff8425872c~tplv-scl3phc04j-image.jpeg` |  |  |  |
| details author | PASS | 丧泽（原著） |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 穿越, 奇幻 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 更新时间：09月10日<br><br>吴辰穿越新世界，却被困在2020年7月7日这一天，不断轮回！他曾肆意放纵，做尽恶事，也曾绝望暴走，但每到新的一天，一切都会重来。就这样他轮回了一千年，新的一天，太阳照常升起。——时间是：2020年7月8日。 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 71 name, chapter 72 name, chapter 73 name, chapter 74 name, chapter 75 name, chapter 76 name, chapter 77 name, chapter 78 name, chapter 79 name, chapter 80 name, chapter 81 name, chapter 82 name, chapter 83 name, chapter 147 name, chapter 240 name, chapter 263 name, chapter 271 name |  |  |  |
| chapters | PASS | 296 chapters |  |  |  |
| chapter dates | LINT | All 296 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=296 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 230 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://p3-zhuxiaobang-sign.shimolife.com/.../o0YQBf86HiKBIHbvyAzQiBDDE3UbBA62CAVAnS~tplv-hra1ikqiyn-29.jpeg <redacted query values: lk3s, x-expires, and x-signature>` (image/jpeg, 116775 bytes, 1080x844) |  |  |  |
