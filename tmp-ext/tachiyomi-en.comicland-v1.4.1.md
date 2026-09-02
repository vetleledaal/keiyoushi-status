# Extension Validation Report

- Extension: tachiyomi-en.comicland-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 2
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6347123306532384776
- Source name: ComicLand
- Source language: en
- Selected manga input: popular offset 0: Switch ON (Uncensored) (`.../switch-on-uncensored`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | Switch ON (Uncensored) (`.../switch-on-uncensored`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | I Banged All My Classmates After Graduation (`.../i-banged-all-my-classmates-after-graduation`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Change Days (`.../change-days`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Switch ON (Uncensored) (`.../switch-on-uncensored`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Switch ON (Uncensored) (`.../switch-on-uncensored`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 46 | Chapter 1 (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 26 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Switch ON (Uncensored), URL=`switch-on-uncensored` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 91/91 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 91/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.comicland.org/.../cover.jpg` (image/png, 422610 bytes, 540x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `switch-on-uncensored` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.comicland.org/.../cover.jpg` |  |  |  |
| details author | PASS | Skins |  |  |  |
| details artist | PASS | KMH |  |  |  |
| details genres | PASS | Psychological, Drama, Fetish, Uncensored, Borderline H, Explicit Sex, Full Color, Webtoons, Romance, Sexual Content, Gyaru, Sexual Abuse, Comedy, School Life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | After throwing up on Yenny, she’s been treating me like her slave. Until I found the switch to her secret toy! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 46 chapters |  |  |  |
| chapter dates | LINT | All 46 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=46 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.comicland.org/.../001.jpg` (image/jpeg, 738690 bytes, 3000x1500) |  |  |  |
