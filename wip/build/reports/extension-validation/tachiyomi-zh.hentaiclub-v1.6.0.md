# Extension Validation Report

- Extension: tachiyomi-zh.hentaiclub-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8618065660246087865
- Source name: 绅士会所
- Source language: zh
- Selected manga input: popular offset 0: G44不会受伤 碧蓝航线 朝凪 泳装 (`.../70682.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | G44不会受伤 碧蓝航线 朝凪 泳装 (`.../70682.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Messie Yoimiya (`.../70652.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | G44不会受伤 碧蓝航线 朝凪 泳装 (`.../70682.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 章节 1 (`.../70682.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.sshs.rip/.../fd2590e4a085e4fb7fee8905cf843a66.webp` (image/webp (encoding: lossy), 63748 bytes, 1440x2158) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../70682.html` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.sshs.rip/.../fd2590e4a085e4fb7fee8905cf843a66.webp` |  |  |  |
| details author | PASS | G44不会受伤 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | G44不会受伤 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 浏览量：1022次 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.hentaiclub.net/.../G44%E4%B8%8D%E4%BC%9A%E5%8F%97%E4%BC%A4%20%E7%A2%A7%E8%93%9D%E8%88%AA%E7%BA%BF%20%E6%9C%9D%E5%87%AA%20%E6%B3%B3%E8%A3%85` to `https://www.hentaiclub.net/.../G44%E4%B8%8D%E4%BC%9A%E5%8F%97%E4%BC%A4%E7%A2%A7%E8%93%9D%E8%88%AA%E7%BA%BF%E6%9C%9D%E5%87%AA%E6%B3%B3%E8%A3%85` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.sshs.rip/.../fd2590e4a085e4fb7fee8905cf843a66.webp` (image/webp (encoding: lossy), 63748 bytes, 1440x2158) |  |  |  |
