# Extension Validation Report

- Extension: tachiyomi-all.metarthunter-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: masonry
- Source ID: 3567512546321944475
- Source name: Metart Hunter
- Source language: all
- Selected manga input: popular offset 0: Beautiful babe stripping and posing in the middle of the kitchen (`.../beautiful-babe-stripping-and-posing-in-the-middle-of-the-kitchen-3839`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Beautiful babe stripping and posing in the middle of the kitchen (`.../beautiful-babe-stripping-and-posing-in-the-middle-of-the-kitchen-3839`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Naughty babe heats up in her bikini as she goes naked and flaunts her peach ass as she poses outdoors (`.../naughty-babe-heats-up-in-her-bikini-as-she-goes-naked-and-flaunts-her-peach-ass-84461`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Sammy Rose in Corset Crush from Metart (`.../sammy-rose-in-corset-crush`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Annys in Presenting Annys from Metart (`.../annys-in-presenting-annys`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Beautiful babe stripping and posing in the middle of the kitchen (`.../beautiful-babe-stripping-and-posing-in-the-middle-of-the-kitchen-3839`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../beautiful-babe-stripping-and-posing-in-the-middle-of-the-kitchen-3839`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.metarthunter.com/.../21244_masonry_1200.jpg` (image/jpeg, 353191 bytes, 1200x1766) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../beautiful-babe-stripping-and-posing-in-the-middle-of-the-kitchen-3839` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Mirabella |  |  |  |
| details artist | PASS | Mirabella |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Beautiful babe stripping and posing in the middle of the kitchen |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.metarthunter.com/.../beautiful-babe-stripping-and-posing-in-the-middle-of-the-kitchen-01.jpg` (image/jpeg, 123696 bytes, 800x1200) |  |  |  |
