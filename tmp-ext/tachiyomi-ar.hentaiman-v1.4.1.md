# Extension Validation Report

- Extension: tachiyomi-ar.hentaiman-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4335920001580787887
- Source name: HentaiMan
- Source language: ar
- Selected manga input: popular offset 0: ميروكي (`.../%D9%85%D9%8A%D8%B1%D9%88%D9%83%D9%8A`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | ميروكي (`.../%D9%85%D9%8A%D8%B1%D9%88%D9%83%D9%8A`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | جلسة تصوير شيرونا سان الجريئة (`.../%D8%AC%D9%84%D8%B3%D8%A9-%D8%AA%D8%B5%D9%88%D9%8A%D8%B1-%D8%B4%D9%8A%D8%B1%D9%88%D9%86%D8%A7-%D8%B3%D8%A7%D9%86-%D8%A7%D9%84%D8%AC%D8%B1%D9%8A%D8%A6%D8%A9`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 0 |  |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 24 | ميروكي (`.../%D9%85%D9%8A%D8%B1%D9%88%D9%83%D9%8A`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ميروكي (`.../%D9%85%D9%8A%D8%B1%D9%88%D9%83%D9%8A`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | الفصل 1 -  (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 21 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ميروكي, URL=`.../%D9%85%D9%8A%D8%B1%D9%88%D9%83%D9%8A` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 has no manga to check |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaiman.net/.../6a4ec26d40582.webp` (image/webp (encoding: lossy), 33964 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%D9%85%D9%8A%D8%B1%D9%88%D9%83%D9%8A` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaiman.net/.../6a4ec26d40582.webp` (image/webp (encoding: lossy), 73378 bytes, 500x750) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | رومانسي, دراما |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Milky DD Milky DD |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hentaiman.net/.../21a44cf0900bda8f.webp` (image/webp (encoding: lossy), 306560 bytes, 1280x1543) |  |  |  |
