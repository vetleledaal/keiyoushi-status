# Extension Validation Report

- Extension: tachiyomi-en.multporn-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1483013328567191791
- Source name: Multporn
- Source language: en
- Selected manga input: popular offset 0: Sultry Summer Book 1 (`.../sultry_summer_book_1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | Sultry Summer Book 1 (`.../sultry_summer_book_1`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 15 | Double Trouble - Incognitymous (`.../double_trouble_incognitymous <redacted query values: r>`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 15 | Upgrades - Tiddybaa (`.../upgrades_tiddybaa`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | Braixen's Well Earned Reward (`.../braixens_well_earned_reward`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Sultry Summer Book 1 (`.../sultry_summer_book_1`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Sultry Summer Book 1 (`.../sultry_summer_book_1`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../sultry_summer_book_1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 171 |  |  | <1s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sultry Summer Book 1, URL=`.../sultry_summer_book_1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://multporn.net/.../sultry_summer_book_1_sultrysummer_cover.png <redacted query values: itok>` (image/jpeg, 104277 bytes, 391x558; server Content-Type: image/png) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sultry_summer_book_1` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Incognitymous |  |  |  |
| details artist | PASS | Incognitymous |  |  |  |
| details genres | PASS | Straight, Very Close Relatives, Oral, Blowjob, Cunnilingus, Deepthroat, Fingering, Masturbation, Creampie, Cum Shots, Cum Swallow, Mini Girl, Mini Male, Virgin, Best, X-Ray, One of the greats, Sweet Home Alabama, Cumflation, Color, Redhead, Story, Sussy baka, Young, Young and tight, Brother and sister, Public, Anal Creampie, Cousins, Cum in mouth, Flat chest, Position 69, Hall of fame, Mom, Lot’s of tags, Body Swap, Teen, Bathroom sex, Red head, One of the weirdest, One of the worst, Bad story but good porn, Ben 10, Ben Tennyson, Gwen Tennyson |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Section:<br>Ben 10<br><br>Characters:<br>Ben Tennyson, Gwen Tennyson<br><br>Pages:<br>171 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 171 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://multporn.net/.../001_sultry_summer.png` (image/png, 509687 bytes, 724x1024) |  |  |  |
