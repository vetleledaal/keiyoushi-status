# Extension Validation Report

- Extension: tachiyomi-zh.manhuawu-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mccms
- Source ID: 3279300917142951720
- Source name: 漫画屋
- Source language: zh
- Selected manga input: latest offset 0: 妖神记 (`.../yaoshenji`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | 斗破苍穹 (`.../doupocangkong`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | 年下邻居 甜蜜攻陷 (`.../nianxialinjutianmigongxian`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | 妖神记 (`.../yaoshenji`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | 絕對綠燈俠 (`.../jueduilvdengxia`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | 妖神记 (`.../yaoshenji`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 妖神记 (`.../yaoshenji`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 980 | 第1话 重生 (`.../189321`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=妖神记, URL=`.../yaoshenji` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 123/123 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 123/123 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://oss.mkzcdn.com/.../63b78ffa50572-750x999.jpg!cover-400` (image/png, 471650 bytes, 400x533) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yaoshenji` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://static-tw.baozimh.com/.../yaoshenji-taxuedongman.jpg <redacted query values: w, h, and q>` (image/jpeg, 26607 bytes, 285x375) |  |  |  |
| details author | PASS | 踏雪动漫 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 热血, 冒险 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 妖神一出，谁与争锋？ 这是一个妖灵的世界，融合了妖灵，就可以成为强大的妖灵师。 因为一本时空妖灵之书，时空发生了扭转，当一切重新开始之时，命运之轮缓缓转动。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 980 chapters |  |  |  |
| chapter dates | LINT | All 980 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=980 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s1.baozimh.com/.../1.jpg` (image/jpeg, 169503 bytes, 724x1057) |  |  |  |
