# Extension Validation Report

- Extension: tachiyomi-en.coolmic-v1.4.4
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
- Source ID: 5279120461134453793
- Source name: Coolmic
- Source language: en
- Selected manga input: popular offset 0: Reincarnated into Demon King Evelogia's World (`.../464`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Reincarnated into Demon King Evelogia's World (`.../464`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Caressing the Nipples of My Hibernating Bear (`.../614`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Your Neighborhood Sex Mart (`.../9251`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | My Neighbors Are Unruly Alphas -The Fumbling Omega Doesn't Stand A Chance- (`.../9080`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | Reincarnated into Demon King Evelogia's World (`.../464`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Reincarnated into Demon King Evelogia's World (`.../464`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 165 | Chapter 01 (`.../10783`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Reincarnated into Demon King Evelogia's World, URL=`464` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Caressing the Nipples of My Hibernating Bear, URL=`614` at page 1 offset 19 and page 2 offset 0 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://en-img.coolmic.me/.../000000464_large_vertical.jpg` (image/jpeg, 191514 bytes, 1020x1428) |  |  |  |
| details identity | PASS | Details preserved selected URL `464` |  |  |  |
| details thumbnail URL | PASS | `https://en-img.coolmic.me/.../000000464_large_vertical.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Io Kaziwara |  |  |  |
| details genres | PASS | BL, Fantasy, Romance, Yaoi, Wimpy Seme, Height Difference |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "Good, make me your owner." The strongest couple to conquer the other world appears!?<br><br>Publisher: WWWave (Coolmic)<br><br>Rating: 18+ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 165 chapters |  |  |  |
| chapter dates | PASS | 165 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Each page index is 1 less than its 0-based list position |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://en-contents.coolmic.me/.../000010783-001.json <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 63331 bytes, 690x747; server Content-Type: binary/octet-stream) |  |  |  |
