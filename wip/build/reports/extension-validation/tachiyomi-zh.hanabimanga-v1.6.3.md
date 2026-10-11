# Extension Validation Report

- Extension: tachiyomi-zh.hanabimanga-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6689953277839268159
- Source name: 花火漫画
- Source language: zh
- Selected manga input: popular offset 0: 学生会也有洞！ (`.../834`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 学生会也有洞！ (`.../834`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | 战姬求生记 背负异世界命运的不正经异性交流 (`.../3300`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | 来自深渊 (`.../648`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | 与猫相邻尚不识恋 (`.../2065`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 学生会也有洞！ (`.../834`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 学生会也有洞！ (`.../834`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 182 | 01卷附录 (`.../44662`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: 请先在插件设置中登录 | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: 请先在插件设置中登录 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=学生会也有洞！, URL=`834` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img2.xfmanga.top/.../379566_AxxZ5.jpg` (image/jpeg, 51608 bytes, 400x566) |  |  |  |
| details identity | PASS | Details preserved selected URL `834` |  |  |  |
| details thumbnail URL | PASS | `https://img2.xfmanga.top/.../379566_AxxZ5.jpg` |  |  |  |
| details author | PASS | むちまろ（无知麻吕） |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 原创, 喜剧, 2022, 四格, 伪娘, むちまろ, 搞笑, 日漫 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 高一的文艺青年水之江梅文学造诣相当深厚，但物理、化学、数学等理科成绩却惨不忍睹，因此面临留级的危机。在导师平冢的建议下，他加入了学生会，希望能借此挽救自己的学业。没想到这所一贯制国高中的学生会成员，竟然不是嚣张的小屁孩，就是闷骚的学姐和不幸少女……在这些个性十足的成员之中，阿梅也开始过上“色”彩缤纷的欢乐校园生活！<br><br>这个学生会的成员们，有的傻乎乎，有的令人害怕，有的闷骚，还有的有点怪。然而，不知为何，这一切又显得格外可爱，就这样度过着奇妙却又平凡的每一天。由略带天才气质的MUCHIMARO献上，全世界最可爱的日常四格漫画！<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 182 chapters |  |  |  |
| chapter dates | PASS | 182 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | 请先在插件设置中登录 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
