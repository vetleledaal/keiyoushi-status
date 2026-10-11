# Extension Validation Report

- Extension: tachiyomi-all.yskcomics-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 177448809266948921
- Source name: YSK Comics
- Source language: en
- Selected manga input: popular offset 0: Ghost Pepper (2025) (`.../ghost-pepper-2025`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Ghost Pepper (2025) (`.../ghost-pepper-2025`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | American Caper (2025) (`.../american-caper-2025`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Ghost Pepper (2025) (`.../ghost-pepper-2025`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | Peter Parker: The Spectacular Spider-Man (2017) (`.../Peter-Parker:-The-Spectacular-Spider-Man-2017`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ghost Pepper (2025) (`.../ghost-pepper-2025`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | #1 (`.../ghost-pepper-2025-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 57 |  |  | <1s |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 10 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 42/42 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.ysk-comics.com/.../MyW0A9sLr0pRbNuZ.webp` (image/webp (encoding: lossy), 41918 bytes, 390x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ghost-pepper-2025` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.ysk-comics.com/.../MyW0A9sLr0pRbNuZ.webp` |  |  |  |
| details author | PASS | Ludo Lullabi |  |  |  |
| details artist | PASS | Adriano Lucas |  |  |  |
| details genres | PASS | action, Adventure, Hero |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Publisher: Image Comics<br>Published at: 2026-04-16<br><br>Ghost Pepper (2025) from Image Comics is a high-energy, genre-blending adventure from rising star Ludo Lullabi, featuring vibrant colors by Adriano Lucas. Combining explosive action with offbeat humor and heartfelt storytelling, this series delivers a fresh take on a world that has already survived the apocalypse—but is far from truly saved.<br><br>In the aftermath of a devastating global threat, humanity has managed to endure, but not everyone shares in the peace that followed. Society is now tightly controlled, with towering robots enforcing order under the guise of protection. For Loloi, survival means staying on the move. She travels from place to place in her food truck, serving up incredible dishes while navigating a dangerous, cutthroat network of rival vendors willing to do anything to dominate the streets.<br><br>Loloi’s life is a constant balancing act—outrunning competitors, dodging the watchful eyes of mechanical enforcers, and holding on to her independence in a world that seems determined to crush it. But everything changes when she crosses paths with a mysterious warrior named Ash. Quiet, powerful, and hiding a past shrouded in secrets, Ash carries abilities that defy explanation—and a purpose that could reshape the future.<br><br>As their paths intertwine, Loloi is pulled into something far greater than survival. Ash may hold the key to saving what remains of the world, but his immense power comes with a dangerous cost. If left unchecked, he could become just as destructive as the threats they’re trying to stop.<br><br>Blending post-apocalyptic tension with kinetic action and unexpected warmth, Ghost Pepper is a story about unlikely heroes, second chances, and the fight to build something better from the ashes. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | LINT | All 10 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=10 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 57 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.ysk-comics.com/.../1.jpg` (image/jpeg, 2597377 bytes, 1988x3056) |  |  |  |
