# Extension Validation Report

- Extension: tachiyomi-en.manhwax-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 3
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6800665234733328599
- Source name: ManhwaX (unoriginal)
- Source language: en
- Selected manga input: popular offset 0: Kim's Shop Raw (`.../kims-shop-raw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Kim's Shop Raw (`.../kims-shop-raw`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | MILF Hunting In Another World (`.../milf-hunting-in-another-world-01`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Kim's Shop Raw (`.../kims-shop-raw`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | MILF Hunting In Another World (`.../milf-hunting-in-another-world-01`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Kim's Shop Raw (`.../kims-shop-raw`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kim's Shop Raw (`.../kims-shop-raw`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 14 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kim's Shop Raw, URL=`.../kims-shop-raw` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwax.pro/.../img <redacted query values: url>` (image/jpeg, 14937 bytes, 206x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kims-shop-raw` |  |  |  |
| details thumbnail URL | PASS | `https://manhwax.pro/.../img <redacted query values: url>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | On Daecheongdo, a remote island where young men have all but vanished, the arrival of a mobile shop changes everything. Its owner is Sang-ki, an attractive, bronzed young man who sells a wide variety of goods. By day, he supplies the village women with household items… but once the sun goes down, the shop’s true VIP business begins. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | LINT | All 14 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=14 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://manhwax.pro/.../manga-list <redacted query values: sort>` to `https://manhwax.pro/.../browse <redacted query values: sort>` (1 redirects); popular: `https://manhwax.pro/.../manga-list` to `https://manhwax.pro/.../browse` (1 redirects); popular: `https://manhwax.pro/.../manga-list <redacted query values: page and sort>` to `https://manhwax.pro/.../browse <redacted query values: page and sort>` (1 redirects); popular: `https://manhwax.pro/.../manga-list <redacted query values: q and sort>` to `https://manhwax.pro/.../browse <redacted query values: q and sort>` (1 redirects); popular: `https://manhwax.pro/.../manga-list <redacted query values: page>` to `https://manhwax.pro/.../browse <redacted query values: page>` (1 redirects) |  |  |  |
| page load | PASS | `https://manhwax.pro/.../img <redacted query values: url>` (image/jpeg, 388323 bytes, 720x6648) |  |  |  |
