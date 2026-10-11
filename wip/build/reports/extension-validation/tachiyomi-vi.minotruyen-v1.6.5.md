# Extension Validation Report

- Extension: tachiyomi-vi.minotruyen-v1.6.5
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 27
- Lint: 3
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.c
- Source ID: 1911829101129863006
- Source name: MinoTruyen Manga
- Source language: vi
- Selected manga input: popular offset 0: Oneshot nhưng lại là series (`.../5899`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Oneshot nhưng lại là series (`.../5899`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Sumanai!! Masumi-kun (`.../53796`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Oneshot nhưng lại là series (`.../5899`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Oneshot nhưng lại là series (`.../5899`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 569 | Thằng bạn lần đầu giả gái để an ủi tôi (minh họa bởi @kandumesss) (`.../201641`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Oneshot nhưng lại là series, URL=`.../5899` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 48/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://p21-lp-sg.ibyteimg.com/.../563a527fd96d498783c8f8fefc271968~tplv-375lmtcpo0-resize:200:200.webp` (image/webp (encoding: lossy), 4964 bytes, 145x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../5899` |  |  |  |
| details thumbnail URL | PASS | `https://p21-lp-sg.ibyteimg.com/.../563a527fd96d498783c8f8fefc271968~tplv-375lmtcpo0-resize:200:200.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | đang tiến hành, đời thường, manga, nam giả nữ, oneshot |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Tổng hợp các oneshot ngắn (hoặc dài, được chia thành nhiều phần) từ Twitter hay Pixiv được tôi dịch. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 94 name, chapter 135 name, chapter 222 name, chapter 253 name, chapter 300 name, chapter 410 name, chapter 424 name, chapter 428 name, chapter 436 name, chapter 451 name, chapter 480 name, chapter 493 name, chapter 497 name, chapter 499 name, chapter 547 name |  |  |  |
| chapters | PASS | 569 chapters |  |  |  |
| chapter dates | PASS | 569 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://api.cloudkk-v1.xyz/.../books <redacted query values: take and category>` to `https://api.cloudkk-v2.xyz/.../books <redacted query values: take and category>` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../books <redacted query values: take, page, and category>` to `https://api.cloudkk-v2.xyz/.../books <redacted query values: take, page, and category>` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../books <redacted query values: take, page, category, and q>` to `https://api.cloudkk-v2.xyz/.../books <redacted query values: take, page, category, and q>` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../5899` to `https://api.cloudkk-v2.xyz/.../5899` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../books <redacted query values: take, page, and category>` to `https://api.cloudkk-v2.xyz/.../books <redacted query values: take, page, and category>` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../chapters <redacted query values: order>` to `https://api.cloudkk-v2.xyz/.../chapters <redacted query values: order>` (1 redirects); popular: `https://minotruyenv5.xyz/.../201641` to `https://minotruyenv5.xyz/.../201641` (1 redirects) |  |  |  |
| page load | PASS | `https://phinf.pstatic.net/.../test.jpeg` (image/jpeg, 192739 bytes, 1024x1298) |  |  |  |
