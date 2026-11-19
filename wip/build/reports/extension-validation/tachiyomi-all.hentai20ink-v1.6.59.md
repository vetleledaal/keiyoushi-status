# Extension Validation Report

- Extension: tachiyomi-all.hentai20ink-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source theme: madara
- Source ID: 2040440472226999633
- Source name: Hentai20.ink (unoriginal)
- Source language: en
- Selected manga input: popular offset 0: Prank with my stepmom (Uncensored) (`.../798`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 19 | Prank with my stepmom (Uncensored) (`.../798`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 17 | I Became an Apartment Security Manager (`.../844`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 16 | I’m the Only Man on the Military Base (`.../882`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 15 | I Banged All My Classmates After Graduation (`.../535`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Prank with my stepmom (Uncensored) (`.../798`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Prank with my stepmom (Uncensored) (`.../798`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 14 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 6 |  |  | 1-10s |

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
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Prank with my stepmom (Uncensored), URL=`798` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 68/68 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 68/68 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.hentai20.ink/.../prank-with-my-stepmom-uncensored-full-175x238.jpg` (image/jpeg, 13521 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `798` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.hentai20.ink/.../prank-with-my-stepmom-uncensored-full-193x278.jpg` (image/jpeg, 16770 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Drama, Mature, Romance, Uncensored, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Blake set out to make his stepmom Vanessa hate him. Then he watched her step out in the bikini he’d swapped. And Blake realized the pranks were never going to be about hating her again. One prank changed everything. And he’s just getting started.<br><br>Read Prank with my stepmom (Uncensored) manhwa online free and join thousands of fans who follow this series for its exceptional art, gripping narrative, and regular chapter releases. Start from Chapter 1 or catch up with the latest chapters now.<br><br>Alternative Names: N/A |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | PASS | 14 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.hentai20.ink/.../1-657.jpg` (image/jpeg, 322715 bytes, 720x5259) |  |  |  |
