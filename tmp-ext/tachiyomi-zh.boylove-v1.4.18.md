# Extension Validation Report

- Extension: tachiyomi-zh.boylove-v1.4.18
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1471112097704477289
- Source name: 香香腐宅
- Source language: zh
- Selected manga input: latest offset 0: Arcadia (`.../32924`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | PASSION/受难曲 (`.../11857`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | 公共财爸爸【无码】 (`.../31087`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Arcadia (`.../32924`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | 近距离邻居【无码】 (`.../33059`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Arcadia (`.../32924`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Arcadia (`.../32924`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 17 | 第01话 (`.../2681386`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 105 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Arcadia, URL=`32924` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 85/85 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 85/85 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blcnimghost2.cc/.../2e433086778e055488f4473f705b619e.webp` (image/webp (encoding: lossy), 148622 bytes, 960x1387) |  |  |  |
| details identity | PASS | Details preserved selected URL `32924` |  |  |  |
| details thumbnail URL | PASS | `https://blcnimghost2.cc/.../2e433086778e055488f4473f705b619e.webp` |  |  |  |
| details author | PASS | 희리,조도차 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 韩漫 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 更新时间：2026-08-28 16:16:00<br><br>아르카디아
<br>平台：ridibooks |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 105 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.boylove.cc/.../otWn6c0akJtDTWHbspkXhrLxnxXvTTz7CYI.webp <redacted query values: w and scrambled_parts_count>` (image/jpeg, 76644 bytes, 650x1055; server Content-Type: image/webp) |  |  |  |
