# Extension Validation Report

- Extension: tachiyomi-en.cartoonporn-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 2
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 7034264791241222160
- Source name: CartoonPorn
- Source language: en
- Selected manga input: popular offset 0: ZZZ Summer porn comic (`.../zzz-summer-porn-comic`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 22 | ZZZ Summer porn comic (`.../zzz-summer-porn-comic`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 22 | Tf Sequences Season 2 porn comic (`.../tf-sequences-season-2-porn-comic`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | CartoonPorn (`.../porncomic`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ZZZ Summer porn comic (`.../zzz-summer-porn-comic`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Zzz summer chapter 1 (`.../zzz-summer-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 1 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 45/45 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 45/45 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cartoonporn.to/.../zzz-summer-alexanderdinh-sex-comic.jpg` (image/jpeg, 1056630 bytes, 1780x2500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../zzz-summer-porn-comic` |  |  |  |
| details thumbnail URL | PASS | `https://cartoonporn.to/.../zzz-summer-alexanderdinh-sex-comic.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | alexanderdinh |  |  |  |
| details genres | PASS | Ahegao, Exhibitionism, Foot Fetish, Gangbang \| Group Sex, Monster Comic, Titty Fuck \| Paizuri |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cartoonporn.to/.../image-1.jpg <redacted query values: v>` (image/jpeg, 1056630 bytes, 1780x2500) |  |  |  |
