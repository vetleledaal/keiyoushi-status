# Extension Validation Report

- Extension: tachiyomi-zh.hentaiclub-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Selected manga input: popular offset 0: Seya狮砸 胜利女神妮姬 马斯特 女仆 (`.../71554.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Seya狮砸 胜利女神妮姬 马斯特 女仆 (`.../71554.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | 冷reng 碧蓝档案 天童凯伊 (`.../71530.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Seya狮砸 胜利女神妮姬 马斯特 女仆 (`.../71554.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 章节 1 (`.../71554.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | <1s |

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
| thumbnail | PASS | `https://cdn.sshs.rip/.../9c66a7ccd5f83524087f69958f3146b6.webp` (image/webp (encoding: lossy), 267090 bytes, 1440x2160) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../71554.html` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.sshs.rip/.../9c66a7ccd5f83524087f69958f3146b6.webp` |  |  |  |
| details author | PASS | Seya狮砸 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Seya狮砸 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 浏览量：3524次 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.hentaiclub.net/.../Seya%E7%8B%AE%E7%A0%B8%20%E8%83%9C%E5%88%A9%E5%A5%B3%E7%A5%9E%E5%A6%AE%E5%A7%AC%20%E9%A9%AC%E6%96%AF%E7%89%B9%20%E5%A5%B3%E4%BB%86` to `https://www.hentaiclub.net/.../Seya%E7%8B%AE%E7%A0%B8%E8%83%9C%E5%88%A9%E5%A5%B3%E7%A5%9E%E5%A6%AE%E5%A7%AC%E9%A9%AC%E6%96%AF%E7%89%B9%E5%A5%B3%E4%BB%86` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.sshs.rip/.../9c66a7ccd5f83524087f69958f3146b6.webp` (image/webp (encoding: lossy), 267090 bytes, 1440x2160) |  |  |  |
