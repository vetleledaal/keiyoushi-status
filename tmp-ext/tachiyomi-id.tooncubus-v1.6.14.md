# Extension Validation Report

- Extension: tachiyomi-id.tooncubus-v1.6.14
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 25
- Lint: 2
- Warnings: 2
- Skipped: 6
- Failed: 1
- Retry disposition: RETRY_WHEN
- Retry condition: HOST_RESOLVES: www.tooncubus-read.my.id

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8493327683322555504
- Source name: Tooncubus
- Source language: id
- Selected manga input: popular offset 0: Aunt Hina (`.../aunt-hina.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Aunt Hina (`.../aunt-hina.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Love For Amalthea (`.../love-for-amalthea.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | A slightly different kind of Magic Duel (`.../a-slightly-different-kind-of-magic-duel.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Aunt Hina (`.../aunt-hina.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Aunt Hina (`.../aunt-hina.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Baca Chapter 01 (`https://www.tooncubus-read.my.id/.../aunt-hina-part-01.html`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.net.UnknownHostException: www.tooncubus-read.my.id: No address associated with hostname | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.net.UnknownHostException: www.tooncubus-read.my.id: No address associated with hostname | RETRY_WHEN | DNS_LOOKUP_FAILURE | HOST_RESOLVES: www.tooncubus-read.my.id |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Aunt Hina, URL=`.../aunt-hina.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../Hina.jpg` (image/jpeg, 54466 bytes, 291x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../aunt-hina.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../Hina.jpg` (image/jpeg, 54466 bytes, 291x400) |  |  |  |
| details author | PASS | ElijahZX |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Full Color, MILF, Big Breast, Big Ass, Big Dick, Masturbation, Blowjob, Cum Swallow, Apron, Anal, Creampie |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | LINT | All 4 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=4 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 4 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | www.tooncubus-read.my.id: No address associated with hostname |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
