# Extension Validation Report

- Extension: tachiyomi-zh.yiqiqimanhua-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4420888243278089080
- Source name: 177漫畫
- Source language: zh
- Selected manga input: latest offset 0: [アキカン] 妊活支援法！特別種付師 【園田ひかり編】 (`.../8829467`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | [laliberte] Dual Love Part 1-2[79P] (`.../8395130`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | [アキカン] 妊活支援法！特別種付師 【園田ひかり編】 (`.../8829467`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 28 | [upStick (あーりおおーりお)] 年下のちっちゃい先輩×スワッピングNTR (`.../8826665`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [アキカン] 妊活支援法！特別種付師 【園田ひかり編】 (`.../8829467`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [アキカン] 妊活支援法！特別種付師 【園田ひかり編】 (`.../8829467`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Ch. 1 (`.../8829467`) |  | <1s |
| pages | `getPageList(chapter)` | success | 128 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[アキカン\] 妊活支援法！特別種付師 【園田ひかり編】, URL=`8829467` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.177pica.com/.../004956-1.jpg` (image/jpeg, 390722 bytes, 1000x1414) |  |  |  |
| details identity | PASS | Details preserved selected URL `8829467` |  |  |  |
| details thumbnail URL | PASS | `https://img.177pica.com/.../004956-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 全彩CG(日文全彩) |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 128 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.177pica.com/.../004956-1.jpg` (image/jpeg, 390722 bytes, 1000x1414) |  |  |  |
