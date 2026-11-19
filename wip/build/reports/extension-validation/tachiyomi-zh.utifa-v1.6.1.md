# Extension Validation Report

- Extension: tachiyomi-zh.utifa-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 312206349505621113
- Source name: Utifa
- Source language: zh
- Selected manga input: popular offset 0: 魔导少年 (`.../1485`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | 魔导少年 (`.../1485`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | 霰草忍法帖 (`.../1478`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 龙珠完全版 (`.../1489`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 神兵玄奇前传 (`.../1463`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 魔导少年 (`.../1485`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 魔导少年 (`.../1485`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 69 | [Kox][魔導少年]FairyTailS-01 (`.../10231`) |  | <1s |
| pages | `getPageList(chapter)` | success | 200 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=魔导少年, URL=`1485` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 98/98 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 98/98 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bx.yaimer.com/.../73d75ca52879457b85a7dd994c5a0d91` (image/jpeg, 167578 bytes, 638x960) |  |  |  |
| details identity | PASS | Details preserved selected URL `1485` |  |  |  |
| details thumbnail URL | PASS | `https://bx.yaimer.com/.../73d75ca52879457b85a7dd994c5a0d91` |  |  |  |
| details author | PASS | 真岛浩 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | fantasy, adventure, shonen, magic |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 魔法世界中，少女露西加入魔导士公会“妖精尾巴”，与纳兹、格雷、艾露莎等伙伴共同接受委托、对抗强敌，在友情与羁绊中不断成长。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 69 chapters |  |  |  |
| chapter dates | PASS | 69 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 200 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://bx.yaimer.com/.../000000.jpg <redacted query values: se, scope, and sig>` to `https://my.microsoftpersonalcontent.com/.../download.aspx <redacted query values: UniqueId, Translate, tempauth, and ApiVersion>` (1 redirects) |  |  |  |
| page load | PASS | `https://bx.yaimer.com/.../000000.jpg <redacted query values: se, scope, and sig>` (image/jpeg, 301948 bytes, 1116x1680) |  |  |  |
