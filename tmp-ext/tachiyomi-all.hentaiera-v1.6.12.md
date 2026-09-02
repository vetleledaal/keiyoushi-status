# Extension Validation Report

- Extension: tachiyomi-all.hentaiera-v1.6.12
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 4
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 647637185891033517
- Source name: HentaiEra
- Source language: en
- Selected manga input: popular offset 0: Artist - EchoSaber (`.../1622035`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Artist - EchoSaber (`.../1622035`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | [Milk Force] Otonari NTR [English] [obsoletezero] (`.../563957`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Katt x Super MILF (Spinnerette) (`.../1723786`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | [Artist] - Vial - DryVial (`.../1723680`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Artist - EchoSaber (`.../1622035`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../1622035`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1381 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://m10.hentaiera.com/.../thumb.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../1622035` |  |  |  |
| details thumbnail URL | FAIL | Differs from selected listing thumbnail; Thumbnail URL `https://m10.hentaiera.com/.../cover.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | echo saber, renetan |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | big ass, big breasts, bikini, dark skin, milf, muscle, nakadashi, swimsuit, western imageset |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Parodies**: boku no hero academia, fairy tail, frieren beyond journeys end, my hero academia, naruto, sousou no frieren, spy x family, super mario brothers<br><br>**Characters**: blonde blazer, bulma briefs, emma frost, fern, frieren, lucy heartfilia, mai shiranui, princess peach, rumi usagiyama, squirrel girl, stark, tsunade, yor forger<br><br>**Languages**: english<br><br>**Category**: western<br><br>**Pages**: 1381 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 1381 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://m10.hentaiera.com/.../1.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
