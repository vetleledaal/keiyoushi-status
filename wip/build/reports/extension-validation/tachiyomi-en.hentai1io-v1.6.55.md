# Extension Validation Report

- Extension: tachiyomi-en.hentai1io-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 8561426018751869351
- Source name: Hentai1.io
- Source language: en
- Selected manga input: popular offset 0: Stop Smoking (`.../11141`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Stop Smoking (`.../11141`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Locked Up (`.../9049`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Slave Code (`.../11863`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | True or False? (Uncensored) (`.../11623`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Stop Smoking (`.../11141`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Stop Smoking (`.../11141`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 115 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 45 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Stop Smoking, URL=`11141` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentai1.io/.../stop-smoking-175x238.jpg` (image/jpeg, 10290 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `11141` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentai1.io/.../stop-smoking-193x278.jpg` (image/jpeg, 12618 bytes, 193x278) |  |  |  |
| details author | PASS | AA |  |  |  |
| details artist | PASS | Momobird |  |  |  |
| details genres | PASS | Drama, Romance, Comedy, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Even though I get teased for being short and bullied at work, my house is paradise!!<br><br>Alternative Names: 담배피지 마세요! / Someone Stop Her! / Deja de fumar |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 115 chapters |  |  |  |
| chapter dates | PASS | 115 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hentai1.io/.../feed <redacted query values: post_type, s, and paged>` to `https://hentai1.io` (1 redirects) |  |  |  |
| page load | PASS | `https://img.hentai1.io/.../001-6765d033486d.jpg` (image/jpeg, 40568 bytes, 720x500) |  |  |  |
