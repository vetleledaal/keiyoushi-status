# Extension Validation Report

- Extension: tachiyomi-en.eggporncomics-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7229505035165953281
- Source name: Eggporncomics
- Source language: en
- Selected manga input: popular offset 0: ONE-HURRICANE (`.../one-hurricane`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | ONE-HURRICANE (`.../one-hurricane`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Fateless 10 Part 1 (`.../fateless-10-part-1`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Mass Effect 2 Romances (`.../mass-effect-2-romances`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Convenient Fuck | Konbiniento Fakku (`.../convenient-fuck-konbiniento-fakku`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | ONE-HURRICANE (`.../one-hurricane`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | ONE-HURRICANE (`.../one-hurricane`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../one-hurricane`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 40 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ONE-HURRICANE, URL=`.../one-hurricane` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://eggporncomics.com/.../thumb300_1.jpg` (image/jpeg, 38463 bytes, 300x424) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-hurricane` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://eggporncomics.com/.../1.jpg` (image/jpeg, 2100546 bytes, 1411x2000) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Category: Anime Comics<br>Tags: breast feeding, muscle, sleeping, virginity, ahegao, big breasts, blowjob, cunnilingus, defloration, nakadashi, thigh high boots |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://eggporncomics.com/.../1.jpg` (image/jpeg, 2100546 bytes, 1411x2000) |  |  |  |
