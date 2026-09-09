# Extension Validation Report

- Extension: tachiyomi-zh.terrahistoricus-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4585134706567717130
- Source name: 泰拉记事社
- Source language: zh
- Selected manga input: popular offset 0: 循途漫录：大将军，出击！ (`.../7746`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 21 | 循途漫录：大将军，出击！ (`.../7746`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 5 | 溯始先声：孤芳 (`.../1429`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 4 | 123罗德岛！？ (`.../6253`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 4 | 加油吧！终末地 (`.../3115`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 循途漫录：大将军，出击！ (`.../7746`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 循途漫录：大将军，出击！ (`.../7746`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | 01 大将军，出击！ (`.../8623`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 58 |  |  | 1-10s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 4 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=循途漫录：大将军，出击！, URL=`.../7746` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 3 manga entries; Latest page 2 repeats 3 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 35/35 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 35/35 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://web.hycdn.cn/.../b317100ce77cbceabeeae6bccb221f17.jpg` (image/jpeg, 862277 bytes, 1920x1080) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../7746` |  |  |  |
| details thumbnail URL | PASS | `https://web.hycdn.cn/.../b317100ce77cbceabeeae6bccb221f17.jpg` |  |  |  |
| details author | PASS | 鹰角网络 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 桃金娘 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 孩子王也是王！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 58 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://res01.hycdn.cn/.../bb2995eb3ad13f7cc9313ee54b587d56.jpg` (image/jpeg, 1534154 bytes, 1200x1670) |  |  |  |
