# Extension Validation Report

- Extension: tachiyomi-en.readkingdommangaonline-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 24
- Lint: 4
- Warnings: 1
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangacatalog
- Source ID: 7952360835727640966
- Source name: Read Kingdom Manga Online
- Source language: en
- Selected manga input: popular offset 0: Kingdom (`https://ww6.readkingdom.com/.../kingdom`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 3 | Kingdom (`https://ww6.readkingdom.com/.../kingdom`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kingdom (`https://ww6.readkingdom.com/.../kingdom`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kingdom (`https://ww6.readkingdom.com/.../kingdom`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 931 | Kingdom Chapter 1 (`https://ww6.readkingdom.com/.../kingdom-chapter-001`) |  | <1s |
| pages | `getPageList(chapter)` | success | 61 |  |  | <1s |

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
| popular listing | PASS | 3 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kingdom, URL=`https://ww6.readkingdom.com/.../kingdom` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 4/4 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://ww6.readkingdom.com/.../kingdom`, popular entry 2: `https://ww6.readkingdom.com/.../li-mu`, popular entry 3: `https://ww6.readkingdom.com/.../meng-wu-and-chu-zi-one-shot` |  |  |  |
| thumbnail URLs | LINT | 0/4 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `https://ww6.readkingdom.com/.../kingdom` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../hCbdZKu.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Read Kingdom Manga Online Scans by turnipfarmers & complexbowler and sensescans Kingdom Official Version Kingdom Official Japanese Version |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 931 chapters |  |  |  |
| chapter dates | LINT | All 931 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=931 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 931 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 61 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.readkingdom.com/.../2.jpeg` (image/jpeg, 57599 bytes, 700x489) |  |  |  |
