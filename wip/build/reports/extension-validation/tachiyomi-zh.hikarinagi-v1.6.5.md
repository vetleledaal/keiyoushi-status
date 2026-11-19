# Extension Validation Report

- Extension: tachiyomi-zh.hikarinagi-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3266193817034354049
- Source name: Hikarinagi
- Source language: zh
- Selected manga input: popular offset 0: 链锯人 (`.../228`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | 链锯人 (`.../228`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 40 | 更衣人偶坠入爱河 (`.../2421`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | 逢芽和宇海 (`.../46213`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | 神乐钵 (`.../4307`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 40 | 逢芽和宇海 (`.../46213`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 链锯人 (`.../228`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 270 | 第01话 (`.../7892`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: 请先在 WebView 中登录 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: 请先在 WebView 中登录 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 40 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 200/200 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 200/200 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imagesp.yurari.moe/.../9a1aaebc-97ac-4161-802a-4f63e08f0b88.webp` (image/webp (container: extended), 834002 bytes, 1297x2048) |  |  |  |
| details identity | PASS | Details preserved selected URL `228` |  |  |  |
| details thumbnail URL | PASS | `https://imagesp.yurari.moe/.../9a1aaebc-97ac-4161-802a-4f63e08f0b88.webp` |  |  |  |
| details author | PASS | 藤本树 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 战斗, 邪道, 热血, 奇幻, 搞笑, 神经病, 猎奇, 自由, 血腥 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 270 chapters |  |  |  |
| chapter dates | PASS | 270 positive upload dates |  |  |  |
| chapter titles | LINT | One or more chapters have no title |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | 请先在 WebView 中登录 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
