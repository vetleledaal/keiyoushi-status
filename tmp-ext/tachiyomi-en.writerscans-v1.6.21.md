# Extension Validation Report

- Extension: tachiyomi-en.writerscans-v1.6.21
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 561830040001881975
- Source name: Writer Scans
- Source language: en
- Selected manga input: popular offset 0: Classmate (`.../640ecb8f2bb`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Classmate (`.../640ecb8f2bb`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 27 | I'm Only Embarrassed in Front of You (`.../6466e5dda5f`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Classmate (`.../640ecb8f2bb`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Classmate (`.../640ecb8f2bb`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 53 | Chapter 1: Encounter (1) (`.../640ecb8f2bb-640ece9aebc`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 27 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Classmate, URL=`.../640ecb8f2bb` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 34/34 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 34/34 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wsrv.nl <redacted query values: url and w>` (image/png, 714505 bytes, 480x640) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../640ecb8f2bb` |  |  |  |
| details thumbnail URL | PASS | `https://wsrv.nl <redacted query values: url and w>` |  |  |  |
| details author | PASS | Sooriboo |  |  |  |
| details artist | PASS | Sooriboo |  |  |  |
| details genres | PASS | Manhwa, Horror, Mystery |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "I'll be your friend." A chilling ghost boy, Haesu Lee, visits the outcast, Eunha Joo. The moment she accepts this dangerous friendship, unexpected events unfold around Eunha... Will this hand offered by her mysterious friend be salvation, or a curse?<br><br>Alternative Titles:<br>- 클래스메이트 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 53 chapters |  |  |  |
| chapter dates | PASS | 53 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../1xsRh8Egoz8` (image/png, 6446479 bytes, 800x14961; server Content-Type: text/plain) |  |  |  |
