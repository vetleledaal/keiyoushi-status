# Extension Validation Report

- Extension: tachiyomi-all.toomics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 7004582542854505662
- Source name: Toomics (Only free chapters)
- Source language: en
- Selected manga input: popular offset 0: Annoying Alice (`.../Y`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 298 | Annoying Alice (`.../Y`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Prices Crash, I Rise (`.../Y`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Annoying Alice (`.../Y`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Annoying Alice (`.../Y`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | 1 - Annoying Alice (`.../4866`) |  | <1s |
| pages | `getPageList(chapter)` | success | 53 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 298 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Annoying Alice, URL=`.../Y` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 309/309 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 309/309 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumb-g2.toomics.com/.../2020_08_18_15977343088979.jpg` (image/jpeg, 38079 bytes, 250x250) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Y` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://thumb-g2.toomics.com/.../2019_03_15_15526329389053.jpg <redacted query values: v>` was not downloaded |  |  |  |
| details author | PASS | Miyune |  |  |  |
| details artist | PASS | LEE HYUNMIN |  |  |  |
| details genres | PASS | Romance, Comedy, Slice of life, Office |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Alice is so annoying! All she does is cause trouble and make fun of me... but why can't I stop thinking about her? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://toon-g2.toomics.com/.../ASRGX3L2MknwvkGFbDYacljgieJ3TRkbYEBiwCPLSj0qxha2a5lcYcL7cx16QPkr_oL5DkZc6nBxt_cpwThbutDUe0UG2u8oLVPOrmzJXgw <redacted query values: time, code, and tri>` (image/jpeg, 22871 bytes, 720x500) |  |  |  |
