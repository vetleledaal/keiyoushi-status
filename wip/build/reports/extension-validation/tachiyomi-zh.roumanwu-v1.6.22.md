# Extension Validation Report

- Extension: tachiyomi-zh.roumanwu-v1.6.22
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3647420805839021718
- Source name: 肉漫屋
- Source language: zh
- Selected manga input: popular offset 0: 摸魚生存指南 (`.../cmd4aowue017ucv07v5y29deq`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | 摸魚生存指南 (`.../cmd4aowue017ucv07v5y29deq`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | 幸福來得太突然 (`.../cm6cwyf4z017nbj073e8qpcu7`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | 純潔遊戲 (`.../cmteorx4z0006s6mf2v54nd1t`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 18 | 摸魚生存指南 (`.../cmd4aowue017ucv07v5y29deq`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 摸魚生存指南 (`.../cmd4aowue017ucv07v5y29deq`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 68 | 第1話 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 398 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=摸魚生存指南, URL=`.../cmd4aowue017ucv07v5y29deq` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=幸福來得太突然, URL=`.../cm6cwyf4z017nbj073e8qpcu7` at page 1 offset 11 and page 2 offset 0, title=夫婦遊戲, URL=`.../cm583elh60000muvwkd0cg249` at page 1 offset 12 and page 2 offset 1, title=韶恩, URL=`.../aaf812e8-5311-4381-aa79-10d638a15088` at page 1 offset 13 and page 2 offset 2, title=強制催眠, URL=`.../8a918eb1-3710-4909-b664-f8cefb9d3d89` at page 1 offset 14 and page 2 offset 3, title=一家有多妻, URL=`.../cmv1qzmt60000s6muw93zs41w` at page 1 offset 19 and page 2 offset 4, title=特別課程, URL=`.../cmnfixkj401midk070kl0n6ct` at page 1 offset 20 and page 2 offset 11, title=與生巨來, URL=`.../cml136agx000es6yipj03igjg` at page 1 offset 21 and page 2 offset 12, title=迷霧深處的誘惑, URL=`.../cmkh2x1rh000ds6upquv276c8` at page 1 offset 22 and page 2 offset 13, title=不要戀愛要打砲, URL=`.../cmfrsjsib019pba07c9rey1ft` at page 1 offset 23 and page 2 offset 14 |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 78/78 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 78/78 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://towm85.xyz/.../czM6Ly9yb3VtYW4vaW1hZ2VzL2NtZDRhb3d1ZTAxN3VjdjA3djV5MjlkZXEvY292ZXIuanBn.jpg` (image/jpeg, 27051 bytes, 270x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cmd4aowue017ucv07v5y29deq` |  |  |  |
| details thumbnail URL | PASS | `https://towm85.xyz/.../czM6Ly9yb3VtYW4vaW1hZ2VzL2NtZDRhb3d1ZTAxN3VjdjA3djV5MjlkZXEvY292ZXIuanBn.jpg` |  |  |  |
| details author | PASS | 洋葱&大秋 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 韓國 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 別名: 摸鱼生存指南<br><br>職場落寞男人的隱秘故事,舊情難斷，新緣悄然萌生,出差邂逅，命運微妙轉折！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 68 chapters |  |  |  |
| chapter dates | LINT | 67 of 68 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=67 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 398 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://v1.kelv47.xyz/.../czM6Ly9yb3VtYW4vaW1hZ2VzL2NtZDRhb3d1ZTAxN3VjdjA3djV5MjlkZXEvZnJlZXgvNDg5MTkvMzQ1MTU3NS5qcGc.jpg` (image/jpeg, 66407 bytes, 720x500) |  |  |  |
