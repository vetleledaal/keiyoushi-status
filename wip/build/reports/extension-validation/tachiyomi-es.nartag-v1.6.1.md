# Extension Validation Report

- Extension: tachiyomi-es.nartag-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2973017642163731007
- Source name: Rncalation
- Source language: es
- Selected manga input: latest offset 0: Shadow Slave (`.../shadow-slave-1784156454442`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 0 |  |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Shadow Slave (`.../shadow-slave-1784156454442`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Shadow Slave (`.../shadow-slave-1784156454442`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Shadow Slave (`.../shadow-slave-1784156454442`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 35 | Capítulo 1 (`.../8xaOhThD7W5-WXUeP39f3`) |  | <1s |
| pages | `getPageList(chapter)` | success | 70 |  |  | <1s |

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
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shadow Slave, URL=`.../shadow-slave-1784156454442` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 25/25 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 25/25 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rncalation.online/.../cover-1784156454442-lg.webp` (image/webp (encoding: lossy), 55670 bytes, 450x675) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shadow-slave-1784156454442` |  |  |  |
| details thumbnail URL | PASS | `https://rncalation.online/.../cover-1784156454442-lg.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | En emisión, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 35 chapters |  |  |  |
| chapter dates | LINT | All 35 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=35 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 70 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://rncalation.online/.../library <redacted query values: sort and page>` to `https://rncalation.online/.../library <redacted query values: sort>` (1 redirects); popular: `https://rncalation.online/.../library <redacted query values: page, q, and sort>` to `https://rncalation.online/.../library <redacted query values: q>` (1 redirects) |  |  |  |
| page load | PASS | `https://rncalation.online/.../1784542265923-f9597a28-c13e-45ef-bc4a-fecca5dcc5a2.jpg <redacted query values: t>` (image/jpeg, 1170259 bytes, 977x1610) |  |  |  |
