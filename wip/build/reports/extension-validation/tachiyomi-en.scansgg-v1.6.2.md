# Extension Validation Report

- Extension: tachiyomi-en.scansgg-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 26
- Lint: 0
- Warnings: 1
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5988638662832109557
- Source name: ScansGG
- Source language: en
- Selected manga input: popular offset 0: Kimi janakya Dame na Dorei Shoujo (`.../17937`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 21 | Kimi janakya Dame na Dorei Shoujo (`.../17937`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 21 | My Wife Waited in the Wheat Fields (`.../17877`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 14 | Revenge Begins With Marriage (`.../17707`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 14 | The Extra’s Academy Survival Guide (`.../1895`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kimi janakya Dame na Dorei Shoujo (`.../17937`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kimi janakya Dame na Dorei Shoujo (`.../17937`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kimi janakya Dame na Dorei Shoujo, URL=`17937` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=The Extra’s Academy Survival Guide, URL=`1895` at page 1 offset 12 and page 2 offset 0, title=Study Group, URL=`2115` at page 1 offset 13 and page 2 offset 1 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 71/71 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 71/71 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.scans.gg/.../31fdee-14adb6-f56288-433bcd.avif` (image/avif (format: avif), 27769 bytes, 401x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `17937` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.scans.gg/.../31fdee-14adb6-f56288-433bcd.avif` |  |  |  |
| details author | PASS | Aome Makito |  |  |  |
| details artist | PASS | Aome Makito |  |  |  |
| details genres | PASS | Romance, Comedy, School Life, Fantasy |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Daito's your average high-school kid. After getting home one day, he finds a strange girl sleeping on the floor—only to find out she's a slave from another world. He decides to take her in so she can start life anew as a normal girl, beginning their sweet-but-unusual life together as they navigate cultural barriers. |  |  |  |
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
