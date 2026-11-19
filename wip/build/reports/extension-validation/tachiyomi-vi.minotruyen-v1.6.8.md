# Extension Validation Report

- Extension: tachiyomi-vi.minotruyen-v1.6.8
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
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
- Selected manga input: popular offset 0: Soukyuu no Ariadne (`.../54087`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Soukyuu no Ariadne (`.../54087`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Gửi tới một tôi mới (`.../52134`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Soukyuu no Ariadne (`.../54087`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Soukyuu no Ariadne (`.../54087`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Chapter 1 (`.../6607363`) |  | <1s |
| pages | `getPageList(chapter)` | success | 53 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Soukyuu no Ariadne, URL=`.../54087` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://p21-lp-sg.ibyteimg.com/.../64f1cd537f3147089909e348cb82b540~tplv-375lmtcpo0-resize:200:200.webp` (image/webp (encoding: lossy), 14518 bytes, 155x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../54087` |  |  |  |
| details thumbnail URL | PASS | `https://p21-lp-sg.ibyteimg.com/.../64f1cd537f3147089909e348cb82b540~tplv-375lmtcpo0-resize:200:200.webp` |  |  |  |
| details author | PASS | Yagi Norihiro |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | action, adventure, comedy, drama, fantasy, shounen, slice of life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Đồng tác giả Claymore, Angel Densetsu, truyện xoay quanh một thiếu niên sống ẩn dật, tách biệt với thế giới nhưng mang trong mình một ước mơ đặc biệt. Định mệnh bắt đầu chuyển bánh vào ngày cậu gặp gỡ một cô gái cô độc và bước chân vào số phận của cô. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://api.cloudkk-v1.xyz/.../books <redacted query values: take and category>` to `https://api.cloudkk-v2.xyz/.../books <redacted query values: take and category>` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../books <redacted query values: take, page, and category>` to `https://api.cloudkk-v2.xyz/.../books <redacted query values: take, page, and category>` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../books <redacted query values: take, page, category, and q>` to `https://api.cloudkk-v2.xyz/.../books <redacted query values: take, page, category, and q>` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../54087` to `https://api.cloudkk-v2.xyz/.../54087` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../books <redacted query values: take, page, and category>` to `https://api.cloudkk-v2.xyz/.../books <redacted query values: take, page, and category>` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../chapters <redacted query values: order>` to `https://api.cloudkk-v2.xyz/.../chapters <redacted query values: order>` (1 redirects); popular: `https://minotruyenv5.xyz/.../6607363` to `https://minotruyenv5.xyz/.../6607363` (1 redirects) |  |  |  |
| page load | PASS | `https://phinf.pstatic.net/.../test.jpeg` (image/jpeg, 49544 bytes, 1200x626) |  |  |  |
