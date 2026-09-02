# Extension Validation Report

- Extension: tachiyomi-en.hiveworks-v1.4.12
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6620819060709781499
- Source name: Hiveworks Comics
- Source language: en
- Selected manga input: popular offset 0: Paranatural (`https://paranatural.net <redacted query values: utm_source, utm_medium, and utm_campaign>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 37 | Paranatural (`https://paranatural.net <redacted query values: utm_source, utm_medium, and utm_campaign>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 4 | Spinnerette (`https://spinnyverse.com <redacted query values: utm_source, utm_medium, and utm_campaign>`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Paranatural (`https://paranatural.net <redacted query values: utm_source, utm_medium, and utm_campaign>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Paranatural (`https://paranatural.net <redacted query values: utm_source, utm_medium, and utm_campaign>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 917 | Chapter 1 (`https://www.paranatural.net/.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | <1s |

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
| latest listing | PASS | 4 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Paranatural, URL=`https://paranatural.net <redacted query values: utm_source, utm_medium, and utm_campaign>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 42/42 listing manga have titles and URLs; popular: all absolute; latest: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://paranatural.net <redacted query values: utm_source, utm_medium, and utm_campaign>`, popular entry 2: `https://goblinscomic.com <redacted query values: utm_source, utm_medium, and utm_campaign>`, popular entry 3: `https://ozziethevampire.com <redacted query values: utm_source, utm_medium, and utm_campaign>` |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
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
| chapters | PASS | 917 chapters |  |  |  |
| chapter dates | PASS | 917 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 917 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.paranatural.net/.../2011-04-30-chapter%201.png` (image/png, 227283 bytes, 800x950) |  |  |  |
