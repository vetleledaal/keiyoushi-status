# Extension Validation Report

- Extension: tachiyomi-all.mangacrazy-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6812667365653325714
- Source name: MangaCrazy
- Source language: all
- Selected manga input: popular offset 0: Summer Vacation (Uncensored) (`.../9894`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Summer Vacation (Uncensored) (`.../9894`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | What She Fell on Was the Tip of My Dick (Uncensored) (`.../9878`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Naughty or Nice? Charmed by the Seductive Pink Santa (Uncensored) (`.../10245`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Family Again (Uncensored) (`.../10223`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Summer Vacation (Uncensored) (`.../9894`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Summer Vacation (Uncensored) (`.../9894`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 116 | Chapter 1 - At the nude beach (`.../chapter-1-at-the-nude-beach`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Summer Vacation (Uncensored), URL=`9894` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangacrazy.net/.../summer-vacation-official-3-175x238.webp` (image/webp (encoding: lossy), 5966 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `9894` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangacrazy.net/.../summer-vacation-official-3-193x278.webp` (image/webp (encoding: lossy), 7304 bytes, 193x278) |  |  |  |
| details author | PASS | ByeongSu |  |  |  |
| details artist | PASS | ByeongSu |  |  |  |
| details genres | PASS | Borderline H, Drama, Explicit Sex, Full Color, Manhwa, Romance, Uncensored, Webtoons |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Summer Vacation<br><br>Tae-ung decided to go to his hometown to see his friend after 10 years for the summer vacation. His unforgettable summer break starts now!<br><br>Alternative Names: 여름방학 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 116 chapters |  |  |  |
| chapter dates | PASS | 116 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://rs2j9f862xh57.mangadistrict.com/.../01.jpg` (image/jpeg, 1151144 bytes, 1440x10000) |  |  |  |
