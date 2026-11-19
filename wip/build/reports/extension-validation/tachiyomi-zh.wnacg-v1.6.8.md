# Extension Validation Report

- Extension: tachiyomi-zh.wnacg-v1.6.8
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6551136894818591762
- Source name: 紳士漫畫
- Source language: zh
- Selected manga input: latest offset 0: [長谷円]アナル処女喪失AVに出てしまった私の妻 (`.../photos-index-aid-404775.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | [スルメニウム (谷口大介)] 彼女のママもセフレにした話 [TMDlixin250] [Amerins重嵌+修复部分翻译] [無修正] (`.../photos-index-aid-405061.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | [ホークビット (孝至)] 叶森さんはドS彼氏の言いなり [DL版] [牢大机翻] (`.../photos-index-aid-404969.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | [長谷円]アナル処女喪失AVに出てしまった私の妻 (`.../photos-index-aid-404775.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | 榜一大哥的女主播收藏计划 [中文插画小说] Vol.7 (`.../photos-index-aid-405858.html`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | [長谷円]アナル処女喪失AVに出てしまった私の妻 (`.../photos-index-aid-404775.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [長谷円]アナル処女喪失AVに出てしまった私の妻 (`.../photos-index-aid-404775.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | 第1話 [Doomqiuqiu汉化][長谷円] 初撮り奥様の尻処女体験 (`.../photos-index-aid-4504.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[長谷円\]アナル処女喪失AVに出てしまった私の妻, URL=`.../photos-index-aid-404775.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://t1.wnimg2.cfd/.../01_001.jpg` (image/jpeg, 19752 bytes, 270x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../photos-index-aid-404775.html` |  |  |  |
| details thumbnail URL | PASS | `https://t1.wnimg2.cfd/.../01_001.jpg` |  |  |  |
| details author | PASS | xxxx111235 |  |  |  |
| details artist | PASS | xxxx111235 |  |  |  |
| details genres | PASS | 同人誌, 合集, 長谷円, 肛交 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img1.wnimg2.cfd/.../00_000.jpg <redacted query values: verify>` (image/jpeg, 5609 bytes, 382x104) |  |  |  |
