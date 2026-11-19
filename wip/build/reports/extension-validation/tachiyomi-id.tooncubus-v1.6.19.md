# Extension Validation Report

- Extension: tachiyomi-id.tooncubus-v1.6.19
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 25
- Lint: 3
- Warnings: 2
- Skipped: 6
- Failed: 1
- Retry disposition: RETRY_WHEN
- Retry condition: HOST_RESOLVES: www.tooncubus-read.my.id

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 8493327683322555504
- Source name: Tooncubus
- Source language: id
- Selected manga input: popular offset 0: Konoha Shinobi Affair (`.../konoha-shinobi-affair.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Konoha Shinobi Affair (`.../konoha-shinobi-affair.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Love For Amalthea (`.../love-for-amalthea.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | A slightly different kind of Magic Duel (`.../a-slightly-different-kind-of-magic-duel.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Konoha Shinobi Affair (`.../konoha-shinobi-affair.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Konoha Shinobi Affair (`.../konoha-shinobi-affair.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Baca Chapter 01 (`https://www.tooncubus-read.my.id/.../konoha-shinobi-affair-01.html`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.net.UnknownHostException: www.tooncubus-read.my.id: Name or service not known | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.net.UnknownHostException: www.tooncubus-read.my.id: Name or service not known | RETRY_WHEN | DNS_LOOKUP_FAILURE | HOST_RESOLVES: www.tooncubus-read.my.id |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Konoha Shinobi Affair, URL=`.../konoha-shinobi-affair.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 52/52 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 52/52 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../01_cover00.jpg` (image/jpeg, 33904 bytes, 249x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../konoha-shinobi-affair.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../01_cover00.jpg` (image/jpeg, 33904 bytes, 249x350) |  |  |  |
| details author | PASS | Ecoas Doodlexxx |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | LINT | All 4 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=4 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 4 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | www.tooncubus-read.my.id: Name or service not known |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
