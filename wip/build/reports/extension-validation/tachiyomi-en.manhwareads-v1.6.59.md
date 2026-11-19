# Extension Validation Report

- Extension: tachiyomi-en.manhwareads-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3315938131690984352
- Source name: Manhwa Reads
- Source language: en
- Selected manga input: popular offset 0: Black Clover (`.../2227`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Black Clover (`.../2227`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 9 | Maydare Tensei Monogatari (`.../2265`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Spy X Family (`.../2270`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 9 | Boruto: Two Blue Vortex (`.../2231`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Black Clover (`.../2227`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Black Clover (`.../2227`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 298 | Vol.06 Chapter 045 - One Day You'll Protect Someone Else (`.../vol-06-chapter-045-one-day-youll-protect-someone-else`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Black Clover, URL=`2227` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 69/69 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 69/69 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwareads.com/.../cover-2227-175x238.jpg` (image/jpeg, 18912 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `2227` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manhwareads.com/.../cover-2227.jpg` (image/jpeg, 43869 bytes, 200x315) |  |  |  |
| details author | PASS | TABATA Yuuki |  |  |  |
| details artist | PASS | TABATA Yuuki |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Shounen |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | In the Clover Kingdom, magic is everything and the greatest sorcerers rule over all. Yet when Arata is born without any Magical Power, he is abandoned at a church orphanage and neglected by everyone around him.<br><br>Now Arata must find his own way in a cruel world and give his all to become the most powerful sorcerer in the entire kingdom; the Wizard King!<br><br>An all-time favorite young and magical fantasy drawn with a beautiful touch and moved by its passionate characters!<br><br>Alternative Names: Black Clover |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 298 chapters |  |  |  |
| chapter dates | PASS | 298 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manhwareads.com/.../u001.jpg` (image/jpeg, 285562 bytes, 728x1148) |  |  |  |
