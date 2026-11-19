# Extension Validation Report

- Extension: tachiyomi-all.xarthunter-v1.6.5
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
- Source ID: 7425515716363969566
- Source name: XArt Hunter
- Source language: all
- Selected manga input: popular offset 0: Short haired blonde Zazie starts riding lover dick like she is addicted (`.../short-haired-blonde-zazie-starts-riding-lover-dick-like-she-is-addicted-12203`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Short haired blonde Zazie starts riding lover dick like she is addicted (`.../short-haired-blonde-zazie-starts-riding-lover-dick-like-she-is-addicted-12203`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 19 | 2 Cool for School (`.../sake-2-cool-for-school`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Lily Blossom in Friends & Lovers from X Art (`.../lily-blossom-in-friends-lovers`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Vixi in Breakfast for Two from X Art (`.../vixi-in-breakfast-for-two`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Short haired blonde Zazie starts riding lover dick like she is addicted (`.../short-haired-blonde-zazie-starts-riding-lover-dick-like-she-is-addicted-12203`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../short-haired-blonde-zazie-starts-riding-lover-dick-like-she-is-addicted-12203`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 77/77 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 77/77 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.xarthunter.com/.../5018_masonry_800.jpg` (image/jpeg, 194802 bytes, 800x1182) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../short-haired-blonde-zazie-starts-riding-lover-dick-like-she-is-addicted-12203` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Zazie |  |  |  |
| details artist | PASS | Zazie |  |  |  |
| details genres | PASS | Babe |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Short haired blonde Zazie starts riding lover dick like she is addicted |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.xarthunter.com/.../short-haired-blonde-zazie-starts-riding-lover-dick-like-she-is-addicted-01.jpg` (image/jpeg, 140265 bytes, 800x1200) |  |  |  |
