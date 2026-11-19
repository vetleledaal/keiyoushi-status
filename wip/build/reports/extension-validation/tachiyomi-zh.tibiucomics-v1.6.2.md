# Extension Validation Report

- Extension: tachiyomi-zh.tibiucomics-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mccms
- Source ID: 6028517731014373149
- Source name: TIBIU漫画
- Source language: zh
- Selected manga input: popular offset 0: 魔咒.../Jinx%E3%80%90%E6%97%A0%E7%A0%81%E3%80%91 (`.../27017`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 魔咒.../Jinx%E3%80%90%E6%97%A0%E7%A0%81%E3%80%91 (`.../27017`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | 红线挑战【无码】 (`.../27222`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | 五则孝爱传 (`.../25387`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Alpha没什么了不起的 (`.../51188`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 魔咒.../Jinx%E3%80%90%E6%97%A0%E7%A0%81%E3%80%91 (`.../27017`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 魔咒.../Jinx%E3%80%90%E6%97%A0%E7%A0%81%E3%80%91 (`.../27017`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 104 | 第1话 (`.../431002`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 144 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=魔咒.../Jinx%E3%80%90%E6%97%A0%E7%A0%81%E3%80%91, URL=`.../27017` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s3-aws.tibiu.xyz/.../30912.webp` (image/webp (encoding: lossy), 42122 bytes, 420x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../27017` |  |  |  |
| details thumbnail URL | PASS | `https://s3-aws.tibiu.xyz/.../30912.webp` |  |  |  |
| details author | PASS | 밍과（Mingwa） |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 追妻火葬场, 纯爱, 苦命受 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS |  《징크스》 别名 : 魔咒 金亶是个负债累累的物理治疗师， 为了奶奶的医疗费，他什么都愿意做。 某天，金亶居然收到了综合格斗选手冠军—周在景的提议， 说要出鉅款请金亶帮忙化解自己的「迷信」…? |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 104 chapters |  |  |  |
| chapter dates | PASS | 104 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 144 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s3-aws.tibiu.xyz/.../USTjlEAhToY36IBLEhKSUmoO8cvLrUx07li.webp` (image/webp (encoding: lossy), 15272 bytes, 650x866) |  |  |  |
