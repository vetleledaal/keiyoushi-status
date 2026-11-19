# Extension Validation Report

- Extension: tachiyomi-all.jagodibuja-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5211085235074917460
- Source name: Jago Dibuja
- Source language: en
- Selected manga input: popular offset 0: Living with Hipstergirl and Gamergirl (`.../web-comic-living-with-hipstergirl-and-gamergirl-en`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 2 | Living with Hipstergirl and Gamergirl (`.../web-comic-living-with-hipstergirl-and-gamergirl-en`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Living with Hipstergirl and Gamergirl (`.../web-comic-living-with-hipstergirl-and-gamergirl-en`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Living with Hipstergirl and Gamergirl (`.../web-comic-living-with-hipstergirl-and-gamergirl-en`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 85 | Comic 0-99 (`.../tira-0-99`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 95 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 2 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Living with Hipstergirl and Gamergirl, URL=`.../web-comic-living-with-hipstergirl-and-gamergirl-en` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 3/3 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 3/3 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://jagodibuja.com/.../seccion-living-with-Hipster-1.png` (image/png, 281454 bytes, 700x375) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../web-comic-living-with-hipstergirl-and-gamergirl-en` |  |  |  |
| details thumbnail URL | PASS | `https://jagodibuja.com/.../seccion-living-with-Hipster-1.png` |  |  |  |
| details author | PASS | Jago |  |  |  |
| details artist | PASS | Jago |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 85 chapters |  |  |  |
| chapter dates | PASS | 85 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 95 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://jagodibuja.com/.../hipster-gilr-1-2048x1374.jpg` (image/jpeg, 342363 bytes, 2048x1374) |  |  |  |
