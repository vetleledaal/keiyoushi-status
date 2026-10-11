# Extension Validation Report

- Extension: tachiyomi-en.yakshacomics-v1.6.57
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 4871612284225100668
- Source name: YakshaComics
- Source language: en
- Selected manga input: popular offset 0: Infinite Evolution Starting From Zero (`.../296`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Infinite Evolution Starting From Zero (`.../296`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Star Spirit Lord (`.../277`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | After Improperly Licking a Dog, I Became a Billionaire (`.../273`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Refusing A Top University’s Special Admission: I’ve Revealed My True Identity As An Immortal Venerable (`.../429`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Infinite Evolution Starting From Zero (`.../296`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Infinite Evolution Starting From Zero (`.../296`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 133 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Infinite Evolution Starting From Zero, URL=`296` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yakshacomics.com/.../4kOQKx-350x476.png` (image/png, 145839 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `296` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://yakshacomics.com/.../4kOQKx-193x278.png` (image/png, 51093 bytes, 193x278) |  |  |  |
| details author | PASS | 桃乐茜ci |  |  |  |
| details artist | PASS | 桃乐茜ci |  |  |  |
| details genres | PASS | Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Exhausting all waste and decline, breaking the limits. Innate talent of a celestial being, a top scholar at the peak. Multiple forms, transcending evolution. Reborn, starting from zero, infinite evolution.<br><br>Alternative Names: 从零开始无限进化 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 133 chapters |  |  |  |
| chapter dates | PASS | 133 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://yakshacomics.com/.../0.png` (image/png, 629033 bytes, 1082x1020) |  |  |  |
