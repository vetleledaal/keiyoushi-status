# Extension Validation Report

- Extension: tachiyomi-zh.zaimanhua-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 524579092615598717
- Source name: 再漫画
- Source language: zh
- Selected manga input: popular offset 0: 大理寺日志 (`.../19526`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | 大理寺日志 (`.../19526`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | 少女不溶于神 (`.../82506`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | 羽鸟与古田的非日常青春谭 (`.../84374`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | 川柳少女 (`.../39472`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 大理寺日志 (`.../19526`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 大理寺日志 (`.../19526`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 392 | 第1话 (`.../84800`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 2 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=大理寺日志, URL=`19526` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.zaimanhua.com/.../1002241141506407587.jpg` (image/jpeg, 33852 bytes, 270x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `19526` |  |  |  |
| details thumbnail URL | PASS | `https://images.zaimanhua.com/.../1002241141506407587.jpg` |  |  |  |
| details author | PASS | RC |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 历史, 职场, 搞笑 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 霸道上司是萌喵，唐朝公务员热热闹闹的日常。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 392 chapters |  |  |  |
| chapter dates | PASS | 392 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.zaimanhua.com/.../chapterpic%2F1863%2F107341%2F1.JPG <redacted query values: sign and t>` (image/jpeg, 345381 bytes, 500x1671; server Content-Type: binary/octet-stream) |  |  |  |
