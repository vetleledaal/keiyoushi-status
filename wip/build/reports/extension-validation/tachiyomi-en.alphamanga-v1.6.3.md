# Extension Validation Report

- Extension: tachiyomi-en.alphamanga-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 25
- Lint: 1
- Warnings: 1
- Skipped: 9
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 370653027333714265
- Source name: Alpha Manga
- Source language: en
- Selected manga input: popular offset 0: Blacksmith Apprentice at Level 596 (`.../805000351`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Blacksmith Apprentice at Level 596 (`.../805000351`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The Tutorial Before My Reincarnation Made Me the Strongest in Another World (`.../872000600`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Blacksmith Apprentice at Level 596 (`.../805000351`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Blacksmith Apprentice at Level 596 (`.../805000351`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 35 | Chapter 1: Level 596?! (`.../2537`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IndexOutOfBoundsException: Index 45 out of bounds for length 45 | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IndexOutOfBoundsException: Index 45 out of bounds for length 45 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Blacksmith Apprentice at Level 596, URL=`805000351` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image-en.alpha-manga.com/.../book_cover_441x627.webp` (image/webp (encoding: lossy), 109848 bytes, 441x627) |  |  |  |
| details identity | PASS | Details preserved selected URL `805000351` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://image-en.alpha-manga.com/.../670x300.webp` (image/webp (encoding: lossy), 71724 bytes, 670x300) |  |  |  |
| details author | PASS | Yuki Terao |  |  |  |
| details artist | PASS | Yu Ameri |  |  |  |
| details genres | PASS | Shonen, Isekai, BeastPeople, Action, Cheats |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The beasthuman Noa has a dream of becoming a blacksmith, as Noa's father, Nomad, used to be the acclaimed Divine Blacksmith. Since Noa's mother died, Nomad has drowned his days in liquor and grief, so Noa ventures to dangerous places to get Nomad's smithing materials. This leads to Noa's life being in continual risk. Noa is now 14 and doing normal work as a smithy to support Nomad, when Nomad makes an unreal discovery about his child! All of the materials Noa's collected are unbelievably rare! Nomad calls his familiar adventurer to check Noa's level...and it's at an amazingly high 596! What's the secret to this super-high level, higher than even the kingdom's hero?! Check out this adventuring fantasy that unfolds around a puppy-human apprentice that's out of this world! |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 24 name |  |  |  |
| chapters | PASS | 35 chapters |  |  |  |
| chapter dates | PASS | 35 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Index 45 out of bounds for length 45 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
