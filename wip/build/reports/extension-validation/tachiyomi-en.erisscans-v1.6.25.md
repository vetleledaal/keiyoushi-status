# Extension Validation Report

- Extension: tachiyomi-en.erisscans-v1.6.25
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: keyoapp
- Source ID: 8358420357808595754
- Source name: Eris Scans
- Source language: en
- Selected manga input: popular offset 0: Obedient Pregnancy (`.../647401bd656`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Obedient Pregnancy (`.../647401bd656`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 601 | Reverse Play (`.../65f735e9c7a`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Obedient Pregnancy (`.../647401bd656`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Obedient Pregnancy (`.../647401bd656`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 49 | Chapter 1 (`.../647401bd656-64740affe0d`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 601 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Obedient Pregnancy, URL=`.../647401bd656` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 614/614 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 614/614 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../a3Huc-ays5G <redacted query values: w>` (image/jpeg, 118207 bytes, 480x639) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../647401bd656` |  |  |  |
| details thumbnail URL | PASS | `https://i0.wp.com/.../a3Huc-ays5G <redacted query values: w>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Josei |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A woman trained to appear perfectly obedient hides a daring, unconventional nature beneath a gentle facade. Taken into a powerful household, she clashes with a control-obsessed heir who tries to mold her to his will. Their battle of wills slowly becomes attraction, forcing him to confront his limits. Refusing to be owned, she defines love on her own terms, leading to a strange yet sweet marriage. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 49 chapters |  |  |  |
| chapter dates | PASS | 49 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../MDmXJjjWXy0` (image/jpeg, 944528 bytes, 800x14759; server Content-Type: text/plain) |  |  |  |
