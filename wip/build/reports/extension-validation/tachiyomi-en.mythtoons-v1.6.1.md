# Extension Validation Report

- Extension: tachiyomi-en.mythtoons-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4095669960873681987
- Source name: Myth Toons
- Source language: en
- Selected manga input: popular offset 0: Breathtaking Alliance (`.../breathtaking-alliance`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 377 | Breathtaking Alliance (`.../breathtaking-alliance`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | Even A Lonely Squirrel Has Its Own Burrow (`.../even-a-lonely-squirrel-has-its-own-burrow`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Temperature of the Embers (`.../temperature-of-the-embers`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Breathtaking Alliance (`.../breathtaking-alliance`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Breathtaking Alliance (`.../breathtaking-alliance`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 40 | Chapter 1 (`.../breathtaking-alliance-ch1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| popular listing | PASS | 377 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Breathtaking Alliance, URL=`.../breathtaking-alliance` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 478/478 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 478/478 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mythtoons.org/.../cover <redacted query values: v>` (image/webp (encoding: lossy), 50514 bytes, 640x843) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../breathtaking-alliance` |  |  |  |
| details thumbnail URL | PASS | `https://mythtoons.org/.../cover <redacted query values: v>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | BL, Drama, Fantasy, Romance, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Freshman year of college, on the long-awaited club MT trip.<br>Sunwoo learns that the senior he has a crush on already has someone she’s seeing.<br>Jealousy flares as Sunwoo glares at his rival, Sangyoon—a guy with the vibe of a total punk.<br>But while exploring a supposed haunted spot, Sunwoo ends up stranded with him, just the two of them.<br>They take shelter from the rain in a suspicious abandoned house… and Sunwoo ends up getting possessed by a ghost. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 40 chapters |  |  |  |
| chapter dates | PASS | 40 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mythtoons.org/.../images <redacted query values: manga, chapter, and page>` (image/jpeg, 2703590 bytes, 1440x19975) |  |  |  |
