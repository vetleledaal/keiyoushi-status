# Extension Validation Report

- Extension: tachiyomi-all.ftvhunter-v1.6.3
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
- Source ID: 2424130356866336342
- Source name: FTV Hunter
- Source language: all
- Selected manga input: popular offset 0: Cute charmer Myra playfully posing on the bed as she exposes her feet and love holes (`.../cute-charmer-myra-playfully-posing-on-the-bed-as-she-exposes-her-feet-and-love-holes77968`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Cute charmer Myra playfully posing on the bed as she exposes her feet and love holes (`.../cute-charmer-myra-playfully-posing-on-the-bed-as-she-exposes-her-feet-and-love-holes77968`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Dafne in State Of Undress from Ftv Girls (`.../dafne-in-state-of-undress`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Cute charmer Myra playfully posing on the bed as she exposes her feet and love holes (`.../cute-charmer-myra-playfully-posing-on-the-bed-as-she-exposes-her-feet-and-love-holes77968`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../cute-charmer-myra-playfully-posing-on-the-bed-as-she-exposes-her-feet-and-love-holes77968`) |  | <1s |
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
| thumbnail | PASS | `https://cdn.ftvhunter.com/.../11085_masonry_1200.jpg` (image/jpeg, 512693 bytes, 1200x1803) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cute-charmer-myra-playfully-posing-on-the-bed-as-she-exposes-her-feet-and-love-holes77968` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Myra |  |  |  |
| details artist | PASS | Myra |  |  |  |
| details genres | PASS | Brunette, Feet, Ass |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Cute charmer Myra playfully posing on the bed as she exposes her feet and love holes |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.ftvhunter.com/.../1` to `https://www.ftvhunter.com/.../newest` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.ftvhunter.com/.../0003-01_1800.jpg` (image/jpeg, 373825 bytes, 1800x1198) |  |  |  |
