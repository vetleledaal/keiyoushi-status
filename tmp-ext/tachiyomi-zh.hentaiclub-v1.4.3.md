# Extension Validation Report

- Extension: tachiyomi-zh.hentaiclub-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8618065660246087865
- Source name: 绅士会所
- Source language: zh
- Selected manga input: popular offset 0: 萨隆苦囚 信浓 相融一梦 (`.../69777.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | 萨隆苦囚 信浓 相融一梦 (`.../69777.html`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | 西园寺南歌 葵酱Aoi 南鸽 绝对彼女 (`.../69753.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 萨隆苦囚 信浓 相融一梦 (`.../69777.html`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | 章节 1 (`.../69777.html`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 54 |  |  | 1-10s |

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
| thumbnail | PASS | `https://cdn.sshs.rip/.../81d7bf15859dfaf080c0c709fa4950bc.webp` (image/webp (encoding: lossy), 92094 bytes, 1440x2160) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../69777.html` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.sshs.rip/.../81d7bf15859dfaf080c0c709fa4950bc.webp` |  |  |  |
| details author | PASS | 萨隆苦囚 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 萨隆苦囚 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 浏览量：3058次 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.sshs.rip/.../81d7bf15859dfaf080c0c709fa4950bc.webp` (image/webp (encoding: lossy), 92094 bytes, 1440x2160) |  |  |  |
