# Extension Validation Report

- Extension: tachiyomi-all.playmatehunter-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 26
- Lint: 3
- Warnings: 0
- Skipped: 5
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1082062847119890629
- Source name: Playmate Hunter
- Source language: all
- Selected manga input: popular offset 0: Perky tittted lady lets us see her getting naked and posing nicely (`.../perky-tittted-lady-lets-us-see-her-getting-naked-and-posing-nicely-19754`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 19 | Perky tittted lady lets us see her getting naked and posing nicely (`.../perky-tittted-lady-lets-us-see-her-getting-naked-and-posing-nicely-19754`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Sophie S in Backstage Pass from Playboy (`.../sophie-s-in-backstage-pass`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Perky tittted lady lets us see her getting naked and posing nicely (`.../perky-tittted-lady-lets-us-see-her-getting-naked-and-posing-nicely-19754`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../perky-tittted-lady-lets-us-see-her-getting-naked-and-posing-nicely-19754`) |  | <1s |
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
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Invalid manga: popular entry 8: title=<blank>, URL=`.../dayna-jones-nude`, popular entry 10: title=<blank>, URL=`.../heather-bauer-nude`, popular entry 11: title=<blank>, URL=`.../alinna-d-penta-nude`, popular entry 14: title=<blank>, URL=`.../suzanne-obryan-nude` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | PASS | 39/39 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.pmatehunter.com/.../17679_masonry_1200.jpg` (image/jpeg, 382741 bytes, 1200x1800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../perky-tittted-lady-lets-us-see-her-getting-naked-and-posing-nicely-19754` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Kayla Garvin |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Perky tittted lady lets us see her getting naked and posing nicely |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.pmatehunter.com/.../perky-tittted-lady-lets-us-see-her-getting-naked-and-posing-nicely-01.jpg` (image/jpeg, 150700 bytes, 1067x1600) |  |  |  |
