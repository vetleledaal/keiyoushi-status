# Extension Validation Report

- Extension: tachiyomi-en.readbluelockmangaonline-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 24
- Lint: 4
- Warnings: 1
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangacatalog
- Source ID: 808579735886687031
- Source name: Read Blue Lock Manga Online
- Source language: en
- Selected manga input: popular offset 0: Blue Lock (`https://ww3.bluelockread.com/.../blue-lock`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Blue Lock (`https://ww3.bluelockread.com/.../blue-lock`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 7 | Blue Lock (`https://ww3.bluelockread.com/.../blue-lock`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Blue Lock (`https://ww3.bluelockread.com/.../blue-lock`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 376 | Blue Lock Chapter 1 (`https://ww3.bluelockread.com/.../blue-lock-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 75 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Blue Lock, URL=`https://ww3.bluelockread.com/.../blue-lock` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 27/27 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://ww3.bluelockread.com/.../blue-lock`, popular entry 2: `https://ww3.bluelockread.com/.../blue-lock-episode-nagi`, popular entry 3: `https://ww3.bluelockread.com/.../another-blue-lock-episode-omotesando` |  |  |  |
| thumbnail URLs | LINT | 0/27 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `https://ww3.bluelockread.com/.../blue-lock` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../yv8QOj4.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | After reflecting on the current state of Japanese soccer, the Japanese Football Association decides to hire the enigmatic and eccentric coach Jinpachi Ego to achieve their dream of winning the World Cup. Believing that Japan has lacked an egoistic striker hungry for goals, Jinpachi initiates the Blue Lock—a prison-like facility where three hundred talented strikers from high schools all over Japan are isolated and pitted against each other. The sole survivor of Blue Lock will earn the right to become the national team's striker, and those who are defeated shall be banned from joining the team forever. Selected to join this risky project is Yoichi Isagi, a striker who failed to bring his high school soccer team to the national tournament. After choosing to pass to a teammate who missed instead of scoring on his own, he could not help but wonder if the results would have been different had he been more selfish. Using this golden opportunity given by the Blue Lock Project, Yoichi aims to clear his doubts and chase his ultimate desire—to become the greatest striker in the world and lead Japan to World Cup glory. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 376 chapters |  |  |  |
| chapter dates | LINT | All 376 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=376 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 376 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 75 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.bluelockread.com/.../1.jpeg <redacted query values: t>` (image/jpeg, 192080 bytes, 1123x1600) |  |  |  |
