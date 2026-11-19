# Extension Validation Report

- Extension: tachiyomi-zh.terrahistoricus-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4585134706567717130
- Source name: 泰拉记事社
- Source language: zh
- Selected manga input: popular offset 0: 序言组曲：火与路 (`.../3114`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 22 | 序言组曲：火与路 (`.../3114`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 6 | 溯始先声：缘起 (`.../6251`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 4 | 123罗德岛！？ (`.../6253`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 4 | 加油吧！终末地 (`.../3115`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 序言组曲：火与路 (`.../3114`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 序言组曲：火与路 (`.../3114`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | 01 上篇 (`.../1565`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | 1-10s |

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
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | PASS | 4 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=序言组曲：火与路, URL=`.../3114` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 3 manga entries; Latest page 2 repeats 2 manga entries: title=加油吧！终末地, URL=`.../3115` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://web.hycdn.cn/.../fd4f3196b2320db30a11ecd053551fef.jpg` (image/jpeg, 937934 bytes, 1920x1080) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../3114` |  |  |  |
| details thumbnail URL | PASS | `https://web.hycdn.cn/.../fd4f3196b2320db30a11ecd053551fef.jpg` |  |  |  |
| details author | PASS | 鹰角网络 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 塔露拉, 序言组曲 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 浴火前行 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | LINT | 1 of 2 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://res01.hycdn.cn/.../032278883438ea87799cf8be7fb604c2.jpg` (image/jpeg, 866632 bytes, 1200x1691) |  |  |  |
