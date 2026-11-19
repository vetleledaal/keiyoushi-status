# Extension Validation Report

- Extension: tachiyomi-en.eggporncomics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7229505035165953281
- Source name: Eggporncomics
- Source language: en
- Selected manga input: popular offset 0: ONE-HURRICANE (`.../one-hurricane`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | ONE-HURRICANE (`.../one-hurricane`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Guardian Nikola 7 (`.../guardian-nikola-7`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Love On The High Seas (`.../love-on-the-high-seas`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | What She Really Wants (`.../what-she-really-wants`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | ONE-HURRICANE (`.../one-hurricane`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ONE-HURRICANE (`.../one-hurricane`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../one-hurricane`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| thumbnail | PASS | `https://eggporncomics.com/.../thumb300_1.jpg` (image/jpeg, 2100546 bytes, 1411x2000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-hurricane` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://eggporncomics.com/.../1.jpg` was not downloaded |  |  |  |
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
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://eggporncomics.com/.../1.jpg` (image/jpeg, 2100546 bytes, 1411x2000) |  |  |  |
