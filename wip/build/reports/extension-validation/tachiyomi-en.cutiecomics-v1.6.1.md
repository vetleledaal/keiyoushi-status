# Extension Validation Report

- Extension: tachiyomi-en.cutiecomics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7821715230468497947
- Source name: Cutie Comics
- Source language: en
- Selected manga input: popular offset 0: COLLEGE GIRL WINS A LEWD CHICKEN DINNER (`.../4527-college-girl-wins-a-lewd-chicken-dinner.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | COLLEGE GIRL WINS A LEWD CHICKEN DINNER (`.../4527-college-girl-wins-a-lewd-chicken-dinner.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | AN ELDRITCH GOD ORDERS ME TO BREED FOR WORLD'S PEACE (`.../23007-an-eldritch-god-orders-me-to-breed-for-worlds-peace.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | COLLEGE GIRL WINS A LEWD CHICKEN DINNER (`.../4527-college-girl-wins-a-lewd-chicken-dinner.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | COLLEGE GIRL WINS A LEWD CHICKEN DINNER (`.../4527-college-girl-wins-a-lewd-chicken-dinner.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../4527-college-girl-wins-a-lewd-chicken-dinner.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 49 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=COLLEGE GIRL WINS A LEWD CHICKEN DINNER, URL=`.../4527-college-girl-wins-a-lewd-chicken-dinner.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cutiecomics.com/.../1648873598_1.jpg` (image/jpeg, 43733 bytes, 290x409) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../4527-college-girl-wins-a-lewd-chicken-dinner.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cutiecomics.com/.../1648873664_1.jpg` (image/jpeg, 282736 bytes, 900x1271) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Big Ass, Big Breasts, Blowjob, Cheating, Deepthroat, Gloves, Hotpants, Huge Breasts, Ponytail, Sole Female, Full Color, Group, Big Penis, Dark Skin, Uncensored, PUBG: BATTLEGROUNDS |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 49 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://cutiecomics.com/.../1` to `https://cutiecomics.com` (1 redirects); popular: `https://cutiecomics.com/.../2` to `https://cutiecomics.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://cutiecomics.com/.../1648873664_1.jpg` (image/jpeg, 282736 bytes, 900x1271) |  |  |  |
