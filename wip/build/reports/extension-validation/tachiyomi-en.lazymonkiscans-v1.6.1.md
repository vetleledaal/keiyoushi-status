# Extension Validation Report

- Extension: tachiyomi-en.lazymonkiscans-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7621495388133559436
- Source name: Lazy Monki Scans
- Source language: en
- Selected manga input: popular offset 0: Lookism (`<redacted URL #1: manga resource; relative; no scheme; query parameters: view and manga>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Lookism (`<redacted URL #1: selected resource; relative; no scheme; query parameters: view and manga>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Ore, Akuyaku Kishidanchou ni Tensei suru (`<redacted URL #2: selected resource; relative; no scheme; query parameters: view and manga>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lookism (`<redacted URL #1: selected resource; relative; no scheme; query parameters: view and manga>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lookism (`<redacted URL #1: selected resource; relative; no scheme; query parameters: view and manga>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Chapter 591 (`<redacted URL #3: selected resource; relative; no scheme; query parameters: view, manga, and chapter>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lookism, URL=`<redacted URL #1: resource; relative; no scheme; query parameters: view and manga>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 25/25 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 19/25 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lh3.googleusercontent.com/.../1675670005053653-1.png` (image/jpeg, 374468 bytes, 1002x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `<redacted URL #1: resource; relative; no scheme; query parameters: view and manga>` |  |  |  |
| details thumbnail URL | PASS | `https://lh3.googleusercontent.com/.../1675670005053653-1.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Park Hyung-Seok is an unattractive loner who wakes up in a different body. Now tall, handsome, and cooler than ever in his new form, Hyung-Seok aims to achieve everything he couldn't before.<br><br>How far will he go to keep his body... and his secrets? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://firestore.googleapis.com/.../S32lXgOpE867mdq4bNq0 <redacted query values: key and mask.fieldPaths>` (image/webp (container: extended), 522600 bytes, 800x14044) |  |  |  |
