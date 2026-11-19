# Extension Validation Report

- Extension: tachiyomi-en.hentaiyoga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4629014421013059878
- Source name: Hentai.yoga
- Source language: en
- Selected manga input: popular offset 0: Delivery (`.../delivery`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Delivery (`.../delivery`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Work-at-Home Clerk, Cums on All Fours! (`.../work-at-home-clerk-cums-on-all-fours`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Delivery (`.../delivery`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Delivery (`.../delivery`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 20 | Delivery Chapter 1 (`.../delivery-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Delivery, URL=`.../delivery` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Work-at-Home Clerk, Cums on All Fours!, URL=`.../work-at-home-clerk-cums-on-all-fours` at page 1 offset 29 and page 2 offset 0 |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.hentai.yoga/.../thumbnail.jpg` (image/jpeg, 91094 bytes, 717x1029) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../delivery` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.hentai.yoga/.../thumbnail.jpg` |  |  |  |
| details author | PASS | Danmuji |  |  |  |
| details artist | PASS | Heheuk |  |  |  |
| details genres | PASS | Drama, Mature, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Delivery is a Korean hentai manhwa, an adult webtoon read in one vertical scroll. Read all 20 chapters online free on Hentai.yoga.<br><br>**Origin:** South Korea · **Color:** Full color · **Censorship:** Censored |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | PASS | 20 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hentai.yoga/.../manga <redacted query values: s>` to `https://hentai.yoga/.../manga <redacted query values: s>` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.hentai.yoga/.../chapter-1-1.jpg <redacted query values: width and format>` (image/webp (container: extended), 122822 bytes, 719x4608) |  |  |  |
