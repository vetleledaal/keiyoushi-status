# Extension Validation Report

- Extension: tachiyomi-all.airibox-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8745980356692752458
- Source name: Airibox
- Source language: all
- Selected manga input: popular offset 0: JVID 璃奈醬 – 璃奈醬耶誕感謝祭,一集三套服裝,三種玩法,三次高潮!! (`.../jvid-%E7%92%83%E5%A5%88%E9%86%AC-%E7%92%83%E5%A5%88%E9%86%AC%E8%80%B6%E8%AA%95%E6%84%9F%E8%AC%9D%E7%A5%AD%E4%B8%80%E9%9B%86%E4%B8%89%E5%A5%97%E6%9C%8D%E8%A3%9D%E4%B8%89%E7%A8%AE%E7%8E%A9%E6%B3%95`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | JVID 璃奈醬 – 璃奈醬耶誕感謝祭,一集三套服裝,三種玩法,三次高潮!! (`.../jvid-%E7%92%83%E5%A5%88%E9%86%AC-%E7%92%83%E5%A5%88%E9%86%AC%E8%80%B6%E8%AA%95%E6%84%9F%E8%AC%9D%E7%A5%AD%E4%B8%80%E9%9B%86%E4%B8%89%E5%A5%97%E6%9C%8D%E8%A3%9D%E4%B8%89%E7%A8%AE%E7%8E%A9%E6%B3%95`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | 蒋露 – 御姐全尺度私拍 挺翘满满的艺术感 (`.../%E8%92%8B%E9%9C%B2-%E5%BE%A1%E5%A7%90%E5%85%A8%E5%B0%BA%E5%BA%A6%E7%A7%81%E6%8B%8D-%E6%8C%BA%E7%BF%98%E6%BB%A1%E6%BB%A1%E7%9A%84%E8%89%BA%E6%9C%AF%E6%84%9F`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | JVID 璃奈醬 – 璃奈醬耶誕感謝祭,一集三套服裝,三種玩法,三次高潮!! (`.../jvid-%E7%92%83%E5%A5%88%E9%86%AC-%E7%92%83%E5%A5%88%E9%86%AC%E8%80%B6%E8%AA%95%E6%84%9F%E8%AC%9D%E7%A5%AD%E4%B8%80%E9%9B%86%E4%B8%89%E5%A5%97%E6%9C%8D%E8%A3%9D%E4%B8%89%E7%A8%AE%E7%8E%A9%E6%B3%95`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../jvid-%E7%92%83%E5%A5%88%E9%86%AC-%E7%92%83%E5%A5%88%E9%86%AC%E8%80%B6%E8%AA%95%E6%84%9F%E8%AC%9D%E7%A5%AD%E4%B8%80%E9%9B%86%E4%B8%89%E5%A5%97%E6%9C%8D%E8%A3%9D%E4%B8%89%E7%A8%AE%E7%8E%A9%E6%B3%95`) |  | <1s |
| pages | `getPageList(chapter)` | success | 305 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 20/20 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 20/20 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://airibox.top/.../COS04P012_0.webp` (image/webp (encoding: lossy), 54504 bytes, 500x750) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../jvid-%E7%92%83%E5%A5%88%E9%86%AC-%E7%92%83%E5%A5%88%E9%86%AC%E8%80%B6%E8%AA%95%E6%84%9F%E8%AC%9D%E7%A5%AD%E4%B8%80%E9%9B%86%E4%B8%89%E5%A5%97%E6%9C%8D%E8%A3%9D%E4%B8%89%E7%A8%AE%E7%8E%A9%E6%B3%95` |  |  |  |
| details thumbnail URL | PASS | `https://airibox.top/.../COS04P012_0.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 305 photos |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 305 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://airibox.top/.../COS04P012_0.webp` (image/webp (encoding: lossy), 54504 bytes, 500x750) |  |  |  |
