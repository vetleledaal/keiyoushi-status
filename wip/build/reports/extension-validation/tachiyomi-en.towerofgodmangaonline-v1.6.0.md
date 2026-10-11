# Extension Validation Report

- Extension: tachiyomi-en.towerofgodmangaonline-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 22
- Lint: 4
- Warnings: 1
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangacatalog
- Source ID: 7174981474350393136
- Source name: Tower Of God Manga Online
- Source language: en
- Selected manga input: popular offset 0: Tower of God (`https://w82.thetowerofgod.com`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1 | Tower of God (`https://w82.thetowerofgod.com`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tower of God (`https://w82.thetowerofgod.com`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tower of God (`https://w82.thetowerofgod.com`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 663 | Chapter 644 (`https://w82.thetowerofgod.com/.../tower-of-god-chapter-644`) |  | <1s |
| pages | `getPageList(chapter)` | success | 25 |  |  | <1s |

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
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tower of God, URL=`https://w82.thetowerofgod.com` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | LINT | 2/2 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://w82.thetowerofgod.com`, search entry 1: `https://w82.thetowerofgod.com` |  |  |  |
| thumbnail URLs | LINT | 0/2 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `https://w82.thetowerofgod.com` |  |  |  |
| details thumbnail URL | PASS | `https://w31.thetowerofgod.com/.../Pic-1-min-725x1024.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Read Tower Of God Best Manga Online in High Quality - English Scans. Best Website to Read Manga Online. Read All Chapters For FREE! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 663 chapters |  |  |  |
| chapter dates | LINT | All 663 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=663 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 663 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `https://w82.thetowerofgod.com/.../tower-of-god-chapter-653` at offsets 0, 653, `https://w82.thetowerofgod.com/.../tower-of-god-chapter-652` at offsets 1, 654, `https://w82.thetowerofgod.com/.../tower-of-god-chapter-651` at offsets 2, 655, `https://w82.thetowerofgod.com/.../tower-of-god-chapter-650` at offsets 3, 656, `https://w82.thetowerofgod.com/.../tower-of-god-chapter-649` at offsets 4, 657, `https://w82.thetowerofgod.com/.../tower-of-god-chapter-648` at offsets 5, 658, `https://w82.thetowerofgod.com/.../tower-of-god-chapter-647` at offsets 6, 659, `https://w82.thetowerofgod.com/.../tower-of-god-chapter-646` at offsets 7, 660, `https://w82.thetowerofgod.com/.../tower-of-god-chapter-645` at offsets 8, 661, `https://w82.thetowerofgod.com/.../tower-of-god-chapter-644` at offsets 9, 662 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../02.webp` (image/jpeg, 168374 bytes, 720x3191) |  |  |  |
