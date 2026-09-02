# Extension Validation Report

- Extension: tachiyomi-zh.kuaikanmanhua-v1.4.13
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 24
- Lint: 0
- Warnings: 0
- Skipped: 11
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8099870292642776005
- Source name: 快看漫画
- Source language: zh-Hans
- Selected manga input: latest offset 0: 魔法无用论 (`.../28223`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 43 | 怦然心动 (`.../766`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 42 | 全球诡异时代 (`.../12432`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 34 | 魔法无用论 (`.../28223`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 魔法无用论 (`.../28223`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 魔法无用论 (`.../28223`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 0 |  |  | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 43 entries |  |  |  |
| latest listing | PASS | 34 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=魔法无用论, URL=`.../28223` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tn1-f2.kkmh.com/.../AtD0pEv2i.webp-w320.w.jpg` (image/jpeg, 36178 bytes, 320x424) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../28223` |  |  |  |
| details thumbnail URL | PASS | `https://tn1-f2.kkmh.com/.../AtD0pEv2i.webp-w320.w.jpg` |  |  |  |
| details author | PASS | snapstudio |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 魔法消失的第七年，世界步入工业时代，魔法师变成流水线工人，曾经的大魔法师伊凡发誓要将魔法重新带回给世界 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
