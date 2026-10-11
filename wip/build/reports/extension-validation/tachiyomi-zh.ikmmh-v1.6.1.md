# Extension Validation Report

- Extension: tachiyomi-zh.ikmmh-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1793919771803569726
- Source name: 爱看漫
- Source language: zh
- Selected manga input: popular offset 0: 变形金刚：传奇~ (`.../35349`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | 变形金刚：传奇~ (`.../35349`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 48 | 闪闪发光部的崩坏~ (`.../71705`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 0 |  |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 372 | 真千金她是全能大佬 (`.../45232`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 变形金刚：传奇~ (`.../35349`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 变形金刚：传奇~ (`.../35349`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 73 | 网络漫画01话 (`.../883935.html`) |  | <1s |
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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=变形金刚：传奇~, URL=`.../35349` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 has no manga to check |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 469/469 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 469/469 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tuer.justpic01pt.com/.../6a80da38-14a5-11ec-a5f3-00163e0ca5bd.jpg` (image/jpeg, 14643 bytes, 270x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../35349` |  |  |  |
| details thumbnail URL | PASS | `https://tuer.justpic01pt.com/.../6a80da38-14a5-11ec-a5f3-00163e0ca5bd.jpg` |  |  |  |
| details author | PASS | IDW |  |  |  |
| details artist | PASS | IDW |  |  |  |
| details genres | PASS | 科幻 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 围绕身为「TF玩具宅！？」的野兽角色们展开的轻松快乐的日常剧。喜欢变形金刚的各位应该也能明白他们的心情！和这些角色们一起享受变形金刚玩具吧！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 73 chapters |  |  |  |
| chapter dates | PASS | 73 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://tuer.justpic01pt.com/.../cc5f2ac0-14a5-11ec-a5f3-00163e0ca5bd.jpg` (image/jpeg, 143565 bytes, 735x1031) |  |  |  |
