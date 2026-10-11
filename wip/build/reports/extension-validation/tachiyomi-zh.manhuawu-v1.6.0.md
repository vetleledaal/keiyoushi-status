# Extension Validation Report

- Extension: tachiyomi-zh.manhuawu-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mccms
- Source ID: 3279300917142951720
- Source name: 漫画屋
- Source language: zh
- Selected manga input: popular offset 0: 斗破苍穹 (`.../doupocangkong`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 斗破苍穹 (`.../doupocangkong`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | 年下邻居 甜蜜攻陷 (`.../nianxialinjutianmigongxian`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | 虚拟临界 (`.../xunilinjie`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 星影 - 传说中的绿蒂 (`.../xingyingchuanshuozhongdeludi`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 6 | 斗破苍穹 (`.../doupocangkong`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 斗破苍穹 (`.../doupocangkong`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 670 | 01 (`.../196437`) |  | <1s |
| pages | `getPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=斗破苍穹, URL=`.../doupocangkong` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 126/126 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 126/126 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static-tw.baozimh.com/.../doupocangqiong-zhiyinmankerenxiang.jpg <redacted query values: w, h, and q>` (image/jpeg, 32004 bytes, 285x375) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../doupocangkong` |  |  |  |
| details thumbnail URL | PASS | `https://static-tw.baozimh.com/.../doupocangqiong-zhiyinmankerenxiang.jpg <redacted query values: w, h, and q>` |  |  |  |
| details author | PASS | 知音漫客 任翔 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 玄幻 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 正所谓三十年河东三十年河西，天才少年因忽然失去了天生的灵力，被所有人嘲笑排挤，为了一雪前耻他亲手毁掉婚约，一心进修、打怪、升级！重登人生巅峰的他让人们知道莫欺少年穷真的很重要！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 670 chapters |  |  |  |
| chapter dates | LINT | All 670 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=670 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s1.baozimh.com/.../1.jpg` (image/jpeg, 89286 bytes, 800x1333) |  |  |  |
