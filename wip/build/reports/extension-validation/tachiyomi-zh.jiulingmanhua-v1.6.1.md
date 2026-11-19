# Extension Validation Report

- Extension: tachiyomi-zh.jiulingmanhua-v1.6.1
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
- Source theme: sinmh
- Source ID: 491516884240375076
- Source name: 90漫画网
- Source language: zh
- Selected manga input: popular offset 0: 在异世界迷宫开后宫 (`.../zaiyishijiemigongkaihougong`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | 在异世界迷宫开后宫 (`.../zaiyishijiemigongkaihougong`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | 炎炎之消防队 (`.../yanyanzhixiaofangdui`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | 异世界后宫循环：为逃离重复的一日而纵享春宵 (`.../yishijiehougongxunhuanweitaolichongfudeyirierzongxiangchunxiao`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | 青色火焰 (`.../qingsehuoyan`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 在异世界迷宫开后宫 (`.../zaiyishijiemigongkaihougong`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 在异世界迷宫开后宫 (`.../zaiyishijiemigongkaihougong`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 130 | 第1话 (`.../96121.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=在异世界迷宫开后宫, URL=`.../zaiyishijiemigongkaihougong` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://cover.haotu90.top/.../15421713035AhVZsQfrZ7EacDD.jpg` (image/jpeg, 70871 bytes, 270x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../zaiyishijiemigongkaihougong` |  |  |  |
| details thumbnail URL | PASS | `http://cover.haotu90.top/.../15421713035AhVZsQfrZ7EacDD.jpg` |  |  |  |
| details author | PASS | 苏我捨耻 四季童子 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少年漫画, 大陆, 冒险, 轻小说 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 「人生就是这样的东西――」。对这个世界感到绝望的少年发现了一个网站。在这个世界觉得辛苦的话就去异世界生活吧，这样想着点击了鼠标，等待他的真的是异世界！？但是因为有很多奖励点数可以用，他化身成了最强的男人，并获得了取得偶像级美少女的权利…！？重生的少年那有点作弊的后宫冒险就要开始了！<br><br>**别名:**<br>- 异世界迷宫里的后宫生活 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 130 chapters |  |  |  |
| chapter dates | LINT | 129 of 130 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=129 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `http://js50.haotu90.top/.../1563185057bHKT_laBYfIeu8wz.jpg` (image/jpeg, 503925 bytes, 1595x2296) |  |  |  |
