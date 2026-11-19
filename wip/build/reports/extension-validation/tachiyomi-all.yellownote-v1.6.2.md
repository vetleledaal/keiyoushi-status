# Extension Validation Report

- Extension: tachiyomi-all.yellownote-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.e
- Source ID: 6844007153169388830
- Source name: 小黄书
- Source language: en
- Selected manga input: popular offset 0: 202X NANNING (`.../6afd5b12df633`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | 202X NANNING (`.../6afd5b12df633`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 23 | Yao Yao (`.../6afa2234e82c7`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 23 | Xiao Xiao (`.../6aed7196553e1`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 202X NANNING (`.../6afd5b12df633`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 202X NANNING (`.../6afd5b12df633`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Page 1 (`.../6afd5b12df633`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 23 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=202X NANNING, URL=`.../6afd5b12df633` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.xchina.io/.../00001_600x0.webp` (image/webp (encoding: lossy), 19410 bytes, 600x903) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../6afd5b12df633` |  |  |  |
| details thumbnail URL | PASS | `https://img.xchina.io/.../00001_600x0.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Other Photos, Chinese Nude, Public Exposure, Outdoor |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 72P |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://en.xchina.co/.../search <redacted query values: q and type>` to `https://en.xchina.co/.../search <redacted query values: q and type>` (1 redirects) |  |  |  |
| page load | PASS | `https://img.xchina.io/.../00001.jpg` (image/jpeg, 650214 bytes, 1800x2710) |  |  |  |
