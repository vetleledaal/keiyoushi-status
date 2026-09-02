# Extension Validation Report

- Extension: tachiyomi-en.mistscans-v1.6.22
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 80073424419623517
- Source name: Mist Scans
- Source language: en
- Selected manga input: popular offset 0: Solo EX Rank Summoner (`.../solo-ex-rank-summoner`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Solo EX Rank Summoner (`.../solo-ex-rank-summoner`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 164 | Skill Taker Of Other World Domination (Uncensored) (`.../skill-taker-of-other-world-domination-uncensored`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Solo EX Rank Summoner (`.../solo-ex-rank-summoner`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Solo EX Rank Summoner (`.../solo-ex-rank-summoner`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 37 | Chapter 1 (`.../64f6dd0cdf8-64f809142b0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 164 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Solo EX Rank Summoner, URL=`.../solo-ex-rank-summoner` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 175/175 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 175/175 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wsrv.nl <redacted query values: url and w>` (image/png, 322566 bytes, 480x240) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../solo-ex-rank-summoner` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://wsrv.nl <redacted query values: url and w>` (image/png, 746457 bytes, 480x640) |  |  |  |
| details author | PASS | Lim Je-yeol |  |  |  |
| details artist | PASS | Studio Inners |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Fantasy, Mystery |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Alternative Titles:<br>- 나 혼자 EX급 소환수 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 37 chapters |  |  |  |
| chapter dates | PASS | 37 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../64f809142b0.avif` (image/avif (format: avif), 451620 bytes, 800x15000) |  |  |  |
