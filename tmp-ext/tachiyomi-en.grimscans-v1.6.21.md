# Extension Validation Report

- Extension: tachiyomi-en.grimscans-v1.6.21
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8588684547293952127
- Source name: Grim Scans
- Source language: en
- Selected manga input: popular offset 0: Turn-Based Wizard (`.../turn-based-wizard`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 7 | Turn-Based Wizard (`.../turn-based-wizard`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 52 | I Was Trying to Debut My Baby, but I Ended up Debuting Instead (`.../i-was-trying-to-debut-my-baby-but-i-ended-up-debuting-instead`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Turn-Based Wizard (`.../turn-based-wizard`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Turn-Based Wizard (`.../turn-based-wizard`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 28 | Chapter 1 (`.../639be7e95ad-639ca2db2e0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 79 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 7 entries |  |  |  |
| latest listing | PASS | 52 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Turn-Based Wizard, URL=`.../turn-based-wizard` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 1 manga entry: title=Turn-Based Wizard, URL=`.../turn-based-wizard` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wsrv.nl <redacted query values: url and w>` (image/png, 874157 bytes, 480x640) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../turn-based-wizard` |  |  |  |
| details thumbnail URL | PASS | `https://wsrv.nl <redacted query values: url and w>` |  |  |  |
| details author | PASS | Hong Min-seok |  |  |  |
| details artist | PASS | Cartoon life |  |  |  |
| details genres | PASS | Manhwa, Fantasy, School Life, Drama, Action, Survival |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | You criminal bastard… have you finally come to your senses?! I had just started the final difficulty of Abyss of the Labyrinth and suddenly, I became one of its characters: a Possessed by Another World. Worse still? I was a criminal turned slave. But every time I face a life-or-death crisis, a strange magic called the Turn-Based Hourglass activates— freezing time for 60 seconds. I don’t know whether it was the developers or some god who threw me into this mess… But one thing’s for sure As a turn-based mage, I’ll survive—no matter what it takes.<br><br>Alternative Titles:<br>- 턴제의 마법사 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 28 chapters |  |  |  |
| chapter dates | PASS | 28 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 79 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../rhAR2HJigdp` (image/jpeg, 151037 bytes, 800x2500; server Content-Type: text/plain) |  |  |  |
