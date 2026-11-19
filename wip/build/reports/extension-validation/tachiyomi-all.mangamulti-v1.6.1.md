# Extension Validation Report

- Extension: tachiyomi-all.mangamulti-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 7309212159933705862
- Source name: Manga Multi
- Source language: en
- Selected manga input: popular offset 0: Agravity Boys (`.../agravity-boys.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 19 | Agravity Boys (`.../agravity-boys.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Agravity Boys (`.../agravity-boys.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Agravity Boys (`.../agravity-boys.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 50 | Agravity Boys, Chapter 1 (`.../agravity-boys-chapter-1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 55 |  |  | <1s |

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
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Agravity Boys, URL=`.../agravity-boys.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 20/20 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 20/20 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.mangamulti.com/.../Agravity_Boys_vol1.jpg` (image/jpeg, 175185 bytes, 252x395) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../agravity-boys.html` |  |  |  |
| details thumbnail URL | PASS | `https://www.mangamulti.com/.../Agravity_Boys_vol1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Saga, Chris, Geralt, and Baba are four young astronauts targeting the year 2118 as they set out on a mission to locate a new home for humanity. Earth is fully engulfed by a black hole just 2 days after their departure, making them the last known survivors of humanity. The quartet is stranded on Alpha Jumbro, a distant planet which makes it mandatory for them to navigate the difficulties of building a new society from square one.<br><br>Agravity Boys is a brilliantly crafted sci-fi comedy manga that is a perfect blend of absurd humor intertwined with heartwarming moments. In the process of adapting to their surroundings, the boys soldiers encounter the strangest exotic aliens, deal with mind-blowing plots, and even face the intricacies of self-understanding. Reigning supreme in twitter's wrinkly memes are aggressive parodies alongside the tight-knit friendships between characters.<br><br>Atsushi Nakamura is the mind behind this dazzling creation, Agravity Boys. It was first published in Weekly Shonen Jump from December 2019 till January 2021. Later, an epilogue was released in Jump Giga in April 2021. The complete story is bound in 7 separate volumes which offers its audience unmatched tale of space and adventure comedy. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | LINT | All 50 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=50 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.mangamulti.com/.../001.jpg` (image/jpeg, 170009 bytes, 784x1145) |  |  |  |
