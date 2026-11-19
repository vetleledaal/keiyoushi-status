# Extension Validation Report

- Extension: tachiyomi-ar.comicverse-v1.6.23
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 7487319247633385575
- Source name: Comic Verse
- Source language: ar
- Selected manga input: popular offset 0: BEN 10 2026 (`.../ben-10-2026.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | BEN 10 2026 (`.../ben-10-2026.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Avengers Forever (2021) (`.../avengers-forever-2021.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | RED HULK (`.../red-hulk.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | BEN 10 2026 (`.../ben-10-2026.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | BEN 10 2026 (`.../ben-10-2026.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | العدد#1 (`.../1_6.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 27 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=BEN 10 2026, URL=`.../ben-10-2026.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../Ben%2010%20001%20%282026%29-000.jpg` (image/jpeg, 463737 bytes, 1032x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ben-10-2026.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../Ben%2010%20001%20%282026%29-000.jpg` (image/jpeg, 212218 bytes, 600x930) |  |  |  |
| details author | PASS | Joe Casey |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | غموض, فانتازيا, مغامرة |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | إعادة تقديم مميزة لإحدى كلاسيكيات القرن الحادي والعشرين! يعود بن 10، الشخصية المحبوبة لدى الجماهير، في سلسلة جديدة كليًا ستنال إعجاب المعجبين القدامى والقراء الجدد على حد سواء. عندما يسقط نيزك غامض على الأرض، يكتشف بن تينيسون، ذو العشر سنوات، الأومنيتريكس، ساعة فضائية متطورة تتمتع بقوة وإمكانيات هائلة. بفضل هذا الجهاز الذي يرتديه على معصمه، يمتلك بن القدرة على التحول إلى أشكال فضائية مذهلة. لكن هل يستطيع السيطرة على هذه القوة؟ إذا بدت القصة مألوفة، فكر مرة أخرى! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../Ben%2010%20001%20%282026%29-000.jpg` (image/jpeg, 463737 bytes, 1032x1600) |  |  |  |
