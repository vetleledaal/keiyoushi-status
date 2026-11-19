# Extension Validation Report

- Extension: tachiyomi-all.elitebabes-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: masonry
- Source ID: 6842598531101194683
- Source name: Elite Babes
- Source language: all
- Selected manga input: popular offset 0: Florens pauses in the doorway, glancing back with a flirtatious smile that invites you to fuck her. (`.../metart-florens-in-skirting-around-123438`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 19 | Florens pauses in the doorway, glancing back with a flirtatious smile that invites you to fuck her. (`.../metart-florens-in-skirting-around-123438`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Julia Morozzi, in red lace lingerie, leans against the piano, smiling as she shows off her fuckable body. (`.../metart-julia-morozzi-in-private-recital-123128`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 16 | Chloe Moss in Little Things 1 from Metart X (`.../metart-x-chloe-moss-in-little-things-1-124768`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 17 | Ivelisse in Poolside Backside from Photodromm (`.../photodromm-ivelisse-in-poolside-backside-124757`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Florens pauses in the doorway, glancing back with a flirtatious smile that invites you to fuck her. (`.../metart-florens-in-skirting-around-123438`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../metart-florens-in-skirting-around-123438`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 67/67 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 67/67 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.elitebabes.com/.../3018673_masonry_1200.jpg` (image/jpeg, 187177 bytes, 1200x1800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../metart-florens-in-skirting-around-123438` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Metart |  |  |  |
| details artist | PASS | Florens |  |  |  |
| details genres | PASS | Asshole, Babe, Blonde, Cute, Skirt, Socks, Teen, Blonde Pussy, Big Areolas, Spreading, Bent Over Pussy, Blonde Babe, Blonde Skirt, Blonde Small Tits, Cute Babe, Cute Pussy, Erect Nipples, Legs Up |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Florens pauses in the doorway, glancing back with a flirtatious smile that invites you to fuck her. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.elitebabes.com/.../0028-01_1200.jpg` (image/jpeg, 235929 bytes, 1200x1800) |  |  |  |
