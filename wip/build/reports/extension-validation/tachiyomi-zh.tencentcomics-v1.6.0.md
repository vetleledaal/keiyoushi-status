# Extension Validation Report

- Extension: tachiyomi-zh.tencentcomics-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 6353436350537369479
- Source name: 腾讯动漫
- Source language: zh-Hans
- Selected manga input: popular offset 0: 一人之下 (`.../531490`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | 一人之下 (`.../531490`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 12 | 顶级气运，悄悄修炼千年 (`.../652765`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | 开局死神职业，抬手召唤冥界 (`.../657938`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | 冥府君主，我即深渊 (`.../657781`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | 一人之下 (`.../531490`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 一人之下 (`.../531490`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 834 | 1.姐姐1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=一人之下, URL=`.../531490` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 58/58 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 58/58 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhua.acimg.cn/.../420` (image/jpeg, 85789 bytes, 420x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../531490` |  |  |  |
| details thumbnail URL | PASS | `https://manhua.acimg.cn/.../420` |  |  |  |
| details author | PASS | 米橙子 x 米二 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 【一人之下6定档1月2日！】大学生张楚岚清明回乡，遭遇神秘少女冯宝宝。素未谋面的冯宝宝却对张楚岚异常熟悉，并将其带去自己打工的快递公司。为了帮冯宝宝寻找她的身世，也为了查清自己与爷爷身上的秘密，张楚岚的生活被彻底颠覆，与冯宝宝一同踏上“异人”之旅。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 834 chapters |  |  |  |
| chapter dates | LINT | All 834 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=834 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manhua.acimg.cn/.../0` (image/jpeg, 361580 bytes, 1200x1906) |  |  |  |
