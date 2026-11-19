# Extension Validation Report

- Extension: tachiyomi-all.sankakucomplex-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3055331830444123651
- Source name: Sankaku Complex
- Source language: all
- Selected manga input: popular offset 0: Peaches [JMoz Comix] (`.../zvkr3EKMZ4J`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | Peaches [JMoz Comix] (`.../zvkr3EKMZ4J`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 48 | Chiisai ko ii yo ne (`.../oG8r63mRqJX`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 41 | A Husband's Mistake - Housewife's Debt (`.../DP7RLBya6dV`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Pigtails (`.../DP7RLNya6dV`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Peaches [JMoz Comix] (`.../zvkr3EKMZ4J`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Peaches [JMoz Comix] (`.../zvkr3EKMZ4J`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | [JMoz Comix] Peaches - Chapter 1 (`.../60rvLNxYM3A`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in via WebView to read this book | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Log in via WebView to read this book | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 41 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Peaches \[JMoz Comix\], URL=`.../zvkr3EKMZ4J` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 178/178 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 18/178 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://v.sankakucomplex.com/.../sample-1b1e604600fe5b64fe163691c535879d.webp <redacted query values: e, expires, m, and token>` (image/webp (encoding: lossy), 170142 bytes, 1080x1350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../zvkr3EKMZ4J` |  |  |  |
| details thumbnail URL | PASS | `https://v.sankakucomplex.com/.../sample-1b1e604600fe5b64fe163691c535879d.webp <redacted query values: e, expires, m, and token>` |  |  |  |
| details author | PASS | JMoz |  |  |  |
| details artist | PASS | JMoz |  |  |  |
| details genres | PASS | Speech bubble, Comic, Monochrome, Full color, Uncensored, Age difference, Milf, Hetero, Oyakodon, Mature, Cheating, Yuri, Original |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 3 books · English language |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView to read this book |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
