# Extension Validation Report

- Extension: tachiyomi-zh.hanabimanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
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
- Selected manga input: popular offset 0: 古见同学有交流障碍症 (`.../65`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 古见同学有交流障碍症 (`.../65`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | 在超市后门吸烟的二人 (`.../446`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | 魔女与佣兵 (`.../3312`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | 要来向表姐撒娇吗？ (`.../2783`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 古见同学有交流障碍症 (`.../65`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 古见同学有交流障碍症 (`.../65`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 494 | 短篇 (`.../4984`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=古见同学有交流障碍症, URL=`65` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img2.cycimg.me/.../180061_v8K7Z.jpg` (image/jpeg, 131891 bytes, 764x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `65` |  |  |  |
| details thumbnail URL | PASS | `https://img2.cycimg.me/.../180061_v8K7Z.jpg` |  |  |  |
| details author | PASS | オダトモヒト |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 治愈, 漫画, 恋爱, 校园, 漫画系列, 日常, 已完结, 日本, 少女漫画, 系列, 日漫, 搞笑, 原创, 连载中, 小学館, 周刊少年sunday, 週刊少年サンデー, 2016, マンガ, 日本漫画, 颜艺, 狗粮, 少年漫画, 欢乐向, オダトモヒト, 黑丝, 古见同学有交流障碍症, 恋爱, 日漫 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 万人迷的美少女古见同学患有社交恐惧症。她极不擅长与人沟通，
<br>　　总是苦恼着「该如何开口跟人交谈？」
<br>　　「交谈之后又该怎么办？」
<br>　　只野同学和患有这种症状的古见同学变成了朋友，
<br>　　两人的心灵逐渐相通并且做了某项约定。从此之后，
<br>　　只野会不知不觉地傻笑，但偶尔，胸口也会隐隐刺痛。
<br>　　让人一看就中毒的社交恐惧症女主角喜剧在此揭开序幕!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 494 chapters |  |  |  |
| chapter dates | PASS | 494 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.hanabimanga.top/.../001.webp <redacted query values: t and sign>` (image/webp (encoding: lossy), 303456 bytes, 900x1330) |  |  |  |
