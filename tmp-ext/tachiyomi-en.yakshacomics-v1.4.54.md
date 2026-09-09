# Extension Validation Report

- Extension: tachiyomi-en.yakshacomics-v1.4.54
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 4871612284225100668
- Source name: YakshaComics
- Source language: en
- Selected manga input: popular offset 0: Infinite Evolution Starting From Zero (`.../infinite-evolution-starting-from-zero`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Infinite Evolution Starting From Zero (`.../infinite-evolution-starting-from-zero`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Cultivation Begins With The Birth Of The Demon Empress (`.../cultivation-begins-with-the-birth-of-the-demon-empress`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Infinite Evolution Starting From Zero (`.../infinite-evolution-starting-from-zero`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Little World, Endless Fun (`.../little-world-endless-fun`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Infinite Evolution Starting From Zero (`.../infinite-evolution-starting-from-zero`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Infinite Evolution Starting From Zero (`.../infinite-evolution-starting-from-zero`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 124 | Chapter 1 (`https://yakshacomics.com/.../chapter-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Infinite Evolution Starting From Zero, URL=`.../infinite-evolution-starting-from-zero` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yakshacomics.com/.../4kOQKx-350x476.png` (image/webp (container: extended), 48026 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../infinite-evolution-starting-from-zero` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://yakshacomics.com/.../4kOQKx-193x278.png` (image/png, 51093 bytes, 193x278) |  |  |  |
| details author | PASS | 桃乐茜ci |  |  |  |
| details artist | PASS | 桃乐茜ci |  |  |  |
| details genres | PASS | Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Exhausting all waste and decline, breaking the limits. Innate talent of a celestial being, a top scholar at the peak. Multiple forms, transcending evolution. Reborn, starting from zero, infinite evolution.<br><br>Alternative Names: 从零开始无限进化 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 124 chapters |  |  |  |
| chapter dates | PASS | 124 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 124 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://yakshacomics.com/.../0.png` (image/png, 629033 bytes, 1082x1020) |  |  |  |
