# Extension Validation Report

- Extension: tachiyomi-en.eggporncomics-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7229505035165953281
- Source name: Eggporncomics
- Source language: en
- Selected manga input: latest offset 0: Poppy X Warwick (`.../poppy-x-warwick`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | ONE-HURRICANE (`.../one-hurricane`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Shedding Inhibitions 10 - Point of View (`.../shedding-inhibitions-10-point-of-view`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Poppy X Warwick (`.../poppy-x-warwick`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Hajimemashite! Watashi, Chuuken Doujin Sakka desu (`.../hajimemashite-watashi-chuuken-doujin-sakka-desu`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | Hypno Girls 6- Puppy Adoption- DecaMeron X (`.../hypno-girls-6-puppy-adoption-decameron-x`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Poppy X Warwick (`.../poppy-x-warwick`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../poppy-x-warwick`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 20 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://eggporncomics.com/.../thumb300_6444189.webp` (image/webp (encoding: lossy), 18634 bytes, 300x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../poppy-x-warwick` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://eggporncomics.com/.../6444189.webp` (image/webp (encoding: lossy), 221340 bytes, 1280x1280) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Category: Anime Comics<br>Tags: anal, big ass, huge penis, wolf boy, midget, gloves, ahegao, anal intercourse |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://eggporncomics.com/.../6444189.webp` (image/webp (encoding: lossy), 221340 bytes, 1280x1280) |  |  |  |
