# Extension Validation Report

- Extension: tachiyomi-en.nuxscans-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 25
- Lint: 3
- Warnings: 3
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5854986367394591788
- Source name: Nux Scans
- Source language: en
- Selected manga input: latest offset 0: I'm An Evil God (`.../1141-sypnosis-bored-with-his-life-on.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 11 | I'm An Evil God (`.../1141-sypnosis-bored-with-his-life-on.html`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 11 | I'm An Evil God (`.../1141-sypnosis-bored-with-his-life-on.html`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | I'm An Evil God (`.../1141-sypnosis-bored-with-his-life-on.html`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | I'm An Evil God (`.../1141-sypnosis-bored-with-his-life-on.html`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 34 | Chapter 115 (`https://nuxscans.blogspot.com/.../im-evil-god-chapter-115_0263624318.html`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 64 |  |  | 1-10s |

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
| popular listing | PASS | 11 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I'm An Evil God, URL=`.../1141-sypnosis-bored-with-his-life-on.html` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 23/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../download.jpg.png` (image/png, 545255 bytes, 453x641) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1141-sypnosis-bored-with-his-life-on.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../Layer+1.png` (image/png, 528324 bytes, 453x641) |  |  |  |
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
| page load | PASS | `https://blogger.googleusercontent.com/.../download.jpg.png` (image/png, 545255 bytes, 453x641) |  |  |  |
