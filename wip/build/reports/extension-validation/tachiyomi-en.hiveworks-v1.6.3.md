# Extension Validation Report

- Extension: tachiyomi-en.hiveworks-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 20
- Lint: 2
- Warnings: 0
- Skipped: 14
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6620819060709781499
- Source name: Hiveworks Comics
- Source language: en
- Selected manga input: popular offset 0: Girl Genius (`https://girlgeniusonline.com <redacted query values: utm_source, utm_medium, and utm_campaign>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 27 | Girl Genius (`https://girlgeniusonline.com <redacted query values: utm_source, utm_medium, and utm_campaign>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 5 | Angel's Orchard (`https://hiveworkscomics.com/.../ao-page-1-2 <redacted query values: utm_source, utm_medium, and utm_campaign>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Girl Genius (`https://girlgeniusonline.com <redacted query values: utm_source, utm_medium, and utm_campaign>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Girl Genius (`https://girlgeniusonline.com <redacted query values: utm_source, utm_medium, and utm_campaign>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | java.lang.Exception: This comic has a unsupported chapter list | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.lang.Exception: This comic has a unsupported chapter list | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 27 entries |  |  |  |
| latest listing | PASS | 5 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Girl Genius, URL=`https://girlgeniusonline.com <redacted query values: utm_source, utm_medium, and utm_campaign>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 33/33 listing manga have titles and URLs; popular: all absolute; latest: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://girlgeniusonline.com <redacted query values: utm_source, utm_medium, and utm_campaign>`, popular entry 2: `https://fantomestein.com <redacted query values: utm_source, utm_medium, and utm_campaign>`, popular entry 3: `https://starimpactcomic.com <redacted query values: utm_source, utm_medium, and utm_campaign>` |  |  |  |
| thumbnail URLs | PASS | 33/33 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hiveworkscomics.com/.../hubbox_GIRL GENIUS.png` (image/png, 47750 bytes, 300x250) |  |  |  |
| details identity | PASS | Details preserved selected URL `https://girlgeniusonline.com <redacted query values: utm_source, utm_medium, and utm_campaign>` |  |  |  |
| details thumbnail URL | PASS | `https://hiveworkscomics.com/.../hubbox_GIRL GENIUS.png` |  |  |  |
| details author | PASS | Phil Foglio, Kaja Foglio |  |  |  |
| details artist | PASS | Phil Foglio, Kaja Foglio |  |  |  |
| details genres | PASS | TEEN |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | In a time when the Industrial Revolution has become an all-out war, Mad Science rules the World...with mixed success. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
