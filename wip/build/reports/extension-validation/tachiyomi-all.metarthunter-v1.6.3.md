# Extension Validation Report

- Extension: tachiyomi-all.metarthunter-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: masonry
- Source ID: 3567512546321944475
- Source name: Metart Hunter
- Source language: all
- Selected manga input: popular offset 0: Fetching babe captivates with her curvy figure as she shows off her yummy tits and pinkish muffin (`.../fetching-babe-captivates-with-her-curvy-figure-as-she-shows-off-her-yummy-tits-and-75962`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Fetching babe captivates with her curvy figure as she shows off her yummy tits and pinkish muffin (`.../fetching-babe-captivates-with-her-curvy-figure-as-she-shows-off-her-yummy-tits-and-75962`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Polly Yangs in Rose Serenity 1 from Metart (`.../polly-yangs-in-rose-serenity-1`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Fetching babe captivates with her curvy figure as she shows off her yummy tits and pinkish muffin (`.../fetching-babe-captivates-with-her-curvy-figure-as-she-shows-off-her-yummy-tits-and-75962`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../fetching-babe-captivates-with-her-curvy-figure-as-she-shows-off-her-yummy-tits-and-75962`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

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
| thumbnail | PASS | `https://cdn.metarthunter.com/.../36073_masonry_1200.jpg` (image/jpeg, 415330 bytes, 1200x1769) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../fetching-babe-captivates-with-her-curvy-figure-as-she-shows-off-her-yummy-tits-and-75962` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Alice Kelly |  |  |  |
| details artist | PASS | Alice Kelly |  |  |  |
| details genres | PASS | Feet, Hairy Pussy, Big Areolas, Big Boobs, Erect Nipples |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Fetching babe captivates with her curvy figure as she shows off her yummy tits and pinkish muffin |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.metarthunter.com/.../1` to `https://www.metarthunter.com/.../newest` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.metarthunter.com/.../0013-01_1200.jpg` (image/jpeg, 288953 bytes, 1200x1800) |  |  |  |
