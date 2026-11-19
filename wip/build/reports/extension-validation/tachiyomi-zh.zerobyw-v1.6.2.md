# Extension Validation Report

- Extension: tachiyomi-zh.zerobyw-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8743284448117690086
- Source name: zero搬运网
- Source language: zh
- Selected manga input: popular offset 0: 欢迎来到难攻不落的魔王城 认定不需负面状态而被踢出勇者队伍的黑魔导士，被魔王军招揽为最高干部 (`.../details <redacted query values: kuid>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | 欢迎来到难攻不落的魔王城 认定不需负面状态而被踢出勇者队伍的黑魔导士，被魔王军招揽为最高干部 (`.../details <redacted query values: kuid>`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | 边境药师，在都会成为S级冒险者 英雄村的少年凭开挂药不自觉无双 (`.../details <redacted query values: kuid>`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 欢迎来到难攻不落的魔王城 认定不需负面状态而被踢出勇者队伍的黑魔导士，被魔王军招揽为最高干部 (`.../details <redacted query values: kuid>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 欢迎来到难攻不落的魔王城 认定不需负面状态而被踢出勇者队伍的黑魔导士，被魔王军招揽为最高干部  (`.../details <redacted query values: kuid>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | 1 (`.../index.php <redacted query values: zjid>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 211 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=欢迎来到难攻不落的魔王城 认定不需负面状态而被踢出勇者队伍的黑魔导士，被魔王军招揽为最高干部, URL=`.../details <redacted query values: kuid>` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://tupa.zerobyw33.com/.../001.jpg` (image/jpeg, 203187 bytes, 1400x1991) |  |  |  |
| details identity | UNUSUAL | Details changed selected title 欢迎来到难攻不落的魔王城 认定不需负面状态而被踢出勇者队伍的黑魔导士，被魔王军招揽为最高干部 to 欢迎来到难攻不落的魔王城 认定不需负面状态而被踢出勇者队伍的黑魔导士，被魔王军招揽为最高干部  |  |  |  |
| details thumbnail URL | PASS | `http://tupa.zerobyw33.com/.../001.jpg` |  |  |  |
| details author | PASS | 御鷹穂積×蚕堂j1×平石六×ユウヒ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 作者: 御鷹穂積×蚕堂j1×平石六×ユウヒ, 冒险, 奇幻, 一半中文一半生肉, 连载中, 收藏: 0, 人气: 4 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 在攻略迷宫化为娱乐的时代… 人气勇者队伍里的一位黑魔导士——雷默。 因为魔法不起眼，被逐出队伍，丢了饭碗。 在前方等待他的是，谜样的美女。 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: title |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | LINT | All 5 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=5 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 211 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `http://tupa.zerobyw33.com/.../001.jpg` (image/jpeg, 3698919 bytes, 4940x4303) |  |  |  |
