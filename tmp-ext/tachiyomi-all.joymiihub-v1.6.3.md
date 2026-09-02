# Extension Validation Report

- Extension: tachiyomi-all.joymiihub-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8421979328901634475
- Source name: Joymii Hub
- Source language: all
- Selected manga input: popular offset 0: Cute chick Gina G takes her partners manhood after oral sex (`.../cute-chick-gina-g-takes-her-partners-manhood-after-oral-sex-53247`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Cute chick Gina G takes her partners manhood after oral sex (`.../cute-chick-gina-g-takes-her-partners-manhood-after-oral-sex-53247`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | May Thai in Text Message from Joymii (`.../fetching-asian-babe-gets-her-pussy-eaten-before-she-vigorously-rides-her-loves-thick-85767`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Cute chick Gina G takes her partners manhood after oral sex (`.../cute-chick-gina-g-takes-her-partners-manhood-after-oral-sex-53247`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../cute-chick-gina-g-takes-her-partners-manhood-after-oral-sex-53247`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 40/40 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 40/40 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.joymiihub.com/.../3802_masonry_1200.jpg` (image/jpeg, 216595 bytes, 1200x1800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cute-chick-gina-g-takes-her-partners-manhood-after-oral-sex-53247` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Gina G |  |  |  |
| details artist | PASS | Gina G |  |  |  |
| details genres | PASS | Blowjob, Cumshot, Sex, Hardcore, Oral |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Cute chick Gina G takes her partners manhood after oral sex |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.joymiihub.com/.../0002-01_1200.jpg` (image/jpeg, 189165 bytes, 1200x1800) |  |  |  |
