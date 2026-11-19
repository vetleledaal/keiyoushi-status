# Extension Validation Report

- Extension: tachiyomi-zh.kanman-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3710922009941786183
- Source name: 看漫画
- Source language: zh
- Selected manga input: latest offset 0: 绝世武神 (`.../98426`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 61 | 凤逆天下 (`.../17745`) |  | 10s+ |
| popular_next | `getPopularManga(2)` | success | 21 | 我的弟子都超神 (`.../108647`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 26 | 绝世武神 (`.../98426`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 42 | 最强仙界朋友圈 (`.../108226`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 26 | 绝世武神 (`.../98426`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 绝世武神 (`.../98426`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1264 | 公告 (`.../gonggao-1688955750.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| popular listing | PASS | 61 entries |  |  |  |
| latest listing | PASS | 26 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=绝世武神, URL=`.../98426` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 176/176 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 176/176 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image.yqmh.com/.../98426_3_4.jpg-noresize.webp` (image/webp (encoding: lossy), 59466 bytes, 600x799) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../98426` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://image.yqmh.com/.../98426.jpg` (image/png, 743077 bytes, 600x799) |  |  |  |
| details author | PASS | 云端漫画 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 热血, 冒险, 穿越 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 【每周五、六、七更新】（本作品部分含AI生成画面）九霄大陆，武道为尊，弱小的武者，都有千、万斤巨力；而强大的武者，可斩断河流、劈开大山；更有武道皇者，通天彻地，遨游太虚。武道，决定命运，决定生死，弱者，受人欺凌，强者，俯瞰天下。这是一个恃强凌弱的世界，人们以武道修为来定等级、论高低。各大门派为了争夺最强之名，一直明争暗斗。在这里，只有强者有权利生存下去，若是实力弱小，也只有被驱赶欺凌的下场。<br><br>**更新:** 每周五、六、七更新 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1264 chapters |  |  |  |
| chapter dates | LINT | 1263 of 1264 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1263 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hw-chapter2.kaimanhua.com/.../1.jpg <redacted query values: auth_key>` (image/jpeg, 1137835 bytes, 1280x1920) |  |  |  |
