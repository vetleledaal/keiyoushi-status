# Extension Validation Report

- Extension: tachiyomi-zh.manhuagui-v1.4.28
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7057750772596492765
- Source name: 漫画柜
- Source language: zh
- Selected manga input: popular offset 0: 鬼灭之刃 (`.../19430`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 42 | 鬼灭之刃 (`.../19430`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 42 | 家有女友 (`.../12912`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 42 | 超级英雄军团V9 (`.../61216`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 42 | 哆啦A梦剧场版 大雄的秘密道具博物馆 官方漫画 (`.../61212`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | 鬼灭之刃 (`.../19430`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 鬼灭之刃 (`.../19430`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 235 | 番外01 (`.../248298.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 3 |  |  | 1-10s |

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
| popular listing | PASS | 42 entries |  |  |  |
| latest listing | PASS | 42 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=鬼灭之刃, URL=`.../19430` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 171/171 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 171/171 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cf.mhgui.com/.../19430.jpg` (image/jpeg, 13888 bytes, 132x176) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../19430` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cf.mhgui.com/.../19430.jpg` (image/jpeg, 22864 bytes, 180x240) |  |  |  |
| details author | PASS | 吾峠呼世晴 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 冒险, 热血 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 充满了鬼才的，血雨剑戟冒险谭，正式开幕。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 235 chapters |  |  |  |
| chapter dates | LINT | 234 of 235 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=234 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i.hamreus.com/.../01.png.webp <redacted query values: e and m>` (image/webp (encoding: lossy), 140256 bytes, 856x1340) |  |  |  |
