# Extension Validation Report

- Extension: tachiyomi-en.sunshinebutterflyscans-v1.4.39
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 0
- Warnings: 0
- Skipped: 8
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9191177608229286435
- Source name: Sunshine Butterfly Scans
- Source language: en
- Selected manga input: popular offset 0: 99.99% Lovers (`.../projects <redacted query values: n>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 34 | 99.99% Lovers (`.../projects <redacted query values: n>`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 34 | Open at Night (`.../projects <redacted query values: n>`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 99.99% Lovers (`.../projects <redacted query values: n>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 99.99% Lovers (`.../projects <redacted query values: n>`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 38 | Chapter 1 (`.../read <redacted query values: series and num>`) |  | <1s |
| pages | `fetchPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 429 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 429 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 34 entries |  |  |  |
| latest listing | PASS | 34 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=99.99% Lovers, URL=`.../projects <redacted query values: n>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 69/69 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 69/69 manga have thumbnail URLs |  |  |  |
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
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 429 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
