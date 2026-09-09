# Extension Validation Report

- Extension: tachiyomi-en.sunshinebutterflyscans-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9191177608229286435
- Source name: Sunshine Butterfly Scans
- Source language: en
- Selected manga input: popular offset 0: 99.99% Lovers (`.../projects <redacted query values: n>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 34 | 99.99% Lovers (`.../projects <redacted query values: n>`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | error | 0 |  | java.lang.NullPointerException | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 99.99% Lovers (`.../projects <redacted query values: n>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 99.99% Lovers (`.../projects <redacted query values: n>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 38 | Chapter 1 (`.../read <redacted query values: series and num>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 34 entries |  |  |  |
| latest listing | SKIP | latest operation did not complete successfully |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=99.99% Lovers, URL=`.../projects <redacted query values: n>` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | latest operation did not complete successfully |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 35/35 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 35/35 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wings.sbs/.../99.jpeg` (image/jpeg, 77462 bytes, 700x394) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../projects <redacted query values: n>` |  |  |  |
| details thumbnail URL | PASS | `https://wings.sbs/.../99.jpeg` |  |  |  |
| details author | PASS | Lash |  |  |  |
| details artist | PASS | Nanna |  |  |  |
| details genres | PASS | manhwa, romance, smut, novel, omegaverse, mysophobic top, abusive top, regretful top, mpreg, partial decensor, licensed |  |  |  |
| details status | PASS | CANCELLED (5) |  |  |  |
| details description | PASS | "I'll give you 1 billion won now, and 2 billion won after you give birth."<br><br>Did I hit the jackpot?! Wouldn’t it be good to receive 3 billion won and then run away?<br>Three times. We only have to sleep together three times.<br><br>…That idea completely changed my life.<br><br>Alternative name: 99.99%의 연인, 99.99퍼센트의 연인, Match Rate 99.99% |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 38 chapters |  |  |  |
| chapter dates | PASS | 38 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.imgur.com/.../x01I5er.png` (image/png, 535954 bytes, 720x629) |  |  |  |
