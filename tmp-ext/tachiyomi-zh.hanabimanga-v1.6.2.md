# Extension Validation Report

- Extension: tachiyomi-zh.hanabimanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6689953277839268159
- Source name: 花火漫画
- Source language: zh
- Selected manga input: popular offset 0: 全知读者视角 (`.../1641`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 全知读者视角 (`.../1641`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | 我们不可能成为恋人！绝对不行。 (※似乎可行？) (`.../347`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | 关于前女友弟弟很可爱的那件事 (`.../3265`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | 魔道转生记 (`.../3496`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 全知读者视角 (`.../1641`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 全知读者视角 (`.../1641`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 312 | 第00话 (`.../81169`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=全知读者视角, URL=`1641` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img2.cycimg.me/.../314399_9MMhG.jpg` (image/jpeg, 42171 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `1641` |  |  |  |
| details thumbnail URL | PASS | `https://img2.cycimg.me/.../314399_9MMhG.jpg` |  |  |  |
| details author | PASS | Sleep-C，SingSyong |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 2020, webtoon, 男性向, 战斗, 韩漫 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ‘这是我读过的内容。’当小说中的世界与现实重叠，残忍的鬼怪与不断升级的逃杀游戏向人们袭来。唯一通读过整部小说的金独子因此拥有了超越他人的优势。然而，随着熟悉的小说角色一个个出现在他身边，‘主角’对他的敌意与戒备也愈发明显，而神秘的幕后势力‘星们’也加入了这场混乱。金独子将如何抉择？故事又将迎来怎样的发展？<br><br>——PODO（已下架）→哔哩哔哩漫画<br><br>「您收到了主线任务。」长着角的妖怪、熟悉的人物纷纷登场……太离谱了……这不就是我读过的小说剧情吗！<br><br>——Line Webtoon TW |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 312 chapters |  |  |  |
| chapter dates | PASS | 312 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.hanabimanga.top/.../001.webp <redacted query values: t and sign>` (image/webp (encoding: lossy), 142898 bytes, 690x3787) |  |  |  |
