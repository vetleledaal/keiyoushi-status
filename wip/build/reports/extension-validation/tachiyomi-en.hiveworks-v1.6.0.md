# Extension Validation Report

- Extension: tachiyomi-en.hiveworks-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 2
- Warnings: 2
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6620819060709781499
- Source name: Hiveworks Comics
- Source language: en
- Selected manga input: popular offset 0: Paranatural (`https://paranatural.net <redacted query values: utm_source, utm_medium, and utm_campaign>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 37 | Paranatural (`https://paranatural.net <redacted query values: utm_source, utm_medium, and utm_campaign>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 1 | Dumbing of Age (`https://dumbingofage.com <redacted query values: utm_source, utm_medium, and utm_campaign>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Paranatural (`https://paranatural.net <redacted query values: utm_source, utm_medium, and utm_campaign>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Paranatural (`https://paranatural.net <redacted query values: utm_source, utm_medium, and utm_campaign>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 921 | Chapter 1 (`https://www.paranatural.net/.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

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
| popular listing | PASS | 37 entries |  |  |  |
| latest listing | PASS | 1 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Paranatural, URL=`https://paranatural.net <redacted query values: utm_source, utm_medium, and utm_campaign>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 39/39 listing manga have titles and URLs; popular: all absolute; latest: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://paranatural.net <redacted query values: utm_source, utm_medium, and utm_campaign>`, popular entry 2: `http://johnnywander.com <redacted query values: utm_source, utm_medium, and utm_campaign>`, popular entry 3: `https://atomic-robo.com <redacted query values: utm_source, utm_medium, and utm_campaign>` |  |  |  |
| thumbnail URLs | PASS | 39/39 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hiveworkscomics.com/.../hubbox_PARANATURAL.png` (image/png, 36196 bytes, 300x250) |  |  |  |
| details identity | PASS | Details preserved selected URL `https://paranatural.net <redacted query values: utm_source, utm_medium, and utm_campaign>` |  |  |  |
| details thumbnail URL | PASS | `https://hiveworkscomics.com/.../hubbox_PARANATURAL.png` |  |  |  |
| details author | PASS | Zack Morrison |  |  |  |
| details artist | PASS | Zack Morrison |  |  |  |
| details genres | PASS | EVERYONE |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Superpowered middle schoolers fight evil spirits in their rural hometown. Come for the jokes, stay for the cast, the creatures, and the mystery that ties them all together! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 921 chapters |  |  |  |
| chapter dates | PASS | 921 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 921 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://paranatural.net/.../archive <redacted query values: utm_source, utm_medium, and utm_campaign>` to `https://www.paranatural.net/.../archive <redacted query values: utm_source, utm_medium, and utm_campaign>` (1 redirects) |  |  |  |
| page load | PASS | `https://www.paranatural.net/.../2011-04-30-chapter%201.png` (image/png, 227283 bytes, 800x950) |  |  |  |
