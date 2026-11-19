# Extension Validation Report

- Extension: tachiyomi-all.dbnewhope-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 4
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 909008906078523978
- Source name: DB New Hope
- Source language: all
- Selected manga input: popular offset 0: DB New Hope (English) (`.../chapters.php`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 3 | DB New Hope (English) (`.../chapters.php`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 3 | DB New Hope (English) (`.../chapters.php`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | DB New Hope (English) (`.../chapters.php`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | DB New Hope (English) (`.../chapters.php`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 23 | Chapter 1: Dark Defeat (`https://dbnewhope.com/.../01.php`) |  | <1s |
| pages | `getPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| popular listing | PASS | 3 entries |  |  |  |
| latest listing | PASS | 3 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=DB New Hope (English), URL=`.../chapters.php` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 7/7 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | LINT | 0/7 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `.../chapters.php` |  |  |  |
| details thumbnail URL | PASS | `https://dbnewhope.com/.../banner.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Welcome to the DB New Hope website, a fan fiction by ブリちゃん Burichan (@dbnewhope on instagram), project in progress since 2021. Here you'll find all the DBNH chapters for free!<br><br>Seven years after Cell's victory over Gohan, the Earth has been rebuilt, but the threat of Cell persists in the shadows. Krilin, scarred by past events, becomes the mentor of a promising warrior, the last hope of the Z-Team. Together, they train intensely, developing a complex relationship of respect and learning. This story explores the transmission of the Z warriors' heritage and the fight against a potential threat, while questioning whether this duo will be ready to face a possible return of Cell. An adventure full of battles and emotions in the Z universe.<br><br>32 years have passed since Team Z fell to their formidable adversaries. In a bleak future where hope seems lost, Bulma embarks on a desperate quest to reverse the course of events. Meanwhile, in the other world, something unexpected happens at the border post.<br><br>Year 783, Gohan arrives ready to take on the cyborgs on a devastated Earth ... but what he finds is beyond anything he could have imagined. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 23 chapters |  |  |  |
| chapter dates | LINT | All 23 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=23 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 23 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://dbnewhope.com/.../fe07eee1f0268775c646e844b05bff2d.png <redacted query values: v>` (image/png, 932204 bytes, 800x962) |  |  |  |
