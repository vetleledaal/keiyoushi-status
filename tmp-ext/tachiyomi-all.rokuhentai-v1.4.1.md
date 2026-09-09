# Extension Validation Report

- Extension: tachiyomi-all.rokuhentai-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6773816792833894188
- Source name: Roku Hentai
- Source language: all
- Selected manga input: popular offset 0: 🇯🇵 【ハイオクR-18】きゅるきゅる推しメイドさん_後編【限定描き下ろし】 (`.../sc7gy9`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | 🇯🇵 【ハイオクR-18】きゅるきゅる推しメイドさん_後編【限定描き下ろし】 (`.../sc7gy9`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | 🇨🇳 教教我！亞〇里老師！！ | Oshiete！A〇ri-sensei！！ (`.../fgwnuv`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 🇯🇵 【ハイオクR-18】きゅるきゅる推しメイドさん_後編【限定描き下ろし】 (`.../sc7gy9`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 🇯🇵 【ハイオクR-18】きゅるきゅる推しメイドさん_後編【限定描き下ろし】 (`.../sc7gy9`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | 🇯🇵 【ハイオクR-18】きゅるきゅる推しメイドさん_後編【限定描き下ろし】 (`.../sc7gy9`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 22 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=🇯🇵 【ハイオクR-18】きゅるきゅる推しメイドさん_後編【限定描き下ろし】, URL=`.../sc7gy9` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rokuhentai.com/.../sc7gy9.jpg` (image/avif (format: avif), 14075 bytes, 198x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sc7gy9` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://rokuhentai.com/.../sc7gy9.jpg` (image/webp (encoding: lossy), 47816 bytes, 396x640) |  |  |  |
| details author | PASS | minagi koh |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | kind: doujinshi, artist: "minagi koh", language: japanese |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rokuhentai.com/.../0.jpg` (image/webp (encoding: lossy), 304262 bytes, 1778x2880) |  |  |  |
