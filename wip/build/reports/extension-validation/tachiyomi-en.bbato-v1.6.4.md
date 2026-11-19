# Extension Validation Report

- Extension: tachiyomi-en.bbato-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 23
- Lint: 1
- Warnings: 1
- Skipped: 9
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1678128543826757763
- Source name: Bbato
- Source language: en
- Selected manga input: popular offset 0: Just Something I've Heard (`.../just-something-i-ve-heard`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Just Something I've Heard (`.../just-something-i-ve-heard`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Mother, it has to be you!! (`.../mother-and-no-other`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Just Something I've Heard (`.../just-something-i-ve-heard`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Kaasan no Ana Tsukawasete (`.../kaasan-no-ana-tsukawasete`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Just Something I've Heard (`.../just-something-i-ve-heard`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Mother, it has to be you!!, URL=`.../mother-and-no-other` at page 1 offset 19 and page 2 offset 0 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://cdn5.sags2mobile.com/.../just-something-i-ve-heard.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../just-something-i-ve-heard` |  |  |  |
| details thumbnail URL | PASS | `https://cdn5.sags2mobile.com/.../just-something-i-ve-heard.webp` |  |  |  |
| details author | PASS | Seo-Raeng, Onuju |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Romance, Boys Love |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Jaehyun has had a huge secret crush on his friend Woojin for the past seven years. But seeing Woojin fall in love with someone else is breaking his heart. Jaehyun tells this all to Seungtae, his online friend who knows all about his secret crush. While on a call with Seungtae, Jaehyun meets a handsome cashier with an oddly familiar voice. Will Jaehyun forever be doomed to talk about his love life like it’s something he’s heard from someone else? Or will he finally find a happier story of his own to tell? (Source: Lezhin US) *Note: The chapter count... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
