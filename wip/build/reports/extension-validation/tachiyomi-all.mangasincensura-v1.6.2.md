# Extension Validation Report

- Extension: tachiyomi-all.mangasincensura-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 9019747441194723320
- Source name: Uncensored Manga
- Source language: en
- Selected manga input: popular offset 0: CHANGE WIFE (`.../manhwa_index <redacted query values: id>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 29 | CHANGE WIFE (`.../manhwa_index <redacted query values: id>`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | CHANGE WIFE (`.../manhwa_index <redacted query values: id>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | CHANGE WIFE (`.../manhwa_index <redacted query values: id>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | Chapter 1 (`.../chapter <redacted query values: manhwa and cap>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 48 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 29 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=CHANGE WIFE, URL=`.../manhwa_index <redacted query values: id>` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 30/30 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 30/30 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://uncensoredmanga.com/.../change_wife_cover.webp` (image/webp (container: extended), 50650 bytes, 735x817) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manhwa_index <redacted query values: id>` |  |  |  |
| details thumbnail URL | PASS | `https://uncensoredmanga.com/.../change_wife_cover.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | FORBIDDEN SEX, SEINEN, ADULT, SEX |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★✬ 8.7<br><br>Some stories leave you with your dick in your hand. This one gets you hard knowing that the hotter wife in the marriage is going to let another guy fuck her.<br><br>Yan Hong and Shi Yin have been married for ten years. He was always in a hurry in bed... until one day he decides to join a swingers club. The problem (or the fucking delight) is that she is way prettier, sexier, and more desirable than he is. While he is fooling around with the other woman, Shi Yin is going to spread her legs for a guy who really knows how to take his time. Ten years of marriage, and now finally someone is going to give her what her husband never did: a slow, deep fuck. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | LINT | All 10 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=10 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.uncensoredmanga.com/.../0001.webp` (image/webp (encoding: lossy), 67134 bytes, 800x1517) |  |  |  |
