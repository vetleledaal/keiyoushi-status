# Extension Validation Report

- Extension: tachiyomi-all.pornsticky-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5052420760211841842
- Source name: PornSticky
- Source language: all
- Selected manga input: popular offset 0: Oriental spinner Miranda licking cock with pierced tongue after massage (`.../oriental-spinner-miranda-licking-cock-with-pierced-tongue-after-massage-32408007`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 160 | Oriental spinner Miranda licking cock with pierced tongue after massage (`.../oriental-spinner-miranda-licking-cock-with-pierced-tongue-after-massage-32408007`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 160 | Teen slut Inga ravished by two BBC in interracial 3some sex (`.../teen-slut-inga-ravished-by-two-bbc-in-interracial-3some-sex-63860036`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Oriental spinner Miranda licking cock with pierced tongue after massage (`.../oriental-spinner-miranda-licking-cock-with-pierced-tongue-after-massage-32408007`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../oriental-spinner-miranda-licking-cock-with-pierced-tongue-after-massage-32408007`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| popular listing | PASS | 160 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 320/320 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 320/320 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdni.pornsticky.com/.../32408007_004_d591.jpg` (image/jpeg, 46114 bytes, 683x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../oriental-spinner-miranda-licking-cock-with-pierced-tongue-after-massage-32408007` |  |  |  |
| details thumbnail URL | PASS | `https://cdni.pornsticky.com/.../32408007_004_d591.jpg` |  |  |  |
| details author | PASS | Miranda Deen |  |  |  |
| details artist | PASS | HD Massage Porn |  |  |  |
| details genres | PASS | Asian, Ass, Ass Fucking, Blowjob, Cowgirl, Cum In Mouth, Cumshot, Foot, Hardcore, Massage, Oiled, Panties, Pigtails, Pussy, Tiny Tits, Tongue, Undressing |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 16 photos |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdni.pornsticky.com/.../32408007_001_9fa7.jpg` (image/jpeg, 53603 bytes, 1024x683) |  |  |  |
