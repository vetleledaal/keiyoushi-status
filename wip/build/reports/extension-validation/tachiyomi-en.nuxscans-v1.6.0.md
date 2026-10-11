# Extension Validation Report

- Extension: tachiyomi-en.nuxscans-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 24
- Lint: 2
- Warnings: 3
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5854986367394591788
- Source name: Nux Scans
- Source language: en
- Selected manga input: popular offset 0: I'm An Evil God (`.../1141-sypnosis-bored-with-his-life-on.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 11 | I'm An Evil God (`.../1141-sypnosis-bored-with-his-life-on.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I'm An Evil God (`.../1141-sypnosis-bored-with-his-life-on.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I'm An Evil God (`.../1141-sypnosis-bored-with-his-life-on.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 34 | Chapter 115 (`https://nuxscans.blogspot.com/.../im-evil-god-chapter-115_0263624318.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 64 |  |  | 1-10s |

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
| popular listing | PASS | 11 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I'm An Evil God, URL=`.../1141-sypnosis-bored-with-his-life-on.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 12/12 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 12/12 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../download.jpg.png` (image/png, 528324 bytes, 453x641) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1141-sypnosis-bored-with-his-life-on.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://blogger.googleusercontent.com/.../Layer+1.png` was not downloaded |  |  |  |
| details author | PASS |  Shidai man wang |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ACTION, FANTASY, ISEKAI, MARTIAL ARTS |  |  |  |
| details status | PASS | CANCELLED (5) |  |  |  |
| details description | PASS | Bored with his life on Earth, Xie Yan is unexpectedly killed in an accident and sent to a world of martial arts and cultivation. Thus his adventures begin, exploring the Han Empire, surviving ordeals, and travelling across various worlds. This is the story of how he becomes an evil god.~ |  |  |  |
| metadata trimming | LINT | Untrimmed fields: author |  |  |  |
| chapters | PASS | 34 chapters |  |  |  |
| chapter dates | LINT | All 34 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=34 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 34 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `https://nuxscans.blogspot.com/.../im-evil-god-chapter-146.html` at offsets 0, 1, 2 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 64 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://blogger.googleusercontent.com/.../download.jpg.png` at pages 1, 2 |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../download.jpg.png` (image/png, 545255 bytes, 453x641) |  |  |  |
