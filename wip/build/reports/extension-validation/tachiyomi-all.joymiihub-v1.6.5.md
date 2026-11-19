# Extension Validation Report

- Extension: tachiyomi-all.joymiihub-v1.6.5
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
- Source ID: 8421979328901634475
- Source name: Joymii Hub
- Source language: all
- Selected manga input: popular offset 0: Blue eyed hottie takes hard stiff pole deep into her ass and pussy (`.../blue-eyed-hottie-takes-hard-stiff-pole-deep-into-her-ass-and-pussy-2048`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | Blue eyed hottie takes hard stiff pole deep into her ass and pussy (`.../blue-eyed-hottie-takes-hard-stiff-pole-deep-into-her-ass-and-pussy-2048`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Pleasing Myself (`.../victoria-r-pleasing-myself`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | May Thai in Text Message from Joymii (`.../fetching-asian-babe-gets-her-pussy-eaten-before-she-vigorously-rides-her-loves-thick-85767`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Eveline Dellai in Cleaning In The Morning from Joymii (`.../eveline-dellai-having-a-blast-in-a-sexual-adventure-with-her-man-until-receiving-81192`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Blue eyed hottie takes hard stiff pole deep into her ass and pussy (`.../blue-eyed-hottie-takes-hard-stiff-pole-deep-into-her-ass-and-pussy-2048`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../blue-eyed-hottie-takes-hard-stiff-pole-deep-into-her-ass-and-pussy-2048`) |  | <1s |
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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.joymiihub.com/.../3026_masonry_800.jpg` (image/jpeg, 139404 bytes, 800x1134) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../blue-eyed-hottie-takes-hard-stiff-pole-deep-into-her-ass-and-pussy-2048` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Ally Breelsen |  |  |  |
| details artist | PASS | Ally Breelsen |  |  |  |
| details genres | PASS | Hardcore, Oral |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Blue eyed hottie takes hard stiff pole deep into her ass and pussy |  |  |  |
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
| page load | PASS | `https://cdn.joymiihub.com/.../blue-eyed-hottie-takes-hard-stiff-pole-deep-into-her-ass-and-pussy-01.jpg` (image/jpeg, 142431 bytes, 1200x800) |  |  |  |
