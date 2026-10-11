# Extension Validation Report

- Extension: tachiyomi-ru.yaoichan-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 2
- Warnings: 1
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: multichan
- Source ID: 2466512768990363955
- Source name: YaoiChan
- Source language: ru
- Selected manga input: latest offset 0: The bro cure (`.../175059-the-bro-cure.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 0 |  |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | The bro cure (`.../175059-the-bro-cure.html`) |  | 10s+ |
| latest_next | `getLatestUpdates(2)` | success | 20 | Too Close for Comfort (`.../174991-too-close-for-comfort.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The bro cure (Братская помощь) (`.../175059-the-bro-cure.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The bro cure (`.../175059-the-bro-cure.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | The bro cure Сингл (`.../1213775-the-bro-cure_v1_ch1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The bro cure (Братская помощь), URL=`.../175059-the-bro-cure.html` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imgcover.manga-chan.me/.../1790714620_2437173-1.jpg` (image/jpeg, 35747 bytes, 416x582) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../175059-the-bro-cure.html` |  |  |  |
| details thumbnail URL | PASS | `https://imgcover.manga-chan.me/.../1790714620_2437173-1.jpg` |  |  |  |
| details author | PASS | ﻿Fudatsu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | комикс, 18 плюс, романтика, фурри, яой |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | LINT | Description is blank; use null when unknown |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://yaoi-chan.me/.../mostfavorites <redacted query values: offset>` to `https://v18.yaoi-chan.me/.../mostfavorites <redacted query values: offset>` (1 redirects); popular: `https://yaoi-chan.me/.../new <redacted query values: offset>` to `https://v18.yaoi-chan.me/.../new <redacted query values: offset>` (1 redirects); popular: `https://yaoi-chan.me <redacted query values: do, subaction, story, and search_start>` to `https://v18.yaoi-chan.me <redacted query values: do, subaction, story, and search_start>` (1 redirects); popular: `https://yaoi-chan.me/.../new <redacted query values: offset>` to `https://v18.yaoi-chan.me/.../new <redacted query values: offset>` (1 redirects); popular: `https://yaoi-chan.me/.../175059-the-bro-cure.html` to `https://v18.yaoi-chan.me/.../175059-the-bro-cure.html` (1 redirects); popular: `https://yaoi-chan.me/.../1213775-the-bro-cure_v1_ch1.html` to `https://v18.yaoi-chan.me/.../1213775-the-bro-cure_v1_ch1.html` (1 redirects); popular: `https://img2.yaoi-chan.me/.../2.jpg` to `https://megaimg2.yaoi-chan.me/.../2.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://img2.yaoi-chan.me/.../2.jpg` (image/jpeg, 2682538 bytes, 2906x4125) |  |  |  |
