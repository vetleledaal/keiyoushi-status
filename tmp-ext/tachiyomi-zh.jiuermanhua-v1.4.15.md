# Extension Validation Report

- Extension: tachiyomi-zh.jiuermanhua-v1.4.15
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1520913911854846698
- Source name: 92漫画
- Source language: zh
- Selected manga input: latest offset 0: 地下忍者 (`.../12`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 36 | 暴夜 (`.../1212`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 36 | 公司内请保持肃静 (`.../1257`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 36 | 地下忍者 (`.../12`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 36 | 欲望的格调 (`.../7342`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 地下忍者 (`.../12`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 地下忍者 (`.../12`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 169 | 第1话 差劲下忍 (`.../1143.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=地下忍者, URL=`.../12` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://cover.alltucdn.cc/.../1619654719kf03VK6kVti7hLDE.jpg` (image/jpeg, 71667 bytes, 360x480) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12` |  |  |  |
| details thumbnail URL | PASS | `http://cover.alltucdn.cc/.../1619654719kf03VK6kVti7hLDE.jpg` |  |  |  |
| details author | PASS | 花泽健吾 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少年漫画, 校园 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 现代忍者故事，隐匿于日本社会中，私下的斗争，各种工作任务，秘密行动；在现实社会下，忍者会过着怎样的生活呢？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 169 chapters |  |  |  |
| chapter dates | LINT | 168 of 169 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=168 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cover.alltucdn.cc/.../1619658529z_QOszmtbR_jSxUb.jpg` (image/jpeg, 682991 bytes, 1153x1638) |  |  |  |
