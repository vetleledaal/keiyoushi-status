# Extension Validation Report

- Extension: tachiyomi-en.coolmic-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5279120461134453793
- Source name: Coolmic
- Source language: en
- Selected manga input: popular offset 0: [Uncensored] Reincarnated into Demon King Evelogia's World (`.../3274`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | [Uncensored] Reincarnated into Demon King Evelogia's World (`.../3274`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | [Uncensored] Caressing the Nipples of My Hibernating Bear (`.../3065`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Omega Auction -A Night Going Undercover- (`.../9387`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Tentacles & Brainwashing: Automatic Submission Trap (`.../9442`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | [Uncensored] Reincarnated into Demon King Evelogia's World (`.../3274`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Uncensored] Reincarnated into Demon King Evelogia's World (`.../3274`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 165 | Chapter 01 (`.../84664`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Uncensored\] Reincarnated into Demon King Evelogia's World, URL=`3274` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://en-img.coolmic.me/.../000003274_large_vertical.jpg` (image/jpeg, 200779 bytes, 1006x1428) |  |  |  |
| details identity | PASS | Details preserved selected URL `3274` |  |  |  |
| details thumbnail URL | PASS | `https://en-img.coolmic.me/.../000003274_large_vertical.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Io Kaziwara |  |  |  |
| details genres | PASS | BL, Fantasy, Uncensored |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | \[Uncensored Edition\] "Good, make me your owner." The strongest couple to conquer the other world appears!?<br><br>Publisher: WWWave (Coolmic)<br><br>Rating: 18+ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 165 chapters |  |  |  |
| chapter dates | PASS | 165 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Each page index is 1 less than its 0-based list position |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://en-contents.coolmic.me/.../000084664-001.json <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 767737 bytes, 1380x1948; server Content-Type: binary/octet-stream) |  |  |  |
