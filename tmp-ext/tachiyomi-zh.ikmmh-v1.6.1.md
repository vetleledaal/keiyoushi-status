# Extension Validation Report

- Extension: tachiyomi-zh.ikmmh-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source ID: 1793919771803569726
- Source name: 爱看漫
- Source language: zh
- Selected manga input: popular offset 0: 雅尼猫~ (`.../52719`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | 雅尼猫~ (`.../52719`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 48 | WHITE NOTE PAD~ (`.../18145`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 246 | 榨乳猎人的异世界榨乳纪~ (`.../60493`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 77 | 高等灵魂 (`.../6380`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 雅尼猫~ (`.../52719`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 雅尼猫~ (`.../52719`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 74 | 第01話 (`.../1700802.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 246 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=雅尼猫~, URL=`.../52719` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 420/420 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 420/420 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tuer.justpic01pt.com/.../1699195513.jpg.328x422.jpg` (image/jpeg, 24726 bytes, 270x348) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../52719` |  |  |  |
| details thumbnail URL | PASS | `https://tuer.justpic01pt.com/.../1699195513.jpg.328x422.jpg` |  |  |  |
| details author | PASS | にゃんにゃんファクトリー |  |  |  |
| details artist | PASS | にゃんにゃんファクトリー |  |  |  |
| details genres | PASS | 欢乐向 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 事已至此，总之先来一根吧~ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 74 chapters |  |  |  |
| chapter dates | PASS | 74 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://tuer.justpic01pt.com/.../1.jpg` (image/jpeg, 125960 bytes, 800x1141) |  |  |  |
